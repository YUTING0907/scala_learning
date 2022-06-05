package chapter10

/**
 * @author yuting
 * @date 2022/6/5 2:16 PM
 * @version 1.0
 */
object ViewDemo01 {
  def main(args: Array[String]): Unit = {
    // 没有使用view
    val res1 = (1 to 100).filter(eq)
    println("res1 = " + res1)

    /**
     * 使用view，来完成这个问题,程序中，对集合进行map,filter,reduce,fold...
     * 你并不希望立即执行，而是在使用到结果才执行，则可以使用view来进行优化.
     */
    val res2 = (1 to 100).view.filter(eq)
    println("res2 = " + res2)

    for(item<- res2){
      print(item + "\t")
    }
    println("\nres2 = " + res2)

  }

  def eq(n:Int):Boolean = {
    n.toString.equals(n.toString.reverse)
  }
}
