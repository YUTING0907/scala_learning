package chapter07.scalaoop

/**
 * @author yuting
 * @date 2022/6/4 11:37 AM
 * @version 1.0
 */
object AbstractDemo01 {
  def main(args: Array[String]): Unit = {
    println("通过jd-gui查看反编译后的代码")
  }
}

/**
 *  抽象类
 */
abstract class Animal{
  var name:String
  var age: Int
  var color:String  = "black"
  def cry() //抽象方法,不需要标记 abstract
}
