package TraitsLesson

class GFG extends Geeks1 with Geeks2
{
  override def method1(): Unit = println("From class to Trait 1")

  // method2 from Geeks2
  override def method2(): Unit = println("From class to Trait 2")
}

