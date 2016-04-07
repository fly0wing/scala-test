package com.github.dudu.ch3

import scala.collection.immutable

/**
  * Created by zk on 2016/4/5.
  */
object Exercises3 {
  def main(args: Array[String]): Unit = {
    var arr = Array(1, 2, 3, 4, 5)
    println(arr)
    println(arr.toBuffer)

    //    revertArr(arr)
    arr = reorderArray(arr)
    println(arr)
    println(arr.toBuffer)
  }

  def revertArr(arr: Array[Int]): IndexedSeq[Unit] = {
    for (i <- 1.until(arr.length, 2)) yield {
      var tmp = arr(i)
      arr(i) = arr(i - 1)
      arr(i - 1) = tmp
    }
  }

  def reorderArray(arr: Array[Int]): Array[Int] = {
    (
      for (i <- 0 until(arr.length, 2)) yield
        if (i + 1 < arr.length)
          Array(arr(i + 1), arr(i))
        else
          Array(arr(i))
      ).flatten.toArray
  }

}
