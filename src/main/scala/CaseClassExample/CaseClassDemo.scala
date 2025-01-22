package CaseClassExample

case class CaseClassDemo(name:String,age:Int)

object CaseClassDemoObject
{
  def main(args:Array[String]): Unit =
  {
    var c = CaseClassDemo("Calfie", 2)
    println(c.name)
    println(c.age)

    //Creating a duplicate of same instance without altering the parameters.
    var c1 = c.copy()  //Copying data
    println(c1.name)
    println(c1.age)

    //Creating a duplicate of same object with changing attributes.
    var c2 = c.copy(age = 20)
    println(c2.name)
    println(c2.age)
  }
}
