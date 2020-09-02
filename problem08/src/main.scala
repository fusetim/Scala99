package fr.fusetim.scala99

object Problem08 extends App {
  // Some testing values:
  assert(
    compress(
      List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    ) == List('a, 'b, 'c, 'a, 'd, 'e)
  )
  assert(
    compress(List(1, 2, 4, 5, 5, 5, 4, 1, 1, 2, 3, 3, 2, 4, 4, 4)) == List(1, 2,
      4, 5, 4, 1, 2, 3, 2, 4)
  )

  /// Return a list without duplicated elements
  def compress[T](list: List[T]): List[T] = {
    list match {
      case head :: Nil                    => return List(head)
      case head :: (x :: xs) if head == x => return compress(head :: xs)
      case head :: tail                   => return head :: compress(tail)
    }
  }
}
