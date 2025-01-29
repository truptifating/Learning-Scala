package Demo

object MapsInScala
{ //Maps Declaration
  //1
  val myMapps : Map[Int, String] = Map(801 ->"Kia", 802 -> "Clara", 803->"Tia")
  //2
  //val mymap = Map(1->"Tom", 2->"Clara", 3->"Sitara")

  val myMapps1 : Map[Int, String] = Map(804 ->"Sitara")

  def main(args:Array[String]): Unit =
  {
    println(myMapps)
    println(myMapps(801))
    println(myMapps.isEmpty)
    println(myMapps.head)
    println(myMapps.tail)
    println(myMapps.keys)
    println(myMapps.values)
    println(myMapps.contains(key = 802))

    println("Printing Key and Values")
    myMapps.keys.foreach{key => println("key "+key);
      println("Value "+myMapps(key))}

    //Concatinating 2 Maps
    println(myMapps++myMapps1)

  }
}
