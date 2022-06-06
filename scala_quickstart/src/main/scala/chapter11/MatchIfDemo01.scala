package chapter11

/**
 * @author yuting
 * @date 2022/6/5 10:12 PM
 * @version 1.0
 */
object MatchIfDemo01 {
  def main(args: Array[String]): Unit = {
    /**
     * 是对"+-3!" 遍历
     */
    for(ch <- "+-3!"){
      var sign = 0
      var digit = 0
      // 模式匹配
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        /**
         * 如果 case 后有 条件守卫即if ,那么这时的 _ 不是表示默认匹配
         * 表示忽略传入的 ch
         */
        case _ if ch.toString.equals("3") => digit = 3
        case _ => sign = 2
      }
      println(s"\nch = $ch \nsign = $sign \ndigit = $digit")
    }
  }
}
