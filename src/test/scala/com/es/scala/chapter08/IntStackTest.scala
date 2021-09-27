package com.es.scala.chapter08

import org.scalatest.FunSpec


class IntStackTest extends FunSpec {
  describe("IntStack::isEmpty") {
    it("new IntStack should be empty") {
      assert(new IntEmptyStack().isEmpty)
    }
  }

  describe("IntStack::top") {
    it("new IntStack should not have top") {
      val thrown = intercept[RuntimeException] {
        new IntEmptyStack().top
      }
      assert(thrown.getMessage == "EmptyStack.top")
    }
  }

  describe("IntStack::push") {
    it("create IntNonEmptyStack") {
      assert(new IntNonEmptyStack(1, new IntEmptyStack()).top == 1)
    }
  }
  describe("IntStack::push") {
    it("push and pop") {
      val myStack = new IntNonEmptyStack(1, new IntEmptyStack())
      assert(myStack.push(2).pop.top == 1)
    }
  }
}
