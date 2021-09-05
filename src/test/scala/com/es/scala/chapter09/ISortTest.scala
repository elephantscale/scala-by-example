package com.es.scala.chapter09
import org.scalatest.FunSpec

class ISortTest extends FunSpec {
  describe("ISort::sort") {
    it("should sort an array of integers") {
      val intArray = List(3, 2, 1, 10, 5)
      val intArraySorted = List(1, 2, 3, 5, 10)
      val answer = new ISort().isort(intArray)
      assert(intArraySorted.sameElements(answer))
    }
  }
}


