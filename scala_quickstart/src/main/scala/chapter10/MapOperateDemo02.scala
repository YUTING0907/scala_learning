package chapter10

/**
 * @author yuting
 * @date 2022/6/5 1:54 PM
 * @version 1.0
 */
object MapOperateDemo02 {
  def main(args: Array[String]): Unit = {
    val list1 = List(3,5,7,9)
    val list2 = list1.map(multiple)

    println("list2 = " + list2)

    val myList1 = MyList()
    val myList2 = myList1.map(multiple)
    println("myList2 = " + myList2)
  }

  def multiple(n:Int):Int={
    2 * n
  }
}

/**
 * 深刻理解map映射函数的机制-模拟实现
 */
class MyList{
  val list1 = List(3,5,7,9)
  var list2 = List[Int]()

  def map(f:Int => Int): List[Int]={
    for(item<- this.list1){
      list2 = list2 :+ (item * 2)
    }
    list2
  }
}

object MyList{
  def apply():MyList = new MyList
}