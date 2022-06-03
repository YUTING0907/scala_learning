package chapter05

/**
 * @author yuting
 * @date 2022/6/3 4:27 PM
 * @version 1.0
 */
object FunctionDetails05 {
  def main(args: Array[String]): Unit = {
    mysqlCon()
    println("--------------------------")
    // 从左到右覆盖
    mysqlCon("127.0.0.1", 777)
    println("--------------------------")
    // 如果我们希望指定覆盖某个默认值，则使用带名参数即可,比如修改用户名和密码
    mysqlCon(user = "ddaimm", pwd = "1021")
    println("**************************")

    fun(p2 = "v2")
    //fun("v2)报错
  }

  def mysqlCon(add:String = "localhost", port: Int = 3306
              ,user:String = "root", pwd:String = "root"):Unit={
    println("add=" + add)
    println("port=" + port)
    println("user=" + user)
    println("pwd=" + pwd)
  }

  def fun(p1:String = "v1", p2: String): Unit ={
    println(p1 + p2)
  }
}
