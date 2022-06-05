package chapter10

/**
 * @author yuting
 * @date 2022/6/5 2:04 PM
 * @version 1.0
 */
object ReduceDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1,20,30,4,5)
    val res = list.reduceLeft(sum)

    //执行的流程分析
    //步骤 1 (1 + 20)
    //步骤 2 (1 + 20) + 30
    //步骤 3 ((1 + 20) + 30) + 4
    //步骤 4 (((1 + 20) + 30) + 4) + 5 = 60
    println("res=" + res)
  }

  def sum(n1:Int,n2:Int):Int = {
    println(s"$n1 + $n2 = ${n1 + n2}")
    n1 + n2
  }
}
