package chapter09.array

import scala.collection.mutable.ArrayBuffer

/**
 * @author yuting
 * @date 2022/6/4 11:54 PM
 * @version 1.0
 */
object ArrayBufferToJavaList {
  def main(args: Array[String]): Unit = {
    // Scala集合 和 Java集合互相转换
    val arr = ArrayBuffer("1","2","3")

    /**
     *
     */
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)

  }
}
