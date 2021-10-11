package com.es.scala.lightbend

import org.scalatest.FunSpec

class HelloTest extends FunSpec {

  describe("Hello::constructor") {
    it("should create a Hello") {
      new Hello("Well, hello")
      assert(true)
    }
    it ("Should create a parameterless constructor") {
      new Hello
    }
    it ("Should allow access to class members") {
      val hello = new Hello
      println("Hello toString: " + hello.greeting)
    }
    it ("Should allow write access to class members") {
      val hello = new Hello
      hello.greeting = "This is my letter to the world"
      println("Hello toString: " + hello.greeting)
    }

  }
}