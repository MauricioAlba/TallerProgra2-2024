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
 * @author lenovo
 */
public class UserPersonal {
    Mysql connect = new Mysql();
    Connection conn;
    Statement sent;
    
    int id_user;
    String name;
    String rol;
    String dependence;
    String level;
    
    public UserPersonal(){
        conn = connect.getConnection();
    }
    
    public void showUserPersonal(int id){
        id_user = id;
        int band = 0;
        try {
            conn = connect.getConnection();
            sent = conn.createStatement();
            ResultSet resultado = sent.executeQuery("select * from userpersonal where user_id = " + id_user);

            while (resultado.next() && band == 0) {
                band = 1;
                name = resultado.getString("name");
                rol = resultado.getString("rol");
                dependence = resultado.getString("dependence");
                level = resultado.getString("level");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    
    public int getId_user() {
        return id_user;
    }

    // Getter y Setter para name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter y Setter para rol
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Getter y Setter para dependence
    public String getDependence() {
        return dependence;
    }

    public void setDependence(String dependence) {
        this.dependence = dependence;
    }

    // Getter y Setter para level
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    
    
    
}
