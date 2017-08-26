package net.shtykhno.algorithms.crackingandcoding

/**
 * Given the words in the magazine and the words in the ransom note,
 * print Yes if he can replicate his ransom note exactly using whole words from the magazine;
 * otherwise, print No.
 */
object RansomNote {

  def solution(src: Array[String], dest: Array[String]): String = {

    val srcWords: Map[String, Int] = src
      .groupBy(identity)
      .mapValues(_.length)

    val destWords: Map[String, Int] = dest
      .groupBy(identity)
      .mapValues(_.length)

    for ( (key, value) <- destWords) {
      if (!srcWords.contains(key) || value > srcWords(key)) {
        return "No"
      }
    }

    "Yes"
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var m = sc.nextInt()
    var n = sc.nextInt()
    var magazine = new Array[String](m)
    for(magazine_i <- 0 until m) {
      magazine(magazine_i) = sc.next()
    }
    var ransom = new Array[String](n)
    for(ransom_i <- 0 until n) {
      ransom(ransom_i) = sc.next()
    }

    println(solution(magazine, ransom))
  }
}
