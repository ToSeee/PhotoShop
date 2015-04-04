/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Bean.Register;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author niponsarikan
 */
public class RegLogDB extends HttpServlet {

    Connection conn;
    String db_driver = "com.mysql.jdbc.Driver";
    String db_url = "jdbc:mysql://localhost:3306/Photo?zeroDateTimeBehavior=convertToNull";
    String db_user = "root";
    String db_pass = "root";

    public RegLogDB() {
        try {
            Class.forName(db_driver);

            conn = DriverManager.getConnection(db_url, db_user, db_pass);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RegLogDB.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    /* 
     
     Check to find duplicate user id 
     If duplicate return false
     Otherwise return true
     
     */
    public boolean checkDuplicate(String username) {
        boolean status = false;
        try {
            PreparedStatement admin = conn.prepareStatement("select * from Admin where A_Username = ?;");
            PreparedStatement merchant = conn.prepareStatement("select * from Merchant where M_Username = ?;");
            PreparedStatement customer = conn.prepareStatement("select * from Customer where C_Username = ?;");

            admin.setString(1, username);
            merchant.setString(1, username);
            customer.setString(1, username);
            ResultSet ad = admin.executeQuery();
            ResultSet mer = merchant.executeQuery();
            ResultSet cus = customer.executeQuery();

            status = !(ad.next() || mer.next() || cus.next());

        } catch (SQLException ex) {
            Logger.getLogger(RegLogDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public void addCustomer(Register customer) {
        try {
            PreparedStatement cus = conn.prepareStatement("insert into customer values(default,?,?,?,?,?,?,'Yes',now())");
            cus.setString(1, customer.getFirstname());
            cus.setString(2, customer.getLastname());
            cus.setString(3, customer.getUsername());
            cus.setString(4, customer.getPassword());
            cus.setString(5, customer.getEmail());
            cus.setString(6, customer.getPhone());
            cus.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegLogDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addMerchant(Register merchant) {
        try {
            PreparedStatement mer = conn.prepareStatement("insert into merchant values(default,?,?,?,?,?,?,?,?,?,?,?,?,'Yes',now())");
            mer.setString(1, merchant.getFirstname());
            mer.setString(2, merchant.getLastname());
            mer.setString(3, merchant.getUsername());
            mer.setString(4, merchant.getPassword());
            mer.setString(5, merchant.getEmail());
            mer.setString(6, merchant.getPhone());
            mer.setString(7, merchant.getPaypal());
            mer.setString(8, merchant.getAddress());
            mer.setString(9, merchant.getDistinct());
            mer.setString(10, merchant.getProvince());
            mer.setString(11, merchant.getZipcode());
            mer.setString(12, merchant.getCountry());
            mer.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegLogDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
    
     Check id&password when login
     if correct return true
     Otherwise return false
    
     */
    public boolean checkLogin(String username, String pass) {
        boolean status = false;
        try {
            PreparedStatement admin = conn.prepareStatement("select * from Admin where A_Username = ? and A_Password =?;");
            PreparedStatement merchant = conn.prepareStatement("select * from Merchant where M_Username = ? and M_password=?;");
            PreparedStatement customer = conn.prepareStatement("select * from Customer where C_Username = ? and C_Password=?;");

            admin.setString(1, username);
            merchant.setString(1, username);
            customer.setString(1, username);

            admin.setString(2, pass);
            merchant.setString(2, pass);
            customer.setString(2, pass);

            ResultSet ad = admin.executeQuery();
            ResultSet mer = merchant.executeQuery();
            ResultSet cus = customer.executeQuery();

            status = ad.next() || mer.next() || cus.next();

        } catch (SQLException ex) {
            Logger.getLogger(RegLogDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public static void main(String[] args) {
        RegLogDB a = new RegLogDB();
        System.out.println(a.checkLogin("maof", "maof"));

        /*
         java.util.Date dt = new java.util.Date();
         java.text.SimpleDateFormat sdf= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         String currentTime = sdf.format(dt);*/
    }

}
