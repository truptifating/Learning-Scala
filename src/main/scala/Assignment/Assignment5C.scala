package Assignment

object Assignment5C
{
  def main(args:Array[String]): Unit =
  {
    // Create tuples with UserName as key and Boolean as value
    val user1: (String, Boolean) = ("Alice", true)
    val user2: (String, Boolean) = ("Bob", false)
    val user3: (String, Boolean) = ("Charlie", true)
    val user4: (String, Boolean) = ("David", false)

    //Creating a List of Tuples
    val userList : List[(String, Boolean)] = List(user1, user2, user3, user4)
    println(userList)

    //Call the method and print the result
    val result = getUserName(userList)
    result.foreach(println)
    }

  def getUserName(userList: List[(String, Boolean)]): List[String] =
  {
      userList.collect {
      case (userName, true) => userName
    }
  }
}
