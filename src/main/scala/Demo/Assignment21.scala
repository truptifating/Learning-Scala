package Demo

object Assignment21
{

  def totalCost(brownies: Int, couponCode: Option[String]): Double = {//The Option[String] type allows the coupon code to be either Some(couponCode) or None.
    val pricePerBrownie = 4.50
    val total = brownies * pricePerBrownie
    val discount = couponCode match {
      case Some("DISCOUNT10") => 0.10 // 10% discount for coupon code "DISCOUNT10"
      case Some("DISCOUNT20") => 0.20 // 20% discount for coupon code "DISCOUNT20"
      case _ => 0.0 // No discount
    }
    total * (1 - discount)

  }
  def main(args:Array[String]): Unit =
    {
      // Get user input for the number of brownies
      println("Enter the number of brownies:")
      val brownies = scala.io.StdIn.readInt()  //These lines prompt the user to enter a coupon code and read the input as a Int

      // Get user input for the coupon code
      println("Enter the coupon code")
      val couponCodeInput = scala.io.StdIn.readLine()  //These lines prompt the user to enter a coupon code and read the input as a string.
      val couponCode = if (couponCodeInput.isEmpty) None else Some(couponCodeInput)

      // Call the function with the user input
      val costWithCoupon = totalCost(brownies, couponCode)
      println(s"The total cost for $brownies brownies with coupon code is $costWithCoupon")

      // Call the function without a coupon code
      val costWithoutCoupon = totalCost(brownies, None)
      println(s"The total cost for $brownies brownies without coupon code is $costWithoutCoupon")
    }
}
