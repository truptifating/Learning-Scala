package Demo

object ImpliciExample2
{
  def main(args:Array[String]): Unit =
    {
      val message = "hello"
      implicit val name ="world"
      def learning(implicit nm : String): String=
      {
        return message+nm
      }

      val result = learning
      println(result)

      val result1 = learning("ABC")
      println(result1)



    }
}
