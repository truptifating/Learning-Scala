package Demo
import Array._

object ArrayDeclaration
{
  //Array Declaration
  //1 way
  val myArray: Array[Int] = new Array[Int](4);
  //2 way
  val myArray2 = new Array[Int](5)
  //3 way
  val myArray3 = Array(1,2,5,3,8,9,0);

  def main(args:Array[String]): Unit =
  {
     myArray(0) = 20
     myArray(1) = 30
     myArray(2) = 40
     myArray(3) = 50
     for(x <- myArray)   //Iterating and Printing Array
      {
        println(x)
      }
      //OR
      for(i <- 0 to (myArray.length-1))
        {
          println(myArray(i))
        }

    //Concatinating 2 Array
        val result= concat(myArray,myArray3)
        for(y <- result)
          {
            println(y)
          }
  }

}
