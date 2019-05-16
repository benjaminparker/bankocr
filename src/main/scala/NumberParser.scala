object NumberParser {
  
  def parse(rows: List[String]): String = {
    def toDigitRows: String => List[DigitRow] = { row =>
      val digitChars = row.sliding(3, 3).toList
      digitChars.map(s => DigitRow(s(0), s(1), s(2)))
    }

    val firstRow = toDigitRows(rows(0))
    val secondRow = toDigitRows(rows(1))
    val thirdRow = toDigitRows(rows(2))

    val digits = (firstRow, secondRow, thirdRow).zipped.map { (r1, r2, r3) => Digit(r1, r2, r3) }

    digits.map(Digits.digits(_)).mkString
  }
}
