package chapter09.map

import scala.collection.mutable

/**
 * @author yuting
 * @date 2022/6/5 12:36 AM
 * @version 1.0
 */
object MapDemo02 {
  def main(args: Array[String]): Unit = {
    val map5 = mutable.Map(("A",1),("B","北京"),("C",3))
    map5("A") = 20
    println("map5=" + map5)

    map5+=("A"->100)
    println("map5=" + map5)
    map5 -= ("A", "B", "AAA") //删除map元素，如果没有这个key则忽略
    println("map5=" + map5)

    println("-------------map的遍历-------------------------------")
    val map6 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))

    println("----(k, v) <- map6--------")
    for((k,v)<-map6){
      println(k + "-" + v)
    }

    println("----k <- map6.keys--------")
    for(k<-map6.keys){
      println(k)
    }
    println("----v <- map6.values--------")
    for(v<-map6.values){
      println(v)
    }
    //这样取出方式 v 类型是 Tuple2
    println("----v <- map6--------")
    for(v<-map6){
      println(v+"\t key = " + v._1 + " val=" + v._2)
    }

  }
}
