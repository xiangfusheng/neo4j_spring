<#include "edit.ftl" />
 <@edit>
	<body>
		
	   	<#list list as l>
			${l.name}-----${l.born}<br>
		</#list>
	    
	</body> 
</@edit>
