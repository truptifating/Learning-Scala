package ClassCreationExamples

class User1(var name:String, var age:Int);  //Creating constructor for var
object CreatingConstructorOfClass
{
  def main(args:Array[String]): Unit =
  {
    var user = new User1("Max",28);  //Initializing constructor
    println(user.name)
    println(user.age)

    //We can override the values of var as it is mutable
    user.name="Tom";
    user.age=18;
    println(user.name)
    println(user.age)
  }
}
