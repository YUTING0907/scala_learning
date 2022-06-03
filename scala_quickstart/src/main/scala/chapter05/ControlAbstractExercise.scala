package chapter05

/**
 * @author yuting
 * @date 2022/6/3 9:23 PM
 * @version 1.0
 */
object ControlAbstractExercise {
  def main(args: Array[String]): Unit = {
    /**
     * 使用传名参数实现一个函数相当于while的功能。
     */
    // built-in while
    var n = 10
    while(n>=1){
      print(s"$n ")
      n -= 1
    }
    println()

    // application: self-defined while, implement a function just like while keyword
    def myWhile(condition: => Boolean): (=>Unit) => Unit = {
      def doLoop(op: => Unit):Unit = {
        if(condition){
          op
          myWhile(condition)(op)
        }
      }
      doLoop _
    }

    n = 10
    myWhile (n >= 1) {
      print(s"$n ")
      n -= 1
    }
    println()

    // simplfy
    def myWhile2(condition: => Boolean): (=> Unit) => Unit = {
      op => {
        if (condition) {
          op
          myWhile2(condition)(op)
        }
      }
    }

    n = 10
    myWhile (n >= 1) {
      print(s"$n ")
      n -= 1
    }
    println()

    // use currying
    def myWhile3(condition: => Boolean)(op: => Unit):Unit = {
      if(condition){
        op
        myWhile3(condition)(op)
      }
    }

    n = 10
    myWhile3 (n >= 1) {
      print(s"$n ")
      n -= 1
    }
    println()
  }
}
