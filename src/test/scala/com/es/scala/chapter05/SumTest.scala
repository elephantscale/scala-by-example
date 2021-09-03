package com.es.scala.chapter05

import org.scalatest.FunSpec


class SumText extends FunSpec {

  describe("Sum::sum") {
    it("sum the numbers") {
      assert(new Sum().sum(x => x, 3, 5) == 12)
    }
    it("sum squares") {
      assert(new Sum().sum(x => x * x, 3, 4) == 25)
    }
    it("sum the numbers, just be written shorter") {
      assert(new Sum1().sum(x => x)(3, 5) == 12)
    }
    it("sum the numbers, shorter yet!") {
      assert(new Sum2().sum(x => x)(3, 5) == 12)
    }
    it("sum the numbers in tail recursive way") {
      assert(new Sum3().sum(x => x)(3, 5) == 12)
    }
    it("multiply numbers of an interval") {
      assert(new Product().product(x => x)(3, 5) == 60)
    }
  }
}
