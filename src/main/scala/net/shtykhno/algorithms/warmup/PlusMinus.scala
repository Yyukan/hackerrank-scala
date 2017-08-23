package net.shtykhno.algorithms.warmup

object PlusMinus {


  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var arr = new Array[Int](n)
    for(arr_i <- 0 until n) {
      arr(arr_i) = sc.nextInt()
    }

    var negative = 0
    var positive = 0
    var zero = 0

    for (i <- 0 until n) {
      arr(i) match {
        case x if x > 0 => positive += 1
        case x if x < 0 => negative += 1
        case _          => zero += 1
      }
    }

    println(positive / n.toFloat)
    println(negative / n.toFloat)
    println(zero / n.toFloat)
  }

}
