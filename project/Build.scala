import sbt.Keys._
import sbt._
import scala.scalajs.sbtplugin.ScalaJSPlugin._
import scala.scalajs.sbtplugin.ScalaJSPlugin.ScalaJSKeys._

object Build extends sbt.Build {

  lazy val d3 = project.in(file("d3"))
    .settings(scalaJSSettings: _*)
    .settings(
      name := "scalajs-bindings",
      organization := "com.viagraphs",
      version := "0.0.1",
      scalaVersion := "2.11.2",
      libraryDependencies ++= Seq(
        "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"
      ),
      jsDependencies ++= Seq(
        "org.webjars" % "d3js" % "3.4.11" / "d3.js"
      ),
      test in Test := (test in(Test, fastOptStage)).value,
      persistLauncher := true,
      persistLauncher in Test := false
    )

}