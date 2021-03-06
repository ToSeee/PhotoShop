/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Bean.Product;
import Database.RegLogDB;
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
 * @author Koshiz
 */
public class Cart {

    private Connection conn;

    //  *** Information Can Change Depend on Computer Mysql Directories ^_^  eiei
    private String db_driver = "com.mysql.jdbc.Driver";
    private String db_url = "jdbc:mysql://localhost:3306/Photo?zeroDateTimeBehavior=convertToNull";
    private String db_user = "root";
    private String db_pass = "root";
    List<Product> cart;

    public Cart() {
        try {
            this.cart = new LinkedList<Product>();
            Class.forName(db_driver);
            conn = DriverManager.getConnection(db_url, db_user, db_pass);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RegLogDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public void addItem(String pid) {

        try {
            String sql = "select * from product natural join merchant where P_ID = '" + pid + "'";
            PreparedStatement add = conn.prepareStatement(sql);
            ResultSet rs = add.executeQuery();
            int check = 0;
            for (Product c : cart) {
                if (pid.equals(c.getId())) {
                    check = 1;
                    break;
                }
            }
            if (check == 0) {
                while (rs.next()) {
                    Product product = new Product();
                    product.setId(pid);
                    product.setmID(rs.getString("M_ID"));
                    product.setAddress(rs.getString("P_Address"));
                    product.setDate(rs.getString("P_Date"));
                    product.setDescription(rs.getString("P_Des"));
                    product.setName(rs.getString("P_Name"));
                    product.setPrice(rs.getDouble("P_Price"));
                    product.setStatus(rs.getString("P_Status"));
                    product.setWatermark(rs.getString("P_WatermarkUrl"));
                    cart.add(product);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public double PriceSum(List<Product> cart) {
        double sum = 0;
        for (Product c : cart) {
            sum += c.getPrice();
        }
        return sum;

    }

    public void removeItem(String pid) {
        for (Product c : cart) {
            if (pid.equals(c.getId())) {
                cart.remove(c);
            }
        }
    }

    /*public static void main(String[] args) {
     Cart x = new Cart();
     x.addItem("7");
     x.addItem("9");
     x.removeItem("7");
     System.out.println(x.PriceSum(x.getCart()));
        
     }*/
}
