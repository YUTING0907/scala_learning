package chapter09.map

import scala.collection.mutable

/**
 * @author yuting
 * @date 2022/6/5 12:27 AM
 * @version 1.0
 */
object MapDemo01 {
  def main(args: Array[String]): Unit = {
    val map1 = Map("dd" -> 18,"mm"-> 19, "tom"->22)
    println("map1 = " + map1)

    /**
     * 无序
     */
    val map2 = mutable.Map("dd"->18,"mm"-> 19,"tom"->22)
    println("map2 = " + map2)

    // 创建空的映射
    val map3 = new mutable.HashMap[String,Int]
    println("map3 = " + map3)

    /**
     * 对偶元组
     */
    val map4 = mutable.Map(("dd",18),("mm",19),("tom",22))
    println("map4 = " + map4)

    println("----------Map中取值------------")
    //方式1-使用map(key)
    println(map4("dd")) // 18
    //方式2-使用contains方法检查是否存在key
    if(map4.contains("dd")){
      println("key存在,值=" + map4("dd"))
    }else{
      println("key不存在：）")
    }
    /**
     * 方式3-使用map.get(key).get取值
     * 1. 如果key存在 map.get(key) 就会返回Some(值)  ,然后Some(值).get就可以取出
     * 2. 如果key不存在 map.get(key) 就会返回None
     */
    println(map4.get("dd").get)
    println(map4.get("DD"))

    //println(map4.get("DD").get)  // 抛出异常

    //方式4-使用map4.getOrElse()取值
    println(map4.getOrElse("DD", "默认的值 鱼 <・)))><<"))
  }
}
