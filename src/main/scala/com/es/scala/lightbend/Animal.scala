package com.es.scala.lightbend

abstract class Animal {
  def name = "Bill"
  def eat = {println("Yum")}
}

class Bird extends Animal {
  new Bird().eat
  def fly = {println("I am flying")}
}

trait Swimmer {
  def swim: String = "I am swimming"
}

