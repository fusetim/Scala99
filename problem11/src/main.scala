package fr.fusetim.scala99

import fr.fusetim.scala99.Problem10

object Problem11 extends App {
  // Some testing values:
  val list1 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val list1_encoded = List(Left((4,'a)), Right('b), Left((2,'c)), Left((2,'a)), Right('d), Left((4,'e)))
  assert(encodeModified(list1) == list1_encoded)

  /// Encode as a run-lenght list (but only duplicates are move into (lenght, value))
  def encodeModified[T](list: List[T]): List[Either[(Int, T), T]] = {
    return Problem10.encode(list) map {
      case (1, v) => Right(v)
      case o => Left(o)
    }
  }
}