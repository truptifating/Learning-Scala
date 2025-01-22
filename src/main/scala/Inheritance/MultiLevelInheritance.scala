package Inheritance

class Grandparents1
{
  var name1 : String = "Trupti";
}
class Parents1 extends Grandparents1
{
  var age1 : Int = 20;
}
class Child1 extends Parents1
{
  var city : String="Pune"
}

object MultiLevelInheritance
{
  def main(args: Array[String]): Unit =
    {
       var ob1 = new Child1()
      println(ob1.name1)
      println(ob1.age1)
      println(ob1.city)
    }
}
