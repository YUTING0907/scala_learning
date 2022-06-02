package chapter02

/**
 * @author yuting
 * @date 2022/6/2 8:48 PM
 * @version 1.0
 */
object ScalaCharDemo {
  def main(args: Array[String]): Unit = {
    var char1: Char = 97
    /** 当我们输出一个char类型，
     * 他会输出该数字对应的字符（码值表unicode）/unicode码值表包括ascii
     */
    // char1 = a
    println("char1 = " + char1)
    var char2: Char = 'a'
    var num = 10 + char2
    // num = 107
    println("num = " + num)
    /**
     * 原因和分析：
     * 1、当把一个计算的结果赋值一个变量,则编译器会进行类型转换及判断(即会看范围+类型)
     * 2、当把一个字面量赋值一个变量，则编译器会进行范围的判定
     */
    var c4: Char = 98
    // c4 = b
    println("c4 = " + c4)

  }
}
