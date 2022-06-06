package chapter14_project.dao

/**
 * @author yuting
 * @date 2022/6/6 10:48 AM
 * @version 1.0
 */
class Customer {
  /**
   * 客户信息
   */
  var id:Int = _
  var age: Int = _
  var name: String = _
  var gender: Char = _
  var phone: String = _
  var email: String = _

  /**
   * 辅助构造器
   * @param id
   * @param age
   * @param name
   * @param gender
   * @param phone
   * @param email
   */
  def this(id: Int,age:Int, name:String,gender: Char, phone: String,email:String){
    this
    this.id = id
    this.age = age
    this.name = name
    this.gender = gender
    this.phone = phone
    this.email = email
  }

  def this(age: Int, name: String, gender: Char, phone: String, email: String){
    this
    this.age = age
    this.name = name
    this.gender = gender
    this.phone = phone
    this.email = email
  }

  /**
   * 重写toString方法
   * @return
   */
  override def toString: String = {
    this.id + "\t\t" + this.age + "\t\t" + this.name + "\t\t" + this.gender + "\t\t" + this.phone + "\t\t" + this.email
  }


}
