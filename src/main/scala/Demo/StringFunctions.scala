package Demo

object StringFunctions
{
  def main(args:Array[String]): Unit =
    {
      // Applying indexOf method
      val result = "NidhiSingh".indexOf("Sin")

      // Displays output
      println(result)


      // Creating a StringBuffer
      val m1 = new StringBuffer("Nidhi")

      // Applying contentEquals() method
      val result1 = "Nidhi".contentEquals(m1)

      // Displays output
      println(result1)
    }
}
