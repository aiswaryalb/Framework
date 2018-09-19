<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form action="userImage" method="post" enctype="multipart/form-data">
    
    <s:file name="userImage" label="User Image"/>
    <s:submit value="Upload" align="center"/>
</s:form>