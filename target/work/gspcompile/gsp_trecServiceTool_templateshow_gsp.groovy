import trecservicetool.Template
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_trecServiceTool_templateshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/template/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(2)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'template.label', default: 'Template'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',20,['code':("template.fixpart.label"),'default':("Fixpart")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "fixpart"))
printHtmlPart(6)
invokeTag('message','g',27,['code':("template.varpart.label"),'default':("Varpart")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "varpart"))
printHtmlPart(6)
invokeTag('message','g',34,['code':("template.codeRepetitions.label"),'default':("Code Repetitions")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "codeRepetitions"))
printHtmlPart(6)
invokeTag('message','g',41,['code':("template.numberOfCodes.label"),'default':("Number Of Codes")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "numberOfCodes"))
printHtmlPart(6)
invokeTag('message','g',48,['code':("template.header1.label"),'default':("Header1")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "header1"))
printHtmlPart(6)
invokeTag('message','g',55,['code':("template.header2.label"),'default':("Header2")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "header2"))
printHtmlPart(6)
invokeTag('message','g',62,['code':("template.header3.label"),'default':("Header3")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "header3"))
printHtmlPart(6)
invokeTag('message','g',69,['code':("template.header4.label"),'default':("Header4")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "header4"))
printHtmlPart(6)
invokeTag('message','g',76,['code':("template.header5.label"),'default':("Header5")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "header5"))
printHtmlPart(6)
invokeTag('message','g',83,['code':("template.header6.label"),'default':("Header6")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "header6"))
printHtmlPart(6)
invokeTag('message','g',90,['code':("template.content2.label"),'default':("Content2")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "content2"))
printHtmlPart(6)
invokeTag('message','g',97,['code':("template.content3.label"),'default':("Content3")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "content3"))
printHtmlPart(6)
invokeTag('message','g',104,['code':("template.content4.label"),'default':("Content4")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "content4"))
printHtmlPart(6)
invokeTag('message','g',111,['code':("template.content5.label"),'default':("Content5")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "content5"))
printHtmlPart(6)
invokeTag('message','g',118,['code':("template.content6.label"),'default':("Content6")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "content6"))
printHtmlPart(6)
invokeTag('message','g',125,['code':("template.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(5)
invokeTag('formatDate','g',127,['date':(templateInstance?.dateCreated)],-1)
printHtmlPart(6)
invokeTag('message','g',132,['code':("template.labelType.label"),'default':("Label Type")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: templateInstance, field: "labelType"))
printHtmlPart(6)
invokeTag('message','g',139,['code':("template.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(5)
invokeTag('formatDate','g',141,['date':(templateInstance?.lastUpdated)],-1)
printHtmlPart(7)
})
invokeTag('captureBody','sitemesh',149,[:],1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1398695182000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
