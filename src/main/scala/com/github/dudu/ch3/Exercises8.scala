package com.github.dudu.ch3

import scala.collection.mutable

/**
  * Created by zk on 2016/4/5.
  */
object Exercises8 {
  def main(args: Array[String]): Unit = {
    val a = Array(1, -2, 0, -3, 0, 4, 5);
    println(a.mkString(","))
    var arr: Array[Int] = Array()
    val l = System.currentTimeMillis()
    for (i <- 0.to(100000000)) {
//      arr = sigNumArr2(a) //3309
            arr = sigNumArr(a) //5038
    }
    val l2 = System.currentTimeMillis()
    println(l2 - l)
    println(arr.mkString(","))
    println(a.mkString(","))
  }

  def sigNumArr(arr: Array[Int]): Array[Int] = {
    val indexs = for (i <- 0.until(arr.length) if arr(i) < 0) yield i
    var a = indexs.reverse.dropRight(1)

    //    println(indexs.mkString(","))
    //    println(a.mkString(","))

    val toBuffer: mutable.Buffer[Int] = arr.toBuffer
    a.foreach(toBuffer.remove)
    toBuffer.toArray
  }

  def sigNumArr2(arr: Array[Int]): Array[Int] = {
    val arr_copy = new Array[Int](arr.length)
    var first = true
    val indexs = for (i <- 0.until(arr.length) if first || arr(i) >= 0) yield {
      if (arr(i) < 0) first = false; i
    }

    var length: Int = indexs.length
    for (j <- 0 until length) {
      arr(j) = arr(indexs(j))
    }
    val toBuffer: mutable.Buffer[Int] = arr.toBuffer
    toBuffer.trimEnd(arr.length - length)
    toBuffer.toArray
  }
}
