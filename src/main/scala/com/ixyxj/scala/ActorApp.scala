package com.ixyxj.scala

import akka.actor.{Actor, ActorSystem, Props}

/**
  * Created by silen on 2019/2/17 17:18
  * Copyright (c) 2019 in FORETREE
  */
class MyActor extends Actor {
  override def receive: Receive = {
    case s: String => println(s)
  }
}


object ActorApp {
  def main(args: Array[String]): Unit = {
    val a = ActorSystem("main").actorOf(Props[MyActor])
    a ! "hello"
  }

}
