package Demo

object WhileLoop
{
  def main(args: Array[String]): Unit =
    {
      var x = 0;
      while (x < 10) {
        println(x)
        x += 1 //x=x+1//Note--x++,++x,--x,x-- (Not allowed in scala)
      }
    }



}
