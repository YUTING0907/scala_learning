package chapter14_project.view

import chapter14_project.service.CustomerService

import scala.io.StdIn

/**
 * @author yuting
 * @date 2022/6/6 11:13 AM
 * @version 1.0
 */
class CustomerView {

  var flag = true
  private val customerService = new CustomerService()

  def mainMenu():Unit = {
    do{
      println(Console.RED + "客户信息管理系统：")
      println("\t1 添加客户")
      println("\t2 修改客户")
      println("\t3 删除客户")
      println("\t4 查询客户")
      println("\t5 退出系统")
      println("\t请输入(1-5)__")

      val operNum = StdIn.readInt()
      operNum match {
        case 1 => customerService.addCustomerInfo()
        case 2 => customerService.updateCustomerInfo()
        case 3 => customerService.delCustomerInfo()
        case 4 => customerService.getCustomerInfo()
        case 5 => flag = false
      }
    }while (flag)
    println("已经退出系统....")
  }
}
