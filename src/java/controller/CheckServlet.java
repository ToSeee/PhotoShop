package controller;

/**
 *
 * @author HenGz
 */

import Bean.User;
import Database.RegLogDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "checkServlet", urlPatterns = {"/check.do"})
public class CheckServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            // all for insert into database
            String id = request.getParameter("id");
            String pwd = request.getParameter("pwd");
            String name = request.getParameter("name");
            String lname = request.getParameter("lname");
            String email = request.getParameter("email");
            String tel = request.getParameter("tel");
            String address = request.getParameter("address");
            String distinct = request.getParameter("distinct");
            String province = request.getParameter("province");
            String zipcode = request.getParameter("zipcode");
            String country = request.getParameter("country");
            String ppid = request.getParameter("ppid");
            String check = request.getParameter("check");
            
            Boolean s = (address.equals("")) && (distinct.equals("")) && (province.equals("")) && (zipcode.equals("")) && (country.equals("")) && (ppid.equals(""))  ;
            
            User regist = new User();
            RegLogDB Re = new RegLogDB();
            
          
            
            if(check == null){
                //Register for customer
                regist(id,pwd,name,lname,email,tel);
            }else if(check.equals("photographer") && s){
                //Register for photographer
                regist(id,pwd,name,lname,email,tel,address,distinct,province,zipcode,country,ppid);
            }else{
                //Insert data not for photographer but check photographer
                getServletContext().getRequestDispatcher("/register.html").forward(request,response);
            }
           
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void regist(String id, String pwd, String name, String lname, String email, String tel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void regist(String id, String pwd, String name, String lname, String email, String tel, String address, String distinct, String province, String zipcode, String country, String ppid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
