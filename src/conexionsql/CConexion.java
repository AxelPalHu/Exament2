/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionsql;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


/**
 *
 * @author OS
 */
public class CConexion {
    Connection conectar =null;
    String usuario="sa";
    String contrasena="1234";
    String bd="tarea";
    String puerto="1433";
    
    //String cadena="jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
    
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String cadena="jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+bd+";"+"encrypt=false";
            conectar=DriverManager.getConnection(cadena,usuario,contrasena);
            JOptionPane.showMessageDialog(null,"Se conecto");
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar: "+e.toString());
        }
        
        return conectar;
        
    }
    
    public void RegistroUsuario(String Nombre, String Apellido, String Contrasena, String Dni, String TipoUsuario){
           
        establecerConexion();
        
        try{
        String sql = "INSERT INTO rUsuario (nombre, apellido,  password,dni, tipousuario) VALUES (?,?,?,?,?)";

        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setString(1, Nombre);
        ps.setString(2, Apellido);
        ps.setString(3, Contrasena);
        ps.setString(4, Dni);
        ps.setString(5, TipoUsuario);
        ps.executeUpdate();
            
        JOptionPane.showMessageDialog(null,"Se inserto correctamente");
        
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error al momento de insertar: "+ex.toString());
        }
    }
    public boolean verificarUsuario(String Dni, String Contrasena) {
        boolean existe = false;
        establecerConexion();
        try {
            String sql = "SELECT * FROM rUsuario WHERE dni = ? AND password = ?";
            PreparedStatement ps = conectar.prepareStatement(sql);
            ps.setString(1, Dni);
            ps.setString(2, Contrasena);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                existe = true; // Usuario encontrado
            }

            JOptionPane.showMessageDialog(null,"Usuario verificado correctamente");
            rs.close();
            ps.close();
            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al verificar usuario: " + e.toString());
        }

        return existe;
    }
}

