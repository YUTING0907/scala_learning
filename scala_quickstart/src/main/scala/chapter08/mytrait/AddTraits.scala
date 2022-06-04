package chapter08.mytrait

/**
 * @author yuting
 * @date 2022/6/4 5:07 PM
 * @version 1.0
 */
object AddTraits {
  def main(args: Array[String]): Unit = {
    val mysql = new MySQL4 with DB4 with File4
    println("------------------------------------------------------")
    
    mysql.insert(10000000)
  }
}

trait Operate4{
  println("Operate4...")
  // 抽象方法
  def insert(id: Int)
}

trait Data4 extends Operate4{
  println("Data4")

  override def insert(id: Int): Unit = {
    println("插入数据 = " + id)
  }
}

trait DB4 extends Data4{
  println("DB4")

  //重写 Data4 的insert
  override def insert(id: Int): Unit = {
    println("向数据库")
    super.insert(id)
  }
}

trait File4 extends Data4{
  println("File4")

  // 重写 Data4 的insert
  override def insert(id: Int): Unit = {
    println("向文件")
    //super.insert(id) //调用了insert方法(难点)，这里super在动态混入时，不一定是父类
    //如果我们希望直接调用Data4的insert方法，可以指定，如下
    //说明：super[?] ?的类型，必须是当前的特质的直接父特质(超类)
    super[Data4].insert(id)
  }
}

class MySQL4{} //普通类