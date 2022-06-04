package chapter07.scalaoop

/**
 * @author yuting
 * @date 2022/6/4 11:40 AM
 * @version 1.0
 */
object BankDemo {
  def main(args: Array[String]): Unit = {
    val acc = new Account("1021", 999999, "1015")
    acc.query("1015")

    val balance = acc.withDraw("1015", 9999)
    println("取出后的余额：" + balance)
  }
}

/**
 * 编写一个Account类
 *
 * @param inAccount 主构造器形参
 * @param inBalance 主构造器形参
 * @param inPwd     主构造器形参
 */
class Account(inAccount:String,inBalance:Double,inPwd: String){
  /**
   * 属性：账号，余额，密码
   * 方法:查询,取款,存款
   */
  private val accountNo = inAccount
  private var balance = inBalance
  private var pwd = inPwd

  def query(pwd:String):Unit = {
    if(!this.pwd.equals(pwd)){
      println("密码错误")
      return
    }

    printf("账号为%s 当前余额是%.2f\n", this.accountNo, this.balance)
  }

  def withDraw(pwd:String,money:Double):Any = {
    if (!this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }
    //判断money是否合理
    if (this.balance < money) {
      println("余额不足")
      return
    }
    this.balance -= money
    this.balance
  }
}
