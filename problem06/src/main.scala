package fr.fusetim.scala99

object Problem06 extends App {

  println(isPalindrome(List(1, 2, 3, 2, 1)))
  println(isPalindrome(List(1, 2, 3, 2, 9)))

  /// Return true if the list is a plindrome
  def isPalindrome[T](list: List[T]): Boolean = {
    def explorer[T](len_top: Int, len_bottom: Int, top: List[T], bottom: List[T]): Boolean = {
      val head :: tl = bottom;
      len_bottom - len_top match {
        case 1 => return isEqual(top, tl)
        case 0 => return isEqual(top, bottom)
        // Go to the middle of the list
        case positive if positive > 1 => return explorer(len_top+1, len_bottom-1, head :: top, tl)
        case negative if negative < 0 => throw new Exception
      }
    }
    val len = Problem04.lenght(list)
    return explorer(0, len, Nil, list)
  }

  /// Return true if the two list are equal
  def isEqual[T](listA: List[T], listB: List[T]): Boolean = {
    if (listA == Nil || listB == Nil) {
      return listA == listB
    } else {
      val headA :: tailA = listA
      val headB :: tailB = listB
      val same = headA == headB
      return isEqual(tailA, tailB) && same
    }
  }
}
