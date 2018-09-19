<%@taglib uri="/struts-tags" prefix="s" %>
Sorry an exception occurred !!
<p>Exception Name : <s:property value="exception"></s:property></p>
<p>Exception Details : <s:property value="exceptionStack"></s:property></p>
<form>
    <input type="button" value="Back" onclick="history.back()">
</form>