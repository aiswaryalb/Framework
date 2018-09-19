<%@taglib uri="/struts-tags" prefix="s" %>
<h2>File upload example</h2><br>
User Image:<s:property value="userImage"/><br><br>
Content Type:<s:property value="userImageContentType"/><br><br>
File Name:<s:property value="userImageFileName"/><br><br>
<img src="images/<s:property value="userImageFileName"/>" />