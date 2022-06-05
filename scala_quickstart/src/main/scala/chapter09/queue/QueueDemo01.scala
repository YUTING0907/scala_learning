package chapter09.queue

import scala.collection.mutable

/**
 * @author yuting
 * @date 2022/6/5 11:21 AM
 * @version 1.0
 */
object QueueDemo01 {
  def main(args: Array[String]): Unit = {
    // 创建队列
    val queue1 = new mutable.Queue[Any]
    // 给队列增加元素
    queue1 += 9
    println("queue1 = " + queue1)
    // 直接加在队列后面
    queue1 ++= List(8,7)
    // queue1 = Queue(9,8,7)
    println("queue1 = " + queue1)

    queue1 += List(6, 5) // 将List(6,5)作为一个元素加入到队列中
    println("queue1 = " + queue1)

    queue1.enqueue(1,3,4)
    queue1.dequeue()

    println("queue1 = " + queue1)

    println("============Queue返回队列的元素=================")
    //队列 Queue返回队列的元素
    //1. 获取队列的第一个元素
    println(queue1.head) // 对queue1没有任何影响

    //2.获取队列的最后一个元素
    println(queue1.last) // 对queue1没有任何影响
    //3. 取出队尾的数据 ,即：返回除了第一个以外剩余的元素，可以级联使用
    println(queue1.tail)
    println("queue1 = " + queue1)
    println(queue1.tail.tail.tail)
    println("queue1 = " + queue1)


  }
}
