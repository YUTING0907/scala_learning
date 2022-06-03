package chapter04

/**
 * @author yuting
 * @date 2022/6/3 10:29 AM
 * @version 1.0
 */
object ForMulti {
  def main(args: Array[String]): Unit = {
    for(i<- 1 to 3; j<- 1 to 3){
      println("i = " + i + "\t j = " + j)
    }

    println("----------------------------")
    // 上面的写法也可以写成：
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println("i = " + i + "\tj = " + j)
      }
    }
  }
}
