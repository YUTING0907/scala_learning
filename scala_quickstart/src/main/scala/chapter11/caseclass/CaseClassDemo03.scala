package chapter11.caseclass

/**
 * @author yuting
 * @date 2022/6/5 11:21 PM
 * @version 1.0
 */
object CaseClassDemo03 {
  def main(args: Array[String]): Unit = {
    val amt1 = new Currency3(3000.0, "RMB")
    // 克隆，创建的对象和amt的属性一样
    val amt2 = amt1.copy()

    // amt2.value = Currency3(3000.0,RMB).value 	 amt2.unit = Currency3(3000.0,RMB).unit
    println(s"amt2.value = $amt2.value \t amt2.unit = $amt2.unit")

    val amt3 = amt1.copy(value = 8000.0)
    println("amt3 = " + amt3)

    val amt4 = amt1.copy(unit = "美元")
    // amt4 = Currency3(3000.0,美元)
    println("amt4 = " + amt4)
  }
}

abstract class Amount3

case class Dollar3(value: Double) extends Amount3

case class Currency3(value: Double, unit: String) extends Amount3

case object NoAmount3 extends Amount3
