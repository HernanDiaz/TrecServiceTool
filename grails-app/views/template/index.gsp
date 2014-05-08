
<%@ page import="trecservicetool.Template" %>
<!DOCTYPE html>
<html>

  <head>  
    <meta name="layout" content="kickstart" />
  <g:set var="entityName" value="${message(code: 'template.label', default: 'Template')}" />
  <title><g:message code="default.index.label" args="[entityName]" /></title>
  <g:javascript>
    function clearForm() {
    document.getElementById("fixpart").value = "";
    document.getElementById("search").submit();
    }
  </g:javascript>
</head>

<body>

  <section id="index-template" class="first">
    <g:form action="index" name="search" style="margin-top:10px;">
      <label for="fixpart">Fixed part</label>
      <g:textField name="fixpart" value="${params.fixpart}"/>
      <g:submitButton name="search" value="Search"/>
      <input type="button" onclick="clearForm()" value="Reset">
    </g:form>

    <table class="table table-bordered margin-top-medium">
      <thead>
        <tr>


      <g:sortableColumn property="fixpart" title="${message(code: 'template.fixpart.label', default: 'Fixed part')}" />

      <g:sortableColumn property="varpart" title="${message(code: 'template.varpart.label', default: 'Variable part')}" />

      <g:sortableColumn property="codeRepetitions" title="${message(code: 'template.codeRepetitions.label', default: 'Code Repetitions')}" />

      <g:sortableColumn property="numberOfCodes" title="${message(code: 'template.numberOfCodes.label', default: 'Number Of Codes')}" />

      <g:sortableColumn property="content2" title="${message(code: 'template.header1.label', default: 'Column 2')}" />

      <g:sortableColumn property="labelType" title="${message(code: 'template.header2.label', default: 'Label Type')}" />



      </tr>
      </thead>
      <tbody>
      <g:each in="${templateInstanceList}" status="i" var="templateInstance">
        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

          <td><g:link action="edit" id="${templateInstance.id}">${fieldValue(bean: templateInstance, field: "fixpart")}</g:link></td>

        <td>${fieldValue(bean: templateInstance, field: "varpart")}</td>

        <td>${fieldValue(bean: templateInstance, field: "codeRepetitions")}</td>

        <td>${fieldValue(bean: templateInstance, field: "numberOfCodes")}</td>

        <td>${fieldValue(bean: templateInstance, field: "content2")}</td>

        <td>${fieldValue(bean: templateInstance, field: "labelType")}</td>

        </tr>
      </g:each>
      </tbody>
    </table>
    <div>
      <bs:paginate total="${templateInstanceCount}" />
    </div>
  </section>

</body>

</html>
