package ru.tsypkin

import org.scalatest.{Matchers, FunSuite}

class MySimpleTest extends FunSuite with Matchers {
  test("my simple test 1") {
    val x = 7
    println(s"wowwww $x")
  }

  test("my simple test 2") {
    println("woooow 2")
  }
}


class MySimpleTest2 extends FunSuite with Matchers {
  test("my simple test 1") {
    val x = 7
    println(s"wowwww $x")
  }

  test("my simple test 2") {
    println("woooow 2")
  }
}
