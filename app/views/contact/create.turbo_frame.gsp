<g:set var="entityName" value="${message(code: 'contact.label', default: 'Contact')}" />

<turbo-frame id="createContact">
<g:form resource="${this.contact}" method="POST">
    <div class="modal fade" id="contactModal" tabindex="-1">
        <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title fs-5" id="contactModalLabel"><g:message code="default.create.label" args="[entityName]" /></h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <g:if test="${flash.message}">
                    <div class="alert alert-success" role="status"><i class="bi bi-info-circle">${flash.message}</div>
                    </g:if>
                    <g:hasErrors bean="${this.contact}">
                    <div class="alert alert-danger" role="alert">
                        <ul class="errors">
                            <g:eachError bean="${this.contact}" var="error">
                            <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>>
                                <i class="bi bi-exclamation-circle"></i><g:message error="${error}"/>
                            </li>
                            </g:eachError>
                        </ul>
                    </div>
                    </g:hasErrors>
                    
                    <fieldset class="form">
                        <f:all bean="contact"/>
                    </fieldset>
                </div>
                <div class="modal-footer">
                    <button name="create" class="btn btn-primary">
                        <i class="bi bi-journal-plus"></i>
                        <g:message code="default.button.create.label" default="Create" />
                    </button>
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</g:form>
</turbo-frame>