[![Main branch build status](https://github.com/grace-plugins/grace-hotwire/workflows/Grace%20CI/badge.svg?style=flat)](https://github.com/grace-plugins/grace-hotwire/actions?query=workflow%3A%Grace+CI%22)
[![Apache 2.0 license](https://img.shields.io/badge/License-APACHE%202.0-green.svg?logo=APACHE&style=flat)](https://opensource.org/licenses/Apache-2.0)
[![Latest version on Maven Central](https://img.shields.io/maven-central/v/org.graceframework.plugins/turbo.svg?label=Maven%20Central&logo=apache-maven&style=flat)](https://search.maven.org/search?q=g:org.graceframework.plugins)
[![Groovy Version](https://img.shields.io/badge/Groovy-3.0.22-blue?style=flat&color=4298b8)](https://groovy-lang.org/releasenotes/groovy-3.0.html)
[![Grace Version](https://img.shields.io/badge/Grace-2022.0.0-blue?style=flat&color=f49b06)](https://github.com/graceframework/grace-framework/releases/tag/v2022.0.0)
[![Grace on X](https://img.shields.io/twitter/follow/graceframework?style=social)](https://x.com/graceframework)

# Grace with Hotwire

[Grace](https://github.com/graceframework/grace-framework) is an open-source and powerful One-Person web application Framework to help developers quickly build Spring Boot applications written in the Groovy programing language.

[Turbo](https://turbo.hotwired.dev) gives you the speed of a single-page web application without having to write any JavaScript.

[Stimulus](https://stimulus.hotwired.dev) is a JavaScript framework with modest ambitions. It doesn’t seek to take over your entire front-end—in fact, it’s not concerned with rendering HTML at all. Instead, it’s designed to augment your HTML with just enough behavior to make it shine. 

This plugin will help you to develop Grace app with Hotwire Turbo and Stimulus.


## Usage

Add dependency to the `build.gradle`,

```gradle

repositories {
    mavenCentral()
}

dependencies {
    implementation "org.graceframework.plugins:stimulus:VERSION"
    implementation "org.graceframework.plugins:turbo:VERSION"
}
```

Turbo plugin supports controller-specific `withFormat()` method,

```groovy
class BookController {

    def list() {
        def books = Book.list()

        withFormat {
            turbo_stream {
                render(template: "book", model: [bookList: books])
            }
            json {
                render books as JSON
            }
        }
    }
}
```

Also, this plugin supports extendsions for Grails Request and Response,

```groovy
// You can get Turbo request headers from Grails Request

request.turboFrameId == request.getHeader('Turbo-Frame')
request.turboRequestId  == request.getHeader('X-Turbo-Request-ID')

// Check if Turbo Request?
if (request.isTurboRequest()) {
    template = 'book-detail'
}

// Check if Turbo Frame?
if (request.isTurboFrame()) {
    template = 'book-detail'
}

// Check if Turbo Stream?
if (request.isTurboStream()) {
    template = 'book-detail'
}
```

If you use [`respond`](https://grails.github.io/legacy-grails-doc/4.0.0/ref/Controllers/respond.html) method introduced in Grails 2.3. The respond method tries to produce the most appropriate response for the requested content type (JSON, XML, HTML etc.)

This plugin already provides [Mime Types](https://grails.github.io/legacy-grails-doc/4.0.0/guide/theWebLayer.html#contentNegotiation) for Turbo Stream.

For example given the show action:

```groovy
def show(Book book) {
    respond book
}
```

You could supply a `show.turbo_stream.gsp` file to render the Turbo Stream:

```html
<turbo-stream action="append" target="books">
  <template>
    ...
  </template>
</turbo-stream>
```

If you use `asset-pipeline` plugin, this plugin already includes `stimulus.js`, `turbo.js`,
so you can add `stimulus.js` to the `app/assets/application.js`,

```javascript
//= require stimulus
//= require turbo
//= require_self
```

Also, you can use `asset` tag in the GSP,

```HTML
<asset:javascript src="stimulus.js"/>
<asset:javascript src="turbo.js"/>
```

## Development

### Build from source

```
git clone https://github.com/grace-plugins/grace-hotwire.git
cd grace-hotwire
./gradlew publishToMavenLocal
```

## Support Version

* Grace 2022.0.0+
* Grails 5.0+

## Roadmap

### 1.x

* Stimulus 3.2.2
* Turbo 8.0.4

## License

This plugin is available as open source under the terms of the [APACHE LICENSE, VERSION 2.0](http://apache.org/Licenses/LICENSE-2.0)

## Links

- [Grace Framework](https://github.com/graceframework/grace-framework)
- [Grace Plugins](https://github.com/grace-plugins)
- [Grace Hotwire Plugin](https://github.com/grace-plugins/grace-hotwire)
- [Grace Stimulus Gudie](https://github.com/grace-guides/gs-stimulus)
- [Grace Turbo Guide](https://github.com/grace-guides/gs-turbo)
- [Hotwire Turbo](https://turbo.hotwired.dev)
- [Hotwire Stimulus](https://stimulus.hotwired.dev)
