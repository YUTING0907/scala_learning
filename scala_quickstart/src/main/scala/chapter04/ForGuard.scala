package chapter04

/**
 * @author yuting
 * @date 2022/6/3 10:28 AM
 * @version 1.0
 */
object ForGuard {
  def main(args: Array[String]): Unit = {
    for(i<-1 to 3 if i!=2){
      println("i=" + 1)
    }
  }
}
