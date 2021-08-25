package com.es.scala.chapter02

object MainCh02 {
  def main(args: Array[String]): Unit = {
    // Note that QuickSort1 changes the input array - not functional programming
    val intArray1 = Array(3, 2, 1, 10, 5)
    println("Testing QuickSort1")
    println(intArray1.mkString(" "))
    println("After sorting")
    new QuickSort1().sort(intArray1)
    println(intArray1.mkString(" "))
    println("Testing QuickSort2")
    val result = new QuickSort2().sort(intArray1)
    println(result.mkString(" "))
  }
}
