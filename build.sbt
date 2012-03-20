name := "Scala Guice"

organization := "uk.me.lings"

version := "3.0.1"

libraryDependencies += "com.google.inject" % "guice" % "3.0"

libraryDependencies += "org.scalatest" % "scalatest_2.9.0" % "1.4.1" % "test"

crossScalaVersions := Seq("2.8.0", "2.8.1", "2.9.1")

publishTo := Some(Resolver.file("file",  new File("repo")))
