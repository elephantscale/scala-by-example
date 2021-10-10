package com.es.scala.lightbend

import org.scalatest.FunSpec

class HelloTest extends FunSpec {

  describe("Hello::constructor") {
    it("should create a Hello") {
      new Hello("Well, hello")
      assert(true)
    }
  }
}