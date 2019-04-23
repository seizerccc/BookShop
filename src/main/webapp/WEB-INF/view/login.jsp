<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/base.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
    <title>Book Store</title>
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <!-- 页面跳转以及需要的js文件-->
    <script type="text/javascript">baselocation="${ctx}"</script>
    <script src="../../js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="../../js/systemJS/login.js"></script>
</head>
<body>
<div id="wrap">
    <div class="header">
        <div class="logo"><img src="../../images/logo.gif" alt="" title="" border="0" /></div>
        <div id="menu">
            <ul>
                <li class="selected"><a href="login.html">Login</a></li>

            </ul>
        </div>
    </div>
    <div class="center_content">
        <div class="left_content">
            <div class="title"><span class="title_icon"><img src="../../images/bullet1.gif" alt="" title="" /></span>Login</div>
            <div class="feat_prod_box_details">
                <p class="details">Welcome to our online book market, please login first!</p>
                <div class="contact_form">
                    <div class="form_subtitle">Type in your informatino here</div>
                    <form name="register" action="#">
                        <div class="form_row">
                            <label class="contact"><strong>Nickname:</strong></label>
                            <input type="text" class="contact_input" id="nickname"/>
                        </div>
                        <div class="form_row">
                            <label class="contact"><strong>Password:</strong></label>
                            <input type="password" class="contact_input"id="password" />
                        </div>

                        <div class="form_row">
                            <button type="button" id="btn_login">login</button>
                        </div>
                    </form>

                    <div ><a id="a_gotoRegister">I don't have account</a></div>
                    <div><a id="a_gotoHome">go to home</a></div>
                    </br> </br></br></br></br></br></br></br></br></br></br></br>
                </div>
            </div>
            <div class="clear"></div>
        </div>
        <!--end of left content-->
        <div class="right_content">
            <div class="title"><span class="title_icon"><img src="../../images/bullet3.gif" alt="" title="" /></span>About Our Store</div>
            <div class="about">
                <p> <img src="../../images/about.gif" alt="" title="" class="right" /> This is a century-old shop where you can find a variety of books from all over the world. Our price is very reasonable and our reputation is quite good. </p>
            </div>
        </div>
        <!--end of right content-->
        <div class="clear"></div>
    </div>
    <!--end of center content-->
    <div class="footer">
        <div class="left_footer"><img src="../../images/footer_logo.gif" alt="" title="" /><br />
        </div>

    </div>
</div>
</body>
</html>

