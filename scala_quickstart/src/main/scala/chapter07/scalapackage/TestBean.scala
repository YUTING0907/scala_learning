package chapter07.scalapackage

/**
 * @author yuting
 * @date 2022/6/4 11:06 AM
 * @version 1.0
 */
object TestBean {
  def main(args: Array[String]): Unit = {
    val m = new Manager("jack")
    println("m.age = " + m.age3)
  }
}

class Manager(var name: String){
  import scala.beans.BeanProperty
  //第一种形式 [使用相对路径引入包]
  @BeanProperty var age: Int = _
  //第二种形式, 和第一种一样，都是相对路径引入
  @scala.beans.BeanProperty var age2: Int = _
  //第三种形式, 是绝对路径引入，可以解决包名冲突
  @_root_.scala.beans.BeanProperty var age3: Int = _
}