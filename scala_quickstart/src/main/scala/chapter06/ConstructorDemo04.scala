package chapter06

/**
 * @author yuting
 * @date 2022/6/4 10:15 AM
 * @version 1.0
 */
object ConstructorDemo04 {
  def main(args: Array[String]): Unit = {
    val worker1 = new Worker("smith1")
    //不能访问 inName,inName就是一个局部变量
    //println(worker1.inName)
    val worker2 = new Worker2("smith2")
    //可以访问 inName
    println(worker2.inName)

    val worker3 = new Worker3("smith3")
    worker3.inName = "mary"

    println(worker3.inName)

  }
}

//1. 如果 主构造器是Worker(inName: String) ，那么  inName就是一个局部变量
class Worker(inName:String){
  var name = inName
}

//2.如果 主构造器是Worker2(val inName: String) ，那么  inName就是Worker2的一个private的只读属性
class Worker2(val inName:String){
  var name = inName
}

//3.如果 主构造器是Worker3(var inName: String) ，那么  inName就是Worker3的一个
// 一个private 的可以读写属性
class Worker3(var inName:String){
  var name = inName
}
