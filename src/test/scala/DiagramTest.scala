import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.diagrams.Diagrams
import scala.util._

class DiagramTest extends AnyFunSuite with Diagrams{
  test("This must not be success"){
    assert(Seq("a", "b") == Seq("a"))
  }
}