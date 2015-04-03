/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.sql.DataSource;


/**
 *
 * @author niponsarikan
 */
public class RegisterDB extends HttpServlet {
    /*@Resource(name = "Photo")
    private DataSource photo;*/

    
    
    Connection conn;
    PreparedStatement pre;
    
    

    /*public void init() {
        conn = (Connection) getServletContext().getAttribute("connection");
        try {
            pre = conn.prepareStatement("select * from Admin where A_Username = ?;");
        } catch (SQLException ex) {
            Logger.getLogger(RegisterDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    /*public void init() {
        try {   
            conn = photo.getConnection();
            pre = conn.prepareStatement("select * from Admin where A_Username = ?;");
        } catch (SQLException ex) {
            Logger.getLogger(RegisterDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    }

    public boolean checkDuplicate(String username) {
        boolean status = false;
        try {
            PreparedStatement admin = conn.prepareStatement("select * from Admin where A_Username = ?;");
            PreparedStatement merchant = conn.prepareStatement("select * from Merchant where M_Username = ?;");
            PreparedStatement customer = conn.prepareStatement("select * from Customer where C_Username = ?;");
            
            admin.setString(1, username);
            merchant.setString(1, username);
            customer.setString(1, username);
            ResultSet rs = admin.executeQuery();
            if (rs.next()) {
                status= false;
            } else {
                rs = merchant.executeQuery();
                if (rs.next()) {
                    status= false;
                } else {
                    rs = customer.executeQuery();
                    if (rs.next()) {
                        status= false;
                    } else {
                        status= true;
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegisterDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
   public void kuy(){
        System.out.println("kuy");
   }
    
    
     public static void main(String[] args) {
         RegisterDB a= new RegisterDB();
         a.init()
      
       
               
         
        
         
         
         
     
         
     }*/
    
    public RegisterDB(){
        try {   
            //conn = photo.getConnection();
            //pre = conn.prepareStatement("select * from Admin where A_Username = ?;");
            Class.forName("com.mysql.jdbc.Driver");
 
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Photo?zeroDateTimeBehavior=convertToNull","root","root");
        } catch (SQLException ex) {
            Logger.getLogger(RegisterDB.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        RegisterDB a = new RegisterDB();
        
        
    }
    

}
