package chapter07.scalaoop

/**
 * @author yuting
 * @date 2022/6/4 3:43 PM
 * @version 1.0
 */
object ScalaFiledOverride01 {
  def main(args: Array[String]): Unit = {
    val obj1: AAA = new BBB
    val obj2: BBB = new BBB
    println(obj1.age) //20
    println(obj2.age) //20
  }
}

class AAA{
  val age: Int = 10 // 会生成 public age()
}

class BBB extends AAA{
  override val age: Int = 20// 会生成 public age()
}
