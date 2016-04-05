package com.github.dudu.ch2

/**
  * Created by zk on 2016/4/5.
  */
object Exercises1 {
  def compute(num: Int): Int = {
    if (num > 0) 1
    else if (num < 0) -1
    else 0
  }

  def main(args: Array[String]): Unit = {
    println(compute(1))
    println(compute(0))
    println(compute(-1111))
  }
}
