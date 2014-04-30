import trecservicetool.Template
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_trecServiceTool_templatelist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/template/list.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(3)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'template.label', default: 'Template'))],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(4)
createClosureForHtmlPart(5, 2)
invokeTag('javascript','g',16,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',17,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
invokeTag('textField','g',24,['name':("fixpart"),'id':("fixpart"),'value':(params.fixpart)],-1)
printHtmlPart(9)
invokeTag('submitButton','g',25,['name':("search"),'value':("Search")],-1)
printHtmlPart(10)
})
invokeTag('form','g',27,['action':("list"),'id':("fixedSearchForm")],2)
printHtmlPart(11)
invokeTag('sortableColumn','g',33,['property':("fixpart"),'title':(message(code: 'template.fixpart.label', default: 'Fixed part'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',35,['property':("varpart"),'title':(message(code: 'template.varpart.label', default: 'Variable part'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',37,['property':("codeRepetitions"),'title':(message(code: 'template.codeRepetitions.label', default: 'Code Repetitions'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',39,['property':("numberOfCodes"),'title':(message(code: 'template.numberOfCodes.label', default: 'Number Of Codes'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',41,['property':("content2"),'title':(message(code: 'template.header1.label', default: 'Column 2'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',43,['property':("labelType"),'title':(message(code: 'template.header2.label', default: 'Label Type'))],-1)
printHtmlPart(13)
loop:{
int i = 0
for( templateInstance in (templateInstanceList) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: templateInstance, field: "fixpart"))
})
invokeTag('link','g',51,['action':("edit"),'id':(templateInstance.id)],3)
printHtmlPart(16)
expressionOut.print(fieldValue(bean: templateInstance, field: "varpart"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: templateInstance, field: "codeRepetitions"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: templateInstance, field: "numberOfCodes"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: templateInstance, field: "content2"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: templateInstance, field: "labelType"))
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
invokeTag('paginate','bs',68,['total':(templateInstanceCount)],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',72,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1398763829734L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
