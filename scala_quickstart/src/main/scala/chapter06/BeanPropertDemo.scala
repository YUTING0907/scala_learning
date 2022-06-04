package chapter06

import scala.beans.BeanProperty

/**
 * @author yuting
 * @date 2022/6/4 10:21 AM
 * @version 1.0
 */
object BeanPropertDemo {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.name = "宝马"
    println(car.name)

    //使用 @BeanProperty 自动生成 getXxx 和 setXxx
    car.setName("奔驰")
    println(car.name)
    println(car.getName())
  }
}

/**
 * 提供Java Bean规范的getter和setter的话可以加
 * @scala.beans.BeanProperty注解
 */
class Car{
  @BeanProperty
  var name : String = null
}
