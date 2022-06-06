package chapter11

/**
 * @author yuting
 * @date 2022/6/5 10:51 PM
 * @version 1.0
 */
object MatchVarDemo01 {
  def main(args: Array[String]): Unit = {
    val ch = 'U'
    ch match{
      case '+' => println("ok~")
      // 下面 case mychar 含义是 mychar = ch
      case mychar => println("ok~" + mychar)
      case _ => println("ok~~")
    }

    val ch1 = '+'
    val res = ch1 match{
      case '+' => ch1 + "hello "
      
      case _ => println("0k~~")
    }

    println("res = " + res)
  }
}
