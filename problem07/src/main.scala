package fr.fusetim.scala99

object Problem07 extends App {
  // Some testing values:
  assert(flatten(List(1, 2, 3, List(1, 2, 3))) == List(1, 2, 3, 1, 2, 3))
  assert(
    flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8)
  )

  /// Return a flatten list
  def flatten(list: List[_]): List[Any] = {

    list match {
      case Nil                     => return List.empty
      case (head: List[_]) :: tail => return flatten(head) ::: flatten(tail)
      case head :: tail            => return head :: flatten(tail)
    }
  }
}
