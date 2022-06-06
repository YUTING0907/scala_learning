package chapter11.caseclass

/**
 * @author yuting
 * @date 2022/6/5 11:06 PM
 * @version 1.0
 */
object CaseClassDemo01 {
  def main(args: Array[String]): Unit = {
    println("-------------------------------")
    /**
     * 类型（对象）--序列化---字符串：
     *   1.可以保存到文件中
     *   2.反序列化
     *   3.网络传输
     */
  }
}

abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount
