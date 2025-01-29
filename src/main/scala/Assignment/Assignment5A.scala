package Assignment

object Assignment5A
{
  def main(args:Array[String]): Unit =
  {
    var myList: List[Integer] = List(1, 3, 6, 7)
    var sumOfList = calculateSum(myList)
    println("Sum of No in List-->>"+sumOfList);
  }

  def calculateSum(list:List[Integer]): Int = {
    var sum = 0;
    list.foreach(sum += _)
    sum
  }
}
