package chapter12

/**
 * @author yuting
 * @date 2022/6/6 10:27 AM
 * @version 1.0
 */
object ScalaImplicitValDemo01 {
  def main(args: Array[String]): Unit = {
    implicit val str: String = "tom"

    def hello(implicit name:String)={
      println(name + "- hello")
    }

    // 底层hello$1.(str)
    hello
  }
}
