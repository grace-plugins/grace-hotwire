<tr id="contact_${bean.id}">
    <td class="text-center">
        <f:display bean="${bean}" property="id" />
    </td>
    <td><f:display bean="${bean}" property="firstName" /></td>
    <td><f:display bean="${bean}" property="lastName" /></td>
    <td><f:display bean="${bean}" property="email" /></td>
    <td class="text-center" nowrap>
        <g:link method="GET" 
            controller="contact" 
            action="show" 
            id="${bean.id}" 
            data-turbo-frame="showContact">
            Show
        </g:link>&nbsp;&nbsp;&nbsp;&nbsp;| &nbsp;&nbsp;&nbsp;&nbsp;
        <g:link method="GET" 
            controller="contact" 
            action="edit" 
            id="${bean.id}" 
            data-turbo-frame="editContact">
            Edit
        </g:link>&nbsp;&nbsp;&nbsp;&nbsp;| 
        <g:link class="btn btn-link"
            method="delete" 
            controller="contact" 
            action="delete" 
            id="${bean.id}" 
            data-turbo-method="delete"
            data-turbo-confirm="Are you sure you want to delete the contact?">
            Delete
        </g:link>
    </td>
</tr>