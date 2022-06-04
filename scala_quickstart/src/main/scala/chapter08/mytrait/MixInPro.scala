package chapter08.mytrait

/**
 * @author yuting
 * @date 2022/6/4 6:52 PM
 * @version 1.0
 */
object MixInPro {
  def main(args: Array[String]): Unit = {
    val mysql = new MySQL6 with DB6{
      override var sal: Int = 11
    }
  }
}

trait DB6{
  // 抽象字段
  var sal: Int
  var opertype: String = "insert"
  def insert(): Unit ={

  }
}

class MySQL6{}