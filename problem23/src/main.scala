package fr.fusetim.scala99

import scala.util.Random

import fr.fusetim.scala99.Problem20

object Problem23 extends App {
  // Some testing values:
  val list1 = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
  for (_ <- 0 to 15) {
    val list1_rs : List[Symbol] = randomSelect(3, list1)
    println(list1_rs)
    assert(list1_rs.length == 3)
    assert(list1_rs.map(list1.contains(_)).fold(true)(_ && _) == true)
  }

  // Select n elements randomly in the given list
  def randomSelect[T](n: Int, list: List[T]): List[T] = {
    def randomSelectTR[T](n: Int, list: List[T], len: Int, rand: Random, pre: List[T]): List[T] = {
      if (n < 0) throw new IndexOutOfBoundsException
      else if (n == 0) return pre

      val (choices, selected) = Problem20.removeAt(rand.nextInt(len), list)
      return randomSelectTR(n-1, choices, len-1, rand, selected :: pre)
    }
    return randomSelectTR(n, list, list.length, new Random, Nil)
  }
}
