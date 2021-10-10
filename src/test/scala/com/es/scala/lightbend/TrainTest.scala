package com.es.scala.lightbend

import org.scalatest.FunSpec

class TrainTest extends FunSpec {

  describe("Train::constructor") {
    it("should create a Train") {
      new Train(9)
      assert(true)
    }
  }
}
