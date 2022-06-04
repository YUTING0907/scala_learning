package chapter06

/**
 * @author yuting
 * @date 2022/6/4 9:46 AM
 * @version 1.0
 */
object ConstructorDemo01 {
  def main(args: Array[String]): Unit = {
    val person = new PersonA("tom")
    println(person)
    val a1 = new A
    val a2 = new A()
    val person2 = new Person("yt",18)
    person2.Person()

  }
}

/**
 * 主构造器写在类定义上，一定是构造时最先被调用的构造器，方法体就是类定义，
 * 可以在类中方法定义的同级编写逻辑，都是主构造器一部分，按顺序执行。
 * @param inName
 * @param inAge
 */
class PersonA(inName:String, inAge:Int){
  var name:String = inName
  var age:Int = inAge
  age += 10
  println("age=" + age)

  /**
   * 辅助构造器用this定义。
   * 辅助构造器必须直接或者间接调用主构造器，调用其他构造必须位于第一行。
   * 主构造器和辅助构造器是重载的方法，所以参数列表不能一致。
   * 可以定义和类名同名方法，就是一个普通方法。
   * @param name
   */
  def this(name:String){
    //辅助构造器，必须在第一行显式调用主构造器(可以是直接，也可以是间接)
    this("jack", 10)
    println("------------------")
    //this
    this.name = name //重新赋值
  }
    //重写了toString，便于输出对象的信息
  override def toString: String = {
      "name=" + this.name + "\t age" + this.age
  }
}

class A(){
}

class Person(private var name: String){
  var age:Int = _
  println("call main constructor")
  def this(name: String, age:Int){
    this(name)
    this.age = age
    println("call assist constructor 2")
    println(s"Person: $name $age")
  }
  //just a common method, not constructor
  def Person():Unit ={
    println("call Person.Person() method")
  }

}


