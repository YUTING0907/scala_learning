package chapter05

/**
 * @author yuting
 * @date 2022/6/3 4:33 PM
 * @version 1.0
 */
object FunctionDetails06 {
  def main(args: Array[String]): Unit = {
    println(f1)
    println(f2)
  }

  def f1 = "venassa" //等价于
  def f2() = {
    "venassa"
  }
}
