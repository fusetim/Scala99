package fr.fusetim.scala99

object Problem06 extends App {

  println(isPalindrome(List(1, 2, 3, 2, 1)))
  println(isPalindrome(List(1, 2, 3, 2, 9)))

  /// Return true if the list is a palindrome
  def isPalindrome[T](list: List[T]): Boolean = {
    val reversed = Problem05.reverse(list)
    return isEqual(list, reversed)
  }

  /// Return true if the two lists are equal
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
