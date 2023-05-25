package Modelo;
import Controlador.*;
import Vistas.FormLogin;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    public static void main(String[] args) {
        
        FormLogin objetoLogin = new FormLogin();
        objetoLogin.setVisible(true);

                            /*---------------------------*/
                            /*---- < Alumnos Data > ----*/
                            /*-------------------------*/

    // <--- CREATE --->
        /*
        Alumno alumno1 = new Alumno(37505332, "Lezcano", "Ruben", LocalDate.of(1988, 7, 8), false);
        AlumnoData alumno1_Data = new AlumnoData();
        alumno1_Data.guardarAlumno(alumno1);
        */
        
    // <--- READ --->
       /*
        AlumnoData alumno1_Data = new AlumnoData();
        alumno1_Data.buscarAlumno(7);
       */
        
    // <--- UPDATE --->
        /*
        Alumno alumno1 = new Alumno(1, 32412345, "Godoy", "Bernardo", LocalDate.of(1998, 05, 23), true);
        AlumnoData alumno1_Data = new AlumnoData();
        alumno1_Data.actualizarAlumno(alumno1);
        */
        
    // <--- DELETE --->
        /*
        AlumnoData alumno1_Data = new AlumnoData();
        alumno1_Data.eliminarAlumno(8);
        */
        
    // <--- HABILITAR --->
        /*
        AlumnoData alumno1_Data = new AlumnoData();
        alumno1_Data.habilitarAlumno(7);
        */
        
    // <--- LISTA DE HABILITADOS --->
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


        
                            /*----------------------------*/
                            /*---- < Materias Data > ----*/
                            /*--------------------------*/
        

    // <--- CREATE --->
        /*
        Materia materia = new Materia ( "Frances" , 1);
        MateriaData materia_data = new MateriaData();
        materia_data.guardarMateria(materia);
        */
        
    // <--- READ --->
        /*
        MateriaData materia_Data = new MateriaData();
        materia_Data.buscarMateria(1);
       */
        
    // <--- UPDATE --->
        /*
        Materia materia = new Materia (6, "Desarrollo Web 1 _ Update", 4, true);
        MateriaData materia_Data = new MateriaData();
        materia_Data.actualizarMateria(materia);
        */
        
    // <--- DELETE --->
        /*
        MateriaData materia_Data = new MateriaData();
        materia_Data.eliminarMateria(7);
        */
        
    // <--- HABILITAR --->
        /*
        MateriaData materia_Data = new MateriaData();
        materia_Data.habilitarMateria(7);
        */
        
    // <--- LISTA DE HABILITADOS --->
    /*
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
    */
        


                            /*--------------------------------*/
                            /*---- < Inscripciones Data > ----*/
                            /*-------------------------------*/



    // <--- CREATE --->
        /*
        Materia materia = new Materia (6, "Desarrollo Web 1" , 1, true );
        Alumno alumno = new Alumno( 1, 32412345, "Godoy", "Bernardo", LocalDate.of(1998, 05, 23), true );
        Inscripcion inscripcion = new Inscripcion(8, alumno, materia);
        
        InscripcionData inscripcion_data = new InscripcionData();
        inscripcion_data.inscribirAlumno(alumno, materia, inscripcion);
        */
        
    // <--- READ --->
        /*
        Inscripcion inscripcion = new Inscripcion();
        InscripcionData inscripcion_data = new InscripcionData();
        
        // inscripcion_data.listarInscripciones();
        // inscripcion_data.buscarInscripcionesIDUsuario(1);
        // inscripcion_data.buscarInscripcionIDMateria(3);
        */
        
    // <--- UPDATE --->
        /*
        InscripcionData inscripcion_data = new InscripcionData();
        inscripcion_data.actualizarNotaID(2 , 8.5);
        */  
        
    // <--- DELETE --->
        /*
        InscripcionData inscripcion_data = new InscripcionData();
        inscripcion_data.eliminarInscripcion(9);
        */
    
    //Array Inscripciones
        InscripcionData inscripcion_data = new InscripcionData();
        List <Inscripcion> listaCursada = new ArrayList<Inscripcion>();
        listaCursada  = inscripcion_data.listaCursada();
        
        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s %-20s", "ID_INSCRIPCION", "NOTA", "ID_ALUMNO", "ID_MATERIA");
        System.out.println("\n-------------------------------------------------------------------------------------");
        
        for (Inscripcion inscripcion : listaCursada) {
            System.out.format("%-20s %-20s %-20s %-20s", inscripcion.getId_inscripto() , inscripcion.getNota() , inscripcion.getAlumno() , inscripcion.getMateria());
            System.out.println();
        }
        
        
    }
}
