<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'contact.label', default: 'Contact')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
    <div id="content" role="main">
        <div class="container">
            <section class="row">
                <a href="#list-contact" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
                <div class="col-12" role="navigation">
                    <ul class="nav nav-pills">
                        <li class="nav-item">
                            <a class="nav-link" href="${createLink(uri: '/')}">
                                <i class="bi bi-house-fill"></i><g:message code="default.home.label"/>
                            </a>
                        </li>
                        <li class="nav-item">
                            <g:link class="nav-link" action="create" data-turbo-frame="createContact">
                                <i class="bi bi-journal-plus"></i><g:message code="default.new.label" args="[entityName]" />
                            </g:link>
                        </li>
                    </ul>
                </div>
            </section>
            <section class="row">
                <div id="list-contact" class="col-12 scaffold scaffold-list" role="main">
                    <h1><g:message code="default.list.label" args="[entityName]" /></h1>
                    <turbo-frame id="flash">
                    <g:if test="${flash.message}">
                        <div class="alert alert-success" role="status"><i class="bi bi-info-circle"></i>${flash.message}</div>
                    </g:if>
                    </turbo-frame>

                    <div id="buttons" class="float-end mb-2">
                        <g:link action="create" class="btn btn-outline-primary" data-turbo-frame="createContact">
                            <i class="bi bi-journal-plus"></i>
                            Add
                        </g:link>
                    </div>
                    <turbo-frame id="listContact" src="/contact/list">
                        Loading contacts...
                    </turbo-frame>
                </div>
            </section>
        </div>
    </div>
    <turbo-frame id="createContact" target="_top">
    </turbo-frame>
    <turbo-frame id="showContact" target="_top">
    </turbo-frame>
    <turbo-frame id="editContact" target="_top">
    </turbo-frame>
    </body>
</html>