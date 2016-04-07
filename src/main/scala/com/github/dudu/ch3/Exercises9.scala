package com.github.dudu.ch3

import java.util.TimeZone

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * Created by zk on 2016/4/5.
  */
object Exercises9 {
  def main(args: Array[String]): Unit = {
    var ids = TimeZone.getAvailableIDs
    var ids2 = Array[String]()
    val l = System.currentTimeMillis()
    for (i <- 0.to(1000000)) {
      //      ids2 = zoneName(ids) //15993
      //      ids2 = zoneName2(ids) //34103
      //      ids2 = timeZoneName(ids) //11385
      ids2 = timeZoneName2(ids) //9483
    }
    val l2 = System.currentTimeMillis()
    println(l2 - l)
    ids2.foreach(println)
  }

  def timeZoneName2(arr: Array[String]): Array[String] = {
    val tmp = ArrayBuffer[String]()

    for (i <- arr if i.startsWith("America/")) {
      //      tmp += i.substring(8)
      tmp += i.drop("America/".length)
    }
    val array: Array[String] = tmp.toArray
    array.sorted
    array
  }

  def timeZoneName(arr: Array[String]): Array[String] = {
    val tmp = for (i <- arr if i.startsWith("America/")) yield {
      i.drop("America/".length)
    }
    scala.util.Sorting.quickSort(tmp)
    tmp
  }

  def zoneName2(ids: Array[String]): Array[String] = {
    ids.filter(_.take(8) == "America/").map(_.drop(8)).sorted
  }

  def zoneName(ids: Array[String]): Array[String] = {
    ids.filter(_.startsWith("America/")).map(_.drop(8)).sorted
  }
}
