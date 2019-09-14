package $package$

import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class MainAppSpec extends FlatSpec with Matchers {
  "The $classname$ object" should "say hello" in {
    $classname$.greeting shouldEqual "Hello, Scala app!"
  }
}