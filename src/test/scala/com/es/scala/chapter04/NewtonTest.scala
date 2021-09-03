package com.es.scala.chapter04

import org.scalatest.FunSpec

import scala.math.abs

class NewtonTest extends FunSpec {

  describe("NewtonTest::sqrt") {
    it("extracts square root") {
      assert(abs(new Newton().sqrt(4) - 2) < .1)
    }
  }

  describe("Newton1Test::sqrt") {
    it("extracts square root") {
      assert(abs(new Newton1().sqrt(4) - 2) < .1)
    }
  }
  describe("Newton2Test::sqrt") {
    it("extracts square root") {
      assert(abs(new Newton2().sqrt(4) - 2) < .1)
    }
  }
  describe("Newton3Test::sqrt") {
    it("extracts square root") {
      assert(abs(new Newton3().sqrt(4) - 2) < .1)
    }
  }
  describe("Newton4Test::sqrt") {
    it("extracts square root") {
      assert(abs(new Newton4().sqrt(4) - 2) < .1)
    }
  }
}


