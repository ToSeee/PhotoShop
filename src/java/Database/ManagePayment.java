/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Bean.ProductSold;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author niponsarikan
 */
public class ManagePayment {
     public Connection conn;
    private String db_driver = "com.mysql.jdbc.Driver";
    private String db_url = "jdbc:mysql://localhost:3306/Photo?zeroDateTimeBehavior=convertToNull";
    private String db_user = "root";
    private String db_pass = "root";
    
    
    public ManagePayment(){
        try {
            
            Class.forName(db_driver);
            conn = DriverManager.getConnection(db_url, db_user, db_pass);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RegLogDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Use For merChant
    public void requestPayment(String mID,double salesum){
         try {
             ManagePayment manage= new ManagePayment();
             PreparedStatement re = conn.prepareStatement("update product natural join order_des set PaymentStatus = 'Yes' where m_id = ?;");
             re.setInt(1, Integer.parseInt(mID));
             re.executeUpdate();
             manage.setPayment(mID, salesum);
             
         } catch (SQLException ex) {
             Logger.getLogger(ManagePayment.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    
    //add to M_Payment
    public void setPayment(String mID,double salesum){
         try {
             PreparedStatement set = conn.prepareStatement("insert into M_Payment values(default,?,'No',now(),?,default)");
             set.setDouble(1, salesum);
             set.setInt(2, Integer.parseInt(mID));
             set.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(ManagePayment.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    //use to set when payment is already (Use For admin)
    public void setResponePayment(String Paymentid,String aID){
         try {
             PreparedStatement set = conn.prepareStatement("update M_Payment set Mpay_Status ='Yes' ,A_ID = ? where MPay_ID = ?;");
             set.setInt(1, Integer.parseInt(aID));
             set.setInt(2, Integer.parseInt(Paymentid));
             set.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(ManagePayment.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}
