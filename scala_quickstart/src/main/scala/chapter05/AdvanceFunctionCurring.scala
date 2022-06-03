package chapter05

/**
 * @author yuting
 * @date 2022/6/3 8:50 PM
 * @version 1.0
 */
object AdvanceFunctionCurring {
  def main(args: Array[String]): Unit = {
    /**
     * 内层函数可以使用外层函数的参数。闭包
     * @param
     * @return
     */
    def func(a:Int):String => (Char => Boolean) = {
      def f1(s:String): Char => Boolean = {
        def f2(c:Char): Boolean = {
          if(a==0&&s==""&&c=='0')false else true
        }
        f2
      }
      f1
    }
    println(func(0)("")('0'))//false
    println(func(1)("hello")('c')) // true

    /**
     * 柯里化之后 把一个参数列表的多个参数，变成多个参数列表
     */
    def func2(a:Int)(s:String)(c:Char):Boolean = !(a==0 && s=="" && c == '0')
    println(func2(0)("")('0')) // false
    println(func2(1)("hello")('c')) // true

    // Currying
    def add(a:Int)(b:Int):Int = a + b
    println(add(4)(3))
    val addFour = add(4) _
    // val addFour: Int => int = add(4)
    println(addFour(3))
  }
}
