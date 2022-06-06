package chapter11

/**
 * @author yuting
 * @date 2022/6/5 10:42 PM
 * @version 1.0
 */
object MatchTupleDemo01 {
  def main(args: Array[String]): Unit = {
    val array = Array((0,1),(1,0),(10,30),(1,1),(1,0,2))

    for(pair <- array){
      val result = pair match{
        case (0,_) => "0..."
        case (y, 0) => y
        case (x, y) => (y,x)
        case _ => "Other"
      }

      println("result = " + result)
    }
  }
}
