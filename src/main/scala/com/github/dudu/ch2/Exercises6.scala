package com.github.dudu.ch2

/**
  * Created by zk on 2016/4/5.
  */
object Exercises6 {
  def mutiStr(str: String): Long = {
    var result=1
    for (i <- str) {
      result *=i
    }
    result
  }

  def main(args: Array[String]) {
    println(mutiStr("Hello"))
  }
}
