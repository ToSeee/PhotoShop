/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Bean.Product;
import Database.ManageProduct;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author HenGz
 */
@WebServlet(name = "UploadServlet", urlPatterns = {"/upload.do"})
public class UploadServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //private final String UPLOAD_DIRECTORY = "/Users/niponsarikan/Desktop/File";
    private final String UPLOAD_DIRECTORY = "C:\\Users\\HenGzTy\\Desktop";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        /*String namepic = request.getParameter("namepic");
         Double pricepic = Double.parseDouble(request.getParameter("pricepic"));
         String catalog = request.getParameter("catalog");
         String description = request.getParameter("description");
        
         HttpSession session = request.getSession();
         String uid = (String) session.getAttribute("userid");
        
         ManageProduct ManagePro = new ManageProduct();
        
         Product pd = new Product(namepic, pricepic, description, catalog, uid);
        
         ManagePro.addProduct(pd);*/

        //process only if its multipart content
        HttpSession session = request.getSession();
        String uid = (String) session.getAttribute("userid");

        ManageProduct ManagePro = new ManageProduct();
        Product pd = new Product();

        if (ServletFileUpload.isMultipartContent(request)) {
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                        new DiskFileItemFactory()).parseRequest(request);
                //out.print(multiparts);
                for (FileItem item : multiparts) {
                    /*if (!item.isFormField()) {
                     String name = new File(item.getName()).getName();
                     item.write(new File(UPLOAD_DIRECTORY + File.separator + name));
                         
                        
                     } else{
                     String fieldName = item.getFieldName();
                     String fieldValue = item.getString();
                     out.println(fieldName +" "+ fieldValue);
                     if(fieldName.equals("namepic")){
                            
                     }
                     }*/
                    if (item.isFormField()) {
                        String fieldName = item.getFieldName();
                        String fieldValue = item.getString();
                        if (fieldName.equals("namepic")) {
                            pd.setName(fieldValue);
                        } else if (fieldName.equals("pricepic")) {
                            pd.setPrice(Double.parseDouble(fieldValue));
                        } else if (fieldName.equals("description")) {
                            pd.setDescription(fieldValue);
                        } else if (fieldName.equals("catalog")) {
                            pd.setCateID(fieldValue);
                        }
                    } else {
                        continue;
                    }
                    pd.setmID(uid);
                }
                ManagePro.addProduct(pd);
                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        String name = new File(item.getName()).getName();
                        item.write(new File(UPLOAD_DIRECTORY + File.separator + name));
                    }
                }
                
                //File uploaded successfully

                request.setAttribute("message", "File Uploaded Successfully");

            } catch (Exception ex) {
                request.setAttribute("message", "File Upload Failed due to " + ex);
            }
        } else {
            request.setAttribute("message",
                    "Sorry this Servlet only handles file upload request");

        }
        // request.getRequestDispatcher("/ResultPage.jsp").forward(request, response);

    }

}
//test