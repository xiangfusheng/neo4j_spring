<#include "edit.ftl" />
<@edit>
	<body>
		<#list list as l>
			${l.friendA.name} And ${l.friendB.name} is friend.<br>
		</#list>
	</body>
</@edit>
