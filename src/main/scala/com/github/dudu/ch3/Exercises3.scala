package com.github.dudu.ch3

/**
  * Created by zk on 2016/4/5.
  */
object Exercises3 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5)
    println(arr)
    println(arr.toBuffer)
    for (i <- 1.until(arr.length, 2)) yield {
      var tmp = arr(i)
      arr(i) = arr(i - 1)
      arr(i - 1) = tmp
    }
    println(arr)
    println(arr.toBuffer)
  }
}
