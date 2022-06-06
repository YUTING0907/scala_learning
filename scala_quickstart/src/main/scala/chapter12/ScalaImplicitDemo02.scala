package chapter12

/**
 * @author yuting
 * @date 2022/6/6 10:22 AM
 * @version 1.0
 */
object ScalaImplicitDemo02 {
  def main(args: Array[String]): Unit = {
    /**
     * 隐式函数，丰富MYSQL功能
     * @param mysql
     * @return
     */
    implicit def addDelete(mysql: MySQL):DB = {
      new DB
    }

    val mysql = new MySQL
    mysql.insert()

    // 编译器工作，addDelete$1(mysql).delete()
    mysql.delete()
    mysql.update()

  }
}

class MySQL{
  def insert():Unit = {
    println("insert")
  }
}

class DB{
  def delete()={
    println("deleted")
  }

  def update()={
    println("update")
  }
}

class Dog{

}