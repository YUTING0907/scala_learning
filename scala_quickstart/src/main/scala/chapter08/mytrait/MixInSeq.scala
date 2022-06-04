package chapter08.mytrait

/**
 * @author yuting
 * @date 2022/6/4 6:56 PM
 * @version 1.0
 */
object MixInSeq {
  def main(args: Array[String]): Unit = {
    /**
     * 这时FF是这样 形式 class FF extends EE with CC with DD
     * 调用当前类的超类构造器
     * 第一个特质的父特质构造器
     * 第一个特质构造器
     * 第二个特质构造器的父特质构造器, 如果已经执行过，就不再执行
     * 第二个特质构造器
     * .......重复4,5的步骤(如果有第3个，第4个特质)
     * 当前类构造器
     *   E...
     *   A...
     *   B....
     *   C....
     *   D....
     *   F....
     */
    val ff = new FF
    println("----------------------------")
    /** 这时我们是动态混入
     * 先创建 new KK 对象，然后再混入其它特质
     * 调用当前类的超类构造器
     * 当前类构造器
     * 第一个特质构造器的父特质构造器
     * 第一个特质构造器.
     * 第二个特质构造器的父特质构造器, 如果已经执行过，就不再执行
     * 第二个特质构造器
     * .......重复5,6的步骤(如果有第3个，第4个特质)
     * 当前类构造器   [案例演示]
     *  E...
     *  K....
     *  A...
     *  B....
     *  C....
     *  D....
     */
    val kk = new KK with CC with DD
  }
}

trait AA{
  println("A...")
}

trait BB extends AA{
  println("B....")
}

trait CC extends BB{
  println("C.....")
}

trait DD extends BB{
  println("D....")
}

class EE{
  println("E....")
}

/**
 * 先继承了EE类，然后再继承CC 和DD
 */
class FF extends EE with CC with DD{
  println("F....")
}

class KK extends EE{
  println("K.....")
}