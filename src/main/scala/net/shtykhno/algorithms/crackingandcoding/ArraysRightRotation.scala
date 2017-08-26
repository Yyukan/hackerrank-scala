package net.shtykhno.algorithms.crackingandcoding

/**
  * Given an array of integers and a number, perform RIGHT rotations on the array
  */
object ArraysRightRotation {

  def solution(a: Array[Int], r: Int): Array[Int] = {
    if (a.isEmpty || a.length == 1 || r == 0) return a

    val d = r % a.length

    if (d < 1) return a

    a.slice(a.length - d, a.length) ++ a.slice(0, a.length - d)
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var k = sc.nextInt()
    var a = new Array[Int](n)
    for(a_i <- 0 until n) {
      a(a_i) = sc.nextInt()
    }

    println(solution(a, k).mkString(" "))
  }

}
