package chapter04

/**
 * @author yuting
 * @date 2022/6/3 10:12 AM
 * @version 1.0
 */
object Exercise03 {
  def main(args: Array[String]): Unit = {
    //3.打印出九九乘法表
    var num = 9
    for(i<- 1 to num){
      for(j<- 1 to i){
        print(s"${j} * ${i} = ${i * j} \t")
      }
      println()
    }
  }
}
