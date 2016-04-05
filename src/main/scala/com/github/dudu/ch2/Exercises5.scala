package com.github.dudu.ch2

/**
  * Created by zk on 2016/4/5.
  */
object Exercises5 {
  def countdown(n: Int): Unit = {
    for (i <- 0.to(n).reverse) {
      println(i)
    }
  }

  def main(args: Array[String]) {
    countdown(15)
  }
}
