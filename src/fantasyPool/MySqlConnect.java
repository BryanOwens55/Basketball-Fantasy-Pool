/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasyPool;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Owner
 */
public class MySqlConnect {
    Connection conn = null;
    static String username;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase?useSSL=false", "root", "hockey");
            return conn;
        }
        catch(Exception e){
              return null;
        }
    }
}

