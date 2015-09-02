package ru.tsypkin

/**
 * Created by AntonTsypkin on 29.04.15.
 */
trait ScalaForME {
   def olimpicExample1 (): Unit = {
val myArrayNomber = Array[Int](1,2,3,4,5)
     val myNomberLength = 4
     val myFactorials = new Array[Int](5)
     var x = 0
     for (x <- 0 to myNomberLength)
       if (x != 0) {
         myFactorials(x) = myFactorials(x-1) + myArrayNomber(x)
       }
     myFactorials(0) = 1
     myFactorials.foreach(println)





   }

}

