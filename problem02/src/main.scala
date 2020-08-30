package fr.fusetim.scala99.problem02

object Main extends App {
  // Some testing values:
  assert(penultimate(List(1, 2, 3, 4, 5, 6)) == 5)
  assert(penultimate(List(7, 2, 115, -85, 65, 87)) == 65)
  assert(penultimate(List(7.2, 2.4, 115.4, -855.5, 4.7)) == -855.5)
  assert(penultimate(List(1, 1, 2, 3, 5, 8)) == 5)

  /// Return the penultimate element from a list
  def penultimate[T](list: List[T]): T = {
    list match {
      case Nil                   => throw new NullPointerException
      case head :: Nil           => throw new NullPointerException
      case head :: (body :: Nil) => return head
      case head :: tail          => return penultimate(tail)
    }
  }
}
