name := "scala-z-hello"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

scalacOptions := Seq(
    "-feature",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:postfixOps",
    "-language:existentials",
    "-deprecation",
    "-unchecked")

libraryDependencies ++= Seq(
			    "org.scalatest" %% "scalatest" % "2.2.4" % "test"
			   )

