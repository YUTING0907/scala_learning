package chapter07.scalaoop

/**
 * @author yuting
 * @date 2022/6/4 3:58 PM
 * @version 1.0
 */
object TypeConvert01 {
  def main(args: Array[String]): Unit = {
    // ClassOf的使用，可以得到类名
    //println(Classof[String])

    val str = "king"
    // 使用反射机制
    println(str.getClass.getName)

    // isInstanceOf asInstanceOf
    var person = new Person200
    var emp = new Emp200
    //将子类引用给父类(向上转型,自动)
    person = emp
    person.sayHi() //emp sayHi....


    //将父类的引用重新转成子类引用(多态),即向下转型
    var emp200 = person.asInstanceOf[Emp200]
    emp200.sayHello()
  }
}

class Person200{
  var name: String = "tom"

  def printName(): Unit ={ //输出名字
    println("Person printName() " + name)
  }

  def sayHi(): Unit ={
    println("person sayHi....")
  }
}

class Emp200 extends Person200{
  override def printName(): Unit ={
    println("Emp printName() " + name)
    //在子类中需要去调用父类的方法,使用super
    super.printName()
    sayHi()
  }

  def sayHello(): Unit ={
    println("say hello --")
  }

  override def sayHi(){
    println("emp sayHi....")
  }
}