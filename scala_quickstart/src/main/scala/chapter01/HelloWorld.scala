package chapter01

/**
 * @author yuting
 * @date 2022/6/2 12:05 PM
 * @version 1.0
 *  object：关键字，声明一个单例对象（伴生对象）
 *  def 方法名称(参数名称：参数类型)：返回值类型 = {方法体}
 */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World")
    //SystemL内库可以拿来直接用，其他要进行包的引用
    System.out.println("hello scala from java")
  }

}
