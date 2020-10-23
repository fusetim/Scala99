package fr.fusetim.scala99

object Problem12 extends App {
  // Some testing values:
  val list1 = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  val list1_decoded = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  assert(decode(list1) == list1_decoded)

  /// Decode a run-lenght list into an uncompressed version
  def decode[T](list: List[Tuple2[Int, T]]): List[_] = {
    list match {
      case Nil => return List.empty[Nothing];
      case (n, char) :: tail => return List.fill(n)(char) ::: decode(tail)
    }  
  }
}