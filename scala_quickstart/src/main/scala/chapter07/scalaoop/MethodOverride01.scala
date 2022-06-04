package chapter07.scalaoop

/**
 * @author yuting
 * @date 2022/6/4 3:31 PM
 * @version 1.0
 */
object MethodOverride01 {
  def main(args: Array[String]): Unit = {
    val emp = new Emp100
    emp.printName()
  }
}


class Person100{
  var name: String = "tom"

  def printName(): Unit ={
    println("Person printName() " + name)
  }

  def sayHi():Unit = {
    println("sayHi....")
  }
}

class Emp100 extends Person100{
  override def printName(): Unit ={
    println("Emp printName() " + name)
    //在子类中需要去调用父类的方法,使用super
    super.printName()
    sayHi()
  }
}