package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js
import scala.scalajs.js.native

@native
trait Geo extends js.Object {
  def path(): Path = js.native
  def circle(): Circle = js.native
  def area(feature: js.Any): Double = js.native
  def bounds(feature: js.Any): js.Array[js.Array[Double]] = js.native
  def centroid(feature: js.Any): js.Array[Double] = js.native
  def distance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def interpolate(a: js.Array[Double], b: js.Array[Double]): js.Function1[Double, js.Array[Double]] = js.native
  def length(feature: js.Any): Double = js.native
  def projection(raw: RawProjection): Projection = js.native
  def projectionMutator(rawFactory: RawProjection): ProjectionMutator = js.native
  def albers(): Projection = js.native
  def albersUsa(): Projection = js.native
  var azimuthalEqualArea: js.Any = js.native
  var azimuthalEquidistant: js.Any = js.native
  var conicConformal: js.Any = js.native
  var conicEquidistant: js.Any = js.native
  var conicEqualArea: js.Any = js.native
  var equirectangular: js.Any = js.native
  var gnomonic: js.Any = js.native
  var mercator: js.Any = js.native
  var orthographic: js.Any = js.native
  var stereographic: js.Any = js.native
  var transverseMercator: js.Any = js.native
  def stream(`object`: GeoJSON, listener: Stream): Unit = js.native
  def graticule(): Graticule = js.native
  def greatArc(): GreatArc = js.native
  def rotation(rotation: js.Array[Double]): Rotation = js.native
}

@native
trait Path extends js.Object {
  def apply(feature: js.Any, index: js.Any = js.native): String = js.native
  def projection(): Projection = js.native
  def projection(projection: Projection): Path = js.native
  def context(): String = js.native
  def context(context: Context): Path = js.native
  def area(feature: js.Any): js.Dynamic = js.native
  def centroid(feature: js.Any): js.Dynamic = js.native
  def bounds(feature: js.Any): js.Dynamic = js.native
  def pointRadius(): Double = js.native
  def pointRadius(radius: Double): Path = js.native
}

@native
trait Context extends js.Object {
  def beginPath(): js.Dynamic = js.native
  def moveTo(x: Double, y: Double): js.Dynamic = js.native
  def lineTo(x: Double, y: Double): js.Dynamic = js.native
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): js.Dynamic = js.native
  def closePath(): js.Dynamic = js.native
}

@native
trait Circle extends js.Object {
  def apply(args: js.Any*): GeoJSON = js.native
  def origin(): js.Array[Double] = js.native
  def origin(origin: js.Array[Double]): Circle = js.native
  def angle(): Double = js.native
  def angle(angle: Double): Circle = js.native
  def precision(): Double = js.native
  def precision(precision: Double): Circle = js.native
}

@native
trait Graticule extends js.Object {
  def apply(): GeoJSON = js.native
  def lines(): js.Array[GeoJSON] = js.native
  def outline(): GeoJSON = js.native
  def extent(): js.Array[js.Array[Double]] = js.native
  def extent(extent: js.Array[js.Array[Double]]): Graticule = js.native
  def minorExtent(): js.Array[js.Array[Double]] = js.native
  def minorExtent(extent: js.Array[js.Array[Double]]): Graticule = js.native
  def majorExtent(): js.Array[js.Array[Double]] = js.native
  def majorExtent(extent: js.Array[js.Array[Double]]): Graticule = js.native
  def step(): js.Array[js.Array[Double]] = js.native
  def step(extent: js.Array[js.Array[Double]]): Graticule = js.native
  def minorStep(): js.Array[js.Array[Double]] = js.native
  def minorStep(extent: js.Array[js.Array[Double]]): Graticule = js.native
  def majorStep(): js.Array[js.Array[Double]] = js.native
  def majorStep(extent: js.Array[js.Array[Double]]): Graticule = js.native
  def precision(): Double = js.native
  def precision(precision: Double): Graticule = js.native
}

@native
trait GreatArc extends js.Object {
  def apply(): GeoJSON = js.native
  def distance(): Double = js.native
  def source(): js.Dynamic = js.native
  def source(source: js.Any): GreatArc = js.native
  def target(): js.Dynamic = js.native
  def target(target: js.Any): GreatArc = js.native
  def precision(): Double = js.native
  def precision(precision: Double): GreatArc = js.native
}

@native
trait GeoJSON extends js.Object {
  var coordinates: js.Array[js.Array[Double]] = js.native
  var `type`: String = js.native
}

@native
trait RawProjection extends js.Object {
  def apply(lambda: Double, phi: Double): js.Array[Double] = js.native
  def invert(x: Double, y: Double): js.Array[Double] = js.native
}

@native
trait Projection extends js.Object {
  def apply(coordinates: js.Array[Double]): js.Array[Double] = js.native
  def invert(point: js.Array[Double]): js.Array[Double] = js.native
  def rotate(): js.Array[Double] = js.native
  def rotate(rotation: js.Array[Double]): Projection = js.native
  def center(): js.Array[Double] = js.native
  def center(location: js.Array[Double]): Projection = js.native
  def parallels(): js.Array[Double] = js.native
  def parallels(location: js.Array[Double]): Projection = js.native
  def translate(): js.Array[Double] = js.native
  def translate(point: js.Array[Double]): Projection = js.native
  def scale(): Double = js.native
  def scale(scale: Double): Projection = js.native
  def clipAngle(): Double = js.native
  def clipAngle(angle: Double): Projection = js.native
  def clipExtent(): js.Array[js.Array[Double]] = js.native
  def clipExtent(extent: js.Array[js.Array[Double]]): Projection = js.native
  def precision(): Double = js.native
  def precision(precision: Double): Projection = js.native
  def stream(listener: Stream = js.native): Stream = js.native
}

@native
trait Stream extends js.Object {
  def point(x: Double, y: Double, z: Double = js.native): Unit = js.native
  def lineStart(): Unit = js.native
  def lineEnd(): Unit = js.native
  def polygonStart(): Unit = js.native
  def polygonEnd(): Unit = js.native
  def sphere(): Unit = js.native
}

@native
trait Rotation extends js.Array[js.Any] {
  def apply(location: js.Array[Double]): Rotation = js.native
  def invert(location: js.Array[Double]): Rotation = js.native
}

@native
trait ProjectionMutator extends js.Object {
  def apply(lambda: Double, phi: Double): Projection = js.native
}
