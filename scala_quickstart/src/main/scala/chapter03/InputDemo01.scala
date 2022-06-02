package chapter03
import scala.io.StdIn

/**
 * @author yuting
 * @date 2022/6/2 11:12 PM
 * @version 1.0
 */
object InputDemo01 {
  def main(args: Array[String]): Unit = {
    println("请输入姓名：")
    val name = StdIn.readLine()
    println("请输入年龄")
    val age = StdIn.readInt()
    println("请输入薪水：")
    val salary = StdIn.readDouble()
    printf("用户的信息为：name=%s, age=%d, salary=%.2f",name,age,salary)
  }
}
