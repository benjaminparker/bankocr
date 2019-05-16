object NumberParser {
  def parse(rows: List[String]): String = {
    val firstRow = toDigitRows(rows(0))
    val secondRow = toDigitRows(rows(1))
    val thirdRow = toDigitRows(rows(2))

    val digits = (0 to 8).map { pos =>
      Digit(firstRow(pos), secondRow(pos), thirdRow(pos))
    }
    digits.map(Digits.digits(_)).mkString
  }

  def toDigitRows(row: String): List[DigitRow] = {
    println(s"Row : $row")
    val list = row.sliding(3, 3).toList
    println(list)
    list.map(s => DigitRow(s(0), s(1), s(2)))
  }

}
