package net.shtykhno.algorithms.warmup

object DiagonalDifference {

  /*
    | X 0 0 |
    | 0 X 0 | - primary diagonal
    | 0 0 X |

    | 0 0 X |
    | 0 X 0 | - secondary diagonal
    | X 0 0 |
   */
  def solution(n: Int, a: Array[Array[Int]]): Int = {
    var primaryDiagonal = 0
    var secondaryDiagonal = 0

    for (i <- 0 until n) {
      primaryDiagonal += a(i)(i)
      secondaryDiagonal += a(i)((n - 1) - i)
    }

    Math.abs(primaryDiagonal - secondaryDiagonal)
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val a = Array.ofDim[Int](n, n)
    for(a_i <- 0 until n) {
      for(a_j <- 0 until n){
        a(a_i)(a_j) = sc.nextInt()
      }
    }

    println(solution(n, a))
  }

}
