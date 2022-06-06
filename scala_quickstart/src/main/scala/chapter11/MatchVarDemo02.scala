package chapter11

/**
 * @author yuting
 * @date 2022/6/5 10:55 PM
 * @version 1.0
 */
object MatchVarDemo02 {
  def main(args: Array[String]): Unit = {
    val(x,y,z) = (1,2,"Helllo")

    println(s"x = $x\ny = $y\nz = $z\n")
    val (i, j) = BigInt(10) /% 3
    println(s"i = $i\nj = $j")

    val arr = Array(1, 3, 5, 7, 9)
    // 提出 arr 的前两个元素
    val Array(first,second,_*) = arr

    /**
     * first = 1
     * second = 3
     */
    println(s"first = $first \nsecond = $second")
  }
}
