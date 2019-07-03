// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/collib01/share/proj/ginger/conf/routes
// @DATE:Wed Jul 03 14:32:45 CDT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  ApiHelpController_0: controllers.ApiHelpController,
  // @LINE:8
  Assets_1: controllers.Assets,
  // @LINE:12
  HomeController_2: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    ApiHelpController_0: controllers.ApiHelpController,
    // @LINE:8
    Assets_1: controllers.Assets,
    // @LINE:12
    HomeController_2: controllers.HomeController
  ) = this(errorHandler, ApiHelpController_0, Assets_1, HomeController_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ApiHelpController_0, Assets_1, HomeController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """swagger.json""", """controllers.ApiHelpController.getResources"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docs/""", """controllers.Assets.at(path:String = "/public/swagger", file:String = "index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docs/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/swagger", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pet/""" + "$" + """id<[^/]+>""", """controllers.HomeController.getPetById(id:String)"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_ApiHelpController_getResources0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("swagger.json")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources0_invoker = createInvoker(
    ApiHelpController_0.getResources,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHelpController",
      "getResources",
      Nil,
      "GET",
      this.prefix + """swagger.json""",
      """ Generate Swagger documentation""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Assets_at1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docs/")))
  )
  private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """docs/""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_at2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docs/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """docs/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_getPetById3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pet/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getPetById3_invoker = createInvoker(
    HomeController_2.getPetById(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getPetById",
      Seq(classOf[String]),
      "GET",
      this.prefix + """pet/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index4_invoker = createInvoker(
    HomeController_2.index,
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

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:7
    case controllers_ApiHelpController_getResources0_route(params@_) =>
      call { 
        controllers_ApiHelpController_getResources0_invoker.call(ApiHelpController_0.getResources)
      }
  
    // @LINE:8
    case controllers_Assets_at1_route(params@_) =>
      call(Param[String]("path", Right("/public/swagger")), Param[String]("file", Right("index.html"))) { (path, file) =>
        controllers_Assets_at1_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:9
    case controllers_Assets_at2_route(params@_) =>
      call(Param[String]("path", Right("/public/swagger")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:12
    case controllers_HomeController_getPetById3_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_getPetById3_invoker.call(HomeController_2.getPetById(id))
      }
  
    // @LINE:14
    case controllers_HomeController_index4_route(params@_) =>
      call { 
        controllers_HomeController_index4_invoker.call(HomeController_2.index)
      }
  
    // @LINE:17
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
