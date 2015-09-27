#scalajs-bindings 0.0.1


* dependency : `"com.viagraphs" %%% "scalajs-bindings" % "0.0.3-SNAPSHOT"`
* Scala.js version : 0.6.5

So far it contains just d3 facades, slightly tested and partially documented.


```scala
libraryDependencies ++= Seq(
  "com.viagraphs" %%% "scalajs-bindings" % "0.0.2-SNAPSHOT"
),
jsDependencies ++= Seq(
  "org.webjars" % "d3js" % "3.4.11" / "d3.js"
)
```