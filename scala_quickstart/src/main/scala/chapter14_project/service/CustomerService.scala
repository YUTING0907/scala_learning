package chapter14_project.service

import chapter14_project.dao.Customer

import scala.collection.mutable.ListBuffer
import scala.io.StdIn
import scala.util.control.Breaks.{break, breakable}

/**
 * @author yuting
 * @date 2022/6/6 10:54 AM
 * @version 1.0
 */
class CustomerService {
  val customer1 = new Customer(1, 18, "tom", '男', "14725836995", "tom@qq.com")
  val customer2 = new Customer(2, 18, "jac", '男', "15869951472", "jac@qq.com")

  var customerInfo = new ListBuffer[Customer]()
  var customerId = 3

  customerInfo.append(customer1)
  customerInfo.append(customer2)

  /**
   * 获取顾客信息：
   */
  def getCustomerInfo() = {
    println(Console.BLUE + "客户列表：")
    println("编号\t\t年龄\t\t姓名\t\t性别\t\t电话\t\t邮箱")
    for(customer <- customerInfo){
      println(customer.toString)
    }
    println("客户列表显示完毕...\n.....................................")
  }

  def addCustomerInfo() ={
    println(Console.GREEN + "添加客户：")
    println("请依次输入用户信息：")
    println("姓名：")
    val name = StdIn.readLine()
    println("年龄：")
    val age = StdIn.readShort()
    println("性别：")
    val gender = StdIn.readChar()
    println("电话：")
    val tel = StdIn.readLine()
    println("邮箱：")
    val email = StdIn.readLine()
    //构建对象
    val customer = new Customer(customerId, age, name, gender, tel, email)
    customerId += 1
    customerInfo.append(customer)
    println("添加客户信息完成！\n")
  }

  /**
   * 删除顾客信息
   */
  def delCustomerInfo(): Unit = {
    println(Console.YELLOW + "删除客户操作:")
    println("请选择待删除客户编号(-1退出)：")
    val id = StdIn.readInt()
    if(id == -1){
      println("退出删除操作")
      return
    }
    println("确认是否删除(Y/N)：")
    var choice = ' '
    breakable{
      do{
        choice = StdIn.readChar().toLower
        if(choice == 'y' || choice == 'n'){
          break()
        }
      }while(true)
    }

    if(choice=='y'){
      if(del(id)){
        println("删除完成！")
        return
      }
    }
    println("删除失败！")
  }

  /**
   * 根据id删除用户信息
   * @param id
   * @return
   */
  def del(id:Int):Boolean = {
    val index = findIndexById(id)
    if(index == -1){
      false
    }else{
      customerInfo.remove(index)
      true
    }
  }

  /**
   * 根据id找到customerInfo的index
   * @param id
   * @return
   */
  def findIndexById(id:Int) = {
    var index = -1
    breakable{
      for(i<- 0 until customerInfo.length){
        if(customerInfo(i).id == id){
          index = i
          break()
        }
      }
    }
    index
  }

  def updateCustomerInfo():Unit={
    println(Console.CYAN + "修改客户操作:")
    println("请选择待修改客户编号(-1退出)：")
    val id = StdIn.readInt()
    if(id == -1){
      println("退出修改操作")
      return
    }

    val index = findIndexById(id)
    if(index == -1){
      println("请输入正确的客户id!")
      return
    }else{
      println("请依次输入新的用户信息：")
      println("姓名(" + customerInfo(index).name + ")：")
      customerInfo(index).name = StdIn.readLine()
      println("年龄(" + customerInfo(index).age + ")：")
      customerInfo(index).age = StdIn.readShort()

      println("性别(" + customerInfo(index).gender + ")：")
      customerInfo(index).gender = StdIn.readChar()

      println("电话(" + customerInfo(index).phone + ")：")
      customerInfo(index).phone = StdIn.readLine()

      println("邮箱(" + customerInfo(index).email + ")：")
      customerInfo(index).email = StdIn.readLine()
      println("修改用户信息完成！")
      return
    }

  }




}
