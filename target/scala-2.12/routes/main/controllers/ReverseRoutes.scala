// @GENERATOR:play-routes-compiler
// @SOURCE:/home/igu/Desktop/PW-Ebean/conf/routes
// @DATE:Sat Jun 15 23:34:07 BRT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def listarLivros(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "listarLivros")
    }
  
    // @LINE:7
    def popular(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "popular")
    }
  
    // @LINE:9
    def listarCompras(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "listarCompras")
    }
  
    // @LINE:10
    def listarLivrosEditora(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "listarLivrosEditora")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
