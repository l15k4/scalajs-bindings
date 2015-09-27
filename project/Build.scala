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
      version := "0.0.3-SNAPSHOT",
      scalaVersion := "2.11.7",
      scalacOptions ++= Seq(
        "-unchecked", "-deprecation", "-feature", "-Xfatal-warnings",
        "-Xlint", "-Xfuture",
        "-Yinline-warnings", "-Ywarn-adapted-args", "-Ywarn-inaccessible",
        "-Ywarn-nullary-override", "-Ywarn-nullary-unit", "-Yno-adapted-args"
      ),
      libraryDependencies ++= Seq(
        "org.scala-js" %%% "scalajs-dom" % "0.8.1"
      ),
      jsDependencies ++= Seq(
        "org.webjars" % "d3js" % "3.4.11" / "d3.js"
      ),
      publishMavenStyle := true,
      publishArtifact in Test := false,
      pomIncludeRepository := { _ => false },
      publishTo := {
        val nexus = "https://oss.sonatype.org/"
        if (isSnapshot.value)
          Some("snapshots" at nexus + "content/repositories/snapshots")
        else
          Some("releases"  at nexus + "service/local/staging/deploy/maven2")
      },
      pomExtra :=
        <url>https://github.com/viagraphs/scalajs-bindings</url>
          <licenses>
            <license>
              <name>The MIT License (MIT)</name>
              <url>http://opensource.org/licenses/MIT</url>
              <distribution>repo</distribution>
            </license>
          </licenses>
          <scm>
            <url>git@github.com:viagraphs/scalajs-bindings.git</url>
            <connection>scm:git:git@github.com:viagraphs/scalajs-bindings.git</connection>
          </scm>
          <developers>
            <developer>
              <id>l15k4</id>
              <name>Jakub Liska</name>
              <email>liska.jakub@gmail.com</email>
            </developer>
          </developers>
    )

}