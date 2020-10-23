package fr.fusetim.scala99

object Problem16 extends App {
  // Some testing values:
  val list1 = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  val list1_final = List('a, 'b, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  assert(drop(3, list1) == list1_final)

  /// Decode a run-lenght list into an uncompressed version
  def drop[T](n: Int, list: List[T]): List[T] = {
    (n, list) match {
      case (_, Nil) => return List.empty[Nothing];
      case (1, _ :: tail) => return tail;
      case (n, el :: tail) => return el :: drop(n-1, tail);
    }  
  }
}