package chapter09.array

import scala.collection.mutable.ArrayBuffer

/**
 * @author yuting
 * @date 2022/6/4 11:48 PM
 * @version 1.0
 */
object ArrayBufferDemo01 {
  // 创建ArrayBuffer
  def main(args: Array[String]): Unit = {
    val arrBuf = ArrayBuffer[Any](3,2,5)

    // 通过下标访问数据
    println("arrBuf(1) = " + arrBuf(1))
    for(item<- arrBuf){
      println(item)
    }

    // arrBuf的长度
    println(arrBuf.length)
    println(arrBuf.hashCode())

    // 使用append方法追加数据，append支持可变参数
    arrBuf.append(11,12,13)
    println("-------------")
    arrBuf(4) = 999
    // 再次遍历arrBuf
    for(item <- arrBuf){
      println(item)
    }

    // 根据下标删除数据
    arrBuf.remove(5)

    println("------------------------------------")

    // 再次遍历arrBuf
    for(item <- arrBuf){
      println(item)
    }
  }
}
