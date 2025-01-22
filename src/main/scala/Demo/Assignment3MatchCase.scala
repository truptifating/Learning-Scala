package Demo

object Assignment3MatchCase
{

  def main(args:Array[String]): Unit =
  {
    noOfBrowniesToBuy1(11)
  }

  def noOfBrowniesToBuy1(noOfPeople: Int): Int =
  {
    val defaultBrowniesToBuy = 10
    val browniesPerPerson = 2

    noOfPeople match {
      case 0          => println("No need to Buy Brownie")
                         0
      case n if n <10 => println(s"Buying default no of brownies $defaultBrowniesToBuy")
                         defaultBrowniesToBuy
      case n if n >10 => val noOfBrowniesToBuy = browniesPerPerson * noOfPeople
                         println(s"Buying brownies-->>$noOfBrowniesToBuy")
                         noOfBrowniesToBuy
    }
  }

}
