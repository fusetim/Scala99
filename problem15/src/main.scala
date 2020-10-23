package fr.fusetim.scala99

object Problem15 extends App {
  // Some testing values:
  val list1 = List('a, 'b, 'c, 'c, 'd)
  val list1_duplicated = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  assert(duplicateN(3, list1) == list1_duplicated)

  /// Duplicate each element in the list n times.
  def duplicateN[T](n: Int, list: List[T]): List[T] = {
    list match {
      case Nil => return List()
      case head :: tail => return List.fill(n)(head) ::: duplicateN(n, tail)
    }
  }
}
