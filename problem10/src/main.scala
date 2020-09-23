package fr.fusetim.scala99

import fr.fusetim.scala99.Problem04
import fr.fusetim.scala99.Problem09

object Problem10 extends App {
  // Some testing values:
  val list1 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val list1_encoded = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  assert(encode(list1) == list1_encoded)

  /// Return the last element from a list
  def encode[T](list: List[T]): List[(Int, T)] = {
    val packed = Problem09.pack(list)
    def encode_packed[T](packed: List[List[T]]): List[(Int, T)] = {
      packed match {
        case Nil => List.empty[Nothing]
        case head :: tl => {
          val len = Problem04.lenght(head)
          val value :: _ = head
          return (len, value) :: encode_packed(tl)
        }
      }
    }
    return encode_packed(packed)
  }
}
