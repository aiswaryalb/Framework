<%@taglib uri="/struts-tags" prefix="s" %>
<h3>All records</h3>

<s:iterator value="list">
    <fieldset>
        <s:property value="id"/><br>
        <s:property value="name"/><br>
        <s:property value="password"/><br>
        
    </fieldset>
</s:iterator>