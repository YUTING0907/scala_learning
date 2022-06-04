package chapter08.mytrait

/**
 * @author yuting
 * @date 2022/6/4 4:58 PM
 * @version 1.0
 */
object TraitDemo01 {
  def main(args: Array[String]): Unit = {
    val c = new C
    val f =  new F
    // 连接mysql数据库...
    c.getConnect()
    // 连接oracle数据库..
    f.getConnect()
  }
}

trait Trait01{
  def getConnect()
}

class A{}

class B extends A{}

class C extends A with Trait01{
  override def getConnect(): Unit = {
    println("连接mysql数据库...")
  }
}

class D {}

class E extends D{}

class F extends D with Trait01{
  override def getConnect(): Unit = {
    println("连接oracle数据库..")
  }
}