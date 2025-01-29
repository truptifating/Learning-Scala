package Demo

object StreamInScala
{
  def main(args:Array[String]): Unit = {
    val streamOb = 1 #:: 2 #:: 3 #:: Stream.empty
    println(streamOb)
    println(streamOb.head)
    println(streamOb.tail)

    // Taking elements from stream
    print("Take first 2 numbers from stream = ")
    println(streamOb.take(2))
    print("\nTake first 10 numbers from stream2 = ")
    println(streamOb.take(10))

    // map elements from stream
    println(streamOb.map(x=>x+5))

    // Creating empty stream
    val emptyStream: Stream[Int] = Stream.empty[Int]
    println(s"Empty Stream = $emptyStream")

    //takeRight() method is utilized to select the last ‘n’ elements of the Stream.
    
  }
}
