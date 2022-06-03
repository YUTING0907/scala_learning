package chapter04

import scala.util.control.Breaks.{break, breakable}

/**
 * @author yuting
 * @date 2022/6/3 10:46 AM
 * @version 1.0
 */
object WhileBreak {
  def main(args: Array[String]): Unit = {
    var n = 0
    breakable{
      while(n<=20){
        n+=1
        println("n = " + n)
        if(n==10){
          break()
        }
      }
    }
  }
}
