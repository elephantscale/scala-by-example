package com.es.scala.lightbend

class Hello (private var _greeting: String) {
  println("Constructor with greeting: " + _greeting)
  def this() = this("Hello")
  def greeting=_greeting
  def greeting_=(newGreeting: String) {
    _greeting = newGreeting
    println("Setting a greeting in Hello to: " + newGreeting)
  }
}

