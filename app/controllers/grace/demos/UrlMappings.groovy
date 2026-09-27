package grace.demos

class UrlMappings {

    static mappings = {

        get "/contact/$contactId/notes"(controller: 'note', action: 'create')
        post "/contact/$contactId/notes"(controller: 'note', action: 'save')
        delete "/contact/$contactId/notes"(controller: 'note', action: 'delete')

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
