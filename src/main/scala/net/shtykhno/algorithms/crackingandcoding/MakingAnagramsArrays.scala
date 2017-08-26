package net.shtykhno.algorithms.crackingandcoding

/**
  * We consider two strings to be anagrams of each other if the first string's
  * letters can be rearranged to form the second string.
  *
  * In other words, both strings must contain the same exact letters
  * in the same exact frequency
  *
  * For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
  */
object MakingAnagramsArrays {

  /**
    * Calculate freq of chars from string a
    * Subtract chars from string b
    * If no such char increment result
    * Add left freq to the result
    */
  def solution(a: String, b: String): Int = {
    val freq = Array.fill[Int](26)(0)

    a.foreach(c => {
      val index = c.toInt - 'a'.toInt
      freq(index) += 1
    })

    b.foreach(c => {
      val index = c.toInt - 'a'.toInt
      freq(index) -= 1
    })

    freq.map(math.abs).sum
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val a: String = sc.next()
    val b: String = sc.next()

    println(solution(a, b))
  }
}
