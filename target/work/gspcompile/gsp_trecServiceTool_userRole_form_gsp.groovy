import ch.cern.trec.st.UserRole
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_trecServiceTool_userRole_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/userRole/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userRoleInstance, field: 'role', 'error'))
printHtmlPart(1)
invokeTag('message','g',6,['code':("userRole.role.label"),'default':("Role")],-1)
printHtmlPart(2)
invokeTag('select','g',8,['class':("many-to-one"),'id':("role"),'name':("role.id"),'from':(ch.cern.trec.st.Role.list()),'optionKey':("id"),'required':(""),'value':(userRoleInstance?.role?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userRoleInstance, field: 'role', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: userRoleInstance, field: 'user', 'error'))
printHtmlPart(5)
invokeTag('message','g',14,['code':("userRole.user.label"),'default':("User")],-1)
printHtmlPart(2)
invokeTag('select','g',16,['class':("many-to-one"),'id':("user"),'name':("user.id"),'from':(ch.cern.trec.st.User.list()),'optionKey':("id"),'required':(""),'value':(userRoleInstance?.user?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userRoleInstance, field: 'user', 'error'))
printHtmlPart(6)
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
