package com.es.scala.chapter08

import org.scalatest.FunSpec


class StackTest extends FunSpec {
  describe("Stack::isEmpty") {
    it("new Stack should be empty") {
      assert(new EmptyStack[Int]().isEmpty)
    }
  }

  describe("Stack::top") {
    it("new Stack should not have top") {
      val thrown = intercept[RuntimeException] {
        new EmptyStack().top
      }
      assert(thrown.getMessage == "EmptyStack.top")
    }
  }

  describe("Stack::push") {
    it("create NonEmptyStack") {
      assert(new NonEmptyStack(1, new EmptyStack()).top == 1)
    }
  }
  describe("Stack::push") {
    it("push and pop") {
      val myStack = new NonEmptyStack(1, new EmptyStack())
      assert(myStack.push(2).pop.top == 1)
    }
  }
}
