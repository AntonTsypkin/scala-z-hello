package ru.tsypkin

/**
 * Created by AntonTsypkin on 29.04.15.
 */
trait ScalaForME {
   def interData (): Unit = {
     val requiredNomber = 2
     val lengthArray = 10
     val nomeroRange = new Array[Int](lengthArray)
     for (i <- 0 to lengthArray - 1) nomeroRange(i) = i
     val factorial = nomeroRange.sum
     if (requiredNomber > factorial) println("Решения нет!")
     val myDyfference = factorial - requiredNomber
     if (myDyfference%2 != 0) println("Нет решения!")
     var myDifferenceHalf = myDyfference/2
     val conclusion = new Array[Tuple2[String,Int]](lengthArray)
     var i = lengthArray - 1
     while (myDifferenceHalf >= nomeroRange(i)){// выучить точное знвчение знаков | и других!
       conclusion(i) = ("-",i)
       myDifferenceHalf = myDifferenceHalf - nomeroRange(i)
       i = i - 1
     }
     for (x <- 0 to myDifferenceHalf - 1) {conclusion(x) = ("+",x)}
     conclusion(myDifferenceHalf) = ("-",myDifferenceHalf)
     for (y <- myDifferenceHalf + 1 to i) conclusion(y) = ("+",y)
     conclusion.foreach(print)
   }

}

