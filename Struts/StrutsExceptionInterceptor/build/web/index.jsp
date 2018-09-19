<%@taglib uri="/struts-tags" prefix="s" %>
<s:form action="login">
    <s:textfield name="name" label="Name" ></s:textfield>
    <s:textfield name="password" label="Password"></s:textfield>
    <s:submit value="Login"/>
</s:form>