package com.es.scala.lightbend

class Hello (private var _greeting: String) {
  def this() = this("Hello")
  def greeting=_greeting
  def greeting_=(newGreeting: String) {
    _greeting = newGreeting
  }
}

