package chapter12

/**
 * @author yuting
 * @date 2022/6/6 10:40 AM
 * @version 1.0
 */
object ImplicitClassDemo {
  def main(args: Array[String]): Unit = {
    /**
     * DB1会对应生成隐式类
     * DB1是一个隐式类, 当我们在该隐式类的作用域范围，创建MySQL1实例
     * 该隐式类就会生效, 这个工作仍然编译器完成
     * 看底层.. //ImplicitClassDemo$DB1$2
     */
    implicit class DB1(val m:MySQL1){
      def addSuffix():String = {
        m + " Scala"
      }
    }

    val mysql1 = new MySQL1
    mysql1.sayOk()

    //如何关联到 DB1$1(mySQL).addSuffix();
    mysql1.addSuffix()
  }
}

class DB1{}

class MySQL1{
  def sayOk()={
    println("sayOK")
  }
}

