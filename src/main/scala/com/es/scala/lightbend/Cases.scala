package com.es.scala.lightbend

object Cases {
  def main(argv: Array[String]): Unit = {
    val highNoon = "12:00"

    def whatTimeIs(any: Any): String = any match {
      case `highNoon` => "High noon"
      case Time(12, m) => "Time is " + m + " minutes past 12"
      case Time(h, m) => "Time is " + h + " hours and " + m + " minutes"
      case _ => s"$any is no time"
    }

    println(whatTimeIs(highNoon))
    println(whatTimeIs("12:00"))
    println(whatTimeIs(new Time(12, 1)))
    println(whatTimeIs(new Time(12, 5)))
    println("----------------------")

    def matchSeq[T] (seq: Seq[T]): String = seq match {
      case Seq(1, 2, 3) => "1 to 3"
      case x +: Nil => s"Only element is $x"
      case _ :+x => s"Last element is $x"
      case Nil => "Empty sequence"
      case _ => s"No case"
    }

    println(matchSeq(1 to 3))
    println(matchSeq(Vector(1)))
    println(matchSeq(Array(1, 2, 3, 4)))
    println(matchSeq(Nil))
  }


}
