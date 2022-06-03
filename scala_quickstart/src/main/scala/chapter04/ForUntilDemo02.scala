package chapter04

/**
 * @author yuting
 * @date 2022/6/3 10:35 AM
 * @version 1.0
 */
object ForUntilDemo02 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 11
    for(i<- start until end){
      println("你好，尚硅谷" + i)
    }
  }
}
