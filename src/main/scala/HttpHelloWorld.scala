import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer

final case class Response(message: String)

object HttpHelloWorld extends App {
    implicit val actorSystem = ActorSystem("akka-http")
    implicit val actorMaterializer = ActorMaterializer()

    def route =
      pathPrefix("greet") {
        path(Segment){
          name => get {
            complete {
              s"Hello $name"
            }
          }
        }

      } ~ path("health") {
      get {
        complete {
          StatusCodes.OK
        }
      }
    }

    Http().bindAndHandle(route,"localhost",8080)
    println("server started at 8080")
}