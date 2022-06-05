package chapter10

/**
 * @author yuting
 * @date 2022/6/5 2:06 PM
 * @version 1.0
 */
object ReduceExercise01 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)

    println(list.reduceLeft(minus))
    // reduce等价于 reduceLeft
    println(list.reduce(minus))
    // 求list中的最小值 1
    println(list.reduce(min))

  }

  def minus(n1: Int,n2:Int):Int ={
    println(s"$n1 - $n2 = ${n1 - n2}")
    n1 - n2
  }

  def min(n1: Int, n2: Int): Int = {
    if(n1 > n2){
      n2
    }else{
      n1
    }
  }
}
