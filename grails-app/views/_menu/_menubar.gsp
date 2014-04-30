<div class="">
	<ul class="nav nav-tabs" data-role="listview" data-split-icon="gear" data-filter="true">
	
		<g:each status="i" var="c" in="${grailsApplication.controllerClasses.sort { it.logicalPropertyName } }">
                  <g:if test="${c.fullName.contains('Role') || c.fullName.contains('User')}">
                  <sec:ifAllGranted roles="ROLE_ADMIN">
                     <li class="controller${params.controller == c.logicalPropertyName ? " active" : ""}">
				<g:link controller="${c.logicalPropertyName}" action="index">
					<g:message code="${c.logicalPropertyName}.label" default="${c.logicalPropertyName.capitalize()}"/>
				</g:link>
		     </li>
                  </sec:ifAllGranted>
                </g:if>
                <g:if test="${c.fullName.contains('Template')}">
                  <sec:ifAnyGranted roles="ROLE_ADMIN,ROLE_USER">
                    <li class="controller${params.controller == c.logicalPropertyName ? " active" : ""}">
				<g:link controller="${c.logicalPropertyName}" action="index">
					<g:message code="${c.logicalPropertyName}.label" default="${c.logicalPropertyName.capitalize()}"/>
				</g:link>
		    </li>
                  </sec:ifAnyGranted>            
                </g:if>
                <g:if test="${c.fullName.contains('Home')}">
                       <li class="controller${params.controller == c.logicalPropertyName ? " active" : ""}">
				<g:link controller="${c.logicalPropertyName}" action="index">
					<g:message code="${c.logicalPropertyName}.label" default="${c.logicalPropertyName.capitalize()}"/>
				</g:link>
			</li>
                </g:if>   
                                          
		</g:each>
		
	</ul>
</div>
