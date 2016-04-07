package com.github.dudu.ch2

/**
  * Created by zk on 2016/4/5.
  */
object Exercises9 {
  def mutiStr(str: String): Long = {
    var result = 1
    //    str.map()
    if (str != "s") {
      mutiStr("s")
    } else{
      0
    }
  }

  def main(args: Array[String]) {
    println(mutiStr("Hello"))
  }
}
