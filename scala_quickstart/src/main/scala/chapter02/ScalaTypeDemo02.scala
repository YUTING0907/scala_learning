package chapter02

/**
 * @author yuting
 * @date 2022/6/2 9:46 PM
 * @version 1.0
 */
object ScalaTypeDemo02 {
  def main(args: Array[String]): Unit = {
    // 默认为double
    var num1 = 1.2
    var num2 = 1.7f
    //在scala中仍然遵守，低精度的值，向高精度的值自动转换(implicit conversion)隐式转换
    //num2 = num1,错误
    num2 = num2.toFloat
    println(num2)

    //false
    println(num2.isInstanceOf[Double])
    // true
    println(num2.isInstanceOf[Float])
    println(sayHello)

  }

  /**
   * 比如开发中，我们有一个方法，就会异常中断，这时就可以返回Nothing
   * 即当我们Nothing 做返回值，就是明确说明该方法有没有正常返回值
   * @return Nothing类型在scala的类层级最低，当一个函数我们确定没有正常的返回值
   *         可以用nothing来指定，这样我们可以吧返回值（异常）赋给其他函数
   */
  def sayHello: Nothing = {
    throw new Exception("抛出异常")
  }
}
