package fr.fusetim.scala99

object Problem09 extends App {
  // Some testing values:
  val list1 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val list1_packed = List(
    List('a, 'a, 'a, 'a),
    List('b),
    List('c, 'c),
    List('a, 'a),
    List('d),
    List('e, 'e, 'e, 'e)
  )
  assert(pack(list1) == list1_packed)

  /// Return a list packing each different element in a distinct list
  def pack[T](list: List[T]): List[List[T]] = {
    list match {
      case Nil => return List.empty[Nothing]
      case head :: Nil => return List(List(head))
      case head :: (x :: xs) if head == x => {
        val a :: b = pack(x :: xs)
        return (head :: a) :: b
      }
      case head :: tail => return List(head) :: pack(tail)
    }
  }
}
