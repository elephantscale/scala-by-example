package com.es.scala.chapter04

import org.scalatest.FunSpec

class NewtonTest extends FunSpec {

  describe ("FactorialTest::factorial") {
    it ("should calculate factorial") {
      assert(new Factorial().factorial(5) == 120)
    }
  }

  describe ("FactorialTest::factorialR") {
    it ("should calculate factorial") {
      assert(new Factorial().factorialR(5) == 120)
    }
  }

  describe("NewtonTest::sqrt") {
    it("extract square root") {
//      val intArray = Array(3, 2, 1, 10, 5)
//      val intArraySorted = Array(1, 2, 3, 5, 10)
//      new QuickSort1().sort(intArray)
//      assert(intArray == intArraySorted)
    }
  }

//  "com.es.scala.chapter04.Newton" should {
//    "extract square root" in {
//      abs(new Newton().sqrt(4) - 2) must be <= .1
//    }
//  }
//
//  "com.es.scala.chapter04.Newton1" should {
//    "extract square root better for small numbers" in {
//      abs(new Newton1().sqrt(.01) - .1) must be <= .1
//    }
//  }
//
//  "com.es.scala.chapter04.Newton2" should {
//    "extract square root with tracing" in {
//      abs(new Newton2().sqrt(.01) - .1) must be <= .1
//    }
//  }
//
//  "com.es.scala.chapter04.Newton3" should {
//    "also extract sqrt - it is just a rewrite with nested functions" in {
//      abs(new Newton3().sqrt(.01) - .1) must be <= .1
//    }
//  }
//
//  "com.es.scala.chapter04.Newton4" should {
//    "do the same sqrt, just more concise" in {
//      abs(new Newton4().sqrt(.01) - .1) must be <= .1
//    }
//  }
}


