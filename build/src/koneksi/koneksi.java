/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Monica
 */
public class koneksi {
     private static Connection konek;
    public static Connection getConnection(){
        if(konek == null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/miler", "root", "");
            } catch(SQLException sqlex){
                JOptionPane.showMessageDialog(null, sqlex.getMessage());
            }
        }
        return konek;
        
    }
}
