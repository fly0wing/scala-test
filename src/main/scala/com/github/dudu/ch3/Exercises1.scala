package com.github.dudu.ch3

import scala.util.Random

/**
  * Created by zk on 2016/4/5.
  */
object Exercises1 {
  def main(args: Array[String]): Unit = {
    val n = 10
    val a = 1.to(n).map(Random.nextInt)
    println(a)
  }
}
