package com.es.scala.chapter09

import org.scalatest.FunSpec

class CaseClassSquareTest extends FunSpec {
  describe("CaseClassSquare::squareList2") {
    it("should square all values in a list and return a list") {
      val intArray = List(1, 2, 3, 4, 5)
      val intArraySquared = List(1, 4, 9, 16, 25)
      val answer = new CaseClassSquare().squareList2(intArray)
      assert(intArraySquared.sameElements(answer))
    }
  }
  describe("CaseClassSquare::squareList1") {
    it("should square all values in a list and return a list") {
      val intArray = List(1, 2, 3, 4, 5)
      val intArraySquared = List(1, 4, 9, 16, 25)
      val answer = new CaseClassSquare().squareList1(intArray)
      assert(intArraySquared.sameElements(answer))
    }
  }
}


