package Demo

object CreatingFunctions
{//Different ways of writing method
  //Syntax-->>def FunctionName (argument:datatype) //Ex-->def working(x:Int, y:Int)
  //def working(x:Int, y:Int) : Int={} (Means this function is returning Integer value)


  def main(args:Array[String]): Unit =
  {
    println(add(45,12))
    println(multiply(45,12))
    println(subtraction(45,12))
    println(division(45,12))
    println(multi(45,12))
    println(Math.add(60,10))

    //Anonymous Function Example
    println(Math.add1())
    println(Math square 5)
    println(Math.+(60, 10))
    println(Math.**(60, 10))

    var sum=(x:Int,y:Int) => x+y;
    println(sum(100, 100));


  }
  //1
  def add(x: Int, y: Int) : Int=
    {
      return x+y;
    }

  //2
  def multiply(x: Int, y: Int): Int =
   {
    x * y;                           //No need of return as well
   }

  //3
  def subtraction(x: Int, y: Int): Int =return x - y;

  //4
  def division(x: Int, y: Int): Float = x / y;

  //5
  def multi(x: Int, y: Int) = x*y; //as input and output of same datatype and hence we remove the datatype

  //6
  object Math
 {
   def add(x: Int, y: Int) : Int=
   {
     return x+y;
   }

   def add1(x: Int=20, y: Int=10): Int = {          //Anonymous Function
     return x + y;
   }

   def +(x: Int, y: Int): Int = {  //Anonymous Function//We can also give operator name to function
     return x + y;
   }

   def **(x: Int, y: Int): Int = {  //Anonymous Function
     return x * y;
   }


   def square(x: Int)=x * x;
 }


}
