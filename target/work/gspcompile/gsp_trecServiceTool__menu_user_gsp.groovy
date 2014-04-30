import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_trecServiceTool__menu_user_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_menu/_user.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('message','g',9,['code':("security.signin.label")],-1)
printHtmlPart(2)
})
invokeTag('ifNotLoggedIn','sec',20,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('loggedInUserInfo','sec',29,['field':("username")],-1)
printHtmlPart(5)
expressionOut.print(createLink(controller: 'logout'))
printHtmlPart(6)
invokeTag('message','g',39,['code':("security.signoff.label")],-1)
printHtmlPart(7)
})
invokeTag('ifLoggedIn','sec',40,[:],1)
printHtmlPart(8)
createTagBody(1, {->
invokeTag('message','g',44,['code':("default.user.unknown.label")],-1)
})
invokeTag('link','g',44,['controller':("user"),'action':("show")],1)
printHtmlPart(9)
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
