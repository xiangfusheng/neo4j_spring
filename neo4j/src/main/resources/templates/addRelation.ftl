<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'addUser.jsp' starting page</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <#include "edit.ftl" />
  <@edit>
	  <body>
	  	<form id="addUser" action="addRelation" method="post">
		   <select name="aID" style="width:178px;" value="">
		        <option value="">--请选择--</option>
		        <#list list as l>
		            <option value="${l.id}">${l.name}</option>
		        </#list>
		    </select>
		    <select name="bID" style="width:178px;" value="">
		        <option value="">--请选择--</option>
		        <#list list as l>
		            <option value="${l.id}">${l.name}</option>
		        </#list>
		        <input type="submit" value="添加新用户节点"/>
		    </select>
	    </form>
	  </body>
  </@edit>
</html>
