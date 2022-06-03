package chapter04

/**
 * @author yuting
 * @date 2022/6/3 9:49 AM
 * @version 1.0
 */
object ContinueDemo {
/**
 * 1. 1 to 10
 * 2. 循环守卫 if (i != 2 && i != 3) 这个条件为ture
 *    才执行循环体,即当i ==2 或者 i == 3时，就跳过
*/
  def main(args: Array[String]): Unit = {
    for(i<- 1 to 10 if (i != 2 && i != 3) ){
      println("i= " + i)
    }

    //也可以写成如下的形式
    for(i<- 1 to 10){
      if(i != 2 && i != 3){
        println("i= " + i)
      }
    }
  }
}
