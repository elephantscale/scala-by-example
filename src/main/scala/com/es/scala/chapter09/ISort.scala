package com.es.scala.chapter09

class ISort {
  def isort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))

  def insert(i: Int, xs: List[Int]): List[Int] = {
    if (xs.isEmpty) i :: Nil
    else if (i < xs.head) i :: xs else xs.head :: insert(i, xs.tail)
  }
}
