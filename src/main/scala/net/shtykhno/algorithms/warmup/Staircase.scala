package net.shtykhno.algorithms.warmup

/**
  * Created 23/08/2017.
  */
object Staircase {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()

    for (j <- 0 until n) {
      for (i <- 0 until n) {
        if (i >= (n - 1 - j)) print('#') else print(' ')
      }
      println
    }
  }

}
