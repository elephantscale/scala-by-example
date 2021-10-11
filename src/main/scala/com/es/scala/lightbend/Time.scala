package com.es.scala.lightbend

class Time (val hours: Int = 0, val minutes: Int = 0) {

  require(hours >= 0 && hours < 24, "Invalid hours")
  require(minutes >= 0 && minutes < 60, "Invalid minutes")

  val asMinutes = hours * 60 + minutes

  def minus(that: Time): Int = asMinutes - that.asMinutes

  def -(that: Time): Int = minus(that)
}

object Time {
  def fromMinutes(m :Int): Time = {
    val hours = m / 60
    val minutes = m - hours * 60
    new Time(hours, minutes)
  }
}