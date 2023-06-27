package Practical_3
import scala.io.StdIn

object Q3 extends App {
  def average(num1: Int, num2: Int): Double = {
    return ((num1 + num2)/2)
  }

  print("Enter num1: ")
  val num1 = StdIn.readInt()
  print("Enter num2: ")
  val num2 = StdIn.readInt()

  val ave1 = average(num1, num2)
  val roundAve = (ave1 * 100).toInt / 100.0
  println("Average = " + roundAve)
}
