package chapter11

/**
 * @author yuting
 * @date 2022/6/5 10:15 PM
 * @version 1.0
 */
object MatchListDemo01 {
  def main(args: Array[String]): Unit = {
    val array = Array(
      List(0),
      List(1,0),
      List(88),
      List(0,0,0)
    )

    for(list <- array){
      val result = list match{
        case 0 :: Nil => "0"
        case x :: y :: Nil => x + " " + y

        case 0 :: tail => "0 ..."
        case x :: Nil => x
        case _ => "something else"
      }

      println("result = " + result)
    }

  }
}
