package chapter07.scalaoop

/**
 * @author yuting
 * @date 2022/6/4 3:48 PM
 * @version 1.0
 */
object ScalaFieldOverrideDetail01 {
  def main(args: Array[String]): Unit = {
    val b1 = new BBBBB()
    println(b1.sal) //0

    val b2: AAAAA = new BBBBB()
    println(b2.sal)//0
    println(b2.sal())//0
  }
}

class AAAAA{
  def sal():Int ={
    return 10
  }
}

class BBBBB extends AAAAA{
  override val sal: Int = 0 //底层 public sal
}
