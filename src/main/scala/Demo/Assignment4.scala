package Demo

class Brownie(var productname: String,var productCode: Int)
{
  def print(): Unit=
  {
    println(productname)
    println(productCode)
  }
}

object Assignment4
{
  def main(args:Array[String]): Unit = {
    var brownie1 = new Brownie("Soap",10)
    var brownie2 = new Brownie("Brush",20)

    brownie1.print()
    brownie2.print()


  }
}
