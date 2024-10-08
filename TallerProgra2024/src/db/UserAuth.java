/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import Mysql.Mysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author albam
 */
public class UserAuth {
    Mysql connect = new Mysql();
    Connection conn;
    Statement sent;
    
    public UserAuth(){
        conn = connect.getConnection();
    }
    
    public int Login(String usuario, String contra) {

        int band = 0;
        int userId = 0;
        try {
            conn = connect.getConnection();
            sent = conn.createStatement();
            ResultSet resultado = sent.executeQuery("select user_id from userpersonal where user= '" + usuario + "' and password= '" + contra + "'");

            while (resultado.next() && band == 0) {
                band = 1;
                userId = Integer.parseInt(resultado.getString("user_id"));
            }

            if (band == 1) {
                JOptionPane.showMessageDialog(null, "Bienvenido otra vez ");
                return userId;
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO O CONTRASEÑA INCORRECTOS",
                        "CUENTA NO VALIDA", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return 0;
    }

}
