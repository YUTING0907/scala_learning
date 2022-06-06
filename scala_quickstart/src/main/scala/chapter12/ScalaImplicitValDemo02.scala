package chapter12

/**
 * @author yuting
 * @date 2022/6/6 10:30 AM
 * @version 1.0
 */
object ScalaImplicitValDemo02 {
  def main(args: Array[String]): Unit = {
    test2()
    test3()
  }

  def test1() = {
    // 隐式变量（值）
    implicit val name: String = "Scala"
    //implicit val name1: String = "World"

    def hello(implicit content:String = "jack")={
      println("Hello " + content)
    }
    //调用hello
    hello
  }

  def test2()={
    // 隐式遍历
    implicit val name:String = "Scala"

    //当同时有implicit 值和默认值，implicit 优先级高
    def hello2(implicit content: String = "jack")={
      println("Hello " + content)
    }
    //调用hello
    hello2
  }

  def test3()={
    //当一个隐式参数匹配不到隐式值，仍然会使用默认值
    implicit val name:Int = 10

    def hello3(implicit content:String = "jack")={
      println("Hello " + content)
    }
    //调用hello
    hello3
  }

  def test4()={
    //当没有隐式值，没有默认值，又没有传值，就会报错
    def hello4(implicit content:String)={
      println("Hello4 " + content)
    }
    //调用hello
    // hello4 error
  }


}
