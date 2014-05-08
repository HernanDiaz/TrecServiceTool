package trecservicetool

import grails.plugin.springsecurity.annotation.Secured;
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import ch.cern.trec.st.utils.ExcelGenerator

/**
 * TemplateController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Transactional(readOnly = true)
@Secured (["ROLE_USER", "ROLE_ADMIN"])
class TemplateController {
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
         if (params?.fixpart){
            def resp = Template.findAllByFixpartLike("%${params.fixpart}%",params)
            return [templateInstanceList:resp, fixpart:params.fixpart,templateInstanceCount: resp.size()]
        }else{
            params.max = Math.min(max ?: 10, 100)
            respond Template.list(params), model:[templateInstanceCount: Template.count()]
        }
    }

    def list(Integer max) {
        if (params?.fixpart){
            def resp = Template.findAllByFixpartLike("%${params.fixpart}%",params)
            return [templateInstanceList:resp, fixpart:params.fixpart,templateInstanceCount: resp.size()]
        }else{
            params.max = Math.min(max ?: 10, 100)
            respond Template.list(params), model:[templateInstanceCount: Template.count()]
        }
    }  

    def show(Template templateInstance) {
        respond templateInstance
    }

    def create() {
        respond new Template(params)
    }

    @Transactional
    def save(Template templateInstance) {
        if (templateInstance == null) {
            notFound()
            return
        }

        if (templateInstance.hasErrors()) {
            respond templateInstance.errors, view:'create'
            return
        }

        templateInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'templateInstance.label', default: 'Template'), templateInstance.id])
                redirect templateInstance
            }
            '*' { respond templateInstance, [status: CREATED] }
        }
    }

    def edit(Template templateInstance) {
        respond templateInstance
    }

    @Transactional
    def update(Template templateInstance) {
        if (templateInstance == null) {
            notFound()
            return
        }

        if (templateInstance.hasErrors()) {
            respond templateInstance.errors, view:'edit'
            return
        }

        templateInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Template.label', default: 'Template'), templateInstance.id])
                redirect templateInstance
            }
            '*'{ respond templateInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Template templateInstance) {

        if (templateInstance == null) {
            notFound()
            return
        }

        templateInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Template.label', default: 'Template'), templateInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'templateInstance.label', default: 'Template'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
    
    def getPDF(Template templateInstance) {
        if (templateInstance == null) {
            notFound()
            return
        }
        
        if (templateInstance.hasErrors()) {
            respond templateInstance.errors, view:'edit'
            return
        }
        //InputStream is = new FileInputStream(new File("E:\\new.xls"))
        response.setHeader("Content-disposition", "attachment; filename="+templateInstance.fixpart+templateInstance.varpart+"x"+templateInstance.codeRepetitions+".xls")
        response.contentType = "application/vnd.ms-excel; charset=utf-8"
        //response.outputStream<<is
        ExcelGenerator e = new ExcelGenerator()
        String[] cnames = [templateInstance.header1,templateInstance.header2,templateInstance.header3,templateInstance.header4,templateInstance.header5,templateInstance.header6]
        String[] ccontent = [templateInstance.content2,templateInstance.content3,templateInstance.content4,templateInstance.content5,templateInstance.content6]
        e.generateExcel(templateInstance.codeRepetitions as int,templateInstance.numberOfCodes as int,templateInstance.fixpart,templateInstance.varpart, cnames, ccontent, response.outputStream)
        response.outputStream.close()  
        response.outputStream.flush()
    }
}
