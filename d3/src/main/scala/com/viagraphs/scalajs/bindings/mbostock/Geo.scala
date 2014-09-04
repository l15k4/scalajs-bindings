package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js

trait Geo extends js.Object {
  def path(): Path = ???
  def circle(): Circle = ???
  def area(feature: js.Any): js.Number = ???
  def bounds(feature: js.Any): js.Array[js.Array[js.Number]] = ???
  def centroid(feature: js.Any): js.Array[js.Number] = ???
  def distance(a: js.Array[js.Number], b: js.Array[js.Number]): js.Number = ???
  def interpolate(a: js.Array[js.Number], b: js.Array[js.Number]): js.Function1[js.Number, js.Array[js.Number]] = ???
  def length(feature: js.Any): js.Number = ???
  def projection(raw: RawProjection): Projection = ???
  def projectionMutator(rawFactory: RawProjection): ProjectionMutator = ???
  def albers(): Projection = ???
  def albersUsa(): Projection = ???
  var azimuthalEqualArea: js.Any = ???
  var azimuthalEquidistant: js.Any = ???
  var conicConformal: js.Any = ???
  var conicEquidistant: js.Any = ???
  var conicEqualArea: js.Any = ???
  var equirectangular: js.Any = ???
  var gnomonic: js.Any = ???
  var mercator: js.Any = ???
  var orthographic: js.Any = ???
  var stereographic: js.Any = ???
  var transverseMercator: js.Any = ???
  def stream(`object`: GeoJSON, listener: Stream): Unit = ???
  def graticule(): Graticule = ???
  def greatArc(): GreatArc = ???
  def rotation(rotation: js.Array[js.Number]): Rotation = ???
}

trait Path extends js.Object {
  def apply(feature: js.Any, index: js.Any = ???): js.String = ???
  def projection(): Projection = ???
  def projection(projection: Projection): Path = ???
  def context(): js.String = ???
  def context(context: Context): Path = ???
  def area(feature: js.Any): js.Dynamic = ???
  def centroid(feature: js.Any): js.Dynamic = ???
  def bounds(feature: js.Any): js.Dynamic = ???
  def pointRadius(): js.Number = ???
  def pointRadius(radius: js.Number): Path = ???
}

trait Context extends js.Object {
  def beginPath(): js.Dynamic = ???
  def moveTo(x: js.Number, y: js.Number): js.Dynamic = ???
  def lineTo(x: js.Number, y: js.Number): js.Dynamic = ???
  def arc(x: js.Number, y: js.Number, radius: js.Number, startAngle: js.Number, endAngle: js.Number): js.Dynamic = ???
  def closePath(): js.Dynamic = ???
}

trait Circle extends js.Object {
  def apply(args: js.Any*): GeoJSON = ???
  def origin(): js.Array[js.Number] = ???
  def origin(origin: js.Array[js.Number]): Circle = ???
  def angle(): js.Number = ???
  def angle(angle: js.Number): Circle = ???
  def precision(): js.Number = ???
  def precision(precision: js.Number): Circle = ???
}

trait Graticule extends js.Object {
  def apply(): GeoJSON = ???
  def lines(): js.Array[GeoJSON] = ???
  def outline(): GeoJSON = ???
  def extent(): js.Array[js.Array[js.Number]] = ???
  def extent(extent: js.Array[js.Array[js.Number]]): Graticule = ???
  def minorExtent(): js.Array[js.Array[js.Number]] = ???
  def minorExtent(extent: js.Array[js.Array[js.Number]]): Graticule = ???
  def majorExtent(): js.Array[js.Array[js.Number]] = ???
  def majorExtent(extent: js.Array[js.Array[js.Number]]): Graticule = ???
  def step(): js.Array[js.Array[js.Number]] = ???
  def step(extent: js.Array[js.Array[js.Number]]): Graticule = ???
  def minorStep(): js.Array[js.Array[js.Number]] = ???
  def minorStep(extent: js.Array[js.Array[js.Number]]): Graticule = ???
  def majorStep(): js.Array[js.Array[js.Number]] = ???
  def majorStep(extent: js.Array[js.Array[js.Number]]): Graticule = ???
  def precision(): js.Number = ???
  def precision(precision: js.Number): Graticule = ???
}

trait GreatArc extends js.Object {
  def apply(): GeoJSON = ???
  def distance(): js.Number = ???
  def source(): js.Dynamic = ???
  def source(source: js.Any): GreatArc = ???
  def target(): js.Dynamic = ???
  def target(target: js.Any): GreatArc = ???
  def precision(): js.Number = ???
  def precision(precision: js.Number): GreatArc = ???
}

trait GeoJSON extends js.Object {
  var coordinates: js.Array[js.Array[js.Number]] = ???
  var `type`: js.String = ???
}

trait RawProjection extends js.Object {
  def apply(lambda: js.Number, phi: js.Number): js.Array[js.Number] = ???
  def invert(x: js.Number, y: js.Number): js.Array[js.Number] = ???
}

trait Projection extends js.Object {
  def apply(coordinates: js.Array[js.Number]): js.Array[js.Number] = ???
  def invert(point: js.Array[js.Number]): js.Array[js.Number] = ???
  def rotate(): js.Array[js.Number] = ???
  def rotate(rotation: js.Array[js.Number]): Projection = ???
  def center(): js.Array[js.Number] = ???
  def center(location: js.Array[js.Number]): Projection = ???
  def parallels(): js.Array[js.Number] = ???
  def parallels(location: js.Array[js.Number]): Projection = ???
  def translate(): js.Array[js.Number] = ???
  def translate(point: js.Array[js.Number]): Projection = ???
  def scale(): js.Number = ???
  def scale(scale: js.Number): Projection = ???
  def clipAngle(): js.Number = ???
  def clipAngle(angle: js.Number): Projection = ???
  def clipExtent(): js.Array[js.Array[js.Number]] = ???
  def clipExtent(extent: js.Array[js.Array[js.Number]]): Projection = ???
  def precision(): js.Number = ???
  def precision(precision: js.Number): Projection = ???
  def stream(listener: Stream = ???): Stream = ???
}

trait Stream extends js.Object {
  def point(x: js.Number, y: js.Number, z: js.Number = ???): Unit = ???
  def lineStart(): Unit = ???
  def lineEnd(): Unit = ???
  def polygonStart(): Unit = ???
  def polygonEnd(): Unit = ???
  def sphere(): Unit = ???
}

trait Rotation extends js.Array[js.Any] {
  def apply(location: js.Array[js.Number]): Rotation = ???
  def invert(location: js.Array[js.Number]): Rotation = ???
}

trait ProjectionMutator extends js.Object {
  def apply(lambda: js.Number, phi: js.Number): Projection = ???
}
