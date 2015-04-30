package ru.tsypkin

import scala.collection.mutable.ArrayBuffer

/**
 * Created by AntonTsypkin on 29.04.15.
 */
trait ScalaForME {
  def watsIsScala ()  {
    val x  =  new ArrayBuffer [String]()
    x (0) = "A"
    x(1) = "B"
    x(2) = "C"
    //x.trimEnd(2)
    println(x(1))






  }

}
