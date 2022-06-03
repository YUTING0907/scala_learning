package chapter05

/**
 * @author yuting
 * @date 2022/6/3 4:16 PM
 * @version 1.0
 */
object FunctionDetails03 {
  def main(args: Array[String]): Unit = {
    //底层private final
    def main():Unit = {
      println("main - ")
    }

    println("----------")
    sayHello()
    FunctionDetails03.sayHello
    FunctionDetails03.sayHello()

    //底层 private final sayHello$1()
    def sayHello():Unit = {
      println("main say hello")

      // 底层 private final sayHello$2()
      def sayHello():Unit = {
        println("say hello hello")
      }
    }
  }

  def sayHello(): Unit = {
    println("say hello")
  }
}
