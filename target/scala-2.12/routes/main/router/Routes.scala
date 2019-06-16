// @GENERATOR:play-routes-compiler
// @SOURCE:/home/igu/Desktop/PW-Ebean/conf/routes
// @DATE:Sat Jun 15 23:34:07 BRT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:14
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:14
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """popular""", """controllers.HomeController.popular"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listarLivros""", """controllers.HomeController.listarLivros"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listarCompras""", """controllers.HomeController.listarCompras"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listarLivrosEditora""", """controllers.HomeController.listarLivrosEditora"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_popular1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("popular")))
  )
  private[this] lazy val controllers_HomeController_popular1_invoker = createInvoker(
    HomeController_1.popular,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "popular",
      Nil,
      "GET",
      this.prefix + """popular""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_listarLivros2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listarLivros")))
  )
  private[this] lazy val controllers_HomeController_listarLivros2_invoker = createInvoker(
    HomeController_1.listarLivros,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listarLivros",
      Nil,
      "POST",
      this.prefix + """listarLivros""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_listarCompras3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listarCompras")))
  )
  private[this] lazy val controllers_HomeController_listarCompras3_invoker = createInvoker(
    HomeController_1.listarCompras,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listarCompras",
      Nil,
      "POST",
      this.prefix + """listarCompras""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_listarLivrosEditora4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listarLivrosEditora")))
  )
  private[this] lazy val controllers_HomeController_listarLivrosEditora4_invoker = createInvoker(
    HomeController_1.listarLivrosEditora,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listarLivrosEditora",
      Nil,
      "POST",
      this.prefix + """listarLivrosEditora""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:7
    case controllers_HomeController_popular1_route(params@_) =>
      call { 
        controllers_HomeController_popular1_invoker.call(HomeController_1.popular)
      }
  
    // @LINE:8
    case controllers_HomeController_listarLivros2_route(params@_) =>
      call { 
        controllers_HomeController_listarLivros2_invoker.call(HomeController_1.listarLivros)
      }
  
    // @LINE:9
    case controllers_HomeController_listarCompras3_route(params@_) =>
      call { 
        controllers_HomeController_listarCompras3_invoker.call(HomeController_1.listarCompras)
      }
  
    // @LINE:10
    case controllers_HomeController_listarLivrosEditora4_route(params@_) =>
      call { 
        controllers_HomeController_listarLivrosEditora4_invoker.call(HomeController_1.listarLivrosEditora)
      }
  
    // @LINE:14
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
