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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author niponsarikan
 */
public class ShowPaymentData {
    public Connection conn;
    private String db_driver = "com.mysql.jdbc.Driver";
    private String db_url = "jdbc:mysql://localhost:3306/Photo?zeroDateTimeBehavior=convertToNull";
    private String db_user = "root";
    private String db_pass = "root";
    
    
    public ShowPaymentData(){
        try {
            
            Class.forName(db_driver);
            conn = DriverManager.getConnection(db_url, db_user, db_pass);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RegLogDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // user for
    public List showMerchantSale(String mID){
        List <ProductSold> products = new LinkedList<ProductSold>();
        try {
            PreparedStatement show = conn.prepareStatement("select * from order_des natural join product"
                    + "where m_ID =? and PaymentStatus = 'No' ;");
            ResultSet rs = show.executeQuery();
            //while
        } catch (SQLException ex) {
            Logger.getLogger(ShowPaymentData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
