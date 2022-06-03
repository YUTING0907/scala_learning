package chapter04

/**
 * @author yuting
 * @date 2022/6/3 9:53 AM
 * @version 1.0
 */
object DoWhileDemo01 {
  def main(args: Array[String]): Unit = {
    var i = 0
    do{
      println(i+ "Hello Scala")
      i+=1
    }while(i<10)
  }
}
