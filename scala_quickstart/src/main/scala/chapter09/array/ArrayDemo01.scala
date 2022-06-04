package chapter09.array

/**
 * @author yuting
 * @date 2022/6/4 11:58 PM
 * @version 1.0
 */
object ArrayDemo01 {
  def main(args: Array[String]): Unit = {
    val arr = new Array[Int](4)
    println(arr.length)

    println("arr01(0)=" + arr(0))

    for(i<- arr){
      println(i)
    }

    println("-----------")

    arr(3) = 10
    for(i<-arr){
      println(i)
    }
  }
}
