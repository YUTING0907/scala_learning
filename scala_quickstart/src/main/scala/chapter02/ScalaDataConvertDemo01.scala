package chapter02

/**
 * @author yuting
 * @date 2022/6/2 8:56 PM
 * @version 1.0
 */
object ScalaDataConvertDemo01 {
  def main(args: Array[String]): Unit = {
    var n1 = 10
    var n2 = 1.1f
    /**
     * 有多种类型的数据混合运算时，
     * 系统首先自动将所有数据转换成容量最大的那种数据类型，
     * 然后再进行计算
     * n3是Float类型的
     */
    var n3 = n1 + n2
    println("n3: ", n3)
    var n4: Byte = 10
    //var char1: Char = n4 ，报错，因为byte不能自动转换char
    val num1: Int = 10 * 3.5.toInt + 6 * 1.5.toInt
    println("num1 = " + num1) //36
    var num2: Int = (10 * 3.5 + 6 * 1.5).toInt
    println("num2 = " + num2) //44

    var char1: Char = 1
    var num3 = 1
    // val char2: Char = num3，报错：
    // 因为Char类型可以保存 Int的常量值，但不能保存Int的变量值，需要强转
  }
}
