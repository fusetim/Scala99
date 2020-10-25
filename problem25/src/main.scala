package fr.fusetim.scala99

import scala.util.Random

import fr.fusetim.scala99.Problem23

object Problem25 extends App {
  // Some testing values:
  val list1 = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
  for (_ <- 0 to 15) {
    val permut : List[Symbol] = randomPermute(list1)
    println(permut)
    assert(permut.length == list1.length)
    assert(permut.map(list1.contains(_)).fold(true)(_ && _) == true)
  }

  // Randomly permute a list
  def randomPermute[T](list: List[T]): List[T] = Problem23.randomSelect(list.length, list)
}
