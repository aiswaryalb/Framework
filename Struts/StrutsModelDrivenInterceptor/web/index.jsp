<%@taglib uri="/struts-tags" prefix="s" %>
<s:form action="login">
    <s:textfield name="name" label="Name"></s:textfield>
    <s:password name="password" label="Password"/>
    <s:submit value="Login"></s:submit>
</s:form>