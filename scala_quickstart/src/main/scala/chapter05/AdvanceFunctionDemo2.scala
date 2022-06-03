package chapter05

/**
 * @author yuting
 * @date 2022/6/3 8:32 PM
 * @version 1.0
 */
object AdvanceFunctionDemo2 {
  def main(args: Array[String]): Unit = {

    /**
     * 高阶函数举例：
     * 使用特定操作处理数组元素，得到新数组。也就是集合处理的map（映射）操作。
     * @param arr
     * @param op
     * @return
     */
    def arrayOp(arr: Array[Int], op: Int => Int): Array[Int] = {
      for(elem <- arr) yield op(elem)
    }
    val arr = Array(1,2,3,4)

    def addOne(elem: Int):Int = elem + 1
    println(arrayOp(arr, addOne).mkString(", "))
    println(arrayOp(arr,elem => elem * 2).mkString(","))
    println(arrayOp(arr, _ * 3).mkString(", "))
  }
}
