<turbo-frame id="listContact">
    <table class="table table-bordered table-hover">
        <thead>
            <tr>
                <g:sortableColumn property="id" titleKey="contact.id.label" class="text-center" />
                <g:sortableColumn property="firstName" titleKey="contact.firstName.label" />
                <g:sortableColumn property="lastName" titleKey="contact.lastName.label" />
                <g:sortableColumn property="email" titleKey="contact.email.label" />
                <th width="15%" class="text-center">Operations</th>
            </tr>
        </thead>
        <tbody>
            <g:render template="item" collection="${contactList}" var="bean" />
        </tbody>
    </table>
    <g:if test="${contactCount > params.int('max')}">
        <div class="pagination justify-content-center">
            <g:paginate total="${contactCount ?: 0}" />
        </div>
    </g:if>
</turbo-frame>