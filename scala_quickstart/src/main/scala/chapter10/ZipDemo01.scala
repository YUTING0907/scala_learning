package chapter10

/**
 * @author yuting
 * @date 2022/6/5 2:19 PM
 * @version 1.0
 */
object ZipDemo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3)
    val list2 = List(4,5,6)
    val res = list1.zip(list2)
    println("res = " + res)

    println("-------------遍历---------------")
    for(item<- res){
      println(item._1 + "---" + item._2)
    }
  }
}
