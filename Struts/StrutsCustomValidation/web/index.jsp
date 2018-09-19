<%@taglib uri="/struts-tags" prefix="s" %>
<s:form action="register">
    <s:textfield name="name" label="Name"/>
    <s:password name="password" label="Password"/>
    <s:submit value="Register"/>
</s:form>