package chapter04

import scala.util.control.Breaks.{break, breakable}

/**
 * @author yuting
 * @date 2022/6/3 10:19 AM
 * @version 1.0
 */
object Breakable {
  def main(args: Array[String]): Unit = {
    var sum = 0
    breakable{
      for(i<- 1 to 100){
        sum += i
        if(sum > 20){
          println("i = " + i)
          break()
        }
      }
    }
    println("sum = " + sum)
  }
}
