package chapter08.mytrait

/**
 * @author yuting
 * @date 2022/6/4 5:01 PM
 * @version 1.0
 */
object TraitDemo02 {
  def main(args: Array[String]): Unit = {
    val sheep = new Sheep
    sheep.sayHi()
    sheep.sayHello()
  }
}

trait Trait03{
  // 抽象方法
  def sayHi()
  // 普通方法
  def sayHello(): Unit ={
    println("say Hello --")
  }
}

/**
 * 当trait有接口和抽象类是
 *  1.class Sheep extends Trait03 在底层 对应
 *  2.class Sheep implements  Trait03
 *  3.当在 Sheep 类中要使用 Trait03的实现的方法，就通过  Trait03$class
 */
class Sheep extends Trait03 {
  override def sayHi(): Unit = {
    println("say Hi-")
  }
}