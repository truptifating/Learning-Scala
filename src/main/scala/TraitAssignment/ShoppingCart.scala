package TraitAssignment

class ShoppingCart extends ShoppingCartDao with InventoryService
{
   override def methodWithoutPara(): Unit = {
     println("Hi Trait");
   }

   override def methodWithPara(x:Int,y:Int): Int =
  {
    return x+y;
  }

   override def method(): Unit = 
   {
    println("Hi Inventory")
   }
  }

object assignment
{
  def main(args:Array[String]): Unit = {
    var shoppingCart = new ShoppingCart
    println(shoppingCart.methodWithPara(10,20))
    shoppingCart.methodWithoutPara()
    shoppingCart.method()
  }
}


