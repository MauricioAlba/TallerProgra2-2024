package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Mysql {

    public static Connection getConnection() {
        Connection link = null;
        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection("jdbc:mysql://LocalHost:3307/datosdeprogra", "root", "");
        } catch (SQLException e) {
            System.out.println("Error1: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
       
    
     public static Connection conectar(){
            Connection link = null;
        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection("jdbc:mysql://LocalHost:3307/datosdeprogra", "root", "");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());   
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
}
