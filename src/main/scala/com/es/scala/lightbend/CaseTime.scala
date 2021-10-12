package com.es.scala.lightbend

case class CaseTime (hours: Int = 0, minutes: Int = 0) {

  require(hours >= 0 && hours < 24, "Invalid hours")
  require(minutes >= 0 && minutes < 60, "Invalid minutes")

  val asMinutes = hours * 60 + minutes

  def minus(that: Time): Int = asMinutes - that.asMinutes

  def -(that: Time): Int = minus(that)
}

object CaseTime {
  def fromMinutes(m :Int): Time = {
    val hours = m / 60
    val minutes = m - hours * 60
    new Time(hours, minutes)
  }
}