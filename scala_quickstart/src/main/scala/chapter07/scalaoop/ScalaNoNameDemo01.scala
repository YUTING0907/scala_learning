package chapter07.scalaoop

/**
 * @author yuting
 * @date 2022/6/4 3:52 PM
 * @version 1.0
 */
object ScalaNoNameDemo01 {
  def main(args: Array[String]): Unit = {
    val monster = new Monster{
      override var name: String = _

      override def cry(): Unit = {
        println("妖怪嗷嗷叫...:")
      }
    }
    monster.cry()
  }
}

abstract class Monster{
  var name:String
  def cry()
}