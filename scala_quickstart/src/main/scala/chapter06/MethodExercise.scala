package chapter06

/**
 * @author yuting
 * @date 2022/6/4 10:32 AM
 * @version 1.0
 */
object MethodExercise {
  def main(args: Array[String]): Unit = {
    method01()

    val matrix = new Matrix
    matrix.width = 2.2
    matrix.length = 2.51
    val res1 = matrix.method()
    println(res1.formatted("%.2f"))

    method02(4,2)

    val res2 = method03(4.22, 3.11)
    println(res2.formatted("%.2f"))

    val res3 = method05(9, 3, '/')
    println(res3)
  }
  /**
   * 编程一个方法，方法不需要参数，
   * 在方法中打印一个10*8 的矩形，在main方法中调用该方法。
   */
  def method01():Unit = {
    for (i <- 1 to 10) {
      for (j <- 1 to 8) {
        print("*")
      }
      println()
    }
  }

  def method02(m: Int, n: Int): Unit = {
    for (i <- 1 to m) {
      for (j <- 1 to n) {
        print("*")
      }
      println()
    }
  }

  /**
   * 修改上一个程序，编写一个方法，提供m和n两个参数，
   * 方法中打印一个m*n的矩形，再编写一个方法算该矩形的面积(可以接收长length，和宽width)，
   * 将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
   * @param width
   * @param length
   * @return
   */
  def method03(width: Double, length: Double): Double={
    width * length
  }

  def method04(n:Int):Unit = {
    if(n % 2 == 0){
      println("是偶数")
    }else(
      println("是奇数")
    )
  }

  /**
   * 定义小小计算器类(Calcuator)，实现加减乘除四个功能
   * 用一个方法搞定
   */
  def method05(m:Int, n:Int,oper:Char):Int = {
    if(oper == '+'){
      m + n
    }else if(oper == '-'){
      m - n
    }else if(oper == '*'){
      m * n
    }else{
      m / n
    }
  }
}

class Matrix{
  var length: Double = _
  var width: Double = _
  /**
   * 修改上一个程序，编写一个方法中，方法不需要参数，计算该矩形的面积，
   * 并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印(结果保留小数点2位)。
   */
  def method(): Double = {
    length * width
  }
}
