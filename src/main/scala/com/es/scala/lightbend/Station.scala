package com.es.scala.lightbend

case class Station(name: String)

case class Train(info: TrainInfo, kind: String, number: Int, schedule: Seq[(Time, Station)]) {
  require(schedule.take(2).size == 2, "Schedule must contain at least 2 elements")

  val stations: Seq[Station] = schedule.map(_._2)
}

sealed abstract class TrainInfo {
  def number: Int
}

case class InterCityExpress (number: Int, hasWifi: Boolean = false) extends TrainInfo
case class RegionalExpress (number: Int, hasWifi: Boolean = false) extends TrainInfo
case class BavarianRegional (number: Int, hasWifi: Boolean = false) extends TrainInfo