/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tienda;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**

/**
 *
 * @author Anita
 */
public class Conexion {
     //Crear instancias de conexion
    Connection miConexion; //Instancia de conexion
    Statement miSentencia; //Instancia de sentencias a ejecutar
    ResultSet miResultado; //Instancia de resultado de consultas
    
    public Connection conectar(){
        try{
            //Driver de la Bd
            Class.forName("com.mysql.jdbc.Driver");
            //Indicar nombre, puerto y la BD
            String servidor="jdbc:mysql://localhost:3306/bebe";
            //Inidcar usuario y contraseña
            String user="root";
            String pwd="";
            //Iniciar la conexion
            miConexion=DriverManager.getConnection(servidor, user, pwd);            
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la BD o en el Driver");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion "+ex.getMessage());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en el proceso");
        }finally{
            return miConexion;
        }
    }
}
