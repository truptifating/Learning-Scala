package Demo

object forLoop
{
  def main(args:Array[String]): Unit =
  {
    //Syntax
    /* for(var i <- Range)
    {

    }*/
    //1
      for(i <- 1 to 5) //it will automatically take var hence no need to declare
      {
        println(i)
      }

    //2
      for (i <- 1.to(2))  //<-(generator)
      {
        println(i)
      }
    //3
      for (i <- 1 until 5) //it will automatically take var hence no need to declare
      {
        println(i)
      }
    //4
      for (i <- 1.until(4))
      {
        println(i)
      }
    //5--Nested Loop
      for(i<-1 to 5; j<-1 to 3)
      {
          println(i+" " +j)
      }
    //6--Iterating and Printing List
        var ls= List(1,2,6,78,345)
      for(i <-ls)
      {
          println("Printing the list "+i)
      }
    //7
      for(i <-ls;if i<10)
      {
          println("Printing the list after if condition "+i)

      }

    //8
        var result1 = for {i <- ls; if i < 10} yield
          {
            i*i
          }
         // println("Result is-->>"+result1);

  }
}

