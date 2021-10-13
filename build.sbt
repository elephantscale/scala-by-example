name := "ScalaExamples"

version := "1.0"

scalaVersion := "2.13.6"

// libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)

scalacOptions += "-feature"
