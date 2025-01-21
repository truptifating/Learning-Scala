package Demo
//Options--(Some or None)
object OptionDemo
{
  val ls = List(1,2,4);
  def main(args:Array[String]): Unit =
  {
     println(ls.find(_>4))
     println(ls.find(_>2))
  }
}
