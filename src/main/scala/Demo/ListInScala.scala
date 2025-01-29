package Demo

object ListInScala
{
  //List declaration
  //1
  //val myList: List[Int] = List(1,2,6,4,8);
  //Or
  //2
  val myList = List(1,2,6,4,8);
  val nameList: List[String] = List("Max","Carl","Roy");
  def main(args:Array[String]): Unit =
  {
    println(myList)
    println(nameList)

    println(nameList.head) //It will give the first value of List
    println(nameList.tail) //It will give the remaining value of List
    println(nameList.isEmpty) // It will check whether the list is empty
    println(nameList.reverse) // It will reverse the list

    println(0 :: myList)  //:: cons-->>It is used to prepend 0 in my list
    println(Nil)          // Creates Empty List
    println(1::4::9::Nil)
    println(myList.max)
    println(myList.min)
    myList.foreach(println)

    //printing sum of every no in list
    var sum:Int =0
    myList.foreach(sum+=_)
    println(sum)


  }

}
