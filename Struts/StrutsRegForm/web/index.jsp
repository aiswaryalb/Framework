<%-- 
    Document   : index
    Created on : Sep 18, 2018, 3:11:48 PM
    Author     : Aiswarya
--%>

<%@taglib uri="/struts-tags" prefix="s" %>
<s:form action="register">
    <s:textfield name="name" label="UserName"></s:textfield>
    <s:textfield name="password" label="Password"></s:textfield>
    <s:textfield name="email" label="Email" ></s:textfield>
    <s:radio list="{'male','female'}" name="gender"></s:radio>
    <s:submit value="register" ></s:submit>
</s:form>