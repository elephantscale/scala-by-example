package com.es.scala.lightbend

import org.scalatest.FunSpec

class TimeTest extends FunSpec {

  describe("Time::minus") {
    it("should correctly calculate minus") {
      val time = new Time(10, 10)
      val time1 = new Time(1,1)
      assertResult(549) { time.minus(time1) }
      assertResult(549) { time minus time1 } // use minus as operator
      assertResult(549) { time - time1 } // use - as operator
      assertResult(549) { time.-(time1) } // use .- as operator
    }
  }
  describe("Time constructor with defaults") {
    it ("Should allow skipping arguments") {
      val time = new Time
      assert(new Time(1).hours == 1)
      assert(new Time(2,2 ).minutes == 2)
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
  describe("Formatting with toString") {
    it ("should correctly format with overridden toString") {
      val toStringTest = new Time(4, 5).toString()
      assert(toStringTest == "04:05")
    }
  }
}
