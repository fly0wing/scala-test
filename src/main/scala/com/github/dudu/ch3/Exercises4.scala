package com.github.dudu.ch3

import scala.collection.mutable.ArrayBuffer

/**
  * Created by zk on 2016/4/5.
  */
object Exercises4 {
  // 正数在前，其他在后，相对顺序不变
  def main(args: Array[String]): Unit = {
    val l = System.currentTimeMillis()
    val arr = Array(-7, 2, 0, -4, 5)
    println(arr)
    println(arr.toBuffer)
    var arr_copy: Array[Int] = Array()
    for (i <- 0.to(100000000)) {
//      arr_copy = sigNumArr2(arr) //7018
//            arr_copy = sigNumArr4(arr) //17623
//            arr_copy = sigNumArr3(arr) //20467
            arr_copy = sigNumArr(arr)  //24390
//            arr_copy = sigNumArr5(arr) //28087
    }

    val l2 = System.currentTimeMillis()
    println(l2 - l)
    println(arr_copy.mkString(","))
    println(arr)
    println(arr.toBuffer)
  }

  def sigNumArr5(arr: Array[Int]) = {
    val b = arr.filter(_ > 0)
    val c = arr.filter(_ <= 0)
    b ++ c
  }

  def sigNumArr4(arr: Array[Int]): Array[Int] = {
    val a = ArrayBuffer[Int]()
    val b = ArrayBuffer[Int]()
    arr.foreach(arg => if (arg > 0) a += arg else b += arg)
    a ++= b
    a.toArray
  }

  def sigNumArr3(arr: Array[Int]): Array[Int] = {
    val arr_copy = new Array[Int](arr.length)
    val indexs = for (i <- 0.until(arr.length) if arr(i) > 0) yield i

    var length: Int = indexs.length
    for (j <- 0 until length) {
      arr_copy(j) = arr(indexs(j))
    }
    //    println(arr_copy.toBuffer)

    for (i <- 0.until(arr.length) if arr(i) <= 0) {
      arr_copy(length) = arr(i)
      length += 1
    }
    arr_copy
  }

  def sigNumArr2(arr: Array[Int]): Array[Int] = {
    val indexs = new Array[Int](arr.length)
    val result = new Array[Int](arr.length)
    var indexs_idx = 0
    for (i <- arr.indices) {
      if (arr(i) > 0) {
        indexs(indexs_idx) = i
        indexs_idx += 1
      }
    }

    for (i <- 0 until indexs_idx) {
      result(i) = arr(indexs(i))
    }

    for (anArr <- arr) {
      if (anArr <= 0) {
        result(indexs_idx) = anArr
        indexs_idx += 1
      }
    }
    result
    //        System.out.println(Arrays.toString(result));
  }

  def sigNumArr(arr: Array[Int]) = {
    val buf = new ArrayBuffer[Int]()
    buf ++= (for (i <- arr if i > 0) yield i)
    buf ++= (for (i <- arr if i <= 0) yield i)
    //    buf ++= (for (i <- arr if i < 0) yield i)
    buf.toArray
  }
}
