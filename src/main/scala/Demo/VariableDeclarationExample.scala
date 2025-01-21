package Demo

object VariableDeclarationExample
{
  def main(args:Array[String]): Unit = {
    //Example 1
    var a:Int=12
    println(a)
    a=a+30
    println(a)
    a=20
    println(a)

    //Example 2
    val b:Int=30
    println(b)
   // b=40   //Will give Error as val is immutable means we cannot change its value once declare
    println("Value of x is-->>"+b)


    //Example 3
    val x= {val a:Int=200; val b:Int=300;a+b}
    println("Value of x is-->>"+x)

    //Example 4
    //var c: Int; ////error--> variables need to be initialized

    //Example 5--String
    val str1: String ="Hello World";
    val str2:String =" Max";
    println(str1.length)
    println(str1.concat(str2))
    println(str1+str2)  //Concatenation can also done with + operator

  }
}
