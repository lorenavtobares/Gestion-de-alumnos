package Controlador;

import Conexion.*;
import Modelo.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MateriaData {
    
    private final Connection con;
    
    public MateriaData (){
        con = Conexion.getConexion();
    }
    
    public void guardarMateria( Materia materia ){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "INSERT INTO materia (nombre, anio, estado) "
                        + "VALUES (?, ?, 1)";    
        try
        {
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setString( 1, materia.getNombre() );
            stmt.setInt( 2 , materia.getAnio() );
            
            stmt.executeUpdate();
            resultado = stmt.getGeneratedKeys();          

            if( resultado.next() ) 
            {
                materia.setId_materia( resultado.getInt( 1 ) ); 
            }

            JOptionPane.showMessageDialog(null, "Materia guardada con exito.", "", JOptionPane.INFORMATION_MESSAGE);
            con.close();
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        finally {
            try { 
                resultado.close(); 
                stmt.close(); 
            }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
    }//.guardarMateria()
    
    public void actualizarMateria ( Materia materia ){
        PreparedStatement stmt = null;
        String query    = "UPDATE materia "
                        + "SET nombre = ? , anio = ? , estado = ? "
                        + "WHERE id_materia = ?";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setString( 1, materia.getNombre() );
            stmt.setInt( 2, materia.getAnio() );
            stmt.setBoolean( 3, materia.getEstado() );
            stmt.setInt( 4, materia.getId_materia() );
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro de materia actualizado.", "", JOptionPane.INFORMATION_MESSAGE);
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR al actualizar registro: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try {  stmt.close(); }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
    }//.actualizarMateria()
    
    public Materia buscarMateria ( int id_materia ){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        Materia materiaN = null;
        
        String query    = "SELECT nombre, anio, estado "
                        + "FROM materia "
                        + "WHERE id_materia = ?";
        
        try{    
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_materia );
            resultado = stmt.executeQuery();
            
            if( resultado.next() )
            {
                materiaN = new Materia();
                materiaN.setId_materia ( id_materia );
                materiaN.setNombre(resultado.getString( "nombre" ));
                materiaN.setAnio(resultado.getInt( "anio" ));
                materiaN.setEstado(resultado.getBoolean( "estado" ));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro la materia selecionada", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR al buscar la materia: " + ex.getMessage());
        }finally {
            try {  
                resultado.close();
                stmt.close(); 
            }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
        
        return materiaN;
    }//.buscarMateria()
    
    public void eliminarMateria ( int id_materia ){
        PreparedStatement stmt = null;
        String query    = "UPDATE materia "
                        + "SET estado = false "
                        + "WHERE id_materia = ?";
        
        try
        {
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_materia);
            
            if(stmt.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Registro eliminado", "", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "ID ingresado incorrecto", "", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE );
        }finally {
            try {  
                stmt.close(); 
            }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
    }//.eliminarMateria()
    
    public void habilitarMateria ( int id_materia ){
        PreparedStatement stmt = null;
        String query    = "UPDATE materia "
                        + "SET estado = true "
                        + "WHERE id_materia = ?";
        
        try
        {
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_materia);
            
            if(stmt.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Materia habilitada ", "", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "ID ingresado incorrecto", "", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() ,"", JOptionPane.ERROR_MESSAGE );
        }finally {
            try {  
                stmt.close(); 
            }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
    }//.eliminarMateria()

    public ArrayList<Materia> listarHabilitadas(){
        ArrayList array_materias = new ArrayList();
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        String query    = "SELECT id_materia, nombre, anio "
                        + "FROM materia "
                        + "WHERE estado = 1";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                Materia materiaN = new Materia();
                materiaN.setId_materia(resultado.getInt("id_materia"));
                materiaN.setNombre(resultado.getString("nombre"));
                materiaN.setAnio(resultado.getInt("anio"));
                
                array_materias.add(materiaN);
            }
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() , "", JOptionPane.ERROR_MESSAGE);
        }finally {
            try {  
                resultado.close();
                stmt.close(); 
            }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
        
        return array_materias;
    }
}
