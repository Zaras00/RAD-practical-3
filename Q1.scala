package Practical_3
import scala.io.StdIn

object Q1 extends App{
    def reverseString (str: String) : String = {
      if (str.isEmpty) {
        ""
      } else {
        reverseString(str.tail) + str.head
      }
    }

    print("Enter a string : ")
    val inputString = StdIn.readLine()
    val reversedString = reverseString(inputString)
    println(reversedString)
}
