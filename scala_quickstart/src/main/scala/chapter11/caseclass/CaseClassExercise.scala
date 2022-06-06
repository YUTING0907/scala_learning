package chapter11.caseclass

/**
 * @author yuting
 * @date 2022/6/5 11:56 PM
 * @version 1.0
 */
object CaseClassExercise {
  def main(args: Array[String]): Unit = {
    /**
     * 这里给出了一个具体的打折的案例
     */
    val sale = Bundle("书籍", 10, Book("漫画", 40),
      Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30), Book("天龙八部", 100)))

    /** 完成上面例子之前需要学习三个知识点：
     * 知识点1 ：使用case语句，得到 "漫画"
     */
    val res1 = sale match {
      /**
       * 如果我们进行对象匹配时，不想接受某些值，则使用_ 忽略即可，_* 表示所有
       */
      case Bundle(_, _, Book(desc, _), _*) => desc
    }
    // res1 = 漫画
    println("res1 = " + res1)

    /**
     * 知识点2-通过@表示法将嵌套的值绑定到变量。_*绑定剩余Item到rest
     */
    val res2 = sale match {
      //如果我们进行对象匹配时，不想接受某些值，则使用_ 忽略即可，_* 表示所有
      case Bundle(_, _, art@Book(_, _), rest@_*) => (art, rest)
    }
    // res2 = (Book(漫画,40.0),WrappedArray(Bundle(文学作品,20.0,WrappedArray(Book(《阳关》,80.0), Book(《围城》,30.0), Book(天龙八部,100.0)))))
    println("res2 = " + res2)


    /**
     * 知识点3-不使用_*绑定剩余Item到rest
     */
    val res3 = sale match {
      // 如果我们进行对象匹配时，不想接受某些值，则使用_ 忽略即可，_* 表示所有
      case Bundle(_, _, art3@Book(_, _), rest3) => (art3, rest3)
    }
    // res3 = (Book(漫画,40.0),Bundle(文学作品,20.0,WrappedArray(Book(《阳关》,80.0), Book(《围城》,30.0), Book(天龙八部,100.0))))
    println("res3 = " + res3)

    /**
     * 完成案例
     * price(sale) = 220.0
     */
    println("price(sale) = " + price(sale))

  }

  def price(it: Item): Double = {
    it match {
      case Book(_, p) => p
      case Bundle(_, disc, its@_*) => its.map(price).sum - disc
    }
  }

}

/**
 * 其修饰的trait，class只能在当前文件里面被继承；
 * 在检查模式匹配的时候，用 sealed 修饰目的是让 scala 知道这些case的所有情况
 */
abstract sealed class Item

case class Book(description: String, price: Double) extends Item

case class Food(description: String, price: Double) extends Item

case class Bundle(description: String,discount: Double, item: Item*) extends Item
