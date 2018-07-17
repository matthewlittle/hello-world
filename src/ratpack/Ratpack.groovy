import ratpack.groovy.template.TextTemplateModule

import static ratpack.groovy.Groovy.groovyTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {
  bindings {
    module TextTemplateModule
  }

  handlers {
    get {
      render groovyTemplate("index.html", title: "My Ratpack App")
    }

    files { dir "public" }
  }
}
