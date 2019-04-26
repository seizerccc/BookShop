<%@ page import="com.springmvc.entity.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/base.jsp" %>

<!-- 准许获取session的值-->
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
    <title>Book Store</title>
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <!-- 页面跳转以及需要的js文件-->
    <script type="text/javascript">baselocation="${ctx}"</script>
    <script type="text/javascript" src="../../js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="../../js/systemJS/account.js"></script>
    <script type="text/javascript" src="../../js/systemJS/links.js"></script>
</head>
<body>
<div id="wrap">
    <div class="header">
        <div class="logo"><a id="a_homelogo"><img src="../../images/logo.gif" alt="" title="" border="0" /></a></div>
        <div id="menu">
            <ul>
                <li ><a id="a_goHome">Home</a></li>
                <li class="selected"><a id="a_goAbout">About us</a></li>
                <li><a id="a_goBooks">Books</a></li>
                <li><a id="a_goAccount">Account</a></li>
                <li><a id="a_goCart">Cart</a></li>
            </ul>
        </div>
    </div>
    <div class="center_content">
        <div class="left_content">
            <div class="prod_det_box">
                <div class="box_top"></div>
                <div class="box_center">
                    <br/><br/><br/>

                    <div class="prod_title">Nickname</div><p class="details">${currCustomer.nickname}</p>
                    <div class="prod_title">Realname</div><p class="details">${currCustomer.custname}</p>
                    <div class="prod_title">Phone</div><p class="details">${currCustomer.phone}</p>
                    <br/><br/><br/><br/><br/><br/><br/>
                    <div class="clear"></div>
                </div>
                <div class="box_bottom"></div>
            </div>
            <div class="clear"></div>
        </div>
        <!--end of left content-->
        <div class="right_content">
            <div class="cart">
                <div class="title"><span class="title_icon"><img src="../../images/cart.gif" alt="" title="" /></span>My cart</div>
                <div class="home_cart_content">
                    3 x items | <span class="red">TOTAL: 57$</span>
                    <a id="a_goCart2">view cart</a>
                </div>
            </div>
            <div class="title"><span class="title_icon"><img src="../../images/bullet3.gif" alt="" title="" /></span>About Our Store</div>
            <div class="about">
                <p> <img src="../../images/about.gif" alt="" title="" class="right" /> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. </p>
            </div>
            <div class="right_box">
                <div class="title"><span class="title_icon"><img src="../../images/bullet4.gif" alt="" title="" /></span>Promotions</div>
                <div class="new_prod_box"> <a href="#">product name</a>
                    <div class="new_prod_bg"> <span class="new_icon"><img src="../../images/promo_icon.gif" alt="" title="" /></span> <a href="#"><img src="../../images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a> </div>
                </div>
                <div class="new_prod_box"> <a href="#">product name</a>
                    <div class="new_prod_bg"> <span class="new_icon"><img src="../../images/promo_icon.gif" alt="" title="" /></span> <a href="#"><img src="../../images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a> </div>
                </div>
                <div class="new_prod_box"> <a href="#">product name</a>
                    <div class="new_prod_bg"> <span class="new_icon"><img src="../../images/promo_icon.gif" alt="" title="" /></span> <a href="#"><img src="../../images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a> </div>
                </div>
            </div>
            <div class="right_box">
                <div class="title"><span class="title_icon"><img src="../../images/bullet5.gif" alt="" title="" /></span>Categories</div>
                <ul class="list">
                    <li><a id="a_category1">literature</a></li>
                    <li><a id="a_category2">education</a></li>
                    <li><a id="a_category3">science</a></li>

                </ul>

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
