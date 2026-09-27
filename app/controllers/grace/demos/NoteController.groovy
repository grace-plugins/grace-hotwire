package grace.demos

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class NoteController {

    static allowedMethods = [create: "GET", save: "POST", delete: "DELETE"]

    ContactService contactService
    NoteService noteService

    def create(Long contactId) {
        Contact contact = this.contactService.get(contactId)

        if (contact == null) {
            notFound()
            return
        }
        def note = new Note(params)
        respond note
    }

    def save(Long contactId) {
        Contact contact = this.contactService.get(contactId)

        if (contact == null) {
            notFound()
            return
        }

        def note = new Note(body: params.body)
        contact.addToNotes(note)

        try {
            this.contactService.save(contact)
        }
        catch (Exception e) {
            respond contact.errors, view:'create'
            return
        }
        request.withFormat {
            form multipartForm {
                redirect controller: "contact", action: "show", method: "GET", params: [id: contactId]
                return
            }
        }
    }

    def delete(Long contactId) {
        Long noteId = params.long('noteId')
        Contact contact = this.contactService.get(contactId)

        if (contact == null) {
            notFound()
            return
        }

        try {
            this.noteService.delete(noteId)
        }
        catch (Exception e) {
            respond contact.errors, controller: "contact", action: "show", method: "GET", params: [id: contactId]
            return
        }

        request.withFormat {
            form multipartForm {
                redirect controller: "contact", action: "show", method: "GET", params: [id: contactId]
                return
            }
            '*'{ render status: NOT_FOUND }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'contact.label', default: 'Contact'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}