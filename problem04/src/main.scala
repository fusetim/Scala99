package fr.fusetim.scala99

object Problem04 extends App {
  // Some testing values:
  assert(lenght(List(1, 1, 2, 3, 5, 8)) == 6)
  assert(lenght(List(7, 2, 115, -85, 65, 87)) == 6)
  assert(lenght(List(7.2, 2.4, 115.4)) == 3)
  assert(lenght(List(1, 1, 2, 3, 5, 8, 9, 7)) == 8)

  /// Return the number of elements of a list
  def lenght[T](list: List[T]): Int = {
    def acc[T](n: Int, list: List[T]): Int = {
      list match {
        case Nil        => return n
        case head :: tl => return acc(n + 1, tl)
      }
    }
    return acc(0, list)
  }
}
