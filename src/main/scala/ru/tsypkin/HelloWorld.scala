package ru.tsypkin



object SingletonObject extends ReadNumber with PascalV2 with PascalV1 with ReadNomberMatching{
  def main(args: Array[String]): Unit = {
    //readNumber()
    //readNumberV2("tr566979 5ty 67 89 00077")
    readNomberMatching
    //loops()
    pascalV1
  }
}



