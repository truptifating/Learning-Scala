package Demo

object Assignment2
{
  def totalCost(brownies:Int)(implicit discount: Double): Double =
  {
    val costOfOneBrownie =5;
    val total = brownies*costOfOneBrownie;
    total*(1-discount)
  }
  def main(args:Array[String]): Unit =

  {

    // Get user input for the number of brownies
    println("Enter the number of brownies:")
    val brownies = scala.io.StdIn.readInt()

    // Get user input for the discount
    println("Enter the discount (as a decimal, e.g., 0.10 for 10%):")
    val userDiscount = scala.io.StdIn.readDouble()

    // Define an implicit value for the discount
    implicit val discount: Double = userDiscount

    //Calling function
    val result=totalCost(brownies)
    println(result)
  }
}
