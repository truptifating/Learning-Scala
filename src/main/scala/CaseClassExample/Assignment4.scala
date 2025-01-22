package CaseClassExample

case class Assignment4(productname: String,productCode: Int)

object Assignment
{
  def main(args:Array[String]): Unit =
  {
    var ob1 = Assignment4("Shampoo", 10)
    println(ob1.productname)
    println(ob1.productCode)

  }
}


