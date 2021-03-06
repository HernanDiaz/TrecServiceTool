<nav id="Navbar" class="navbar navbar-fixed-top navbar-inverse" role="navigation">
	<div class="container">
	
	    <div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
        		<span class="sr-only">Toggle navigation</span>
        		<span class="icon-bar"></span>
	           	<span class="icon-bar"></span>
	           	<span class="icon-bar"></span>
			</button>
	
			<a class="navbar-brand" href="${createLink(uri: '/')}">
				<img class="logo" src="${resource(dir:'images', file:'Pip-boy.png')}" alt="${meta(name:'app.name')}" width="16px" height="16px"/> 
				${meta(name:'app.name')}
				<small> v${meta(name:'app.version')}</small>
			</a>
		</div>

		<div class="collapse navbar-collapse navbar-ex1-collapse" role="navigation">

		<ul class="nav navbar-nav">
			<g:render template="/_menu/controller"/>
		</ul>

    	<ul class="nav navbar-nav navbar-right">
                        <sec:ifAnyGranted roles="ROLE_ADMIN,ROLE_USER">
 			<g:render template="/_menu/search"/> 
                        </sec:ifAnyGranted>
                        <sec:ifAllGranted roles="ROLE_ADMIN">
			<g:render template="/_menu/admin"/>														
			</sec:ifAllGranted>
                        <g:render template="/_menu/info"/>														
			<g:render template="/_menu/user"/><!-- NOTE: the renderDialog for the "Register" modal dialog MUST be placed outside the NavBar (at least for Bootstrap 2.1.1): see bottom of main.gsp -->
			<g:render template="/_menu/language"/>														
	    </ul>			

		</div>
	</div>
</nav>
