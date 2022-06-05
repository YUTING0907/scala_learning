package chapter10

/**
 * @author yuting
 * @date 2022/6/5 2:08 PM
 * @version 1.0
 */
object ScanDemo01 {
  def main(args: Array[String]): Unit = {
    val res1 = (1 to 5).scanLeft(5)(minus)
    // res1 = Vector(5, 4, 2, -1, -5, -10)
    println("res1 = " + res1)

    val res2 = (1 to 5).scanRight(5)(add)
    //res2 = Vector(20, 19, 17, 14, 10, 5)
    println("res2 = " + res2)
  }

  def minus(n1:Int,n2:Int):Int={
    println(s"$n1 - $n2 = ${n1 - n2}")
    n1 - n2
  }

  def add(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
