package fr.fusetim.scala99

object Problem20 extends App {
  // Some testing values:
  val list1 = List('a, 'b, 'c, 'd)
  val list1_removed = (List('a, 'c, 'd),'b)
  assert(removeAt(1, list1) == list1_removed)

  def removeAt[T](n: Int, list: List[T]): (List[T], T) = {
    def removeTailRecursive[T](n: Int, list: List[T], pre: List[T]): (List[T], T) = {
      (n, list) match {
        case (n, _) if n < 0 => throw new NoSuchElementException
        case (_, Nil) => throw new NoSuchElementException
        case (0, head :: tail) => return (pre ::: tail, head)
        case (n, head :: tail) => return removeTailRecursive(n-1, tail, pre ::: List(head))
      }
    }
    return removeTailRecursive(n, list, Nil)
  }
}
