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
    <form id="addUser" action="addPersonNode" method="post"> 
	    userName: <input name="name"/><br/> 
	    born:<input name="born"/><br/>
	    <input type="submit" value="添加新用户节点"/> 
	</form>
  </body>
  </@edit>
</html>
