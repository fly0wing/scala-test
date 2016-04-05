package com.github.dudu.ch2

/**
  * Created by zk on 2016/4/5.
  */
object Exercises4 {
  def main(args: Array[String]) {
    //    for (int i=10;i>=0;i--)System.out.println(i) //java
    for (i <- 0.to(10).reverse) {
      println(i)
    }
  }
}
