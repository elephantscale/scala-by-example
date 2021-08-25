package com.es.scala.chapter04

import java.lang.Math.abs

object MainCh04 {
  def main(args: Array[String]): Unit = {
    println("Testing factorial")
    println("5! = " + new Factorial().factorial(5))
    println("Testing factorialR")
    println("5! = " + new Factorial().factorialR(5))
    println("Testing Newton")
    println("abs(new Newton().sqrt(4) - 2) = " + abs(new Newton().sqrt(4) - 2))
    println("abs(new Newton1().sqrt(.01) - .1) = " + abs(new Newton1().sqrt(.01) - .1))
    println("abs(new Newton2().sqrt(.01) - .1) = " + abs(new Newton2().sqrt(.01) - .1))
    println("abs(new Newton3().sqrt(.01) - .1) = " + abs(new Newton3().sqrt(.01) - .1))
    println("abs(new Newton4().sqrt(.01) - .1) = " + abs(new Newton4().sqrt(.01) - .1))
  }
}
