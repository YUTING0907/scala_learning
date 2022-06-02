package chapter02

/**
 * @author yuting
 * @date 2022/6/2 9:18 PM
 * @version 1.0
 */
object ScalaStringToOther {
  def main(args: Array[String]): Unit = {
    var str = "12.5"

    //在scala中，不是将小数点后的数据进行截取，而是会抛出异常
    //println(str.toInt) 报错
    println(str.toDouble)//12.5
    // 思考就是要把"12.5"转成Int
    println(str.toDouble.toInt)
  }
}
