package ru.tsypkin

/**
 * Created by AntonTsypkin on 29.04.15.
 */
trait ScalaForME {
   def interData (): Unit = {
     val myArrayLenght = 11 // длина числового ряда
     val myX = 33// искомое число
     println("Искомый результат " + myX)
     var myArrayNomber = new Array[Int](myArrayLenght) //мой числовой ряд
     for (y <- 0 to (myArrayLenght - 1)) myArrayNomber(y) = y //здесь явно можно сделать проще!!!
     val myFactorials = new Array[Int](myArrayNomber.length)
     var x = 0
     for (x <- 0 to (myArrayNomber.length - 1)) {
       if (x != 0) {
         myFactorials(x) = myFactorials(x - 1) + myArrayNomber(x)
       }
       else {
         myFactorials(x) = myArrayNomber(x)
       }
     }//вычислили ряд факториалов
     for (i <- 0 to (myArrayLenght - 1)) println(myArrayNomber(i) + " - " + myFactorials(i)) //вывод числового ряда
     val myDifference = myFactorials(myArrayLenght - 1) - myX //вычисление разницы между факториалом самого большого числа и искомым
     println("myDifference = " + myDifference) //вывод разницы
     var saveIndexForMinus = new Array[Int](myArrayLenght) //сохранение индексов
     if (myDifference % 2 != 0) println("При таком искомом числе решение невозможно")//принципиально это возможно?
     //далее алгоритм поиска чисел под минус
     var y = myDifference/2 //разница,уменьшаемая в процессе до нуля
     var doubleMyArrayNomber = myArrayNomber //дублируем ряд для уменьшения
     while (y > doubleMyArrayNomber.last)  {
       saveIndexForMinus(doubleMyArrayNomber.last) = doubleMyArrayNomber.last //запоминаем последнее число
       y = y - doubleMyArrayNomber.last //вычисляем новый остаток
       doubleMyArrayNomber = doubleMyArrayNomber.init //убираем из числового ряда последний член
     }
         saveIndexForMinus(y) = y
         //y = 0

     for (i <- 0 to saveIndexForMinus.length - 1) if (saveIndexForMinus(i) != 0) println("Поставить минус перед цифрой " + saveIndexForMinus(i))//вывод чисел перед которыми нужно поставить минус
     //далее выстраиваем итоговый ряд из цифр и знаков
     //сначала превратим saveIndex в последовательность минусов и плюсов
     var totalSignature = new Array [String] (saveIndexForMinus.length)
     for (i <- 0 to totalSignature.length - 1) if (saveIndexForMinus(i) == 0) totalSignature(i) = "+" else totalSignature(i) = "-"
     var totalString = new Array[String](myArrayNomber.length + totalSignature.length)
     var i = 0
     totalString(0) = totalSignature(0)
     totalString(1) = myArrayNomber(0).toString
     totalSignature = totalSignature.tail
     myArrayNomber = myArrayNomber.tail
     i = 2
     while (i <= totalString.length - 1) {
       if (i%2 == 0) {
         totalString(i) = totalSignature(0)
         totalSignature = totalSignature.tail
         i = i.+(1)
       }
       else {
         totalString(i) = myArrayNomber(0).toString
         myArrayNomber = myArrayNomber.tail
         i = i.+(1)
       }


     }
     totalString = totalString.tail
     totalString.foreach(print)


   }

}

