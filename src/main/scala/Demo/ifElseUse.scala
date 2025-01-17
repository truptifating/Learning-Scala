package Demo

object ifElseUse
{
  def main(args:Array[String]): Unit =
  {
     val x=20;
     var res=if (x==20) "true" else "false"
     println(res)
    //OR
     println(if (x==20) "true" else "false")

     var b:Int=13
     var res1=if(b!=13) "true" else "false"
     println("Output od res1-->>"+res1)






    //Normal way of programming
//    if (x==20)
//      {
//        res="true"
//      }
//    else
//      {
//        res="false"
//      }
//      println(res)
  }
}
