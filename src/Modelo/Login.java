package Modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
    
    private final Connection con;
    private static String usuario_login = "";
    private static int rol_usuario = 0;
    
    public Login(){
        con = Conexion.getConexion();
    }
    
    public boolean validarUsuario(JTextField usuario, JPasswordField contrasenia){
       boolean estado = false;

       try{
            String query =  "SELECT * FROM usuarios " +
                            "WHERE usuario = ? " +
                            "AND contrasenia = ?";
            
            PreparedStatement stmt = con.prepareStatement( query);
            stmt.setString( 1, usuario.getText() );
            stmt.setString( 2, String.valueOf( contrasenia.getPassword() ) );
            
            ResultSet resultado = stmt.executeQuery();
                       
            if ( resultado.next() ) {
                estado = true;
            }            
        
        }catch (SQLException ex){
            System.out.println("ERROR: " + ex.getMessage());
        }       
        
        return estado;
    }

    public static String getUsuario_login() {
        return usuario_login;
    }

    public static void setUsuario_login(String usuario_login) {
        Login.usuario_login = usuario_login;
    }

    public static int getRol_usuario() {
        return rol_usuario;
    }

    public static void setRol_usuario(int rol_usuario) {
        Login.rol_usuario = rol_usuario;
    }
       
}