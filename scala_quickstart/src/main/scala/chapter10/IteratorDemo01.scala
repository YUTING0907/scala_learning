package chapter10

/**
 * @author yuting
 * @date 2022/6/5 12:04 PM
 * @version 1.0
 */
object IteratorDemo01 {
  def main(args: Array[String]): Unit = {
    val iterator = List(1,2,3,4).iterator

    println("-------------------遍历方式一 while------------------------")
/*    while(iterator.hasNext){
      println(iterator.next())
    }*/
    println("-------------------遍历方式一 for------------------------")
    for(item<- iterator){
      println(item)
    }
  }
}
