package com.ixyxj.scala

/**
  * Created by silen on 2019/2/17 15:53
  * Copyright (c) 2019 in FORETREE
  */
object CollectionApp {
  def main(args: Array[String]): Unit = {

    // list
    val list = List("hi 1", "hi 2", "hi 3")
    val result = list.map( f => {
      f.split(" ")
    })

    result.foreach(a => {
      println("+++++++++")
      a.foreach(println)
    })

    //Array
//    val arr = Array[Int](1,2,3,4)
//    arr.foreach(println)
//
//    val arr2 = new Array[String](3)





  }
}
