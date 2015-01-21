scalajs-bindings 0.0.1
===========

So far it contains just d3 facades, slightly tested and partially documented.

NOTE: It hasn't been released yet until scala.js 0.6.0 is out.

```
libraryDependencies ++= Seq(
  "com.viagraphs" %%% "scalajs-bindings" % "0.0.2-SNAPSHOT"
),
jsDependencies ++= Seq(
  "org.webjars" % "d3js" % "3.4.11" / "d3.js"
)
```