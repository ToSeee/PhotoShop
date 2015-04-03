<%-- 
    Document   : Home
    Created on : Mar 21, 2015, 5:28:34 PM
    Author     : niponsarikan
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>


       <!-- <link href="themes/bar/bar.css" rel="stylesheet" type="text/css" media="screen">
        <link href="themes/dark/dark.css" rel="stylesheet" type="text/css" media="screen">
        <link href="themes/default/default.css" rel="stylesheet" type="text/css" media="screen">
        <link href="themes/light/light.css" rel="stylesheet" type="text/css" media="screen">
        <link href="nivo-slider.css" rel="stylesheet" type="text/css" media="screen">
        <link href="../themes/bar/bar.css" rel="stylesheet" type="text/css">
        <<link href="style.css" rel="stylesheet" type="text/css" media="screen">
        <link href="assets/base.css" rel="stylesheet" type="text/css">
        <link href="fixed-navigation-bar.css" rel="stylesheet" type="text/css">
        <link rel="shortcut icon" href="http://sixrevisions.com/favicon.ico">
        <link href="SearchBox.css" rel="stylesheet" type="text/css">
        <link href="album.css" rel="stylesheet" type="text/css">
        <link href="Category.css" rel="stylesheet" type="text/css">-->
        
        
        <link href="../themes/bar/bar.css" rel="stylesheet" type="text/css">
        <link href="../themes/dark/dark.css" rel="stylesheet" type="text/css">
        <link href="../themes/default/default.css" rel="stylesheet" type="text/css">
        <link href="../themes/light/light.css" rel="stylesheet" type="text/css">
        <link href="../nivo-slider.css" rel="stylesheet" type="text/css">
        <link href="../CSS/assets/base.css" rel="stylesheet" type="text/css">
        <link href="../CSS/style.css" rel="stylesheet" type="text/css">
        <link href="../CSS/fixed-navigation-bar.css" rel="stylesheet" type="text/css">
        <link href="../CSS/SearchBox.css" rel="stylesheet" type="text/css">
        <link href="../CSS/album.css" rel="stylesheet" type="text/css">
        <link href="../CSS/Category.css" rel="stylesheet" type="text/css">
        <link rel="shortcut icon" href="http://sixrevisions.com/favicon.ico">
        
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


        <div class="slider-wrapper theme-default" >

            <div id="slider" class="nivoSlider"> 

                <img src="images/Home/view.jpg" data-thumb="images/view.jpg" alt="" title="#htmlcaption" />
                <img src="images/Home/photographer.jpg" data-thumb="images/photographer.jpg" alt="" title="#htmlcaption" />
                <img src="images/Home/camera.jpg" data-thumb="images/camera.jpg" alt="" title="#htmlcaption" />
                <img src="images/Home/Money.jpg" data-thumb="images/Money.jpg" alt="" title="#htmlcaption" />
            </div>
            <!--<div id="htmlcaption" class="nivo-html-caption">
                <strong>This</strong> is an example of a <em>HTML</em> caption with <a href="#">a link</a>. 
            </div>-->
        </div>
        <p>
            <script type="text/javascript" src="scripts/jquery-1.9.0.min.js"></script> 
            <script type="text/javascript" src="../jquery.nivo.slider.js"></script>
        </p>
        <script type="text/javascript">
            $(window).load(function () {
                $('#slider').nivoSlider();
            });
        </script>
        <form class="form-wrapper cf">
            <input type="text" placeholder="Search here..." required>
            <button type="submit">Search</button>
        </form>
        <p>Top Photo </p>
        <div id="album">
            <ul class="stage">

                <li class="image-wrapper">
                    <img src="http://i.imgur.com/dj7aqdo.jpg" style="border-radius:10px"/>
                    <span><center>Caption 4</center></span> 
                <li class="image-wrapper">
                    <img src="http://i.imgur.com/dj7aqdo.jpg" style="border-radius:10px"/>
                    <span><center>Caption 4</center></span>  
                <li class="image-wrapper">
                    <img src="http://i.imgur.com/dj7aqdo.jpg" style="border-radius:10px"/>
                    <span><center>Caption 4</center></span>  
                <li class="image-wrapper">
                    <img src="http://i.imgur.com/dj7aqdo.jpg" style="border-radius:10px"/>
                    <span><center>Caption 4</center></span>  
                <li class="image-wrapper">
                    <img src="http://i.imgur.com/dj7aqdo.jpg" style="border-radius:10px"/>
                    <span><center>Caption 4</center></span>  
                <li class="image-wrapper">
                    <img src="http://i.imgur.com/dj7aqdo.jpg" style="border-radius:10px"/>
                    <span><center>Caption 4</center></span>      

            </ul>
        </div>

        <p>New Release </p>
        <div id="album">
            <ul class="stage">

                <li class="image-wrapper">
                    <img src="http://i.imgur.com/dj7aqdo.jpg" style="border-radius:10px"/>
                    <span><center>Caption 4</center></span> 
                <li class="image-wrapper">
                    <img src="http://i.imgur.com/dj7aqdo.jpg" style="border-radius:10px"/>
                    <span><center>Caption 4</center></span>  
                <li class="image-wrapper">
                    <img src="http://i.imgur.com/dj7aqdo.jpg" style="border-radius:10px"/>
                    <span><center>Caption 4</center></span>  
                <li class="image-wrapper">
                    <img src="http://i.imgur.com/dj7aqdo.jpg" style="border-radius:10px"/>
                    <span><center>Caption 4</center></span>  
                <li class="image-wrapper">
                    <img src="http://i.imgur.com/dj7aqdo.jpg" style="border-radius:10px"/>
                    <span><center>Caption 4</center></span>  
                <li class="image-wrapper">
                    <img src="http://i.imgur.com/dj7aqdo.jpg" style="border-radius:10px"/>
                    <span><center>Caption 4</center></span>      

            </ul>
        </div>
        <p>Categories</p>
        <div style="margin-left:23em;margin-right:20em;">

            <div class="back">   
                <div class="grow pic">
           	    <img src="../akaroa_new_zealand-wallpaper-3840x2160.jpg" width="3840" height="2160"> 
                </div>
                <div class="label">
                    People
                </div>  
            </div> 

            <div class="back">   
                <div class="shrink pic">
                    <img src="../akaroa_new_zealand-wallpaper-3840x2160.jpg" width="3840" height="2160"> 
                </div>
                <div class="label">
                    Place
                </div>  
            </div> 

            <div class="back">   
                <div class="sidepan pic">
                    <img src="../akaroa_new_zealand-wallpaper-3840x2160.jpg" width="3840" height="2160"> 
                </div>
                <div class="label">
                    Nature
                </div>  
            </div> <br>

            <div class="back">   
                <div class="vertpan pic">
                    <img src="../akaroa_new_zealand-wallpaper-3840x2160.jpg" width="3840" height="2160"> 
                </div>
                <div class="label">
                    Animal
                </div>  
            </div> 

            <div class="back">   
                <div class="blur pic">
                   <img src="../akaroa_new_zealand-wallpaper-3840x2160.jpg" width="3840" height="2160"> 
                </div>
                <div class="label">
                    Food
                </div>  
            </div> 

            <div class="back">   
                <div class="bw pic">
                    <img src="../akaroa_new_zealand-wallpaper-3840x2160.jpg" width="3840" height="2160"> 
                </div>
                <div class="label">
                    Other
                </div>  
            </div> 

        </div>


    </body>
</html>