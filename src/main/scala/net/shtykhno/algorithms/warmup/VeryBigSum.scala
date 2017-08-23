package net.shtykhno.algorithms.warmup

object VeryBigSum {

  def aVeryBigSum(n: Int, ar: Array[Long]): Long =  {
    var sum: Long = 0L

    for (i <- 0 until n) {
      sum += ar(i)
    }

    sum
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val ar = new Array[Long](n)

    for(ar_i <- 0 until n) {
      ar(ar_i) = sc.nextLong()
    }

    println(aVeryBigSum(n, ar))
  }

}
