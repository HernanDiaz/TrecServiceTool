import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_trecServiceTool__menu_menubar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_menu/_menubar.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( c in (grailsApplication.controllerClasses.sort { it.logicalPropertyName }) ) {
printHtmlPart(1)
if(true && (c.fullName.contains('Role') || c.fullName.contains('User'))) {
printHtmlPart(1)
createTagBody(3, {->
printHtmlPart(2)
expressionOut.print(params.controller == c.logicalPropertyName ? " active" : "")
printHtmlPart(3)
createTagBody(4, {->
printHtmlPart(4)
invokeTag('message','g',9,['code':("${c.logicalPropertyName}.label"),'default':(c.logicalPropertyName.capitalize())],-1)
printHtmlPart(5)
})
invokeTag('link','g',10,['controller':(c.logicalPropertyName),'action':("index")],4)
printHtmlPart(6)
})
invokeTag('ifAllGranted','sec',12,['roles':("ROLE_ADMIN")],3)
printHtmlPart(7)
}
printHtmlPart(7)
if(true && (c.fullName.contains('Template'))) {
printHtmlPart(1)
createTagBody(3, {->
printHtmlPart(8)
expressionOut.print(params.controller == c.logicalPropertyName ? " active" : "")
printHtmlPart(3)
createTagBody(4, {->
printHtmlPart(4)
invokeTag('message','g',18,['code':("${c.logicalPropertyName}.label"),'default':(c.logicalPropertyName.capitalize())],-1)
printHtmlPart(5)
})
invokeTag('link','g',19,['controller':(c.logicalPropertyName),'action':("index")],4)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',21,['roles':("ROLE_ADMIN,ROLE_USER")],3)
printHtmlPart(10)
}
printHtmlPart(7)
if(true && (c.fullName.contains('Home'))) {
printHtmlPart(11)
expressionOut.print(params.controller == c.logicalPropertyName ? " active" : "")
printHtmlPart(3)
createTagBody(3, {->
printHtmlPart(4)
invokeTag('message','g',26,['code':("${c.logicalPropertyName}.label"),'default':(c.logicalPropertyName.capitalize())],-1)
printHtmlPart(5)
})
invokeTag('link','g',27,['controller':(c.logicalPropertyName),'action':("index")],3)
printHtmlPart(12)
}
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
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
