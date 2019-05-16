case class Digit(firstRow: DigitRow, secondRow: DigitRow, thirdRow: DigitRow)
case class DigitRow(char1: Char, char2: Char, char3: Char)

object Digits {
  val Zero = Digit(
          DigitRow(' ', '_', ' '),
          DigitRow('|', ' ', '|'),
          DigitRow('|', '_', '|')
        )
  val One = Digit(
           DigitRow(' ', ' ', ' '),
           DigitRow(' ', ' ', '|'),
           DigitRow(' ', ' ', '|')
         )

  val digits: Map[Digit, String] = Map(
    Zero -> "0",
    One  -> "1",
  )
}
