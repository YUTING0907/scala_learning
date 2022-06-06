package chapter11

/**
 * @author yuting
 * @date 2022/6/5 10:20 PM
 * @version 1.0
 */
object MatchObjectDemo01 {
  def main(args: Array[String]): Unit = {
    val number: Double = Square(6.0) // 这里调用的是apply
    println(number)
    number match{
      /**
       * 说明 case Square(arg) 的运行的机制
       * 1. 当匹配到 case Square(arg)
       * 2. 调用Square 的 unapply(arg: Double),arg的值就是 number
       * 3. 如果对象提取器 unapply(arg: Double) 返回的是Some(6.0) ,
       *    则表示匹配成功，同时将6.0 赋给 Square(arg) 的 arg
       * 4. 果对象提取器 unapply(arg: Double) 返回的是None ,则表示匹配不成功
       */
      case Square(arg) => println(s"匹配成功arg = $arg")
      case _ => println("nothing matched")
    }

  }
}

object Square{
  /**
   * unapply方法是对象提取器
   *
   * @param arg 接收的Double类型的参数
   * @return 返回类型是Option[Double]，
   *         返回值是Some(math.sqrt(arg))，返回arg的开平方的值并放入到Some()中
   */
  def unapply(arg: Double): Option[Double] = {
    Some(math.sqrt(arg))
  }

  def apply(arg: Double): Double = arg * arg
}
