package chapter09.array

import scala.collection.mutable.ArrayBuffer

/**
 * @author yuting
 * @date 2022/6/5 12:08 AM
 * @version 1.0
 *  ArrayBuffer - Array
 *  Array 转 ArrayBuffer
 *
 */
object ArrayToToArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arrBuf = new ArrayBuffer[Int]()
    arrBuf.append(1,2,3,4)
    println(arrBuf)

    /** ArrayBuffer转Array
     * 1. arrBuf.toArray 调用 arrBuf 的方法 toArray
     * 2. 将 ArrayBuffer ---> Array
     * 3. arrBuf本身没有任何变化
     */
    val arr = arrBuf.toArray
    for(item<-arr){
      println(item)
    }
    println("arr.length = " + arr.length)

    println("--------------------------------------------------")
    val array = new Array[Int](4)
    for(index <- 0 until array.length){
      array(index) = index
    }
    for(item<- array){
      println(item)
    }

    /**
    Array 转 ArrayBuffer 底层的实现
       override def toBuffer[A1 >: A]: mutable.Buffer[A1] = {
          val result = new mutable.ArrayBuffer[A1](size)
          copyToBuffer(result)
          result
       }
     */
    val buffer =  array.toBuffer
    buffer.append(5,6,7,8)
    for(item<-buffer ) {
      println(item)
    }
  }
}
