package chapter07.scalapackage

/**
 * @author yuting
 * @date 2022/6/4 11:10 AM
 * @version 1.0
 */
object TestTiger {
  def main(args: Array[String]): Unit = {
    val tiger1 = new chapter07.scalapackage.xh.Tiger()
    val tiger2 = new chapter07.scalapackage.xm.Tiger()
    println(tiger2.name)
    println(tiger1.name)
  }
}
