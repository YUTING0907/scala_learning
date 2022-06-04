package chapter06

import sun.invoke.empty.Empty

/**
 * @author yuting
 * @date 2022/6/4 10:54 AM
 * @version 1.0
 */
object OopCreateObj {
  def main(args: Array[String]): Unit = {
    // emp1类型就是Emp
    val emp1 = new Emp
    // 如果我们希望将子类对象，交给父类的引用，这时就需要写上类型
    val emp2: Person1 = new Emp
  }
}

class Person1{
}

class Emp extends Person1{
}
