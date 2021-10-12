package com.es.scala.lightbend

import org.scalatest.FunSpec

class CaseTimeTest extends FunSpec {

  describe("CaseTime constructor with defaults") {
    it ("Should allow skipping arguments") {
      val time = CaseTime(1, 1)
      assert(CaseTime(1).hours == 1)
      assert(CaseTime(2,2 ).minutes == 2)
    }
  }
  describe("Time object and class") {
    it ("Should construct Time from minutes") {
      assert(Time.fromMinutes(61).hours == 1)
      assert(Time.fromMinutes(61).minutes == 1)
    }
  }
  describe("Use of require") {
    it ("should throw exceptions for invalid hours") {
      val thrown = intercept[RuntimeException] {
        new Time(-1, 1)
      }
      assert(thrown.getMessage == "requirement failed: Invalid hours")
    }
    it ("should throw exceptions for invalid minutes ") {
      val thrown = intercept[RuntimeException] {
        new Time(0, 60)
      }
      assert(thrown.getMessage == "requirement failed: Invalid minutes")
    }
  }
}
