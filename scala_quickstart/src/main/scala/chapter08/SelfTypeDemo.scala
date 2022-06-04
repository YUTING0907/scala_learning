package chapter08

/**
 * @author yuting
 * @date 2022/6/4 7:05 PM
 * @version 1.0
 * 自身类型跟继承和特征MixIn类似
 * 语法：_: User (类或者特征)=>
 */
object SelfTypeDemo {
  def main(args: Array[String]): Unit = {
    println("-------------------------------------- ")
    val u = new RegisterUser("catholly", "nephren")
    u.insert()
  }
}

/**
 * Logger就是自身类型特质,当这里做了自身类型后，那么
 * trait Logger extends Exception,要求混入该特质的类也是 Exception子类
 */
trait Logger{
  // 明确告诉编译器，我就是Exception,如果没有这句话，下面的getMessage不能调用
  /**
   * 语法，在类或特征中：_: SelfType =>，其中_的位置是别名定义，
   * 也可以是其他，_指代this。插入后就可以用this.xxx来访问自身类型中的属性和方法了。
   */
  this: Exception =>
  def log(): Unit ={
    println(getMessage)
  }
}

class Console extends Exception with Logger{}
//class Console extends  Logger {} 报错


class User(val name: String,val password: String)
// user database access object
trait UserDao{
  // dependency injection from external
  _: User => // self type
  // simulate insert data to databse
  def insert(): Unit ={
    println(s"insert into db: $name $password")
  }
}

//register user
class RegisterUser(name:String,password:String) extends User(name, password) with UserDao


