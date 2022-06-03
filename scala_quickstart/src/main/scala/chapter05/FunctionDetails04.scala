package chapter05

/**
 * @author yuting
 * @date 2022/6/3 4:25 PM
 * @version 1.0
 */
object FunctionDetails04 {
  def main(args: Array[String]): Unit = {
    println(sayOK())
    println(sayOK("tom"))
  }
  def sayOK(name: String = "jack"): String = {
    return name + "\tok!"
  }
}
