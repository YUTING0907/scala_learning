package chapter08.mytrait

/**
 * @author yuting
 * @date 2022/6/4 6:46 PM
 * @version 1.0
 */
object MixInDemo01 {
  def main(args: Array[String]): Unit = {
    // ocp原则
    // 在不修改 类的定义基础，让他们可以使用trait方法
    val orcaleDB = new OracleDB with Operate3
    orcaleDB.insert(100)

    val mySQL = new MySQL3 with Operate3
    mySQL.insert(200)

    //如果一个抽象类有抽象方法，如何动态混入特质
    val mySql_ = new MySQL3_ with Operate3{
      override def say(): Unit ={
        println("sqy-")
      }
    }

    mySql_.insert(999)
    mySql_.say()
  }
}

trait Operate3{
  def insert(id: Int): Unit ={
    println("插入数据 = " + id)
  }
}

class OracleDB{
}

abstract class MySQL3{
}

abstract class MySQL3_{
  def say()
}