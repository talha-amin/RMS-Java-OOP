/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resturant_s;
//importing libraries
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Talha
 */

public class MyConnector {
    //variable for database
    Connection con;
    //constructor
    public MyConnector(){
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://E:/EmpDatabase.accdb;memory=true");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    Connection connectionMaker(){
        return con;   
}
}