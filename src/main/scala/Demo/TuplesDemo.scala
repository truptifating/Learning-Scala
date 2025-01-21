package Demo
//Tuples is a class which contain element of different datatype
//Tuples are immutable means we cannot change its value once declare
object TuplesDemo
{
  //Tupple declaration
  //1
  val mytuple = (1,3,"Hi",'a',true);

  //2
  val mytuple2 = new Tuple3(1,true,"Hi") //Tuple 3 indicates that Tuple have 3 elements
  def main(args:Array[String]): Unit =
  {
    println(mytuple)
    println(mytuple2)
    println(mytuple2._1) //It will print only 1 element from tuple

    mytuple2.productIterator.foreach{
      i => println(i)             //Iterating and printing values from tuple
    }
  }
}
