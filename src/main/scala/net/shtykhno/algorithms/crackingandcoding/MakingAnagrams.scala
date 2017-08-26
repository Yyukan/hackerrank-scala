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
object MakingAnagrams {

  import scala.collection._

  /**
    * Calculate freq of chars from string a
    * Subtract chars from string b
    * If no such char increment result
    * Add left freq to the result
    */
  def solution(a: String, b: String): Int = {
    val freq: mutable.Map[Char, Int] = new mutable.HashMap()
    var result = 0

    a.foreach(c => {
      if (freq.contains(c))
        freq.put(c, freq(c) + 1)
      else
        freq.put(c, 1)
    })

    b.foreach(c => {
      if (freq.contains(c)) {
        val value = freq(c)
        if (value > 0) {
          freq.put(c, value - 1)
        } else {
          result += 1
          freq.remove(c)
        }
      } else {
        result += 1
      }
    })

    result + freq.values.sum
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val a: String = sc.next()
    val b: String = sc.next()

    println(solution(a, b))
  }
}
