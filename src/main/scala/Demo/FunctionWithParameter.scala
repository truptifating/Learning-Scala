package Demo

object FunctionWithParameter
{
  def main(args:Array[String]): Unit =
  {
    println(square(5))
    println(add(1,3))

  }

  def square(x:Int):Int =
  {
  return x*x               // Function with Explicit Parameter
  }

  def add(x:Int, y:Int):Int =
  {
      return x+y;
  }


}
