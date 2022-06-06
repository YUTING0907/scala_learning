package chapter12

/**
 * @author yuting
 * @date 2022/6/6 10:17 AM
 * @version 1.0
 */
object ScalaConversionDemo01 {
  def main(args: Array[String]): Unit = {
    /**
     * 隐式转换函数，隐式函数应当在作用域才能生效
     *
     * @param double —> Int
     * @return Int
     */
    implicit def fun1(double: Double): Int ={
      double.toInt
    }

    // 底层编译 fun$(3.5)
    val num1: Int = 3.5
    println(num1)

    implicit def fun2(float:Float): Int = {
      println("fun2执行了....")
      float.toInt
    }

    val num2: Int = 4.6f
    println(num2)



  }
}
