package fr.fusetim.scala99

object Problem13 extends App {
  // Some testing values:
  val list1 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val list1_encoded = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  assert(encodeDirect(list1) == list1_encoded)

  /// Encode as a run-lenght list 
  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    list match {
      case Nil => return List()
      case head :: Nil => return List((1, head))
      case head :: tail => {
        val n = tail.takeWhile(_ == head).length;
        val tail2 = tail.drop(n)
        return List((n+1, head)) ::: encodeDirect(tail2)
      }
    }
  }
}
