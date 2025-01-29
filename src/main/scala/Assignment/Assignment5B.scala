package Assignment

object Assignment5B
{
  def main(args:Array[String]): Unit = {
    val mymap : Map[String,Boolean] = Map("Pune" -> true, "Mumbai"->false, "Nagpur"->true)

    val activeUser=getUsername(mymap)
    activeUser.foreach(println)

  }
  def getUsername(map: Map[String,Boolean]): List[String]=
  {
    map.collect{
      case(userName1, true)=>userName1
    }.toList                              // Will convert Map to List
  }
}
//case (userName, isActive):
//This pattern matches a tuple with two elements.
//userName is bound to the first element of the tuple (the key in the Map).
//isActive is bound to the second element of the tuple (the value in the Map).