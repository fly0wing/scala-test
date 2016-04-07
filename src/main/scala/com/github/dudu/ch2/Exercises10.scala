package com.github.dudu.ch2

/**
  * Created by zk on 2016/4/5.
  */
object Exercises10 {
  // x 的n次方
  def xn(x: Double, n: Int): Double = {
    if (n > 0) {
      if ((n & 1) == 1) {
        //奇数
        x * xn(x, n - 1)
      } else {
        //偶数
        xn(x, n / 2) * xn(x, n / 2)
      }
    } else if (n == 0) {
      1
    } else {
      1 / xn(x, -n)
    }
  }

  def main(args: Array[String]) {
    println(xn(2, -2))
    println(xn(2, -1))
    println(xn(2, 0))
    println(xn(2, 1))
    println(xn(2, 2))
    println(xn(2, 3))
    println(xn(2, 4))
  }
}
