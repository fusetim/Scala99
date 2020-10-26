package fr.fusetim.scala99

import scala.util.Random

object Problem26 extends App {
  // Some testing values:
  val list1 = List('a, 'b, 'c, 'd, 'e, 'f)
  val clist1 = combinations(3, list1)
  val clist2 = combinations2(3, list1)
  println(s"combination: $clist1")
  println(s"combination2: $clist2")
  assert(clist1.length == (6*5*4*3*2*1)/(3*2*1*3*2*1))
  assert(clist1 == clist2)

  // Generate combinaisons of n elements of a list (while loop)
  def combinations[T](n: Int, list: List[T]): List[List[T]] = {
    if (n < 0) throw new IndexOutOfBoundsException
    if (n == 0) return List(List())
    var footer = list
    var comb : List[List[T]] = List()
    while (!footer.isEmpty){
      val (head :: tail) = footer
      comb = (combinations(n-1, tail) map (c => head :: c)) ::: comb
      footer = tail
    }
    return comb
  }

  // Generate all list's tails 
  def subList[T](list: List[T]): List[List[T]] = {
    def subListTR[T](list: List[T], pre: List[List[T]]): List[List[T]] = (list) match {
      case Nil => pre
      case head :: tail => subListTR(tail, list :: pre)
    }
    return subListTR(list, Nil)
  }

  // Generate combinaisons of n elements of a list (functional style)
  def combinations2[T](n: Int, list: List[T]): List[List[T]] = 
    if (n < 0) throw new IndexOutOfBoundsException
    else if (n == 0) return List(List())
    else subList(list).map(s => combinations2(n-1, s.tail)
                      .map(c => s.head :: c))
                      .fold(List[List[T]]())(_ ::: _)
}
