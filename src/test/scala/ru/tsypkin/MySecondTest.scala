package ru.tsypkin

import org.scalatest.{Matchers, FunSuite}
import ru.tsypkin.subpack.SubPack

class MyClassForTest { val ttt = 1
}


class MySecondTest extends FunSuite with Matchers {
  test("my second test 1") {
    val x: Int = 7
    val y = SingletonObject.toString
    println(SingletonObject.myFunction(1, y))
    val sub: SubPack = new SubPack("y")

    println(s"wowwww sub = ${sub.toString}, singleton = ${SingletonObject.b}")
  }
}
