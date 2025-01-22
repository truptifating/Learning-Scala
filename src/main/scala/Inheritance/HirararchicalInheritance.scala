package Inheritance

class Parent2 {
  var Name1: String = "Siya"
  var Name2: String = "Soniya"
}

class ChildA extends Parent2 {
  var Age: Int = 32

  def detailsA(): Unit =
  {
    println(" Name: " + Name1);
    println(" Age: " + Age);
  }
}

class ChildB extends Parent2 {
  var Height: Int = 164

  // Method
  def detailsB(): Unit ={
    println(" Name: " + Name2);
    println(" Height: " + Height);
  }
}
object HirararchicalInheritance
{
  def main(args: Array[String]): Unit=
  {

    // Creating objects of both derived classes
    val ob1 = new ChildA();
    val ob2 = new ChildB();
    ob1.detailsA();
    ob2.detailsB();
  }
}
