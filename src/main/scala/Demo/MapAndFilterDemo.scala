package Demo

object MapAndFilterDemo
{
  val ls = List(1,2,3,5,6,7);
  val mymap = Map(1->"Tom", 2->"Clara", 3->"Sitara")
  def main(args:Array[String]): Unit = {
    println(ls.map(x=>x*2)) //Or println(ls.map(_*2))
    println(ls.map(x=>x+"hi"))
    println(ls.map(x=>"hi"+x))
    println(ls.map(x=>"hi"*x))

    //Applying map to mymapp
    println(mymap.map(x=>"hi"+ x))

    println("hello".map(x=>x.toUpper))

    println(List(List(1,2,3),List(3,4,5)))

    println(List(List(1,2,3),List(3,4,5)).flatten)

    println(ls.flatMap(x=>List(x, x+1)))
    println(ls.map(x => List(x, x + 1)))

    println("Filter Operation")
    println(ls.filter(x=>x%2==0))
  }
}
