package com.es.scala.lightbend

case class Station(name: String)

case class Train(kind: String, number: Int, schedule: Seq[(Time, Station)]) {
  require(schedule.take(2).size == 2, "Schedule must contain at least 2 elements")

  val stations: Seq[Station] = schedule.map(_._2)
}