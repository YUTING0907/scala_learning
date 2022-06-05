package chapter10

/**
 * @author yuting
 * @date 2022/6/5 1:52 PM
 * @version 1.0
 */
object MapOperateDemo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(3,5,7) //
    var list2 = List[Int]() //新的集合，准备放入新的内容

    for(item<- list1) {
      // 对元素*2 ，然后加入list2集合
      list2 = list2 :+ item * 2
   }

    println("list2=" + list2) //List(6,10,14
    
  }
}
