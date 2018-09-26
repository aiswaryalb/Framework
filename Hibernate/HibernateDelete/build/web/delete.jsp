<%@page import="pack.deldb" %>
<jsp:useBean id="obj" class="pack.del"></jsp:useBean>
<jsp:setProperty property="*" name="obj"></jsp:setProperty>
<%
    deldb.deleteitem(obj);
    out.print("Value deleted");
    
    %>
    