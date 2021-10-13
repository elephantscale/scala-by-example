package com.es.scala.lightbend

import org.scalatest.FunSpec

class TrainTest extends FunSpec {

  describe("Train::constructor") {
    it("should create a Train") {
      val s1 = Station("Piter")
      val s2 = Station("Moskva")
      Train("Express", 9, Seq(s1, s2))
      assert(true)
    }
  }
}
