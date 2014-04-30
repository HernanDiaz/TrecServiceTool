import ch.cern.trec.st.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_trecServiceTool_usershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
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
invokeTag('message','g',20,['code':("user.username.label"),'default':("Username")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: userInstance, field: "username"))
printHtmlPart(6)
invokeTag('message','g',27,['code':("user.password.label"),'default':("Password")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: userInstance, field: "password"))
printHtmlPart(6)
invokeTag('message','g',34,['code':("user.accountExpired.label"),'default':("Account Expired")],-1)
printHtmlPart(5)
invokeTag('formatBoolean','g',36,['boolean':(userInstance?.accountExpired)],-1)
printHtmlPart(6)
invokeTag('message','g',41,['code':("user.accountLocked.label"),'default':("Account Locked")],-1)
printHtmlPart(5)
invokeTag('formatBoolean','g',43,['boolean':(userInstance?.accountLocked)],-1)
printHtmlPart(6)
invokeTag('message','g',48,['code':("user.enabled.label"),'default':("Enabled")],-1)
printHtmlPart(5)
invokeTag('formatBoolean','g',50,['boolean':(userInstance?.enabled)],-1)
printHtmlPart(6)
invokeTag('message','g',55,['code':("user.passwordExpired.label"),'default':("Password Expired")],-1)
printHtmlPart(5)
invokeTag('formatBoolean','g',57,['boolean':(userInstance?.passwordExpired)],-1)
printHtmlPart(7)
})
invokeTag('captureBody','sitemesh',65,[:],1)
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
