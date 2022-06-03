package chapter05

/**
 * @author yuting
 * @date 2022/6/3 4:10 PM
 * @version 1.0
 */
object FunctionDetails02 {
  def main(args: Array[String]): Unit = {
    val sum1 = getSum(1,2)
    println(sum1)
    val res = getRes(3,4)
    //返回()
    println(res)
    val sum2 = getSum2(5,6)
    println(sum2)
  }

  def getSum(n1:Int,n2:Int): Int = {
    return n1 + n2
  }
  /**
   * 如果返回值这里什么什么都没有写，即表示该函数没有返回值
   * 这时return无效
   */
  def getRes(n1:Int,n2:Int){
    return n1 + n2
  }
  /**
   * 如果函数明确声明无返回值(声明Unit)，那么函数体中即使使用return 关键字也不会有返回值
   */
  def getSum2(n1:Int,n2:Int):Unit = {
    return n1 + n2
  }
}
