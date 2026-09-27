<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'contact.label', default: 'Contact')}" />
        <title><g:message code="default.show.label" args="[entityName]" /></title>
    </head>
    <body>
    <div id="content" role="main">
        <div class="container">
            <section class="row">
                <a href="#show-contact" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
                <div class="col-12" role="navigation">
                    <ul class="nav nav-pills">
                        <li class="nav-item">
                            <a class="nav-link" href="${createLink(uri: '/')}">
                                <i class="bi bi-house-fill"></i><g:message code="default.home.label"/>
                            </a>
                        </li>
                        <li class="nav-item">
                            <g:link class="nav-link" action="index">
                                <i class="bi bi-journals"></i><g:message code="default.list.label" args="[entityName]" />
                            </g:link>
                        </li>
                        <li class="nav-item">
                            <g:link class="nav-link" action="create">
                                <i class="bi bi-journal-plus"></i><g:message code="default.new.label" args="[entityName]" />
                            </g:link>
                        </li>
                    </ul>
                </div>
            </section>
            <section class="row">
                <div id="show-contact" class="col-12 scaffold scaffold-show" role="main">
                    <h1><g:message code="default.show.label" args="[entityName]" /></h1>
                    <g:if test="${flash.message}">
                    <div class="alert alert-success" role="status"><i class="bi bi-info-circle"></i>${flash.message}</div>
                    </g:if>
                    <f:display bean="contact" except="id, notes" />
                </div>
            </section>
            <section class="row">
                <div id="list-note" class="col-12 scaffold scaffold-list">
                    <div id="buttons" class="float-end mb-2">
                        <g:link controller="note" action="create" method="GET" params="[contactId: params.id]" class="btn btn-outline-primary" data-turbo-frame="createNote">
                            <i class="bi bi-journal-plus"></i>
                            Add Note
                        </g:link>
                    </div>
                    <table class="table table-bordered table-hover">
                        <thead>
                            <tr>
                                <g:sortableColumn property="id" titleKey="note.id.label" class="text-center" />
                                <th><g:message code="note.body.label" /></th>
                                <th width="15%" class="text-center">Operations</th>
                            </tr>
                        </thead>
                        <tbody>
                            <g:each var="note" in="${contact.notes}">
                            <tr>
                                <td class="text-center"><f:display bean="${note}" property="id" /></td>
                                <td><f:display bean="${note}" property="body" /></td>
                                <td>
                                    <g:link class="btn btn-link"
                                        method="delete"
                                        controller="note"
                                        action="delete"
                                        params="[contactId: contact.id, noteId: note.id]"
                                        data-turbo-method="delete"
                                        data-turbo-confirm="Are you sure you want to delete this note?">
                                        Delete
                                    </g:link>
                                </td>
                            </tr>
                            </g:each>
                        </tbody>
                    </table>
                </div>
            </section>
        </div>
    </div>
    <turbo-frame id="createNote" target="_top">
    </turbo-frame>
    </body>
</html>
