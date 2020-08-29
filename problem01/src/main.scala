package fr.fusetim.scala99.problem01

object Main extends App {

  // Some testing values:
  assert(last(List(1, 2, 3, 4, 5, 6)) == 6)
  assert(last(List(7, 2, 115, -85, 65, 87)) == 87)
  assert(last(List(7.2, 2.4, 115.4, -855.5, 4.7)) == 4.7)
  assert(last(List(1, 1, 2, 3, 5, 8)) == 8)

  /// Return the last element from a list
  def last[T](list: List[T]): T = {
    list match {
      case Nil         => throw new NullPointerException
      case head :: Nil => return head
      case head :: tl  => return last(tl)
    }
  }
}
