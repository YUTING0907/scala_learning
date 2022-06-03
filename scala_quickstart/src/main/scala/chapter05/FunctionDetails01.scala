package chapter05

/**
 * @author yuting
 * @date 2022/6/3 4:06 PM
 * @version 1.0
 */
object FunctionDetails01 {
  def main(args: Array[String]): Unit = {
    val pig1 = new Pig
    val pig2 = toPig(19,pig1)
    println(pig2.name)
  }

  def toPig(n:Int,pig:Pig): Pig = {
    if(n>=10){
      pig.name = "大胖猪"
    }
    return pig
  }
}

class Pig{
  var name = "小胖猪"
}
