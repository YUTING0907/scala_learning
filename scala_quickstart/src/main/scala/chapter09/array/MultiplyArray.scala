package chapter09.array

/**
 * @author yuting
 * @date 2022/6/5 12:15 AM
 * @version 1.0
 */
object MultiplyArray {
  def main(args: Array[String]): Unit = {
    val arr = Array.ofDim[Int](3,4)

    for(i<-0 until arr.length){
      for(j<- 0 until arr(i).length){
        arr(i)(j) = i * j
      }
    }

    for(i1<- arr){
      for(i2<- i1){
        print(i2)
      }
      println()
    }
    println("-------------------------------------")
    println(arr(2)(3))
  }
}
