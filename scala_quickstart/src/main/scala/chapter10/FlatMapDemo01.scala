package chapter10

/**
 * @author yuting
 * @date 2022/6/5 11:53 AM
 * @version 1.0
 */
object FlatMapDemo01 {
  def main(args: Array[String]): Unit = {
    val names = List("dd","mm","dm")

    val names2 = names.flatMap(upper)
    println("names2 = " + names2)

  }

  def upper(str:String):String={
    str.toUpperCase
  }
}
