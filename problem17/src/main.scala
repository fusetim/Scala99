package fr.fusetim.scala99

object Problem17 extends App {
  // Some testing values:
  val list1 = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  val list1_split = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  assert(split(3, list1) == list1_split)

  /// Split a list into two parts
  def split[T](n: Int, list: List[T]): (List[T], List[T]) = {
    (n, list) match {
      case (n, Nil) => return (List(), List())
      case (0, l) => return (List(), l)
      case (1, head :: tail) => return (List(head), tail)
      case (n, head :: tail) => {
        val splitted = split(n-1, tail);
        return(head :: splitted._1, splitted._2)
      }
    }
  }
}
