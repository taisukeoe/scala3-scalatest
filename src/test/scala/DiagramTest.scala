import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.diagrams.Diagrams
import scala.util._

class DiagramTest extends AnyFunSuite with Diagrams{
  test("This must be success"){
    assert(Seq("a").nonEmpty)
  }
}