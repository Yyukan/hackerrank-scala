package net.shtykhno.algorithms.warmup

object VeryBigSum {

  def aVeryBigSum(n: Int, ar: Array[Long]): Long =  {
    ar.sum
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var ar = new Array[Long](n)
    for(ar_i <- 0 until n) {
      ar(ar_i) = sc.nextLong()
    }
    val result = aVeryBigSum(n, ar)
    println(result)
  }

}
