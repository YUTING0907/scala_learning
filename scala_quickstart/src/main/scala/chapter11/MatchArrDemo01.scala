package chapter11

import scala.collection.mutable.ArrayBuffer

/**
 * @author yuting
 * @date 2022/6/5 3:42 PM
 * @version 1.0
 */
object MatchArrDemo01 {
  def main(args: Array[String]): Unit = {
    // 这里arrs仅仅是一个数据
    val arrs = Array(
      Array(0), Array(1,0),
      Array(0,1,0), Array(1,1,0),
      Array(1,1,0,1)
    )

    // 遍历数据，arrs总共有五个元素
    for(arr <- arrs){
      // 开始模式匹配
      val result = arr match {
        case Array(0) => "0"
        case Array(x,y) => x + " = " + y
        case Array(0, _*) => "以0开头和数组"
        case _ => "什么集合都不是"
      }
      println("result = " + result)
    }
    println("--------------------匹配数组练习-------------------------")
    /**
     * 给你一个数组集合，如果该数组时  Array(10,20) , 请使用默认匹配，返回Array(20,10)
     */
    val arrs2 = Array(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0), Array(1, 1, 0),
      Array(1, 1, 0, 1)
    )

    for(arr<- arrs2){
      val result = arr match{
        case Array(x,y) => ArrayBuffer(y,x)
        case _=> "不处理~~"
      }
      println("result = " + result) //ArrayBuffer(0,1)
    }

  }
}
