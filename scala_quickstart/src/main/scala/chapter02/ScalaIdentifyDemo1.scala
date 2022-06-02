package chapter02

/**
 * @author yuting
 * @date 2022/6/2 9:08 PM
 * @version 1.0
 */
object ScalaIdentifyDemo1 {
  def main(args: Array[String]): Unit = {
    val ++ = "Hello Scala"
    println(++)

    val +-*/ = 90
    println(+-*/)

    //其实编译器是进行以下处理的：
    // ++ ==>  $plus$plus
    //val +a = "abc" 报错
    var `boolean` = "true"
    println(`boolean`)
    val Int = 90.44
    println(Int) //Double类型

    var _ = "jack"
    //println(_)
  }
}
