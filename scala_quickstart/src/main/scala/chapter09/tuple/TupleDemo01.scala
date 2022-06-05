package chapter09.tuple

/**
 * @author yuting
 * @date 2022/6/5 11:29 AM
 * @version 1.0
 */
object TupleDemo01 {
  def main(args: Array[String]): Unit = {
    val tuple = (1,2,3,"hello", 4)

    println(tuple)

    println(tuple._1)
    println(tuple._4)

    println(tuple.productElement(4))

    println("==================遍历元组=========================")
    for(item<- tuple.productIterator ){
      println(item)
    }
  }
}
