package chapter09.set

import scala.collection.mutable

/**
 * @author yuting
 * @date 2022/6/5 11:16 AM
 * @version 1.0
 */
object SetDemo01 {
  def main(args: Array[String]): Unit = {
    val set1 = Set(1,2,3) //不可变
    println("set = " + set1)
    println("set.max = " + set1.max)
    println("set1 min = " + set1.min)

    val set2 = mutable.Set(1,2,"Hello")// 可变
    println("set2 = " + set2)

    println("-------------Set添加元素--------------------")
    // 添加元素的三种方式
    set2.add("tom")
    set2 += 3
    set2.+=(4)

    // set2 = Set(1, 2, 3, tom, 4, Hello)
    println("set2 = " + set2)

    println("-------------Set删除元素--------------------")
    set2 -= 4
    println("set2 = " + set2)
    // 方法的形式，scala的Set可以直接删除值
    // 如果删除的对象不存在，则不生效，也不报错
    set2.remove("hello")
    println("set2 = " + set2)

    println("-------------Set集合遍历--------------------")
    for(item<- set2){
      println(item)
    }

  }
}
