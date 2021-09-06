package com.es.scala.chapter09

import scala.annotation.tailrec

class MyList[T] (list: List[T]) {
  val countList = Nil
  @tailrec
  final def length(soFar: Int, x: List[T]): (Int, List[T]) = x match {
    case Nil => (soFar, Nil)
    case y :: ys => length(soFar + 1, ys)
  }
}

