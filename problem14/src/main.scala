package fr.fusetim.scala99

object Problem14 extends App {
  // Some testing values:
  val list1 = List('a, 'b, 'c, 'c, 'd)
  val list1_duplicated = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  assert(duplicate(list1) == list1_duplicated)

  /// Duplicate each element in the list
  def duplicate[T](list: List[T]): List[T] = {
    list match {
      case Nil => return List()
      case head :: tail => return List(head, head) ::: duplicate(tail)
    }
  }
}
