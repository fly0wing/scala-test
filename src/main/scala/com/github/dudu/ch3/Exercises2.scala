package com.github.dudu.ch3

import scala.util.Random

/**
  * Created by zk on 2016/4/5.
  */
object Exercises2 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5)
    println(arr.toBuffer)
    for (i <- 1.until(arr.length, 2)) {
      var tmp = arr(i)
      arr(i) = arr(i - 1)
      arr(i - 1) = tmp
    }
    arr.toBuffer.foreach(print)
    println
    println(arr.mkString(","))
  }
}
