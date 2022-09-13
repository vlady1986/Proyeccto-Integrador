 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author quish
 */
public class Conexion {

    private static Connection con=null;
    private static String url="jdbc:mysql://localhost:3306/dbhosterialaguacoto";
    private static String user = "root";
    private static String paswd = "Intander29@";
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, paswd);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (Exception e) {
            System.out.println("Conexion Errada");
        }
        return con;
    
    }
    
    public static void closeConection(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "Se cerro la conexion");
            
        } catch (Exception e) {
            System.out.println("No exite conexion abierta");
        }
        
    }

}
