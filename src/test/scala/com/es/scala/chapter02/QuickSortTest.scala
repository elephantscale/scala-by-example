package com.es.scala.chapter02

import org.scalatest.FunSpec

class QuickSortTest extends FunSpec {

  describe("QuickSort1::sort") {
    it("should sort an array of integers") {
      val intArray = Array(3, 2, 1, 10, 5)
      val intArraySorted = Array(1, 2, 3, 5, 10)
      new QuickSort1().sort(intArray)
      assert(intArray.sameElements(intArraySorted))
    }
  }

  describe("QuickSort2::sort") {
    it("should sort an array of integers") {
      val intArray = Array(3, 2, 1, 10, 5)
      val intArraySorted = Array(1, 2, 3, 5, 10)
      new QuickSort2().sort(intArray)
      assert(new QuickSort2().sort(intArray).sameElements(intArraySorted))
    }
  }
}
