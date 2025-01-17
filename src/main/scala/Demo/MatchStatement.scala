package Demo

object MatchStatement
{
  def main(args:Array[String]): Unit =
  {
    var age=18;
    age match
    {
      case 20 => println(age)
      case 18 => println(age)
      case 30 => println(age)
      case _ => println("default")

    }

    val i =7;
    i match
    {
      case 1|3|5|7|9 => println("Odd")
      case 2|4|6|8|0 => println("Even")
    }

  }

}
