package chapter10

import scala.collection.mutable

/**
 * @author yuting
 * @date 2022/6/5 2:23 PM
 * @version 1.0
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    val lines = List("atguigu han hello", "atguigu han aaa aaa aaa ccc ddd uuu")
    val res = lines.foldLeft(mutable.Map[String,Int]())(wordCount)
    // _._1 根据key排序，_._2根据value排序，默认都是升序
    println(res.toSeq.sortBy(_._2))
    println(res.toSeq.sortWith(_._2 > _._2))
    println(res)
  }

  def wordCount(map:mutable.Map[String,Int],str:String):mutable.Map[String,Int]={
    val strs = str.split(" ")
    for(word <- strs){
      if(map.contains(word)){
        val count = map.get(word).get
        map += (word -> (count + 1))
      }else{
        map += (word -> 1)
      }
    }
    map
  }
}
