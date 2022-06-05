package chapter09

/**
 * @author yuting
 * @date 2022/6/5 11:33 AM
 * @version 1.0
 */
object CollectionDemo01 {
  def main(args: Array[String]): Unit = {
    // 字符串在scala就是Char的集合 IndexedSeq
    val str = "hello"
    for(item<- str){
      println(item)
    }

    println(str(1)) //e
  }
}
