package org.graceframework.plugin

import grails.plugins.*

class TurboGrailsPlugin extends Plugin {

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2022.1.0 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Grace Turbo Plugin"
    def author = "Michael Yan"
    def authorEmail = "rain@rainboyan.com"
    def description = '''\
Use Turbo in your Grace app.
'''
    def profiles = ['web']

    // URL to the plugin's documentation
    def documentation = "https://github.com/grace-plugins/grace-turbo"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Grace Framework", url: "https://github.com/graceframework/" ]

    // Any additional developers beyond the author specified above.
    def developers = [ [ name: "Michael Yan", email: "rain@rainboyan.com" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "GitHub", url: "https://github.com/grace-plugins/grace-turbo/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/grace-plugins/grace-turbo.git" ]

}
