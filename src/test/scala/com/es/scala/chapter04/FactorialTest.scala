package com.es.scala.chapter04

import org.scalatest.FunSpec

class FactorialTest extends FunSpec {

  describe("FactorialTest::factorial") {
    it("should calculate factorial") {
      assert(new Factorial().factorial(5) == 120)
    }
  }

  describe("FactorialTest::factorialR") {
    it("should calculate factorial") {
      assert(new Factorial().factorialR(5) == 120)
    }
  }
}
