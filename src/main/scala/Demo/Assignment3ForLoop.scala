package Demo

object Assignment3ForLoop
{

  def main(args:Array[String]): Unit =
  {
    for (noOfPeople <- 1 to 10) {
      noOfBrowniesToBuy3(noOfPeople)
    }
  }

}
def noOfBrowniesToBuy3(noOfPeople: Int): Int =
{
  val defaultBrowniesToBuy = 10
  val browniesPerPerson = 2

  if (noOfPeople == 0) {
    println("No need to Buy Brownie")
    0
  } else if (noOfPeople < 10) {
    println(s"No of brownies to buy-->> $defaultBrowniesToBuy")
    defaultBrowniesToBuy
  } else {
    val noOfBrowniesToBuy=browniesPerPerson * noOfPeople
    println(s"No of brownies to buy-->>$noOfBrowniesToBuy")
    noOfBrowniesToBuy

  }
}

