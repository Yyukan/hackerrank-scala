package net.shtykhno.algorithms.crackingandcoding

/**
  * A queue is an abstract data type that maintains the order in which elements were added to it,
  * allowing the oldest elements to be removed from the front and new elements to be added to the rear.
  * This is called a First-In-First-Out (FIFO) data structure because the first element added to the queue
  * (i.e., the one that has been waiting the longest) is always the first one to be removed.
  * *
  * A basic queue has the following operations:
  * *
  * Enqueue: add a new element to the end of the queue.
  * Dequeue: remove the element from the front of the queue and return it.
  * In this challenge, you must first implement a queue using two stacks. Then process  queries, where each query is one
  * of the following  types:
  * *
  * 1 x: Enqueue element  into the end of the queue.
  * 2: Dequeue the element at the front of the queue.
  * 3: Print the element at the front of the queue.
  * *
  * Sample Input
  * *
  * 10
  * 1 42
  * 2
  * 1 14
  * 3
  * 1 28
  * 3
  * 1 60
  * 1 78
  * 2
  * 2
  * Sample Output
  * *
  * 14
  * 14
  */
object ATaleOfTwoStacks extends App {

  class Stack[T] {

    import scala.collection.mutable

    private val stack = new mutable.ListBuffer[T]

    def pop(): T = stack.remove(0)

    def push(data: T): Unit = data +=: stack

    def peek(): T = stack.head

    def size: Int = stack.length

    def isEmpty: Boolean = stack.isEmpty
  }

  val inbox = new Stack[Int]
  val outbox = new Stack[Int]

  val input = scala.io.StdIn.readInt()

  (1 to input).foreach { _ =>
    scala.io.StdIn.readLine().split(" ") match {
      case Array(action, data) =>
        action match {
          case "1" => enqueue(data.toInt)
          case _ =>
        }
      case Array(action) =>
        action match {
          case "3" => println(peek())
          case "2" => dequeue()
          case _ =>
        }
    }
  }

  def enqueue(data: Int): Unit = {
    inbox.push(data)
  }

  def dequeue(): Unit = {
    move()
    outbox.pop()
  }

  def peek(): Int = {
    move()
    outbox.peek()
  }

  def move(): Unit = {
    if (outbox.isEmpty) {
      while (!inbox.isEmpty) {
        outbox.push(inbox.pop())
      }
    }
  }
}
