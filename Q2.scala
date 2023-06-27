import scala.io.StdIn

object Q2 extends App {
  def filterList(list: List[String]): List[String] = {
    list.filter(_.length > 5)
  }

  print("Enter a string : ")
  val str = StdIn.readLine()
  val stringList = str.split(" ").toList
  val filteredString = filterList(stringList)
  println(filteredString)
}
