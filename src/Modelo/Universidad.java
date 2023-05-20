package Modelo;
import Controlador.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class Universidad {
    public static void main(String[] args) {

/* < Alumnos > */
        
    // <--- Create --->
        /*
        Alumno alumno1 = new Alumno(0000000, "Sosa", "Emanuel", LocalDate.of(1998, 05, 23), false);
        AlumnoData alumno1_Data = new AlumnoData();
        alumno1_Data.guardarAlumno(alumno1);
        */
        
    // <--- Read --->
       /*
        AlumnoData alumno1_Data = new AlumnoData();
        alumno1_Data.buscarAlumno(7);
       */
        
    // <--- Update --->
        /*
        Alumno alumno1 = new Alumno(1, 32412345, "Godoy", "Bernardo", LocalDate.of(1998, 05, 23), true);
        AlumnoData alumno1_Data = new AlumnoData();
        alumno1_Data.actualizarAlumno(alumno1);
        */
        
    // <--- Delete --->
        /*
        AlumnoData alumno1_Data = new AlumnoData();
        alumno1_Data.eliminarAlumno(8);
        */
        
        
    // <--- Habilitar --->
        /*
        AlumnoData alumno1_Data = new AlumnoData();
        alumno1_Data.habilitarAlumno(7);
        */
        
    // <--- Lista de habilitados--->
        /*
        ArrayList<Alumno> listaHabilitados = new ArrayList();
        AlumnoData alumno1_Data = new AlumnoData();
        listaHabilitados = alumno1_Data.listarHabilitados();
        
        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s %-20s", "DNI", "APELLIDO", "NOMBRE", "FECHA NACIMIENTO");
        System.out.println("\n-------------------------------------------------------------------------------------");
        
        for (Alumno listaHabilitado : listaHabilitados) {
            
            System.out.format("%-20s %-20s %-20s %-20s", listaHabilitado.getDni() , listaHabilitado.getApellido() , listaHabilitado.getNombre() , listaHabilitado.getFecha_nacimiento());
            System.out.println();
        }
        
        System.out.println("\n-------------------------------------------------------------------------------------");
        */

/* < Materias> */

    // <--- Create --->
        /*
        Materia materia = new Materia ( "Frances" , 1);
        MateriaData materia_data = new MateriaData();
        materia_data.guardarMateria(materia);
        */
        
    // <--- Read --->
        /*
        MateriaData materia_Data = new MateriaData();
        materia_Data.buscarMateria(1);
       */
        
    // <--- Update --->
        /*
        Materia materia = new Materia (6, "Desarrollo Web 1 _ Update", 4, true);
        MateriaData materia_Data = new MateriaData();
        materia_Data.actualizarMateria(materia);
        */
        
    // <--- Delete --->
        /*
        MateriaData materia_Data = new MateriaData();
        materia_Data.eliminarMateria(7);
        */
        
    // <--- Habilitar --->
        /*
        MateriaData materia_Data = new MateriaData();
        materia_Data.habilitarMateria(7);
        */
        
    // <--- Lista de habilitados--->
    
        ArrayList<Materia> listaHabilitados = new ArrayList();
        MateriaData materia_Data = new MateriaData();
        listaHabilitados = materia_Data.listarHabilitadas();
        
        System.out.println("\n-----------------------------------------------");
        System.out.printf("%-20s %-20s", "AÑO", "MATERIA");
        System.out.println("\n-----------------------------------------------");
        
        for (Materia listaHabilitado : listaHabilitados) {
            System.out.format("%-20s %-20s", listaHabilitado.getAnio(), listaHabilitado.getNombre());
            System.out.println();
        }
        
        System.out.println("\n-----------------------------------------------");
    
        

/* < Inscripciones > */
    // <--- Create --->
        /*
        Materia materia = new Materia (6, "Desarrollo Web 1" , 1, true );
        Alumno alumno = new Alumno( 1, 32412345, "Godoy", "Bernardo", LocalDate.of(1998, 05, 23), true );
        Inscripcion inscripcion = new Inscripcion(8, alumno, materia);
        
        InscripcionData inscripcion_data = new InscripcionData();
        inscripcion_data.inscribirAlumno(alumno, materia, inscripcion);
        */
        
    // <--- Read --->
    /*
        Inscripcion inscripcion = new Inscripcion();
        InscripcionData inscripcion_data = new InscripcionData();
        
        inscripcion_data.listarInscripciones();
    */  
        //inscripcion_data.buscarInscripcionID(1);
        
        
    }
}
