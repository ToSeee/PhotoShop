<%-- 
    Document   : Login
    Created on : Apr 1, 2015, 5:42:18 PM
    Author     : niponsarikan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



        <title>JSP Page</title>
        <link href="../CSS/login.css" rel="stylesheet" type="text/css">
    </head>
    <body>

        <form action="../Home.jsp" method="POST">

            <div id="loginform">

                <div id="mainlogin">





                    <form action="#">
                        <input type="text" placeholder="username or email" value="" style="padding:12px 20px 12px 10px;" required>
                        <input type="password" placeholder="password" value="" style="padding:12px 20px 12px 10px;"required>
                        <button type="submit">Login</button>


                        <div id="note"><a href="#">Forgot your password?</a></div>
                </div>


            </div>
        </form>


        <div id="regisform">
            <div id="regis">
                <h1>Register</h1>

                <input type="ID" placeholder="username" value="" style="display:block" required>
                <input type="password" placeholder="password" value="" style="display:block"required>
                <input type="Name" placeholder="name" value="" style="display:block"required>
                <input type="Lastname" placeholder="lastname" value="" style="display:block"required>
                <input type="Email" placeholder="email" value=""style="display:block"required>
                <input type="Tel" placeholder="phone number" value="" style="display:block"required>

                <h2>*** For Photographer ***</h2>

                <input type="Address" placeholder="address" value="" style="display:block"required>
                <input type="Distinct" placeholder="distinct" value="" style="display:block"required>
                <input type="Province" placeholder="province" value="" style="display:block"required>
                <input type="Zipcode" placeholder="zipcode" value="" style="display:block"required>
                <input type="Country" placeholder="country" value="" style="display:block"required>
                <input type="PaypalID" placeholder="paypalID" value="" style="display:block"required>

                <div class="slideThree">
                    <input type="checkbox" value="" id="slideThree" name="check" onClick="check(this.value);"/><label for="slideThree" ></label> 
                    <  

                </div> 

            </div>
        </div>  
    </body>
</html>
