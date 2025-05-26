/*
 * Copyright 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.graceframework.plugins.stimulus

import grails.plugins.*

class StimulusGrailsPlugin extends Plugin {

    def version = '0.5.0-SNAPSHOT'
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "5.0.0 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Grace Stimulus Plugin"
    def author = "Michael Yan"
    def authorEmail = "rain@rainboyan.com"
    def description = '''\
Use Stimulus in your Grace app.
'''
    def profiles = ['web']

    // URL to the plugin's documentation
    def documentation = "https://github.com/grace-plugins/grace-hotwire"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Grace Plugins", url: "https://github.com/grace-plugins/" ]

    // Any additional developers beyond the author specified above.
    def developers = [ [ name: "Michael Yan", email: "rain@rainboyan.com" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "GitHub", url: "https://github.com/grace-plugins/grace-hotwire/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/grace-plugins/grace-hotwire.git" ]

}
