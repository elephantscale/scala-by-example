package com.es.scala.chapter09

import org.scalatest.FunSpec

class CaseClassSortTest extends FunSpec {
  describe("CaseClassSort::isort") {
    it("should sort an array of integers") {
      val intArray = List(3, 2, 1, 10, 5)
      val intArraySorted = List(1, 2, 3, 5, 10)
      val answer = new CaseClassSort().isort(intArray)
      assert(intArraySorted.sameElements(answer))
    }
  }
}


