package chapter10

/**
 * @author yuting
 * @date 2022/6/5 11:50 AM
 * @version 1.0
 */
object FilterDemo01 {
  def main(args: Array[String]): Unit = {
    val names = List("ALice", "Bob","Nick")
    val names2 = names.filter(startA)

    println("names=" + names)
    println("names2=" + names2)
  }

  def startA(str:String):Boolean = {
    // println(str.startsWith("A"))
    str.startsWith("A")
  }
}
