package controllers

import javax.inject._
import play.api.Logger
import play.api.mvc._

// Swagger support
import io.swagger.annotations.{Api, ApiParam, ApiResponse, ApiResponses}


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
@Api
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  val logger = Logger(this.getClass)

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  @ApiResponses(Array(
    new ApiResponse(code = 400, message = "Invalid ID supplied"),
    new ApiResponse(code = 404, message = "Pet not found")))
  def index():Action[AnyContent] = Action { implicit request: Request[AnyContent] =>

    logger.info("Index called ")
    Ok(views.html.index())
  }


  @ApiResponses(Array(
    new ApiResponse(code = 400, message = "Invalid ID supplied"),
    new ApiResponse(code = 404, message = "Pet not found")))
  def getPetById( @ApiParam(value = "ID of the pet to fetch") id: String):Action[AnyContent] = Action {
    implicit request:Request[AnyContent] =>
      logger.info("getPetById called ")
      //JsonResponse(new value.ApiResponse(404, "Pet not found"), 404)
      NotFound(s"Pet not found $id")
  }

  /*
  val petData:String = s"Getting pet id: $id"
  //petData.getPetbyId(getLong(0, 100000, 0, id)) match {
  petData match {
    case Some(pet) => JsonResponse(pet)
    case _ => JsonResponse(new value.ApiResponse(404, "Pet not found"), 404)
  } */



}
