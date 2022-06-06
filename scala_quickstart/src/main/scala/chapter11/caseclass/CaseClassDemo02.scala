package chapter11.caseclass

/**
 * @author yuting
 * @date 2022/6/5 11:10 PM
 * @version 1.0
 */
object CaseClassDemo02 {
  def main(args: Array[String]): Unit = {
    val array = Array(Dollar2(1000.0),Currency2(1000.0,"RMB"),NoAmount2)
    for(amt <- array){
      val result = amt match{
        case Dollar2(x) => "$" + x
        case Currency2(v,u) => v + " " + u
        case NoAmount2 => ""
      }
      println("amt = " + amt)
      println("result =" + result)
    }
  }
}

abstract class Amount2

case class Dollar2(value: Double) extends Amount2

case class Currency2(value: Double, unit: String) extends Amount2

case object NoAmount2 extends Amount2
