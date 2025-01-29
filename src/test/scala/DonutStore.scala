import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class DonutStore
{
  def donutStore(): String="Vanila donut"

}
class ScalaTestDemo extends AnyFlatSpec with Matchers
{
  var d = new DonutStore()
  d.donutStore() shouldEqual "Vanila donut"
  d.donutStore() should not equal "plain donut"

}
