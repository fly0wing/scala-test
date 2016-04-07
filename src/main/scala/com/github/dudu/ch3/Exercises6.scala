package com.github.dudu.ch3

import scala.collection.mutable.ArrayBuffer

/**
  * Created by zk on 2016/4/5.
  */
object Exercises6 {
  def main(args: Array[String]): Unit = {
    val a = Array(1, -2, 0, -3, 0, 4, 5);
    println(a.reverse.mkString(","))
    val b = ArrayBuffer(1, -2, 0, -3, 0, 4, 5);
    println(b.reverse.mkString(","))
  }

}
