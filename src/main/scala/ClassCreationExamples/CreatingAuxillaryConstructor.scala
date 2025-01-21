package ClassCreationExamples

//Auxillary constructor are alternative to class
//Class can have many auxillary constructor but with different signature
/*class User4(var name: String, var age: Int)
{
  def this(): Unit= 
  {
     this("Tom",32);        // Default constructor
  }
  
  def this(name:String): Unit = 
  {
    this(name,20);
  }
  
};
object CreatingAuxillaryConstructor
{
  def main(args:Array[String]): Unit =
  {
    var userA = new User4("Clara",20)
    var userB = new User4()           // Call default constructor
    var userC = new User4("Stella")
  }
}
*/