package fr.fusetim.scala99

object Problem03 extends App {
  // Some testing values:
  assert(nth(1, List(1, 2, 3, 4, 5, 6)) == 2)
  assert(nth(0, List(7, 2, 115, -85, 65, 87)) == 7)
  assert(nth(4, List(7.2, 2.4, 115.4, -855.5, 4.7)) == 4.7)
  assert(nth(2, List(1, 1, 2, 3, 5, 8)) == 2)

  /// Return the nth element from a list
  def nth[T](n: Int, list: List[T]): T = {
    val head :: tl = list
    n match {
      case negative if negative < 0 => throw new IndexOutOfBoundsException
      case 0                        => return head
      case positive if positive > 0 => nth(n - 1, tl)
    }
  }
}
