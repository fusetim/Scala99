package fr.fusetim.scala99

object Problem21 extends App {
  // Some testing values:
  val list1 = List('a, 'b, 'c, 'd)
  val list1_append = List('a, 'new, 'b, 'c, 'd)
  assert(appendAt('new, 1, list1) == list1_append)

  // Append element at index n in the given list
  def appendAt[T](el: T, n: Int, list: List[T]): List[T] = {
    def appendTailRecursive[T](el: T, n: Int, list: List[T], pre: List[T]): List[T] = {
      (n, list) match {
        case (n, _) if n < 0 => throw new IndexOutOfBoundsException
        case (_, Nil) => return List(el)
        case (1, head :: tail) => return pre ::: (head :: (el :: tail))
        case (n, head :: tail) => return appendTailRecursive(el, n-1, tail, pre ::: List(head))
      }
    }
    return appendTailRecursive(el, n, list, Nil)
  }
}
