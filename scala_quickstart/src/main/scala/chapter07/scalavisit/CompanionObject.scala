package chapter07.scalavisit

/**
 * @author yuting
 * @date 2022/6/4 4:16 PM
 * @version 1.0
 */
object CompanionObject {
  def main(args: Array[String]): Unit = {
    val clerk = new Clerk
    clerk.showInfo()
    Clerk.test(clerk)
  }
}

class Clerk{
  var name:String = "jack"
  private var sal: Double = 9999.9
  protected var age = 10
  var job: String = "大数据工程师"

  def showInfo(): Unit ={
    //在本类可以使用私有的
    println(" name " + name + "\n sal= " + sal)
  }
}

object Clerk{
  def test(c:Clerk): Unit ={
    //这里体现出在伴生对象中，可以访问c.sal
    println("test() name=" + c.name + "\n sal= " + c.sal)
  }
}

class Person{
  /**
   * 这里我们增加一个包访问权限
   * 下面private[CompanionObject] ：
   *  1，仍然是private
   *  2. 在scalavisit包(包括子包)下也可以使用name ,相当于扩大访问范围
   */
  protected[scalavisit] val name= "jack"
}