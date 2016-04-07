package com.github.dudu.ch2

/**
  * Created by zk on 2016/4/5.
  */
object Exercises9 {
  def product(str: String): Long = {
    //    if (str.length == 1) {
    //      str.charAt(0)
    //    } else {
//          str.charAt(0).toLong * product(str.substring(1))
    //    }
    //
    if (str.length == 1)
      str.charAt(0).toLong
    else
      str.take(1).charAt(0).toLong * product(str.drop(1))
  }

  def main(args: Array[String]) {
    println(product("Hello"))
  }
}
