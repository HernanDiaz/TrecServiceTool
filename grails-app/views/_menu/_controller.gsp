<li class="dropdown">
	<a class="dropdown-toggle" data-toggle="dropdown" href="#">Browse <b class="caret"></b></a>
	<ul class="dropdown-menu">
		<g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
		<g:if test="${c.fullName.contains('Role') || c.fullName.contains('User')}">
                  <sec:ifAllGranted roles="ROLE_ADMIN">
                     <li class="controller${params.controller == c.logicalPropertyName ? " active" : ""}">
				<g:link controller="${c.logicalPropertyName}" action="index">
                                        <i class="glyphicon glyphicon-cloud"></i>
					<g:message code="${c.logicalPropertyName}.label" default="${c.logicalPropertyName.capitalize()}"/>
				</g:link>
		     </li>
                  </sec:ifAllGranted>	
                  </g:if>
                <g:if test="${c.fullName.contains('Template')}">
                  <sec:ifAnyGranted roles="ROLE_ADMIN,ROLE_USER">
                    <li class="controller${params.controller == c.logicalPropertyName ? " active" : ""}">
				<g:link controller="${c.logicalPropertyName}" action="index">
                                        <i class="glyphicon glyphicon-home"></i>
					<g:message code="${c.logicalPropertyName}.label" default="${c.logicalPropertyName.capitalize()}"/>
				</g:link>
		    </li>
                  </sec:ifAnyGranted>            
                </g:if>
                <g:if test="${c.fullName.contains('Home')}">
                       <li class="controller${params.controller == c.logicalPropertyName ? " active" : ""}">
				<g:link controller="${c.logicalPropertyName}" action="index">
                                        <i class="glyphicon glyphicon-cloud"></i>
					<g:message code="${c.logicalPropertyName}.label" default="${c.logicalPropertyName.capitalize()}"/>
				</g:link>
			</li>
                </g:if>   
                </g:each>
	</ul>
</li>
