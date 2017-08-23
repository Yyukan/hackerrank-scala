package net.shtykhno.algorithms.warmup

/**
  * Created 23/08/2017.
  */
object MiniMaxSum {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var arr = new Array[Int](5)

    for (arr_i <- 0 until 5) {
      arr(arr_i) = sc.nextInt()
    }

    var sum: Long = 0
    var max: Int = arr(0)
    var min: Int = arr(0)

    for (i <- 0 until 5) {
      sum += arr(i)
      if (arr(i) < min) min = arr(i)
      if (arr(i) > max) max = arr(i)
    }
    
    println(s"${sum-max} ${sum-min}")
  }
}
