package Controlador;

import Conexion.Conexion;
import Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MateriaData {
    
    private final Connection con;
    
    public MateriaData (){
        con = Conexion.getConexion();
    }
    
    public void guardarMateria( Materia materia ){
        
        String query =  "INSERT INTO materia (nombre, anio, estado) " + 
                        "VALUES (?, ?, 1)";    
        try{
            
            PreparedStatement stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setString( 1, materia.getNombre() );
            stmt.setInt( 2 , materia.getAnio() );
            
            stmt.executeUpdate();
            ResultSet resultado = stmt.getGeneratedKeys();          

            if( resultado.next() ) {
                materia.setId_materia( resultado.getInt( 1 ) ); 
            }

            JOptionPane.showMessageDialog(null, "Materia guardada con exito.");
            con.close();
        }
        
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//.guardarMateria()
    
    public void actualizarMateria ( Materia materia ){
        String query =  "UPDATE materia " + 
                        "SET nombre = ? , anio = ? , estado = ? " + 
                        "WHERE id_materia = ?";
        
        try{
            PreparedStatement stmt = con.prepareStatement( query );
            stmt.setString( 1, materia.getNombre() );
            stmt.setInt( 2, materia.getAnio() );
            stmt.setBoolean( 3, materia.getEstado() );
            stmt.setInt( 4, materia.getId_materia() );
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro de materia actualizado.");
            con.close();
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR al actualizar registro: " + ex.getMessage());
        }
    }//.actualizarMateria()
    
    public Materia buscarMateria ( int id_materia ){
       
        Materia materiaN = null;
        String query =  "SELECT nombre, anio, estado " + 
                        "FROM materia " + 
                        "WHERE id_materia = ?";
        
        try{    
            PreparedStatement stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_materia );
            
            ResultSet resultado = stmt.executeQuery();
            
            if( resultado.next() ){
                materiaN = new Materia();
                materiaN.setId_materia ( id_materia );
                materiaN.setNombre(resultado.getString( "nombre" ));
                materiaN.setAnio(resultado.getInt( "anio" ));
                materiaN.setEstado(resultado.getBoolean( "estado" ));
            }else{
                System.out.println("No se encontro la materia solicitada.");
            }
            
            con.close();
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR al buscar la materia: " + ex.getMessage());
        }
        
        return materiaN;
    }//.buscarMateria()
    
    public void eliminarMateria ( int id_materia ){
        
        String query =  "UPDATE materia " + 
                        "SET estado = false " + 
                        "WHERE id_materia = ?";
        
        try{
            PreparedStatement stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_materia);
            
            if(stmt.executeUpdate() > 0){
                System.out.println("Registro de Materia eliminada.");
            }else{
                System.out.println("ID ingresado incorrecto.");
            }
            con.close();           
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
    }//.eliminarMateria()
    
    public void habilitarMateria ( int id_materia ){
        String query =  "UPDATE materia " + 
                        "SET estado = true " + 
                        "WHERE id_materia = ?";
        
        try{
            PreparedStatement stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_materia);
            
            if(stmt.executeUpdate() > 0){
                System.out.println("Materia habilitada.");
            }else{
                System.out.println("ID ingresado incorrecto.");
            }
            con.close();        
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
    }//.eliminarMateria()

    public ArrayList<Materia> listarHabilitadas(){
        ArrayList array_materias = new ArrayList();
        
        String query =  "SELECT id_materia, nombre, anio " + 
                        "FROM materia " + 
                        "WHERE estado = 1";
        
        try{
            PreparedStatement stmt = con.prepareStatement( query );
            ResultSet resultado = stmt.executeQuery();
            
            while ( resultado.next() ) {
                Materia materiaN = new Materia();
                materiaN.setId_materia(resultado.getInt("id_materia"));
                materiaN.setNombre(resultado.getString("nombre"));
                materiaN.setAnio(resultado.getInt("anio"));
                
                array_materias.add(materiaN);
            }
            
            con.close();
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
        
        return array_materias;
    }
}
