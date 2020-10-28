package fr.fusetim.scala99

import fr.fusetim.scala99.Problem26.combinations2

object Problem27 extends App {
  // Some testing values
  val people = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
  assert(group3(people).length == 1260) // 1260 = C(9,2) * (7,3) * (4,4)
  assert(group3(people) == group(List(2,3,4), people))

  // Generate all combinations to form groups of 2, 3 and 4 elements from all of them
  def group3[T](list: List[T]): List[List[List[T]]] = {
    for {
      g1 <- combinations2(2, list)
      g2 <- combinations2(3, list.diff(g1))
    } yield List(g1, g2, list.diff(g1:::g2))
  }

  // Generate all combinations to form given sized-groups of elements from all of them
  def group[T](groups: List[Int], list: List[T]): List[List[Any]] = {
    if (groups.length < 0) throw new IndexOutOfBoundsException
    if (groups.length == 0) return List(Nil)
    for {
      g1 <- combinations2(groups(0), list)
      g2 <- group(groups.drop(1), list.diff(g1))
    } yield g1 :: g2
  }
}