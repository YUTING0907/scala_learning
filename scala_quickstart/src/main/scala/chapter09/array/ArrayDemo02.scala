package chapter09.array

/**
 * @author yuting
 * @date 2022/6/5 12:03 AM
 * @version 1.0
 */
object ArrayDemo02 {
  def main(args: Array[String]): Unit = {
    var arr = Array(1,3,"xx")
    arr(1) = "xx"

    for(i<-arr){
      println(i)
    }

    for(index<- 0 until arr.length){
      printf("arr(%d) = %s", index,arr(index)+"\t")
    }
  }
}
