package chapter06

/**
 * @author yuting
 * @date 2022/6/4 10:27 AM
 * @version 1.0
 */
object MethodDemo01 {
  def main(args: Array[String]): Unit = {
    val dogSon = new DogSon
    println(dogSon.cal(10,11))
  }
}

/**
 * scala中属性和方法默认公有，并且不提供public关键字。
 * private私有，类内部和伴生对象内可用
 * protected保护权限，scala中比java中严格，只有同类、子类可访问，同包无法访问。
 * private [pacakgeName]增加包访问权限，在包内可以访问。
 */
class DogSon{
  //属性
  private var sal: Double = _

  var food: String = _
  //方法
  def cal(n1:Int,n2:Int):Int = {
    n1 + n2
  }
}