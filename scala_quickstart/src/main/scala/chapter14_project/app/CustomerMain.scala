package chapter14_project.app

import chapter14_project.view.CustomerView

/**
 * @author yuting
 * @date 2022/6/6 11:16 AM
 * @version 1.0
 */
object CustomerMain {
  def main(args: Array[String]): Unit = {
    // 程序的入口
    new CustomerView().mainMenu()
  }
}
