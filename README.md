## scalajs-bindings

* Scala.js version : 0.6.31

So far it contains just d3 facades, slightly tested and partially documented.

```scala
resolvers in ThisBuild ++= Seq(
  Resolver.bintrayRepo("pragmaxim", "maven")
)
libraryDependencies ++= Seq("com.pragmaxim" %%% "scalajs-bindings" % "0.0.4")
```