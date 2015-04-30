package ru.tsypkin

import scala.collection.mutable.ArrayBuffer

/**
 * Created by AntonTsypkin on 13.04.15.
 */
trait ReadNomberMatching {
  def readNomberMatching(): Unit = {
    var mainStr = "/,;l;.1.2..2..3.3.3.3.4bf654f.12345982739847398475781902783462794688563"
    mainStr  += "-"
    val strngLenght: Int = mainStr.length
    var saveDigit = new ArrayBuffer[(String , String )]()
    var saveX : String = ""
    var x : Int = 0
    var digitCandidatte : String = ""
    var prevIsDigit = false
    var prevIsLetter = false
    var isInNomberCandidatte = false
    while (x < strngLenght) {
      (mainStr(x).isDigit, mainStr(x).isLetter, prevIsDigit, prevIsLetter) match {
       case (true, false, true, false) if isInNomberCandidatte => { digitCandidatte += mainStr(x) ; isInNomberCandidatte = true }
       case (true, false, false, true) =>
       case (true, false, false,false) => digitCandidatte += mainStr(x) ; isInNomberCandidatte = true ; saveX = (x+1).toString
       case (false, true, true, false) => digitCandidatte = "" ; isInNomberCandidatte = false ; saveX = ""
       case (false, true, false, true) =>
       case (false, true, false, false) =>
       case (false, false, true, false)  if isInNomberCandidatte => saveDigit.append ((saveX, digitCandidatte)) ; digitCandidatte = "" ; isInNomberCandidatte = false ; saveX = ""
       case (false, false, false, true) =>
       case (_, _, _, _) =>
       //case _ => throw new RuntimeException("cho za hren'")

      }
     if (mainStr(x).isDigit) {
       prevIsDigit = true
       prevIsLetter = false
     }
      else
     if (mainStr(x).isLetter) {
       prevIsDigit = false
       prevIsLetter = true
     }
      else
     if (!mainStr(x).isDigit && !mainStr(x).isLetter) {
       prevIsDigit = false
       prevIsLetter = false
     }



      x = x + 1
    }
//    while (x == strngLenght - 1)  match {
//      case (true, false, true, false) if isInNomberCandidatte => { digitCandidatte += mainStr(x) ; isInNomberCandidatte = true }
//      case (true, false, false, true) =>
//      case (true, false, false,false) => digitCandidatte += mainStr(x) ; isInNomberCandidatte = true
//      case (false, true, true, false) => digitCandidatte = "" ; isInNomberCandidatte = false
//      case (false, true, false, true) =>
//      case (false, true, false, false) =>
//      case (false, false, true, false) => saveDigit.append ((x, digitCandidatte)) ; digitCandidatte = "" ; isInNomberCandidatte = false
//      case (false, false, false, true) =>
//      case (_, _, _, _) =>
//    }

    saveDigit.foreach(i => println(i))
   }


  }


