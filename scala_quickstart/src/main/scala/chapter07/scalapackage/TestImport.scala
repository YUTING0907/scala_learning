package chapter07.scalapackage

import scala.collection.mutable

/**
 * @author yuting
 * @date 2022/6/4 11:16 AM
 * @version 1.0
 */
object TestImport {
  def main(args: Array[String]): Unit = {
    // 可以使用选择器，选择引入包的内容，这里，我们只引入HashMap, HashSet
    import scala.collection.mutable.{HashMap,HashSet}
    var map = new HashMap()
    var set = new HashSet()
  }

  def testImport1():Unit = {
    // 下面的含义是将java.util.HashMap重命名为JavaHashMap
    import java.util.{HashMap=> JavaHashMap}
    import scala.collection.mutable._
    var map = new HashMap()//此时的HashMap指向的是scala中的HashMap
    var jMap = new JavaHashMap()//此时使用的java 中hashMap的别名
  }

  def testImport2():Unit = {
    import java.util.{HashMap=>_,_}
    // 含义为引入java.util 包的所有类，但是忽略HahsMap类
    var map = new mutable.HashMap()
  }
}
