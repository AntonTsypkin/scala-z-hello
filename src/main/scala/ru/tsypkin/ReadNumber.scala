package ru.tsypkin

import scala.collection.mutable.ArrayBuffer

trait ReadNumber {
  def readNumber(): Unit = {
    val myStr : String = "-r12345r-"/*инициализируем строку*/
    //здесь нужно прибавить к концу строки знак тире либо пробел!!!!!!!!
    val lastNomero = myStr.length/*устанавливаем ее длину */
    var saveDigit = new ArrayBuffer[String] () /*это инициализация переменного массива для хранения чисел*/
    var x = 0
    println(lastNomero)
    //далее проверка первого символа на цифру
    //ее можно избежать,если в начало тоже поставить пробел
    if (myStr(x).isDigit) {
      if (!myStr(x+1).isLetter)
        println(myStr(x))
    }
    x=x+1
    //далее поск всех цифр не окруженных буквами
    while (x.<=(lastNomero-1)) {
      if (myStr(x).isDigit) {
        if (!myStr(x-1).isLetter) {
          if (!myStr(x+1).isLetter) {
            println(myStr(x))

            //здесь идет пока неизвестная процедура записи индекса и значения в массив
            x = x + 1
          }
          else
            x = x + 1
        }
        else
          x = x + 1
      }
      else
        x = x + 1
    }
    //поиск букв,которые соседствуют с цифрами!!!!!!!!!!!
    //так же первый случай для первого символа
    //нужно попробовать искать буквы с конца!!!!
    x=0
    if (myStr(x).isLetter) {
      if (myStr(x+1).isDigit)
        println(myStr(x))
    }
    //а здесь поиск по всему остальному ряду
    x=x+1
    while (x.<(lastNomero)) {
      if (myStr(x).isLetter) {
        if (myStr(x-1).isDigit | myStr(x+1).isDigit) {
          println(myStr(x))
          x = x + 1

        }
        else
          x=x+1
      }
      else
        x=x+1
    }

  }

  def readNumberV2(myStr: String): Unit = {
    val saveDigit = new ArrayBuffer[Int]()

    //буфер кандидата в число
    var strBuf: String = ""
    //var prevChar: Char = null
    var isPrevLetter: Boolean = false
    var isPrevDigit: Boolean = false
    var isInNumberCandidate = false

    //strBuf = strBuf + "a" //добавление в строку

    //val strBuf = new StringBuffer()/*создаем переменную строку*/

    var x = 0
    val len = myStr.length
    while (x < len) {
      val c = myStr.charAt(x)

      if (c.isLetter) {
        if (isInNumberCandidate) {
          strBuf = ""
          isInNumberCandidate = false
        }
      } else
      if (c.isDigit) {
        if (isInNumberCandidate) {
          strBuf = strBuf + c
        } else
          if (isPrevDigit) {
            if (isInNumberCandidate) {
              strBuf += c
            }
          } else
            if (!isPrevLetter)
              {
                strBuf += c
                isInNumberCandidate = true
              }
      }
      else {
        if (isInNumberCandidate) {
          saveDigit += strBuf.toInt
          strBuf = ""
          isInNumberCandidate = false
        }
      }

// необходимые действия при завершении каждой итерации
      if (c.isLetter) {
        isPrevDigit = false
        isPrevLetter = true
      } else
          if (c.isDigit) {
            isPrevDigit = true
            isPrevLetter = false
          } else {
              isPrevDigit = false
              isPrevLetter = false
            }
      x = x + 1
    }
    if (isInNumberCandidate) {
       saveDigit += strBuf.toInt
    }


    saveDigit.foreach(i => println(i))
  }


  def test(): Unit = {
    var x = true
    val y = false
    var z = 0

    (x, y, z) match {
      case (true, true, 1) => z = z + 1
      case (false, _, 0) => z = z - 1
      case _ =>
    }
  }
}