package fr.fusetim.scala99

import fr.fusetim.scala99.Problem22
import fr.fusetim.scala99.Problem23

object Problem24 extends App {
  // Some testing values:
  for (_ <- 0 to 15) {
    val draw : List[Int] = lotto(6, 49)
    println(draw)
    assert(draw.length == 6)
    assert(draw.map(Problem22.range(1, 49).contains(_)).fold(true)(_ && _) == true)
  }

  // Draw n integers in a range between 1 to m
  def lotto(n: Int, m: Int): List[Int] = {
    return Problem23.randomSelect(n, Problem22.range(1, 49))
  }
}

