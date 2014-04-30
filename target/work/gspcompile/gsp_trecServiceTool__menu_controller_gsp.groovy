import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_trecServiceTool__menu_controller_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_menu/_controller.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
for( c in (grailsApplication.controllerClasses.sort { it.fullName }) ) {
printHtmlPart(1)
if(true && (c.fullName.contains('Role') || c.fullName.contains('User'))) {
printHtmlPart(2)
createTagBody(3, {->
printHtmlPart(3)
expressionOut.print(params.controller == c.logicalPropertyName ? " active" : "")
printHtmlPart(4)
createTagBody(4, {->
printHtmlPart(5)
invokeTag('message','g',10,['code':("${c.logicalPropertyName}.label"),'default':(c.logicalPropertyName.capitalize())],-1)
printHtmlPart(6)
})
invokeTag('link','g',11,['controller':(c.logicalPropertyName),'action':("index")],4)
printHtmlPart(7)
})
invokeTag('ifAllGranted','sec',13,['roles':("ROLE_ADMIN")],3)
printHtmlPart(8)
}
printHtmlPart(9)
if(true && (c.fullName.contains('Template'))) {
printHtmlPart(2)
createTagBody(3, {->
printHtmlPart(10)
expressionOut.print(params.controller == c.logicalPropertyName ? " active" : "")
printHtmlPart(4)
createTagBody(4, {->
printHtmlPart(11)
invokeTag('message','g',20,['code':("${c.logicalPropertyName}.label"),'default':(c.logicalPropertyName.capitalize())],-1)
printHtmlPart(6)
})
invokeTag('link','g',21,['controller':(c.logicalPropertyName),'action':("index")],4)
printHtmlPart(12)
})
invokeTag('ifAnyGranted','sec',23,['roles':("ROLE_ADMIN,ROLE_USER")],3)
printHtmlPart(13)
}
printHtmlPart(9)
if(true && (c.fullName.contains('Home'))) {
printHtmlPart(14)
expressionOut.print(params.controller == c.logicalPropertyName ? " active" : "")
printHtmlPart(4)
createTagBody(3, {->
printHtmlPart(5)
invokeTag('message','g',29,['code':("${c.logicalPropertyName}.label"),'default':(c.logicalPropertyName.capitalize())],-1)
printHtmlPart(6)
})
invokeTag('link','g',30,['controller':(c.logicalPropertyName),'action':("index")],3)
printHtmlPart(15)
}
printHtmlPart(16)
}
printHtmlPart(17)
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
