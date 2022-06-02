package chapter03

/**
 * @author yuting
 * @date 2022/6/2 11:02 PM
 * @version 1.0
 */
object DataTypeConvertExercise {
  def main(args: Array[String]): Unit = {
    /**
     * 假如还有97天放假，问：xx个星期零xx天
     */
    val days = 97
    printf("%d个星期零%d天", days / 7, days % 7)
    println()
    /**
     * 定义一个变量保存华氏温度，
     * 华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100),
     * 请求出华氏温度对应的摄氏温度。[测试：232.5]
     */
    val huashi = 232.5
    val shesi = 5.0 / 9 * (huashi - 100)
    printf("232.5华氏度等于%.2f摄氏度",shesi)
  }
}
