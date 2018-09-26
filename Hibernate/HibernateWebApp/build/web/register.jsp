<%-- 
    Document   : register
    Created on : Sep 26, 2018, 10:38:54 AM
    Author     : Aiswarya
--%>

<%@page import="p1.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="obj" class="p1.User"></jsp:useBean>
        <jsp:setProperty property="*" name="obj"></jsp:setProperty>
        <%
            int i=UserDao.register(obj);
            if(i>0)
                out.print("You are successfully registered");
            
            %>
  
    </body>
</html>
