import sbt.Keys._
import sbt._

import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object Build extends sbt.Build {

  lazy val d3 =
    project.in(file("d3"))
    .enablePlugins(ScalaJSPlugin)
    .settings(
      name := "scalajs-bindings",
      organization := "com.viagraphs",
      version := "0.0.2-SNAPSHOT",
      scalaVersion := "2.11.4",
      libraryDependencies ++= Seq(
        "org.scala-js" %%% "scalajs-dom" % "0.7.1-SNAPSHOT"
      ),
      jsDependencies ++= Seq(
        "org.webjars" % "d3js" % "3.4.11" / "d3.js"
      )
    )

}