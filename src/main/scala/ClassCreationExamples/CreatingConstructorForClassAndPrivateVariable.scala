package ClassCreationExamples



//Var -->> Getter and Setter available
//Val -->> Only Getter available not Setter
//default -->> No Getter No Setter

class User3(private var name:String, val age:Int, city:String)
{
  def printName: Unit = {println(name)}
  def printCity: Unit = {println(city)}

};
object CreatingConstructorForClassAndPrivateVariable
{
  def main(args:Array[String]): Unit =
  {
    var user3= new User3("Carl",14,"Pune")
    //println(user3.name)-->> It will throw error as variable is private and hence we cannot use it outside class
    user3.printName;
    println(user3.age)
    //println(user3.city) -->> will give error as variable is default type and hence we cannot apply getter and setter
    user3.printCity;


  }

}
