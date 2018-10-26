import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{FlatSpec, Matchers}

class HttpHelloWorldSpec extends FlatSpec with Matchers with ScalatestRouteTest {

  "Rest service for /greet/name" should "greet Hello $name" in {
    Get("/greet/Prasanna")  ~> HttpHelloWorld.route ~> check {
      responseAs[String] should be("Hello Prasanna")
    }
  }

  "Rest service for /health" should "return status" in {
    Get("/health") ~> HttpHelloWorld.route ~> check {
      responseAs[String] should be("OK")
    }
  }

}
