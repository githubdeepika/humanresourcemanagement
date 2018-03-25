package project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn;
    public static Connection ConnecrDB(){
         try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Documents\\NetBeansProjects\\Humanresourcemanagementsystem\\HumanNew.sqlite");
            return conn;
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
           return null;
        }
    }
}
