package ru.tsypkin

object SingletonObjectTask2 {
  val b = 1000
  def myFunction(x: Int, y: String): String = {
    s"$y: $x"
  }

  def main(args: Array[String]): Unit = {
    import scala.io.StdIn._
    val x = readLine() //readLine()//System.console().readLine()
    println(x)
    val y = x.toBoolean
    println(y)
  }

}