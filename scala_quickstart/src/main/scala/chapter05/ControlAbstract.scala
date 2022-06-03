package chapter05

/**
 * @author yuting
 * @date 2022/6/3 9:03 PM
 * @version 1.0
 */
object ControlAbstract {
  def main(args: Array[String]): Unit = {

    /**
     * 控制抽象
     * 1：值传递
     * 2：名传递（把代码传递进去）
     * @param
     */
    //pass by value
    def f0(a:Int):Unit = {
      println("a: " + a)
    }
    // pass by name, argument can be a code block that return to Int
    // 传名函数：=> Int 表示代码块的返回值是Int
    def f1(a: => Int): Unit = {
      println("a: " + a)
    }

    def f2(): Int = {
      println("call f2()")
      10
    }

    f1(10)
    f1(f2())// pass by name, just replace a with f2(), then will call f2() twice
    f1({
      println("code block") // print twice
      30
    })
  }
}
