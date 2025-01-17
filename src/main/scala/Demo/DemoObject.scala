package Demo

object DemoObject
{
    def main(args:Array[String]): Unit =
    {
      val name="Hello World"
      println(name)

      val gname="Mark"
      val age=18
      //String Interpolation
      println(gname+" is"+age+" years old")
      println(s"$gname is $age years old")
      println(s"Hello \nWorld")
      println(raw"Hello \nWorld")

    }
}






