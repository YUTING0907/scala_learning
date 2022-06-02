package chapter03

/**
 * @author yuting
 * @date 2022/6/2 10:50 PM
 * @version 1.0
 */
object DataTypeConversion {
  def main(args: Array[String]): Unit = {
    var r1: Int = 10 / 3
    println("r1 = " + r1)
    var r2: Double = 10 / 3
    println("r2=" + r2)
    var r3: Double = 10.0 / 3
    println("r3 = " + r3)
    println("r3 = " + r3.formatted("%.2f"))

    /** %的使用
     * 1
     * -1
     * -1
     * 1
     */
    println(10 % 3)
    println(-10 % 3)
    println(-10 % -3)
    println(10 % -3)

    /**
     * ++ 和 --
     * 在scala中没有++和--，而使用+=1和-=1
     */
    var num1 = 10
    //num++ 错误
    num1 += 1
    num1 -= 1
    println(num1)//10
  }
}
