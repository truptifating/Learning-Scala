package Demo


class Bank(val value:Double)
{
   def bankAccount : Double =value*100
}

implicit def bankBalance(y:Double):Bank =new Bank(y)
// Define an implicit conversion from Double to Bank
//This line defines an implicit function bankBalance that converts a Double to a Bank.
//The implicit keyword indicates that this function can be used for implicit conversions.
//The function takes a parameter x of type Double and returns a new instance of the Bank class with x as its value.

val length: Bank = 5.0

object ImplicitFunctionExample
{
  def main(args:Array[String]): Unit = {
    println(length.bankAccount)

  }
}
