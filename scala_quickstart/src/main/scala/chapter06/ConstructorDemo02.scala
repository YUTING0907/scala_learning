package chapter06

/**
 * @author yuting
 * @date 2022/6/4 10:03 AM
 * @version 1.0
 */
object ConstructorDemo02 {
  def main(args: Array[String]): Unit = {
    val a = new AA("jack")
    //输出的顺序是
    //1. BB~~~ 父类
    //2. AA~~~ 主构造器
    //3. AA this(name:String) 辅助构造器
  }
}

class AA() extends BB(){
  println("AA--------")
  def this(name:String){
    this
    println("AA this(name:String)")
  }
}
class BB(){
  println("BB~~~")
}
