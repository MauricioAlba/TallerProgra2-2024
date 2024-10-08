package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {

    public static Connection getConnection() {
        Connection cn = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");//puede cambiar 
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datosdeprogra", "root", "");
            //JOptionPane.showMessageDialog(null, "conexion exitosa");
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            //JOptionPane.showMessageDialog(null, "ingreso datos");
        } catch (Exception e1) {
            System.out.println("Error: " + e1.getMessage());
        }
        return cn;
    }
}
