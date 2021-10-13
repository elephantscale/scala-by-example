package com.es.scala.lightbend

import org.scalatest.FunSpec

class TrainTest extends FunSpec {

  describe("Train::constructor") {
    it("should create a Train") {
      val t1 = new Time(12, 0)
      val t2 = new Time(13, 0)
      val s1 = Station("Piter")
      val s2 = Station("Moskva")
      Train("Express", 9, Seq( (t1, s1) , (t2, s2)) )
      assert(true)
    }
  }
}
