package fr.fusetim.scala99

object Problem19 extends App {
  // Some testing values:
  val list1 = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  val list1_rotated = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  val list2 = list1
  val list2_rotated = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  assert(rotate(3, list1) == list1_rotated)
  assert(rotate(-2, list2) == list2_rotated)

  /// Rotate the list n times to the left
  def rotate[T](n: Int, list: List[T]): List[T] = {
    def rotateTailRecursive[T](n: Int, list: List[T], pre: List[T]): List[T] = {
      (n, list) match {
        case (_, Nil) => Nil
        case (1, head :: tail) => return tail ::: (pre ::: List(head))
        case (n, list) if n < 1 => return rotateTailRecursive(list.length+n, list, pre)
        case (n, head :: tail) => return rotateTailRecursive(n-1, tail, pre ::: List(head))
      }
    }
    return rotateTailRecursive(n, list, Nil)
  }
}
