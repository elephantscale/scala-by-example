package com.es.scala.chapter09

import org.scalatest.FunSpec

class MyListTest extends FunSpec {
  describe("MyList::length") {
    it("should have a tail-recursive version of 'length") {
      val myList = List(3, 2, 1, 10, 5)
      assert(new MyList(myList).length(0, myList)._1 == myList.length)
    }
  }
}


