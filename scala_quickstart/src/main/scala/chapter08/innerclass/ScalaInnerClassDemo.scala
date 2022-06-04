package chapter08.innerclass

/**
 * @author yuting
 * @date 2022/6/4 4:32 PM
 * @version 1.0
 */
object ScalaInnerClassDemo {
  def main(args: Array[String]): Unit = {
    val outer1:ScalaOuterClass1 = new ScalaOuterClass1();
    val outer2:ScalaOuterClass1 = new ScalaOuterClass1();
    // Scala创建内部类的方式和Java不一样，将new 关键字放置在前
    // 使用 对象.内部类 的方式创建
    val inner1 = new outer1.ScalaInnerClass1
    val inner2 = new outer2.ScalaInnerClass1

    // 创建静态内部类对象
    val staticInner = new ScalaOuterClass1.ScalaStaticInnerClass
    println(staticInner)
  }
}


/**
 * 外部类
 */
class ScalaOuterClass1{
  // 成员内部类
  class ScalaInnerClass1{

  }
}
/**
 * 伴生对象
 */
object ScalaOuterClass1{
  class ScalaStaticInnerClass{

  }
}

/**
 * 外部类
 * 内部类访问外部类的属性的方法1
 * 外部类名.this.属性
 */
class ScalaOuterClass2{
  //定义两个属性
  var name = "scoot"
  private var sal = 30000.9

  class ScalaInnerClass{//成员内部类,
    def info()={
      // 访问方式：外部类名.this.属性名
      // 怎么理解 ScalaOuterClass.this 就相当于是 ScalaOuterClass 这个外部类的一个实例,
      // 然后通过 ScalaOuterClass.this 实例对象去访问 name 属性
      // 只是这种写法比较特别，学习java的同学可能更容易理解 ScalaOuterClass.class 的写法.
      println("name = " + ScalaOuterClass2.this.name
        + " sal =" + ScalaOuterClass2.this.sal)
    }
    }
}