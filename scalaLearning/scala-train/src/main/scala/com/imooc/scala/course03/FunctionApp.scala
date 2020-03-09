package com.imooc.scala.course03

object FunctionApp {
  def main(args: Array[String]): Unit = {
    println(add(2,3))
    println(three)//没有入参。括号可以省略

    sayName("123")
  }

  def add(x:Int,y:Int):Int ={
    x+y
  }

  def three() = 1+2

  def sayName(name:String ="PK"): Unit ={
    println(name)
  }


}
