package ClassCreationExamples

class User2(val name:String, val age:Int);
object CreatingConstructorOfClassForVal
{
  def main(args:Array[String]): Unit =
  {
    val user2 = new User2("Jack",15)
    println(user2.name)
    println(user2.age)

    //We cannot override the values of val as it is immutable
   // user2.name()-->>It will give error as reassignment of val is not possible

  }

}
// Note--class User2(val name:String, var age:Int);
//It is also allowed with different data type, here we can override the var but not val values