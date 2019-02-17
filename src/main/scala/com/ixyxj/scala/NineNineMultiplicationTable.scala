package com.ixyxj.scala

/**
  * Created by silen on 2019/2/16 23:48
  * Copyright (c) 2019 in FORETREE
  * 九九乘法表
  */
object NineNineMultiplicationTable {

  def main(args: Array[String]): Unit = {

    for (a <- 1 until 10; b <- 1 to 10) {
      if (a >= b) {
        print(a + "x" + b + "=" + a*b + "\t")
      }
      if (a == b) {
        println()
      }
    }
  }

}
