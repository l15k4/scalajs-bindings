package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js

trait Svg extends js.Object {
  def symbol(): Symbol = js.native
  def axis(): Axis = js.native
  def arc(): Arc = js.native
  var line: js.Any = js.native
  def area(): AreaFunc = js.native
  def brush(): Brush = js.native
  def chord(): Chord = js.native
  var diagonal: js.Any = js.native
  var symbolTypes: js.Array[String] = js.native
}

trait AreaObject extends js.Object {
  var x: Double = js.native
  var y0: Double = js.native
  var y: Double = js.native
  var y1: Double = js.native
}

trait AreaFunc extends js.Object {
  def apply(dat: js.Any): String = js.native
  def x(a: AreaObject => Double): AreaFunc = js.native
  def y0(a: AreaObject => Double): AreaFunc = js.native
  def y1(a: AreaObject => Double): AreaFunc = js.native
}

trait Symbol extends js.Object {
  var `type`: js.Function1[String, Symbol] = js.native
  var size: js.Function1[Double, Symbol] = js.native
}

trait Brush extends js.Object {
  def apply(selection: Selection): Unit = js.native
  def x(): Scale = js.native
  def x(scale: Scale): Brush = js.native
  def y(): Scale = js.native
  def y(scale: Scale): Brush = js.native
  def extent(): js.Array[js.Any] = js.native
  def extent(values: js.Array[js.Any]): Brush = js.native
  def clear(): Brush = js.native
  def empty(): Boolean = js.native
  def on(`type`: String): js.Function2[js.Any, Double, Any] = js.native
  def on(`type`: String, listener: js.Function2[js.Any, Double, Any], capture: Boolean = js.native): Brush = js.native
}

trait Axis extends js.Object {
  def apply(selection: Selection): Unit = js.native
  def scale(): js.Dynamic = js.native
  def scale(scale: js.Any): Axis = js.native
  def orient(): String = js.native
  def orient(orientation: String): Axis = js.native
  def ticks(): js.Array[js.Any] = js.native
  def ticks(arguments: js.Any*): Axis = js.native
  def tickPadding(): Double = js.native
  def tickPadding(padding: Double): Axis = js.native
  def tickValues(): js.Array[js.Any] = js.native
  def tickValues(values: js.Array[js.Any]): Axis = js.native
  def tickSubdivide(count: Double): Axis = js.native
  def tickSize(major: Double = js.native, minor: Double = js.native, end: Double = js.native): Axis = js.native
  def tickFormat[A <: js.Any](formatter: js.Function1[A, String]): Axis = js.native
}

trait Arc extends js.Object {
  def apply(data: js.Any, index: Double = js.native): String = js.native
  def innerRadius(): js.Function2[js.Any, Double, Double] = js.native
  def innerRadius(radius: Double): Arc = js.native
  def outerRadius(): js.Function2[js.Any, Double, Double] = js.native
  def outerRadius(radius: Double): Arc = js.native
  def startAngle(): js.Function2[js.Any, Double, Double] = js.native
  def startAngle(angle: Double): Arc = js.native
  def endAngle(): js.Function2[js.Any, Double, Double] = js.native
  def endAngle(angle: Double): Arc = js.native
  def centroid(data: js.Any, index: Double = js.native): js.Array[Double] = js.native
}

trait Line extends js.Object {
  def apply(data: js.Array[js.Any], index: Double = js.native): String = js.native
  def x(): js.Function2[js.Any, Double, Double] = js.native
  def x(accessor: js.Function1[js.Any, Double]): Line = js.native
  def x(cnst: Double): Line = js.native
  def y(): js.Function2[js.Any, Double, Double] = js.native
  def y(accessor: js.Function1[js.Any, Double]): Line = js.native
  def y(cnst: Double): Line = js.native
  def interpolate(): String = js.native
  def interpolate(interpolate: String): Line = js.native
  def tension(): Double = js.native
  def tension(tension: Double): Line = js.native
  def defined(): js.Function2[js.Any, Double, Boolean] = js.native
  def defined(defined: js.Function1[js.Any, Boolean]): Line = js.native
}

trait LineRadial extends js.Object {
  def apply(data: js.Array[js.Any], index: Double = js.native): String = js.native
  def x(): js.Function2[js.Any, Double, Double] = js.native
  def x(accessor: js.Function1[js.Any, Double]): LineRadial = js.native
  def x(cnst: Double): LineRadial = js.native
  def y(): js.Function2[js.Any, Double, Double] = js.native
  def y(accessor: js.Function1[js.Any, Double]): LineRadial = js.native
  def y(cnst: Double): LineRadial = js.native
  def interpolate(): String = js.native
  def interpolate(interpolate: String): LineRadial = js.native
  def tension(): Double = js.native
  def tension(tension: Double): LineRadial = js.native
  def defined(): js.Function1[js.Any, Any] = js.native
  def defined(defined: js.Function1[js.Any, Any]): LineRadial = js.native
  def radius(): js.Function2[js.Any, Double, Double] = js.native
  def radius(radius: Double): LineRadial = js.native
  def angle(): js.Function2[js.Any, js.Any, Double] = js.native
  def angle(angle: Double): LineRadial = js.native
}

trait Area extends js.Object {
  def apply(data: js.Array[js.Any], index: Double = js.native): String = js.native
  def x(): js.Function2[js.Any, Double, Double] = js.native
  def x(accessor: js.Function1[js.Any, Double]): Area = js.native
  def x(cnst: Double): Area = js.native
  def x0(): js.Function2[js.Any, Double, Double] = js.native
  def x0(accessor: js.Function1[js.Any, Double]): Area = js.native
  def x0(cnst: Double): Area = js.native
  def x1(): js.Function2[js.Any, Double, Double] = js.native
  def x1(accessor: js.Function1[js.Any, Double]): Area = js.native
  def x1(cnst: Double): Area = js.native
  def y(): js.Function2[js.Any, Double, Double] = js.native
  def y(accessor: js.Function1[js.Any, Double]): Area = js.native
  def y(cnst: Double): Area = js.native
  def y0(): js.Function2[js.Any, Double, Double] = js.native
  def y0(accessor: js.Function1[js.Any, Double]): Area = js.native
  def y0(cnst: Double): Area = js.native
  def y1(): js.Function2[js.Any, Double, Double] = js.native
  def y1(accessor: js.Function1[js.Any, Double]): Area = js.native
  def y1(cnst: Double): Area = js.native
  def interpolate(): String = js.native
  def interpolate(interpolate: String): Area = js.native
  def tension(): Double = js.native
  def tension(tension: Double): Area = js.native
  def defined(): js.Function1[js.Any, Any] = js.native
  def defined(defined: js.Function1[js.Any, Any]): Area = js.native
}

trait AreaRadial extends js.Object {
  def apply(data: js.Array[js.Any], index: Double = js.native): String = js.native
  def x(): js.Function2[js.Any, Double, Double] = js.native
  def x(accessor: js.Function1[js.Any, Double]): AreaRadial = js.native
  def x(cnst: Double): AreaRadial = js.native
  def x0(): js.Function2[js.Any, Double, Double] = js.native
  def x0(accessor: js.Function1[js.Any, Double]): AreaRadial = js.native
  def x0(cnst: Double): AreaRadial = js.native
  def x1(): js.Function2[js.Any, Double, Double] = js.native
  def x1(accessor: js.Function1[js.Any, Double]): AreaRadial = js.native
  def x1(cnst: Double): AreaRadial = js.native
  def y(): js.Function2[js.Any, Double, Double] = js.native
  def y(accessor: js.Function1[js.Any, Double]): AreaRadial = js.native
  def y(cnst: Double): AreaRadial = js.native
  def y0(): js.Function2[js.Any, Double, Double] = js.native
  def y0(accessor: js.Function1[js.Any, Double]): AreaRadial = js.native
  def y0(cnst: Double): AreaRadial = js.native
  def y1(): js.Function2[js.Any, Double, Double] = js.native
  def y1(accessor: js.Function1[js.Any, Double]): AreaRadial = js.native
  def y1(cnst: Double): AreaRadial = js.native
  def interpolate(): String = js.native
  def interpolate(interpolate: String): AreaRadial = js.native
  def tension(): Double = js.native
  def tension(tension: Double): AreaRadial = js.native
  def defined(): js.Function1[js.Any, Any] = js.native
  def defined(defined: js.Function1[js.Any, Any]): AreaRadial = js.native
  def radius(): Double = js.native
  def radius(radius: Double): AreaRadial = js.native
  def innerRadius(): Double = js.native
  def innerRadius(radius: Double): AreaRadial = js.native
  def outerRadius(): Double = js.native
  def outerRadius(radius: Double): AreaRadial = js.native
  def angle(): Double = js.native
  def angle(angle: Double): AreaRadial = js.native
  def startAngle(): Double = js.native
  def startAngle(angle: Double): AreaRadial = js.native
  def endAngle(): Double = js.native
  def endAngle(angle: Double): AreaRadial = js.native
}

trait Chord extends js.Object {
  def apply(datum: js.Any, index: Double = js.native): String = js.native
  def radius(): Double = js.native
  def radius(radius: Double): Chord = js.native
  def startAngle(): Double = js.native
  def startAngle(angle: Double): Chord = js.native
  def endAngle(): Double = js.native
  def endAngle(angle: Double): Chord = js.native
  def source(): js.Dynamic = js.native
  def source(angle: js.Any): Chord = js.native
  def target(): js.Dynamic = js.native
  def target(angle: js.Any): Chord = js.native
}

trait Diagonal extends js.Object {
  def apply(datum: js.Any, index: Double = js.native): String = js.native
  def projection(): js.Function2[js.Any, Double, js.Array[Double]] = js.native
  def projection(proj: js.Function1[js.Any, js.Array[Double]]): Diagonal = js.native
  def source(): js.Function2[js.Any, Double, Any] = js.native
  def source(src: js.Function1[js.Any, Any]): Diagonal = js.native
  def target(): js.Function2[js.Any, Double, Any] = js.native
  def target(target: js.Function1[js.Any, Any]): Diagonal = js.native
}
