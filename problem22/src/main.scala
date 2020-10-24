package fr.fusetim.scala99

object Problem22 extends App {
  // Some testing values:
  val list4to9 = List(4, 5, 6, 7, 8, 9)
  assert(range(4, 9) == list4to9)
  assert(rangeTailRecursive(4, 9) == list4to9)

  // Create a inclusive range
  def range(start: Int, end: Int): List[Int] = {
    if (start > end) return Nil
    else return start :: range(start+1, end)
  }

  // Create a inclusive range, using a tail recursive method
  def rangeTailRecursive(start: Int, end: Int): List[Int] = {
    def rangeTR(start: Int, end: Int, acc: List[Int]): List[Int] = {
      if (start > end) return acc
      else return rangeTR(start+1, end, acc ::: List(start))
    }
    return rangeTR(start, end, Nil)
  }
}
