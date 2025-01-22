package Inheritance

class Parent {
  var name: String = "Ankita";
}

class Child extends Parent {
  var age: Int = 12;

  def details(): Unit = {
    println("Name " + name)
    println("Age " + age)
  }
}
object SingleLevelInheritance
{
  def main(args: Array[String]): Unit = {
    var ob = new Child
    ob.details()
  }
}


