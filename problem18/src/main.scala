package fr.fusetim.scala99

object Problem18 extends App {
  // Some testing values:
  val list1 = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  val list1_slice = List('d, 'e, 'f, 'g)
  assert(slice(3, 7, list1) == list1_slice)

  /// Extract a slice from from a list
  def slice[T](i: Int, k: Int, list: List[T]): List[T] = {
    val method1 = sliceRecursive(i,k,list)
    val method2 = sliceTailRecursive(i,k,list)
    assert(method1 == method1)
    return method1
  }

  def sliceRecursive[T](i: Int, k: Int, list: List[T]): List[T] = {
    (i, k, list) match {
      case (_, _, Nil) => return Nil
      case (0, 1, head :: list) => return List(head)
      case (0, k, head :: tail) => return head :: slice(0, k-1, tail)
      case (i, k, head :: tail) => return slice(i-1, k-1, tail)
    }
  }

  def sliceTailRecursive[T](i: Int, k: Int, list: List[T]): List[T] = {
    def slicer[T](i: Int, k: Int, list: List[T], pre: List[T]): List[T] = {
      (i, k, list) match {
        case (_, _, Nil) => return Nil
        case (0, 1, head :: list) => return pre ::: List(head)
        case (0, k, head :: tail) => return slicer(0, k-1, tail, pre ::: List(head))
        case (i, k, head :: tail) => return slicer(i-1, k-1, tail, Nil)
      }
    }
    return slicer(i,k,list,Nil)
  }
}
