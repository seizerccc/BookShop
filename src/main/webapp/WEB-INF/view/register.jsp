<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
    <title>Book Store</title>
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <!-- 页面跳转以及需要的js文件-->
    <script type="text/javascript">baselocation="${ctx}"</script>
    <script type="text/javascript" src="../../js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="../../js/systemJS/register.js"></script>
</head>
<body>
<div id="wrap">
    <div class="header">
        <div class="logo"><a ><img src="../../images/logo.gif" alt="" title="" border="0" /></a></div>
        <div id="menu">
            <ul>
                <li><a id="a_goLogin">Login</a></li>
                <li class="selected"><a id="a_goRegister">Register</a></li>
            </ul>
        </div>
    </div>
    <div class="center_content">
        <div class="left_content">
            <div class="title"><span class="title_icon"><img src="../../images/bullet1.gif" alt="" title="" /></span>Register</div>
            <div class="feat_prod_box_details">
                <p class="details">You can create a new account with your information here.<br/><b>Make sure your information is true and confirmed because once being saved, it can not be changed!</b></p>
                <div class="contact_form">
                    <div class="form_subtitle">create new account</div>
                    <form name="register" action="#">
                        <div class="form_row">
                            <label class="contact"><strong>Realname:</strong></label>
                            <input type="text" id="realname" class="contact_input" />
                        </div>
                        <div class="form_row">
                            <label class="contact"><strong>Nickname:</strong></label>
                            <input type="text" id="nickname" class="contact_input" />
                        </div>
                        <div class="form_row">
                            <label class="contact"><strong>Password:</strong></label>
                            <input type="password" id="password" class="contact_input" />
                        </div>
                        <div class="form_row">
                            <label class="contact"><strong>Phone:</strong></label>
                            <input type="text" id="phone" class="contact_input" />
                        </div>

                        <div class="form_row">
                            <input type="button" id="btn_register" class="register" value="register" />
                        </div>
                    </form>
                </div>

            </div>
            <div class="clear"></div>
            <br/><br/><br/><br/><br/><br/><br/>
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









