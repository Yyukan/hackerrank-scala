package net.shtykhno.algorithms.warmup

/**
  * Created 23/08/2017.
  */
object TimeConversion {

  def timeConversion(s: String): String =  {

    var hours = s.take(2).toInt
    val time = s.drop(2).dropRight(2)

    s.takeRight(2) match {
      case "AM" =>
        if (hours == 12) hours = 0
      case "PM" =>
        if (hours < 12) hours += 12
    }
    f"$hours%02d$time"
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var s = sc.next()
    val result = timeConversion(s)
    println(result)
  }
}
