package chapter05

/**
 * @author yuting
 * @date 2022/6/3 6:35 PM
 * @version 1.0
 */
object AdvanceFunctionDemo1 {
  def main(args: Array[String]): Unit = {
    val fun = (name:String) => {println(name)}
    println(f(fun))
    /**
     * 1.函数作为值传递
     * 作为值传递：经过赋值之后在底层变成一个lambda对象。
     */
    def foo(n:Int): Int = {
      println("call foo")
      n + 1
    }
    // function assign to value, also a object
    val func = foo _ // represent the function foo, not function call
    val func1: Int => Int = foo // specify the type of func1
    println(func) // Main$$$Lambda$674/0x000000080103c588@770beef5
    println(func == func1) // false, not a same object

    /**
    2.函数作为参数，可以传匿名函数、函数名称、lambda对象。
     */
    def dualOp(func: (Int, Int) => Int): Int = {
      func(1,2)
    }
    println(dualOp((a: Int, b:Int) => a + b))
    println(dualOp((a:Int,b: Int) => a - b))
    println(dualOp((a,b)=> a - b))
    println(dualOp(_+_))// a + b
    println(dualOp(-_ + _))

    /**
     * 3.函数作为返回值
     */
    // function as return value
    def outerFunc(): Int => Unit = {
      def inner(a:Int): Unit = {
        println(s"call inner with argument ${a}")
      }
      inner
    }

    println(outerFunc()(10))

  }


  def f(func: String=>Unit): Unit={
    func("alice")
  }

}
