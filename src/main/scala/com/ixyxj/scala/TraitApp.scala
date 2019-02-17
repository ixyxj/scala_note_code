package com.ixyxj.scala

/**
  * Created by silen on 2019/2/17 16:22
  * Copyright (c) 2019 in FORETREE
  */
trait Calculation {
  def area(point: Point): Int = {
    point.x * point.y
  }
}

class Point(xx: Int, yy: Int) extends Calculation {
  val x = xx
  val y = yy
}


object TraitApp {
  def main(args: Array[String]): Unit = {

    val p = new Point(1, 2)
    println(p.area(p))

  }
}
