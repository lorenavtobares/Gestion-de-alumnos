//@author Grupo 11

package Controlador;

import Conexion.Conexion;
import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class InscripcionData {

    private final Connection con;
    
    public InscripcionData (){
        con = Conexion.getConexion();
    }

    /*<-- CREATE -->*/
    public void inscribirAlumno(Alumno alumno, Materia materia, Inscripcion inscripcion){
        String query =  "INSERT INTO inscripcion (nota, id_alumno, id_materia) " + 
                        "VALUES (?, ?, ?)";
        
        try{
            PreparedStatement stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setDouble(1, inscripcion.getNota() );
            stmt.setInt(2, alumno.getId_alumno() );
            stmt.setInt(3, materia.getId_materia() );
            
            stmt.executeUpdate();
            ResultSet resultado = stmt.getGeneratedKeys();
            
            if( resultado.next() ) {
                inscripcion.setId_inscripto( resultado.getInt( 1 ) );
            }
            
            JOptionPane.showMessageDialog(null, "Inscripcion realizada con exito.");
            stmt.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR DB: " + ex.getMessage() );
        }
        
    } // inscribirAlumno() 
    
    /*<-- READ -->*/
    public void listarInscripciones() {
        
        String query =  "SELECT a.dni , a.apellido, a.nombre, m.nombre AS nombreMateria " + 
                        "FROM inscripcion AS i " + 
                        "JOIN alumno AS a " + 
                        "ON a.id_alumno = i.id_alumno " + 
                        "JOIN materia AS m " + 
                        "ON m.id_materia = i.id_materia " + 
                        "ORDER BY a.dni";
        
        try{
            
            PreparedStatement stmt = con.prepareStatement( query );
            ResultSet resultado = stmt.executeQuery();

            System.out.println("\n-------------------------------------------------------------------------------------");
            System.out.printf("%-20s %-20s %-20s %-20s", "DNI", "APELLIDO", "NOMBRE", "MATERIA");
            System.out.println("\n-------------------------------------------------------------------------------------");
            
            while ( resultado.next() ) {
                String dni = String.valueOf(resultado.getInt("dni"));
                String apellido = resultado.getString("apellido");
                String nombre = resultado.getString("nombre");
                String nombreMateria = resultado.getString("nombreMateria");
                
                System.out.format("%-20s %-20s %-20s %-20s", dni , apellido , nombre , nombreMateria);
                System.out.println();
            }
            System.out.println("\n-------------------------------------------------------------------------------------");
            

            stmt.close();
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
        
    } // listarInscripciones()
    
    public void buscarInscripcionesIDUsuario ( int id_alumno ) {
        
        String query =  "SELECT a.dni , a.apellido, a.nombre, m.nombre AS nombreMateria " + 
                        "FROM inscripcion AS i " + 
                        "JOIN alumno AS a " + 
                        "ON i.id_alumno = a.id_alumno " + 
                        "JOIN materia AS m " + 
                        "ON i.id_materia = m.id_materia " + 
                        "WHERE i.id_materia = ? " + 
                        "ORDER BY a.dni";
        
        try{
            
            PreparedStatement stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_alumno );
            stmt.setInt( 2, id_alumno );
            ResultSet resultado = stmt.executeQuery();
            
            System.out.println("\n-------------------------------------------------------------------------------------");
            System.out.printf("%-20s %-20s %-20s %-20s", "DNI", "APELLIDO", "NOMBRE", "MATERIA");
            System.out.println("\n-------------------------------------------------------------------------------------");
            
            while ( resultado.next() ) {
                String dni = String.valueOf(resultado.getInt("dni"));
                String apellido = resultado.getString("apellido");
                String nombre = resultado.getString("nombre");
                String nombreMateria = resultado.getString("nombreMateria");
                
                System.out.format("%-20s %-20s %-20s %-20s", dni , apellido , nombre , nombreMateria);
                System.out.println();
            }
            System.out.println("\n-------------------------------------------------------------------------------------");
            
        }catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
    
    } //buscarInscripcionID ()
    
    public void buscarInscripcionIDMateria ( int id_materia ) {
        
        String query =  "SELECT a.dni , a.apellido, a.nombre, m.nombre AS nombreMateria " + 
                        "FROM inscripcion AS i " + 
                        "JOIN alumno AS a " + 
                        "ON i.id_alumno = a.id_alumno " +
                        "JOIN materia AS m " +
                        "ON i.id_materia = m.id_materia " +
                        "WHERE i.id_materia = ? " + 
                        "ORDER BY a.dni";
        
        try{
            
            PreparedStatement stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_materia );

            
            ResultSet resultado = stmt.executeQuery();
            
            System.out.println("\n-------------------------------------------------------------------------------------");
            System.out.printf("%-20s %-20s %-20s %-20s", "DNI", "APELLIDO", "NOMBRE", "MATERIA");
            System.out.println("\n-------------------------------------------------------------------------------------");
            
            while ( resultado.next() ) {
                String dni = String.valueOf(resultado.getInt("dni"));
                String apellido = resultado.getString("apellido");
                String nombre = resultado.getString("nombre");
                String nombreMateria = resultado.getString("nombreMateria");
                
                System.out.format("%-20s %-20s %-20s %-20s", dni , apellido , nombre , nombreMateria);
                System.out.println();
            }
            System.out.println("\n-------------------------------------------------------------------------------------");
            
        }catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
    
    } //buscarInscripcionID ()

    /*<-- UPDATE -->*/
    public void actualizarNotaID( int id_inscripcion, double nota ){
        String query =  "UPDATE inscripcion " + 
                        "SET nota = ? " + 
                        "WHERE id_inscripcion = ?";
        
        try{
            PreparedStatement stmt = con.prepareStatement( query );
            stmt.setDouble( 1, nota);
            stmt.setInt( 2, id_inscripcion);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Nota actualizada.");
            stmt.close();
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR al actualizar registro: " + ex.getMessage());
        }
    } // actualizarMateriaID()
    
    /*<-- DELETE -->*/
    public void eliminarInscripcion ( int id_inscripcion){
        
        String query =  "DELETE FROM inscripcion " + 
                        "WHERE id_inscripcion = ?";
                        
        try{
            PreparedStatement stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_inscripcion);
            
            if(stmt.executeUpdate() > 0){
                System.out.println("Registro de inscripcion eliminado.");
            }else{
                System.out.println("ID ingresado incorrecto.");
            }
            stmt.close();            
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
    }// eliminarInscripcion()
    
}