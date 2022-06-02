package chapter02

/**
 * @author yuting
 * @date 2022/6/2 9:21 PM
 * @version 1.0
 */
object ScalaTypeDemo01 {
  def main(args: Array[String]): Unit = {
    var num:Int = 10
    /*
      因为Int是一个类，因此他的一个实例，就是可以使用很多方法
      在 scala中，如果一个方法，没有形参，则可以省略()
     */

    println(num.toDouble + "\n" + num.toString + "\n" + 10.toString)
    var isPass = true
    println(isPass.toString)
    val age = 10
    val name = "ywq"
    printf("%d岁的%s在尚硅谷学习",age,name)
    println(s"${age}岁的${name}在尚硅谷学习")
    val num1: Double = 2.3456
    println(f"The num is ${num1}%2.2f")
    println(raw"The num is ${num1}%2.2f")

    val sql =
      s"""
         |select *
         |from 
         | student
         |where 
         | name = ${name}

         | age > ${age}

         |""".stripMargin
    //这两种方法的调用都可以
    sayHi()
    sayHi
  }

  def sayHi():Unit = {
    println("say hi-")
  }
}
