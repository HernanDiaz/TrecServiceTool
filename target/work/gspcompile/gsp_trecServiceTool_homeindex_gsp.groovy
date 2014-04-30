import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_trecServiceTool_homeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/home/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',4,['code':("default.welcome.title"),'args':([meta(name:'app.name')])],-1)
printHtmlPart(2)
})
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(resource(dir:'images', file:'Pip-boy.png'))
printHtmlPart(6)
expressionOut.print(meta(name:'app.name'))
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('ifNotLoggedIn','sec',15,[:],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('loggedInUserInfo','sec',17,['field':("username")],-1)
printHtmlPart(9)
})
invokeTag('ifLoggedIn','sec',18,[:],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',38,['class':("btn btn-large btn-primary"),'controller':("nextSteps")],2)
printHtmlPart(13)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/frontpage',file: 'bs-docs-twitter-github.png'))
printHtmlPart(14)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/frontpage',file: 'browser_logos.png'))
printHtmlPart(15)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/frontpage',file: 'html5css3js8.png'))
printHtmlPart(16)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/frontpage',file: 'Datepicker.png'))
printHtmlPart(17)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/frontpage',file: 'flags_preview_large.png'))
printHtmlPart(18)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/frontpage',file: 'empty.png'))
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',101,[:],1)
printHtmlPart(20)
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
