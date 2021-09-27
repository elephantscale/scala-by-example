package com.es.scala.chapter06

import org.scalatest.FunSpec


//class SetTest extends Specification {
//  "com.es.scala.chapter06.IntSet" should {
//    "verify that no element belongs to EmptySet" in {
//      new EmptySet().contains(1) must beFalse
//    }
//    "verify that correct elements belong to NonEmptySet" in {
//      val set = new EmptySet
//      val set1 = set.incl(3)
//      set1.contains(1) must beFalse
//      set1.contains(3) must beTrue
//    }
//  }
//}

class ExprTest extends FunSpec {
  describe("Set::contain") {
    it ("checks element containment") {
      pending
    }
  }
}