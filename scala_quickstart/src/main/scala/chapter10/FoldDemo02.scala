package chapter10

/**
 * @author yuting
 * @date 2022/6/5 12:00 PM
 * @version 1.0
 */
object FoldDemo02 {
  def main(args: Array[String]): Unit = {
    val list = List(1,9)
    // 这种写法等价于 val res1 = list.foldLeft(4)(minus)
    val res1 = (4 /: list) (minus)
    println("res1 = " + res1) // -6

    // 这种写法等价于 val res1 = list.foldRight(5)(minus)
    val res2 = (list :\ 5) (minus)
    println("res2 = " + res2) // -3
  }

  def minus(n1:Int,n2:Int):Int = {
    n1 - n2
  }
}
