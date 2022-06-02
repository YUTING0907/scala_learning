package chapter02

/**
 * @author yuting
 * @date 2022/6/2 10:31 PM
 * @version 1.0
 */
object UnitNullNothingDemo {
  def main(args: Array[String]): Unit = {
    val res = sayHello()
    println("res = " + res)
    /**
     * Null类只有一个实例对象,null类似于Java中的null引用
     * null可以赋值给任意引用类型(AnyRef),但是不能赋值给值类型(AnyVal:比如 Int, Float, Char， Boolean, Long,Double, Byte, Short)
     */
    //val dog: Dog = null
    println("ok1~~~")
    //val char: Char = null  运行会报错
    println("ok1~~~")

    // 类型推导，这个时候age是Int类型
    var age = 18

    /**
     * 有两种方式我们可以age是Int类型的：
     * 1.idea提示
     * 2. println(age.isInstanceOf[Int]) 结果为true
     */

    // 类型确定后，就不能修改，说明Scala是强数据类型语言
    // age = 2.1 编译器报错
    age = 19
    val sal = 200
    // sal是val声明的，所以不可变
    // sal = 10000  编译器报错
    /**
     * Scala设计者为什么设计 var 和 val 呢？
     * 1、在实际编程，我们更多的需求是获取/创建一个对象后，读取该对象的属性，或者是修改对象的属性值，但是我们很少去改变这个对象本身。
     *     var dog = new Dog()
     *     dog.age = 99
     *     dog = new Dog()
     *   这时我们就可以使用val定义dog
     *     val dog = new Dog()
     *     dog.age = 99
     * 2、因为val 没有线程安全问题，因此效率高，scala的设计者推荐我们val
     * 3、如果对象需要改变，则使用var
     */
    val dog = new Dog()
    //0
    println(dog.age)
    println(dog.name)
    // 这里我们就不能有下面的操作了
    // dog = new Dog()
  }

  /**
   * Unit等于Java的void，只有一个实例值()
   */
  def sayHello(): Unit = {

  }

  class Dog{
    // 声明一个age属性,给了一个默认值 _
    var age: Int = _
    var name: String = "小花"
  }
}
