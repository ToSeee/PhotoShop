<%-- 
    Document   : Upload
    Created on : Apr 21, 2015, 3:06:38 AM
    Author     : HenGzTy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <meta charset="UTF-8">
        <link href="css/style" rel="stylesheet" type="text/css">
        <style type="text/css" media="all">
            @import url("CSS/upload.css");
            @import url("CSS/fixed-navigation-bar.css");
        </style>
    </head>

    <body>


        <nav class="fixed-nav-bar">
            <div id="menu" class="menu">
                <!-- Example responsive navigation menu  -->
                <a class="show" href="#menu">Menu</a><a class="hide" href="#hidemenu">Menu</a>
                <ul class="menu-items">
                    <li><a href="//sixrevisions.com">Home</a></li>
                    <li><a href="//sixrevisions.com/about/">Cart</a></li>

                    <li><a href="//twitter.com/sixrevisions">Sign In</a></li>
                    <li><a href="//www.facebook.com/sixrevisions">Sign Up</a></li>
                    <li><a href="//sixrevisions.com/contact/">About</a></li>
                </ul>
            </div>
        </nav>

        <form action="Upload.jsp" METHOD="POST"  enctype="multipart/form-data">

            <div class="choose ">


                <div class="buttonchoose roundedCorners animation"  style="margin-left:2%; height:30px; width:250px; padding:2%; display:block;" >
                    <input type="file" name="filepic" />
                </div>



                <h1>Name</h1>
                <input type="name"  name="namepic"	 	style="margin:10px;width:710px; padding-left:15px; display:block;border-radius:10px; border:#000; background-color:#B4B4B4;">
                <h1>Price</h1>
                <input type="price"  name="pricepic" 	style="margin:10px;width:710px; padding-left:15px; display:block;border-radius:10px; border:#000; background-color:#B4B4B4;">
                <h1>Catalog</h1>
                <div class="dropdown" style="margin-left:10px;">
                    <select name="catalog" class="dropdown-select">
                        <option value="1">People</option>
                        <option value="2">Place</option>
                        <option value="3">Nature</option>
                        <option value="4">Animal</option>
                        <option value="5">Food</option>
                        <option value="6">Other..</option>
                    </select>
                </div>
                <br>
                <h1>Description</h1>
                <TEXTAREA type="description" name="description"  style="border-radius:10px;border-color:#F36; padding: 15px; margin:10px; border: #09F; width:700px; height:300px;"  ></TEXTAREA>
<button>Upload</button>
</div>
     </form>
   
 
</body>
</html>