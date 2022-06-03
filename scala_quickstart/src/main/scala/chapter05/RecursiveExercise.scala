package chapter05

/**
 * @author yuting
 * @date 2022/6/3 4:49 PM
 * @version 1.0
 */
object RecursiveExercise {
  def main(args: Array[String]): Unit = {
    val res1 = fib(6)
    println(res1) //8
    val res2 = fun(2)
    println(res2) //7
    val res3 = peach(1)
    println(res3) //1534
  }
  def fib(n:Int): Int = {
    if(n==1||n==2){
      return 1
    }
    return fib(n-1) + fib(n -2 )
  }
  /**
   * 题2：求函数值
   * 已知 f(1)=3; f(n) = 2*f(n-1)+1;
   * 请使用递归的思想编程，求出 f(n)的值?
   */
  def fun(n:Int):Int = {
    if(n == 1){
      return 3
    }
    return 2 * fun(n - 1) + 1
  }
  /**
   * 题3：猴子吃桃子问有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
   * 以后每天猴子都吃其中的一半，然后再多吃一个。
   * 当到第十天时，想再吃时（还没吃），发现只有1个桃子了。问题：最初共多少个桃子？
   */
  def peach(day: Int):Int = {
    if(day == 10){
      return 1
    }else{
      return (peach(day + 1) + 1) * 2
    }
  }
}
