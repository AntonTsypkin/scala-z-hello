package ru.tsypkin

import scala.collection.mutable.ArrayBuffer

/**
 * Created by AntonTsypkin on 13.04.15.
 */
trait ReadNomberMatching {
  def readNomberMatching(): Unit = {
    val mainStr = "1-1-2-3"
    val strLenght = mainStr.length
    var saveDigit = new ArrayBuffer[Int]()
    var x = 0
    var digitCandidatte : String = ""
    var prevIsDigit = false
    var prevIsLetter = false
    var isInNomberCandidatte = false
    while (x < strLenght)
      (mainStr(x).isDigit, mainStr(x).isLetter, prevIsDigit, prevIsLetter) match {
        case (true, false, false, false) => digitCandidatte = "" + mainStr(x); isInNomberCandidatte = true
        case (true, false, false, true) => digitCandidatte = "" ; isInNomberCandidatte = false
        case (true, false, true, false) => digitCandidatte = "" + mainStr(x); isInNomberCandidatte = true
        case (false, true, true, false) => digitCandidatte = ""; isInNomberCandidatte = false
        case (false, false, true, false) => saveDigit += digitCandidatte.toInt; digitCandidatte = ""
      }

    if (mainStr(x).isDigit) {
      prevIsDigit = true
      prevIsLetter = false
    }
    if (mainStr(x).isLetter) {
      prevIsDigit = false
      prevIsLetter = true
    }
    if (!mainStr(x).isLetterOrDigit) {
      prevIsDigit = true
      prevIsLetter = false
    }

    x=x+1

    saveDigit.foreach(i => println(i))

  }

}
