package ru.tsypkin

import scala.collection.mutable.ArrayBuffer

/**
 * Created by AntonTsypkin on 25.04.15.
 */
trait MassiveReserch {
  def createMassiveReserch () : Unit = {
    val Massive1 = ArrayBuffer[String] ()
    //for (x <- 1 to 10 ; y <- 1 to 10 ; z <- 1 to 10 ; if ( x == y) ; if (y == z )  ) println(x,y,z) //клевая и логичная последовательность перебора нескольких выражений!!!
//    var x = 0
    //for (x <-  1 until 10) yield x % 3 ; println(x)//как это работает?!!!

//    Massive1.append("Привет")
//    Massive1.append("Пока")
//    Massive1.append("Ага")
//    Massive1.append("Ну неет!")
//    Massive1.foreach(  => println(Massive1(0)) )
  }


}
