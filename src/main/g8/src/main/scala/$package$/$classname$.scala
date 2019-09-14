package $package$

object $classname$ extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "Hello, Scala app!"
}
