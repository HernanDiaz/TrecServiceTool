<%@ page import="trecservicetool.Template" %>



			<div class="${hasErrors(bean: templateInstance, field: 'fixpart', 'error')} required">
				<label for="fixpart" class="control-label"><g:message code="template.fixpart.label" default="Fixed part" /><span class="required-indicator">*</span></label>
				<div>
					<g:textField class="form-control" name="fixpart" required="" value="${templateInstance?.fixpart}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'fixpart', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'varpart', 'error')} ">
				<label for="varpart" class="control-label"><g:message code="template.varpart.label" default="Variable part" /></label>
				<div>
					<g:textField class="form-control" name="varpart" value="${templateInstance?.varpart}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'varpart', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'codeRepetitions', 'error')} required">
				<label for="codeRepetitions" class="control-label"><g:message code="template.codeRepetitions.label" default="Code Repetitions" /><span class="required-indicator">*</span></label>
				<div>
					<g:textField class="form-control" name="codeRepetitions" required="" value="${templateInstance?.codeRepetitions}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'codeRepetitions', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'numberOfCodes', 'error')} required">
				<label for="numberOfCodes" class="control-label"><g:message code="template.numberOfCodes.label" default="Number Of Codes" /><span class="required-indicator">*</span></label>
				<div>
					<g:textField class="form-control" name="numberOfCodes" required="" value="${templateInstance?.numberOfCodes}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'numberOfCodes', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'header1', 'error')} required">
				<label for="header1" class="control-label"><g:message code="template.header1.label" default="Header 1" /><span class="required-indicator">*</span></label>
				<div>
					<g:textField class="form-control" name="header1" required="" value="${templateInstance?.header1}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'header1', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'header2', 'error')} ">
				<label for="header2" class="control-label"><g:message code="template.header2.label" default="Header 2" /></label>
				<div>
					<g:textField class="form-control" name="header2" value="${templateInstance?.header2}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'header2', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'header3', 'error')} ">
				<label for="header3" class="control-label"><g:message code="template.header3.label" default="Header 3" /></label>
				<div>
					<g:textField class="form-control" name="header3" value="${templateInstance?.header3}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'header3', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'header4', 'error')} ">
				<label for="header4" class="control-label"><g:message code="template.header4.label" default="Header 4" /></label>
				<div>
					<g:textField class="form-control" name="header4" value="${templateInstance?.header4}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'header4', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'header5', 'error')} ">
				<label for="header5" class="control-label"><g:message code="template.header5.label" default="Header 5" /></label>
				<div>
					<g:textField class="form-control" name="header5" value="${templateInstance?.header5}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'header5', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'header6', 'error')} ">
				<label for="header6" class="control-label"><g:message code="template.header6.label" default="Header 6" /></label>
				<div>
					<g:textField class="form-control" name="header6" value="${templateInstance?.header6}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'header6', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'content2', 'error')} ">
				<label for="content2" class="control-label"><g:message code="template.content2.label" default="Content 2" /></label>
				<div>
					<g:textField class="form-control" name="content2" value="${templateInstance?.content2}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'content2', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'content3', 'error')} ">
				<label for="content3" class="control-label"><g:message code="template.content3.label" default="Content 3" /></label>
				<div>
					<g:textField class="form-control" name="content3" value="${templateInstance?.content3}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'content3', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'content4', 'error')} ">
				<label for="content4" class="control-label"><g:message code="template.content4.label" default="Content 4" /></label>
				<div>
					<g:textField class="form-control" name="content4" value="${templateInstance?.content4}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'content4', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'content5', 'error')} ">
				<label for="content5" class="control-label"><g:message code="template.content5.label" default="Content 5" /></label>
				<div>
					<g:textField class="form-control" name="content5" value="${templateInstance?.content5}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'content5', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'content6', 'error')} ">
				<label for="content6" class="control-label"><g:message code="template.content6.label" default="Content 6" /></label>
				<div>
					<g:textField class="form-control" name="content6" value="${templateInstance?.content6}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'content6', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: templateInstance, field: 'labelType', 'error')} ">
				<label for="labelType" class="control-label"><g:message code="template.labelType.label" default="Label Type" /></label>
				<div>
					<g:textField class="form-control" name="labelType" value="${templateInstance?.labelType}"/>
					<span class="help-inline">${hasErrors(bean: templateInstance, field: 'labelType', 'error')}</span>
				</div>
			</div>

