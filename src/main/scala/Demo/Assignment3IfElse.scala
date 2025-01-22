package Demo

object Assignment3IfElse {
  
  def main(args: Array[String]): Unit =
  {

    noOfBrowniesToBuy(16)
  }

  def noOfBrowniesToBuy(noOfPeople: Int): Int =
    {
      val defaultBrowniesToBuy = 10
      val browniesPerPerson = 2

      if (noOfPeople == 0) {
        println("No need to Buy Brownie")
        0
      } else if (noOfPeople < 10) {
        println(s"Buying default no of brownies $defaultBrowniesToBuy")
        defaultBrowniesToBuy
      } else {
        val noOfBrowniesToBuy=browniesPerPerson * noOfPeople
        println(s"Buying brownies-->>$noOfBrowniesToBuy")
        noOfBrowniesToBuy

      }
    }

}