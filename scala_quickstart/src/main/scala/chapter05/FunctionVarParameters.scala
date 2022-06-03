package chapter05

/**
 * @author yuting
 * @date 2022/6/3 4:40 PM
 * @version 1.0
 */
object FunctionVarParameters {
  def main(args: Array[String]): Unit = {
    val res = sum(1,2,3,4,5,5)
    println(res)
  }

  def sum(n:Int,args:Int *):Int={
    println("args.length = " + args.length)
    var sum = n
    for(item<- args){
      sum += item
    }
    sum
  }
}
