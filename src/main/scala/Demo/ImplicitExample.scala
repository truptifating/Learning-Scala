package Demo

object ImplicitExample
{
  def main(args:Array[String]): Unit =
    {
      val value=10
      implicit val multiplier =3; //implicit variable declaration
      println(multiplication)

      def multiplication (implicit x :Int): Int=
    {
        return value*x
    }
    }
}
