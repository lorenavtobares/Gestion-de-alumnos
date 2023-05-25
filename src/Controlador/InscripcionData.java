package Controlador;

import Conexion.Conexion;
import Modelo.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {
    private final Connection con;
    
    public InscripcionData (){
        con = Conexion.getConexion();
    }

    private Alumno regenerarAlumno ( int idAlumno ){
        Alumno alumno = new Alumno();
        AlumnoData alumnoData = new AlumnoData();
        alumno = alumnoData.buscarAlumno(idAlumno);
        return alumno;
    }
    
    private Materia regenerarMateria ( int idMateria ){
        Materia materia = new Materia();
        MateriaData materiaData = new MateriaData();
        materia = materiaData.buscarMateria(idMateria);
        return materia;
    }
    
    /*<-- CREATE -->*/
    public void inscribirAlumno(Alumno alumno, Materia materia, Inscripcion inscripcion){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "INSERT INTO inscripcion (nota, id_alumno, id_materia) "
                        + "VALUES (?, ?, ?)";
        
        try
        {
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setDouble(1, inscripcion.getNota() );
            stmt.setInt(2, alumno.getId_alumno() );
            stmt.setInt(3, materia.getId_materia() );
            
            stmt.executeUpdate();
            resultado = stmt.getGeneratedKeys();
            
            if ( resultado.next() ) 
            {
                inscripcion.setId_inscripto( resultado.getInt( 1 ) );
            }
            JOptionPane.showMessageDialog( null, "Inscripcion realizada con exito." );
        } 
        catch ( SQLException ex ) 
        {
            JOptionPane.showMessageDialog( null, "ERROR DB: " + ex.getMessage() );
        } 
        finally 
        {
            try 
            {
                resultado.close();
                stmt.close();
            } 
            catch  ( SQLException ex ) 
            {
                ex.printStackTrace( System.out );
            }
        }
        
    } // inscribirAlumno() 
    
    /*<-- READ -->*/
    public void listarInscripciones() {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "SELECT a.dni , a.apellido, a.nombre, m.nombre AS nombreMateria "
                        + "FROM inscripcion AS i "
                        + "JOIN alumno AS a "
                        + "ON a.id_alumno = i.id_alumno "
                        + "JOIN materia AS m "
                        + "ON m.id_materia = i.id_materia "
                        + "ORDER BY a.dni";
        
        try
        {    
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();

            System.out.println("\n-------------------------------------------------------------------------------------");
            System.out.printf("%-20s %-20s %-20s %-20s", "DNI", "APELLIDO", "NOMBRE", "MATERIA");
            System.out.println("\n-------------------------------------------------------------------------------------");
            
            while ( resultado.next() ) 
            {
                String dni = String.valueOf(resultado.getInt("dni"));
                String apellido = resultado.getString("apellido");
                String nombre = resultado.getString("nombre");
                String nombreMateria = resultado.getString("nombreMateria");
                
                System.out.format("%-20s %-20s %-20s %-20s", dni , apellido , nombre , nombreMateria);
                System.out.println();
            }
            System.out.println("\n-------------------------------------------------------------------------------------");
        }
        catch ( SQLException ex )
        {
            JOptionPane.showMessageDialog( null, "ERROR: " + ex.getMessage() );
        }
        finally 
        {
            try 
            {
                resultado.close();
                stmt.close();
            } 
            catch  ( SQLException ex ) 
            {
                ex.printStackTrace( System.out );
            }
        }
        
    } // listarInscripciones()
    
    public void buscarInscripcionesIDUsuario ( int id_alumno ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "SELECT a.dni , a.apellido, a.nombre, m.nombre AS nombreMateria "
                        + "FROM inscripcion AS i "
                        + "JOIN alumno AS a "
                        + "ON i.id_alumno = a.id_alumno "
                        + "JOIN materia AS m "
                        + "ON i.id_materia = m.id_materia "
                        + "WHERE i.id_materia = ? "
                        + "ORDER BY a.dni";
        
        try
        {    
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_alumno );
            stmt.setInt( 2, id_alumno );
            resultado = stmt.executeQuery();
            
            System.out.println("\n-------------------------------------------------------------------------------------");
            System.out.printf("%-20s %-20s %-20s %-20s", "DNI", "APELLIDO", "NOMBRE", "MATERIA");
            System.out.println("\n-------------------------------------------------------------------------------------");
            
            while ( resultado.next() ) 
            {
                String dni = String.valueOf( resultado.getInt( "dni" ) );
                String apellido = resultado.getString( "apellido" );
                String nombre = resultado.getString( "nombre" );
                String nombreMateria = resultado.getString( "nombreMateria" );
                
                System.out.format("%-20s %-20s %-20s %-20s", dni , apellido , nombre , nombreMateria);
                System.out.println();
            }
            System.out.println("\n-------------------------------------------------------------------------------------");
            
        }
        catch ( SQLException ex )
        {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
        finally 
        {
            try 
            {
                resultado.close();
                stmt.close();
            } 
            catch  ( SQLException ex ) 
            {
                ex.printStackTrace( System.out );
            }
        }
    
    } //buscarInscripcionID ()
       
    public void buscarInscripcionIDMateria ( int id_materia ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "SELECT a.dni , a.apellido, a.nombre, m.nombre AS nombreMateria "
                        + "FROM inscripcion AS i "
                        + "JOIN alumno AS a "
                        + "ON i.id_alumno = a.id_alumno "
                        + "JOIN materia AS m "
                        + "ON i.id_materia = m.id_materia "
                        + "WHERE i.id_materia = ? "
                        + "ORDER BY a.dni";
        
        try
        {
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_materia );

            resultado = stmt.executeQuery();
            
            System.out.println("\n-------------------------------------------------------------------------------------");
            System.out.printf("%-20s %-20s %-20s %-20s", "DNI", "APELLIDO", "NOMBRE", "MATERIA");
            System.out.println("\n-------------------------------------------------------------------------------------");
            
            while ( resultado.next() ) 
            {
                String dni = String.valueOf(resultado.getInt("dni"));
                String apellido = resultado.getString("apellido");
                String nombre = resultado.getString("nombre");
                String nombreMateria = resultado.getString("nombreMateria");
                
                System.out.format("%-20s %-20s %-20s %-20s", dni , apellido , nombre , nombreMateria);
                System.out.println();
            }
            System.out.println("\n-------------------------------------------------------------------------------------");
            
        }
        catch ( SQLException ex )
        {
            JOptionPane.showMessageDialog( null, "ERROR: " + ex.getMessage() );
        }
        finally 
        {
            try 
            {
                resultado.close();
                stmt.close();
            } 
            catch  ( SQLException ex ) 
            {
                ex.printStackTrace( System.out );
            }
        }
    
    } //buscarInscripcionID ()
    
    public List <Inscripcion> listaCursada(){
        List <Inscripcion> listaInscripciones = new ArrayList <Inscripcion> ();
        PreparedStatement stmt = null;  
        ResultSet resultado = null;
        
        try{
            String query =  "SELECT * FROM inscripcion";
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            Inscripcion inscricion;
            
            while ( resultado.next() )
            {
                inscricion = new Inscripcion();
                inscricion.setId_inscripto( resultado.getInt("id_inscripcion") );
                
                Alumno alumno = regenerarAlumno( resultado.getInt("id_alumno") );
                inscricion.setAlumno(alumno);
                
                Materia materia = regenerarMateria( resultado.getInt("id_materia") );
                inscricion.setMateria(materia);
                
                inscricion.setNota( resultado.getDouble("nota") );
                
                listaInscripciones.add(inscricion);
            }
            
        }
        catch ( SQLException ex )
        {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
        
        return listaInscripciones;
    }

    /*<-- UPDATE -->*/
    public void actualizarNotaID( int id_inscripcion, double nota ){
        PreparedStatement stmt = null;
        
        String query    = "UPDATE inscripcion "
                        + "SET nota = ? "
                        + "WHERE id_inscripcion = ?";
        
        try
        {
            stmt = con.prepareStatement( query );
            stmt.setDouble( 1, nota);
            stmt.setInt( 2, id_inscripcion);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Nota actualizada.");
            stmt.close();
        }
        catch ( SQLException ex )
        {
            JOptionPane.showMessageDialog(null, "ERROR al actualizar registro: " + ex.getMessage());
        }
        finally 
        {
            try 
            {
                stmt.close();
            } 
            catch  ( SQLException ex ) 
            {
                ex.printStackTrace( System.out );
            }
        }
    } // actualizarMateriaID()
    
    /*<-- DELETE -->*/
    public void eliminarInscripcion ( int id_inscripcion){
        PreparedStatement stmt = null;
        
        String query    = "DELETE FROM inscripcion "
                        + "WHERE id_inscripcion = ?";
                        
        try
        {
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_inscripcion);
            
            if(stmt.executeUpdate() > 0)
            {
                System.out.println("Registro de inscripcion eliminado.");
            }
            else
            {
                System.out.println("ID ingresado incorrecto.");
            }
            stmt.close();            
        }
        catch ( SQLException ex )
        {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() );
        }
        finally 
        {
            try 
            {
                stmt.close();
            } 
            catch  ( SQLException ex ) 
            {
                ex.printStackTrace( System.out );
            }
        }
    } // eliminarInscripcion()
    
}