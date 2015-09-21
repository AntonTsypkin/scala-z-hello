package ru.tsypkin

/**
 * Created by AntonTsypkin on 11.09.15.
 */
trait someList {
  def someList () : Unit = {
    val someList = List(2,3)
    val somelist2 = 23 :: someList
    println(somelist2)
  }

}
