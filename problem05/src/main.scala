package fr.fusetim.scala99

object Problem05 extends App {
  // Some testing values:
  assert(reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
  assert(reverse(List(9, 8, 2, 1)) == List(1, 2, 8, 9))
  assert(reverse(List(2, 4, 2, 5, 4)) == List(4, 5, 2, 4, 2))
  assert(reverse(List(4, 4, 9, 5, 7)) == List(7, 5, 9, 4, 4))

  /// Return the list reversed
  def reverse[T](list: List[T]): List[T] = {
    def reversor[T](todo: List[T], done: List[T]): List[T] = {
      todo match {
        case Nil        => return done
        case head :: tl => return reversor(tl, head :: done)
      }
    }
    return reversor(list, Nil)
  }
}
