package com.github.dudu.ch2

/**
  * Created by zk on 2016/4/5.
  */
object Exercises8 {
  def product(str: String): Long = {
    var result: Long = 1
    str.foreach(result *= _)
    result
  }

  def main(args: Array[String]) {
    println(product("Hello"))
  }
}
