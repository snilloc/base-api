// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/collib01/share/proj/ginger/conf/routes
// @DATE:Wed Jul 03 14:32:45 CDT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseApiHelpController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def getResources(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "swagger.json")
    }
  
  }

  // @LINE:12
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def getPetById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pet/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:14
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:8
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def at(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:8
        case (file) if file == "index.html" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/swagger"), ("file", "index.html"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "docs/")
      
        // @LINE:9
        case (file)  =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/swagger"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "docs/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
