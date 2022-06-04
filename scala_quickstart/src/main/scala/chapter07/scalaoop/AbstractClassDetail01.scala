package chapter07.scalaoop

/**
 * @author yuting
 * @date 2022/6/4 11:31 AM
 * @version 1.0
 */
object AbstractClassDetail01 {
  def main(args: Array[String]): Unit = {
    /**
     * 默认情况下，一个抽象类是不能实例化的，但是你实例化时，
     * 动态的实现了抽象类的所有抽象方法，也可以
     */
    val animal = new Animal03{
      override def sayHello(): Unit = {
        println("say Hello ~")
      }
      override var food: String = _
    }
    animal.sayHello()
  }
}

abstract class Animal02{
  //在抽象类中可以有实现的方法
  def sayHi():Unit = {
    println("xxx")
  }
}

abstract class Animal03{
  def sayHello()
  var food: String
}

class Dog extends Animal03{
  override def sayHello(): Unit = {
    println("小狗汪汪叫！")
  }
  override var food: String = ""
}