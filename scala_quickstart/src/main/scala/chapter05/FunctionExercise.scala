package chapter05

/**
 * @author yuting
 * @date 2022/6/3 4:35 PM
 * @version 1.0
 */
object FunctionExercise {
  def main(args: Array[String]): Unit = {
    getTriangle(4)
  }
  def getTriangle(n:Int): Unit ={
    for(i<- 1 to n){
      for(j<- 1 to n - i){
        print(" ")
      }
      for (k <- 1 to 2 * i - 1) {
        print("*")
      }
      println()
    }
  }
}
