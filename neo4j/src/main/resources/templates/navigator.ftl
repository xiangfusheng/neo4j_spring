<#macro base>
<html> 
<body>
上：welcome ${name}  to freemarker!
    	这是导航页面
    	<#nested>
    下：welcome ${name}  to freemarker!
</body> 
</html>
</#macro>