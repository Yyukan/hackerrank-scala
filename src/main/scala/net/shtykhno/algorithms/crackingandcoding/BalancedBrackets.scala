package net.shtykhno.algorithms.crackingandcoding

/**
  * A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a
closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is
not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single,
unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:

It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, print YES
on a new line; otherwise, print NO on a new line.

3
{[()]}
{[(])}
{{[[(())]]}}

Sample Output

YES
NO
YES

  */
object BalancedBrackets {

  import scala.collection.mutable

  def isBalanced(expression: String): String = {
    val stack = new mutable.ListBuffer[Char]()
    val pairs = Map('(' -> ')', '{' -> '}', '[' -> ']' )

    expression.foreach {
      case c @('{' | '[' | '(') => c +=: stack
      case c @('}' | ']' | ')') =>
        if (stack.isEmpty) {
          return "NO"
        } else if (c == pairs(stack.head)) {
          stack.remove(0)
        }
      case _ => return "NO"
    }

    if (stack.isEmpty) "YES" else "NO"
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt()
    var a0 = 0
    val result = new mutable.ListBuffer[String]()

    while(a0 < t) {
      val expression = sc.next()
      result += isBalanced(expression)
      a0 += 1
    }
    println(result.mkString("\n"))
  }
}
