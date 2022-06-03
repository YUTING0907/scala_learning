package chapter04

import scala.io.StdIn

/**
 * @author yuting
 * @date 2022/6/3 10:05 AM
 * @version 1.0
 */
object Exercise02 {
  /**
   * 2.统计三个班及格人数，每个班有5名同学。
   */
  def main(args: Array[String]): Unit = {
    val classNum = 3
    val stuNum = 5
    var score = 0.0 //分数
    var classScore = 0.0
    var passNum = 0
    var totalScore = 0.0
    for(i<-1 to classNum){
      //先将 classScore 清0
      classScore = 0.0
      for(j<-1 to stuNum){
        printf("请输入第%d班级的第%d个学生的成绩\n", i, j)
        score = StdIn.readDouble()
        if(score>=60){
          passNum+=1
        }
        classScore += score
      }
      //累计 totalScore
      totalScore += classScore
      printf("第%d班级的平均分为%.2f\n", i, classScore / stuNum)
    }
    printf("所有班级的平均分为%.2f", totalScore / (stuNum * classNum))
    printf("所有班级的及格人数为%d", passNum)
  }
}
