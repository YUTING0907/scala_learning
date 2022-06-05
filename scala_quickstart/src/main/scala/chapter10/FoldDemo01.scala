package chapter10

/**
 * @author yuting
 * @date 2022/6/5 11:56 AM
 * @version 1.0
 */
object FoldDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)

    /**
     * 说明
     * 1. 折叠的理解和化简的运行机制几乎一样.
     * 理解 list.foldLeft(5)(minus) 理解成 list(5,1, 2, 3, 4) list.reduceLeft(minus)
     */
    //步骤  (5-1)
    //步骤  ((5-1) - 2)
    //步骤  (((5-1) - 2) - 3)
    //步骤  ((((5-1) - 2) - 3)) - 4 = - 5

    println(list.foldLeft(5)(minus)) // 函数的柯里化

    // 理解 list.foldRight(5)(minus) 理解成 list(1, 2, 3, 4, 5) list.reduceRight(minus)
    // 步骤 (4 - 5)
    // 步骤 (3- (4 - 5))
    // 步骤 (2 -(3- (4 - 5)))
    // 步骤 1- (2 -(3- (4 - 5))) = 3
    println(list.foldRight(5)(minus))
  }

  def minus(n1:Int,n2:Int):Int={
    n1 - n2
  }
}
