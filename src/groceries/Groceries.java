/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceries;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Robert
 */
public class Groceries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Connection myConnection = null;
     Statement myStatement = null;
     ResultSet myResult = null;
     String myQuery = "SELECT * FROM ROBERT.VEGETABLES";
     String user , url , password ;
     user = "Robert";
     url = "jdbc:derby://localhost:1527/Groceries";
     password = "muffin";
     
     try{
         myConnection = DriverManager.getConnection(url,user,password);
         myStatement = myConnection.createStatement();
         myResult = myStatement.executeQuery(myQuery);
         System.out.println(myResult);
         
     }catch (SQLException e){
         e.printStackTrace();
     }
    }
    
}
