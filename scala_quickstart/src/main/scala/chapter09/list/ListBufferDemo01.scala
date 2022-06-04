package chapter09.list

import scala.collection.mutable.ListBuffer

/**
 * @author yuting
 * @date 2022/6/5 12:18 AM
 * @version 1.0
 */
object ListBufferDemo01 {
  def main(args: Array[String]): Unit = {
    val listBuf1 = ListBuffer[Int](1,2,3)
    for(item<-listBuf1){
      println(item)
    }
    println(listBuf1(2))
    println("listBuf1 = " + listBuf1)

    println("--------------ListBuffer添加元素----------------")
    // 动态的增加元素，listBuf1就会变化
    val listBuf2 = new ListBuffer[Int]
    listBuf2 += 4
    println("listBuf2 = " + listBuf2)
    listBuf2.append(5)
    println("listBuf2 = " + listBuf2)

    // ListBuffer(1, 2, 3) listBuf1
    //    +
    // ListBuffer(4, 5) listBuf2
    //    ||
    // ListBuffer(4, 5, 1, 2, 3)
    listBuf2 ++= listBuf1
    println("listBuf2 = " + listBuf2)

    val listBuf3 = listBuf1 ++ listBuf2
    // ListBuffer(1, 2, 3, 4, 5, 1, 2, 3)
    println("listBuf3 = " + listBuf3)
    val listBuf4 = listBuf3 :+ 4
    println("listBuf4 = " + listBuf4)

    println("----------------------listBuf4.remove(4)----------------------------")
    listBuf4.remove(4)
    println("listBuf4 = " + listBuf4)
  }
}
