package net.shtykhno.algorithms.warmup

/**
  * Created 23/08/2017.
  */
object BirthdayCakeCandles {

  def birthdayCakeCandles(n: Int, ar: Array[Int]): Int =  {
    var max = ar(0)
    var result = 1
    for (i <- 1 until n) {
      ar(i) match {
        case x if x == max => result += 1
        case x if x > max  => max = x; result = 1
        case _ =>
      }
    }
    result
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt();
    var ar = new Array[Int](n)
    for(ar_i <- 0 until n) {
      ar(ar_i) = sc.nextInt()
    }
    val result = birthdayCakeCandles(n, ar)
    println(result)
  }
}
