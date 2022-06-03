package chapter05

/**
 * @author yuting
 * @date 2022/6/3 4:01 PM
 * @version 1.0
 */
object FunctionDemo01 {
  def main(args: Array[String]): Unit = {
    val n1 = 10
    val n2 = 20
    val oper = '-'
    val unit = getRes(n1,n2,oper)
    println(unit)
  }
  def getRes(n1:Int,n2:Int, oper:Char): Unit ={
    if(oper == '+'){
    }else if(oper=='-'){
      println("res=" + (n1 - n2))
    }
    null
  }
}
