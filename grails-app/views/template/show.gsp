
<%@ page import="trecservicetool.Template" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'template.label', default: 'Template')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-template" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.fixpart.label" default="Fixpart" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "fixpart")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.varpart.label" default="Varpart" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "varpart")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.codeRepetitions.label" default="Code Repetitions" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "codeRepetitions")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.numberOfCodes.label" default="Number Of Codes" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "numberOfCodes")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.header1.label" default="Header1" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "header1")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.header2.label" default="Header2" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "header2")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.header3.label" default="Header3" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "header3")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.header4.label" default="Header4" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "header4")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.header5.label" default="Header5" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "header5")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.header6.label" default="Header6" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "header6")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.content2.label" default="Content2" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "content2")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.content3.label" default="Content3" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "content3")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.content4.label" default="Content4" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "content4")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.content5.label" default="Content5" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "content5")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.content6.label" default="Content6" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "content6")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.dateCreated.label" default="Date Created" /></td>
				
				<td valign="top" class="value"><g:formatDate date="${templateInstance?.dateCreated}" /></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.labelType.label" default="Label Type" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: templateInstance, field: "labelType")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="template.lastUpdated.label" default="Last Updated" /></td>
				
				<td valign="top" class="value"><g:formatDate date="${templateInstance?.lastUpdated}" /></td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
