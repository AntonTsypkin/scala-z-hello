package ru.tsypkin

import scala.collection.mutable.ArrayBuffer


case class MyResult(number: Int, pos: Int)

trait MassivesProba {
  def createMassive (): Unit = {

    val Massive1 = ArrayBuffer[(Int, String)]()
    val x: (Int, String) = (1, "2")
    val a = Tuple2(1, "2")
    val y: (Int, String) = x
    val z: Tuple2[Int, String] = x
    //z._1 //вызов нужного поля по индексу Tuple
    //z._2
    val (p: Int, _/*можно прокускать ненужныйэлемент нижним подкнием,но их должно быть столько сколько и в Tuple*/) = z //

    val res = ArrayBuffer[MyResult]()
    val r = MyResult(1, 2)
    r.number
    r.pos
    Massive1.append((4, "5f"))
    //Massive1.
    Massive1(0) = (3, "y7y")
    //Massive1(0)

  }

}
