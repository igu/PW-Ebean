// @GENERATOR:play-routes-compiler
// @SOURCE:/home/igu/Desktop/PW-Ebean/conf/routes
// @DATE:Sat Jun 15 23:34:07 BRT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def listarLivros: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.listarLivros",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "listarLivros"})
        }
      """
    )
  
    // @LINE:7
    def popular: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.popular",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "popular"})
        }
      """
    )
  
    // @LINE:9
    def listarCompras: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.listarCompras",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "listarCompras"})
        }
      """
    )
  
    // @LINE:10
    def listarLivrosEditora: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.listarLivrosEditora",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "listarLivrosEditora"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
