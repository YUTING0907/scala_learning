package chapter02

/**
 * @author yuting
 * @date 2022/6/2 10:25 PM
 * @version 1.0
 */
object ScalaTypeDemo03 {
  def main(args: Array[String]): Unit = {
    println("Int的最大值：" + Int.MaxValue)
    println("Int的最小值：" + Int.MinValue)
    println("Long的最大值：" + Long.MaxValue)
    println("Long的最小值：" + Long.MinValue)

    var i = 10
    var j = 10L
    // 报错，因为超过了Int的范围
    //var k = 9223372036854775807
    var num1: Float = 2.2345678910f
    var num2: double = 2.2345678910
    /**
     * num1=2.2345679
     * num2=2.234567891
     */
    println("num1=" + num1)
    println("num2" + num2)


  }
}
