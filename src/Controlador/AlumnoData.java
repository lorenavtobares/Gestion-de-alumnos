package Controlador;

import Conexion.Conexion;
import Modelo.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlumnoData {

    private final Connection con;
    
    public AlumnoData(){
        con = Conexion.getConexion();
    }

    public void guardarAlumno( Alumno alumno ){
        
        String query    = "INSERT INTO alumno "
                        + "(dni, apellido, nombre, fecha_nacimiento, estado) "
                        + "VALUES (?, ?, ?, ?, 1)";
        
        try{
            PreparedStatement stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setInt( 1, alumno.getDni() );
            stmt.setString( 2, alumno.getApellido() );
            stmt.setString( 3, alumno.getNombre() );
            stmt.setDate( 4, Date.valueOf( alumno.getFecha_nacimiento() ) );
            
            stmt.executeUpdate();
            ResultSet resultado = stmt.getGeneratedKeys();
            
            if( resultado.next() ) {
                alumno.setId_alumno(resultado.getInt( 1 )); 
            }           
            
            JOptionPane.showMessageDialog(null, "Alumno guardado con exito");
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR al guardar el Alumno: " + ex.getMessage() );
        }

    }//.guardarAlumno()
    
    public void actualizarAlumno ( Alumno alumno ){
        
        String query =  "UPDATE alumno " + 
                        "SET dni = ?, apellido = ? , nombre = ? , fecha_nacimiento = ?  " + 
                        "WHERE id_alumno = ?";
        
        try{
            PreparedStatement stmt = con.prepareStatement( query );
            stmt.setInt( 1, alumno.getDni() );
            stmt.setString( 2, alumno.getApellido() );
            stmt.setString( 3, alumno.getNombre() );
            stmt.setDate( 4, Date.valueOf( alumno.getFecha_nacimiento() ) );
            stmt.setInt( 5, alumno.getId_alumno() );
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro actualizado.");
            stmt.close();
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR al actualizar registro: " + ex.getMessage() );
        }
    }//.actualizarAlumno()
    
    public Alumno buscarAlumno ( int id_alumno ){
        Alumno alumnoN = null;
        
        String query =  "SELECT dni, apellido, nombre, fecha_nacimiento, estado " + 
                        "FROM alumno " + 
                        "WHERE id_alumno = ?";
        
        try{
            PreparedStatement stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_alumno );
            
            ResultSet resultado = stmt.executeQuery();
            
            if( resultado.next() ){
                alumnoN = new Alumno();
                alumnoN.setId_alumno( id_alumno );
                alumnoN.setDni(resultado.getInt("dni"));
                alumnoN.setApellido(resultado.getString("apellido"));
                alumnoN.setNombre(resultado.getString("nombre"));
                alumnoN.setFecha_nacimiento(resultado.getDate("fecha_nacimiento").toLocalDate());
                alumnoN.setEstado(resultado.getBoolean("estado"));
                
                //String estado = ( resultado.getBoolean("estado") != false ) ? "Habilitado" : "Deshabilitado";               
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el alumno solicitado.");
                System.out.println("No se encontro el alumno solicitado.");
            }
            
            stmt.close();
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR al buscar alumno: " + ex.getMessage() );
            Logger.getLogger( AlumnoData.class.getName() ).log( Level.SEVERE, null, ex );
        }
        
        return alumnoN;
    }//.buscarAlumno()
    
    public void eliminarAlumno ( int id_alumno ){
        try{
            String query =  "UPDATE alumno " + 
                            "SET estado = false " + 
                            "WHERE id_alumno = ?";
            
            PreparedStatement stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_alumno);
            
            if(stmt.executeUpdate() > 0){
                System.out.println("Registro de alumno eliminado.");
            }else{
                System.out.println("ID ingresado incorrecto.");
            }
            stmt.close();            
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
    }//.eliminarAlumno()
    
    public void habilitarAlumno ( int id_alumno ){
        try{
            String query =  "UPDATE alumno " +
                            "SET estado = true " +
                            "WHERE id_alumno = ?";
            
            PreparedStatement stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_alumno);
            
            if(stmt.executeUpdate() > 0){
                System.out.println("Alumno habilitado.");
            }else{
                System.out.println("ID ingresado incorrecto.");
            }
            stmt.close();            
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
    }//.habilitarAlumno()
   
    public ArrayList<Alumno> listarHabilitados ( ){
        ArrayList array_alumnos = new ArrayList();
        
        String query =  "SELECT id_alumno, dni, apellido, nombre, fecha_nacimiento " + 
                        "FROM alumno " + 
                        "WHERE estado = 1";
        
        try{
            PreparedStatement stmt = con.prepareStatement( query );
            ResultSet resultado = stmt.executeQuery();
            
            while ( resultado.next() ) {
                Alumno alumnoN = new Alumno();
                alumnoN.setId_alumno( resultado.getInt("id_alumno"));
                alumnoN.setDni(resultado.getInt("dni"));
                alumnoN.setApellido(resultado.getString("apellido"));
                alumnoN.setNombre(resultado.getString("nombre"));
                alumnoN.setFecha_nacimiento(resultado.getDate("fecha_nacimiento").toLocalDate());
                
                array_alumnos.add(alumnoN);
            }
            
            stmt.close();
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
        
        return array_alumnos;
    }
}