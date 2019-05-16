import org.scalatest.{Matchers, WordSpec}

import scala.io.Source

class NumberParserSpec extends WordSpec with Matchers {

  "Number parser" should {

    "read a line of zeroes" in {
      val zeroes = Source.fromFile("zeroes.txt").getLines().toList
      NumberParser.parse(zeroes) shouldBe "000000000"
    }
  }
}
