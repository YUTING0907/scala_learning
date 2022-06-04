package chapter07.scalaoop

/**
 * @author yuting
 * @date 2022/6/4 11:52 AM
 * @version 1.0
 */
object Extends02 {
  def main(args: Array[String]): Unit = {
    //1. 在scala中，子类继承了父类的所有属性
    //2. 但是private的属性和方法无法访问
    val sub = new Sub
    sub.sayOk()
    // sub.test200() 编译不通过

  }
}

class Base{
  var n1:Int = 1
  protected var n2: Int = 2
  private var n3: Int = 3

  def test100():Unit = {
    println("base 100")
  }

  protected def test200():Unit = {
    println("base 200")
  }

  private def test300():Unit = {
    println("base 300")
  }
}

class Sub extends Base{
  def sayOk(): Unit = {
    this.n1 = 20
    this.n2 = 40

    println("范围" + this.n1 + this.n2)

    test200()//在子类中使用protected
    test100()

  }
}