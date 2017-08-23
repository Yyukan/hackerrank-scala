package net.shtykhno.algorithms.warmup

object CompareTheTriplets {

  def solution(aliceScores: (Int, Int, Int), bobScores: (Int, Int, Int)): String = {

    def aliceRules(a: (Int, Int)) = if (a._1 > a._2) 1 else 0
    def bobRules(a: (Int, Int)) = if (a._1 < a._2) 1 else 0


    val zip =
      (aliceScores.productIterator.asInstanceOf[Iterator[Int]].toList,
       bobScores.productIterator.asInstanceOf[Iterator[Int]].toList).zipped

    val aliceScore = zip.foldLeft(0)( (a, b) => a + aliceRules(b) )
    val bobScore = zip.foldLeft(0)( (a, b) => a + bobRules(b) )

    s"$aliceScore $bobScore"
  }

  def main(args: Array[String]) {
    var a0 = 5
    var a1 = 6
    var a2 = 7
    var b0 = 3
    var b1 = 6
    var b2 = 10

    println(solution((a0, a1, a2), (b0, b1, b2)))
  }

}
