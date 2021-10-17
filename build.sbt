import sbt.Keys.libraryDependencies

name := "ScalaExamples"

version := "1.0"

scalaVersion := "2.13.6"

// libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
    // https://mvnrepository.com/artifact/com.typesafe.play/play-json

)

libraryDependencies ++= Seq(
    "com.typesafe.play" %% "play-json" % "2.9.2"
)



scalacOptions += "-feature"
