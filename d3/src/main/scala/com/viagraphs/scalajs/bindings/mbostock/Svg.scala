package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js

trait Svg extends js.Object {
  def symbol(): Symbol = ???
  def axis(): Axis = ???
  def arc(): Arc = ???
  var line: js.Any = ???
  def area(): AreaFunc = ???
  def brush(): Brush = ???
  def chord(): Chord = ???
  var diagonal: js.Any = ???
  var symbolTypes: js.Array[js.String] = ???
}

trait AreaObject extends js.Object {
  var x: Double = ???
  var y0: Double = ???
  var y: Double = ???
  var y1: Double = ???
}

trait AreaFunc extends js.Object {
  def apply(dat: js.Any): String = ???
  def x(a: AreaObject => Double): AreaFunc = ???
  def y0(a: AreaObject => Double): AreaFunc = ???
  def y1(a: AreaObject => Double): AreaFunc = ???
}

trait Symbol extends js.Object {
  var `type`: js.Function1[js.String, Symbol] = ???
  var size: js.Function1[js.Number, Symbol] = ???
}

trait Brush extends js.Object {
  def apply(selection: Selection): Unit = ???
  def x(): Scale = ???
  def x(scale: Scale): Brush = ???
  def y(): Scale = ???
  def y(scale: Scale): Brush = ???
  def extent(): js.Array[js.Any] = ???
  def extent(values: js.Array[js.Any]): Brush = ???
  def clear(): Brush = ???
  def empty(): js.Boolean = ???
  def on(`type`: js.String): js.Function2[js.Any, js.Number, Any] = ???
  def on(`type`: js.String, listener: js.Function2[js.Any, js.Number, Any], capture: js.Boolean = ???): Brush = ???
}

trait Axis extends js.Object {
  def apply(selection: Selection): Unit = ???
  def scale(): js.Dynamic = ???
  def scale(scale: js.Any): Axis = ???
  def orient(): js.String = ???
  def orient(orientation: js.String): Axis = ???
  def ticks(): js.Array[js.Any] = ???
  def ticks(arguments: js.Any*): Axis = ???
  def tickPadding(): js.Number = ???
  def tickPadding(padding: js.Number): Axis = ???
  def tickValues(): js.Array[js.Any] = ???
  def tickValues(values: js.Array[js.Any]): Axis = ???
  def tickSubdivide(count: js.Number): Axis = ???
  def tickSize(major: js.Number = ???, minor: js.Number = ???, end: js.Number = ???): Axis = ???
  def tickFormat[A <: js.Any](formatter: js.Function1[A, js.String]): Axis = ???
}

trait Arc extends js.Object {
  def apply(data: js.Any, index: js.Number = ???): js.String = ???
  def innerRadius(): js.Function2[js.Any, js.Number, js.Number] = ???
  def innerRadius(radius: js.Number): Arc = ???
  def outerRadius(): js.Function2[js.Any, js.Number, js.Number] = ???
  def outerRadius(radius: js.Number): Arc = ???
  def startAngle(): js.Function2[js.Any, js.Number, js.Number] = ???
  def startAngle(angle: js.Number): Arc = ???
  def endAngle(): js.Function2[js.Any, js.Number, js.Number] = ???
  def endAngle(angle: js.Number): Arc = ???
  def centroid(data: js.Any, index: js.Number = ???): js.Array[js.Number] = ???
}

trait Line extends js.Object {
  def apply(data: js.Array[js.Any], index: js.Number = ???): js.String = ???
  def x(): js.Function2[js.Any, js.Number, js.Number] = ???
  def x(accessor: js.Function1[js.Any, js.Number]): Line = ???
  def x(cnst: js.Number): Line = ???
  def y(): js.Function2[js.Any, js.Number, js.Number] = ???
  def y(accessor: js.Function1[js.Any, js.Number]): Line = ???
  def y(cnst: js.Number): Line = ???
  def interpolate(): js.String = ???
  def interpolate(interpolate: js.String): Line = ???
  def tension(): js.Number = ???
  def tension(tension: js.Number): Line = ???
  def defined(): js.Function2[js.Any, js.Number, js.Boolean] = ???
  def defined(defined: js.Function1[js.Any, js.Boolean]): Line = ???
}

trait LineRadial extends js.Object {
  def apply(data: js.Array[js.Any], index: js.Number = ???): js.String = ???
  def x(): js.Function2[js.Any, js.Number, js.Number] = ???
  def x(accessor: js.Function1[js.Any, js.Number]): LineRadial = ???
  def x(cnst: js.Number): LineRadial = ???
  def y(): js.Function2[js.Any, js.Number, js.Number] = ???
  def y(accessor: js.Function1[js.Any, js.Number]): LineRadial = ???
  def y(cnst: js.Number): LineRadial = ???
  def interpolate(): js.String = ???
  def interpolate(interpolate: js.String): LineRadial = ???
  def tension(): js.Number = ???
  def tension(tension: js.Number): LineRadial = ???
  def defined(): js.Function1[js.Any, Any] = ???
  def defined(defined: js.Function1[js.Any, Any]): LineRadial = ???
  def radius(): js.Function2[js.Any, js.Number, js.Number] = ???
  def radius(radius: js.Number): LineRadial = ???
  def angle(): js.Function2[js.Any, js.Any, js.Number] = ???
  def angle(angle: js.Number): LineRadial = ???
}

trait Area extends js.Object {
  def apply(data: js.Array[js.Any], index: js.Number = ???): js.String = ???
  def x(): js.Function2[js.Any, js.Number, js.Number] = ???
  def x(accessor: js.Function1[js.Any, js.Number]): Area = ???
  def x(cnst: js.Number): Area = ???
  def x0(): js.Function2[js.Any, js.Number, js.Number] = ???
  def x0(accessor: js.Function1[js.Any, js.Number]): Area = ???
  def x0(cnst: js.Number): Area = ???
  def x1(): js.Function2[js.Any, js.Number, js.Number] = ???
  def x1(accessor: js.Function1[js.Any, js.Number]): Area = ???
  def x1(cnst: js.Number): Area = ???
  def y(): js.Function2[js.Any, js.Number, js.Number] = ???
  def y(accessor: js.Function1[js.Any, js.Number]): Area = ???
  def y(cnst: js.Number): Area = ???
  def y0(): js.Function2[js.Any, js.Number, js.Number] = ???
  def y0(accessor: js.Function1[js.Any, js.Number]): Area = ???
  def y0(cnst: js.Number): Area = ???
  def y1(): js.Function2[js.Any, js.Number, js.Number] = ???
  def y1(accessor: js.Function1[js.Any, js.Number]): Area = ???
  def y1(cnst: js.Number): Area = ???
  def interpolate(): js.String = ???
  def interpolate(interpolate: js.String): Area = ???
  def tension(): js.Number = ???
  def tension(tension: js.Number): Area = ???
  def defined(): js.Function1[js.Any, Any] = ???
  def defined(defined: js.Function1[js.Any, Any]): Area = ???
}

trait AreaRadial extends js.Object {
  def apply(data: js.Array[js.Any], index: js.Number = ???): js.String = ???
  def x(): js.Function2[js.Any, js.Number, js.Number] = ???
  def x(accessor: js.Function1[js.Any, js.Number]): AreaRadial = ???
  def x(cnst: js.Number): AreaRadial = ???
  def x0(): js.Function2[js.Any, js.Number, js.Number] = ???
  def x0(accessor: js.Function1[js.Any, js.Number]): AreaRadial = ???
  def x0(cnst: js.Number): AreaRadial = ???
  def x1(): js.Function2[js.Any, js.Number, js.Number] = ???
  def x1(accessor: js.Function1[js.Any, js.Number]): AreaRadial = ???
  def x1(cnst: js.Number): AreaRadial = ???
  def y(): js.Function2[js.Any, js.Number, js.Number] = ???
  def y(accessor: js.Function1[js.Any, js.Number]): AreaRadial = ???
  def y(cnst: js.Number): AreaRadial = ???
  def y0(): js.Function2[js.Any, js.Number, js.Number] = ???
  def y0(accessor: js.Function1[js.Any, js.Number]): AreaRadial = ???
  def y0(cnst: js.Number): AreaRadial = ???
  def y1(): js.Function2[js.Any, js.Number, js.Number] = ???
  def y1(accessor: js.Function1[js.Any, js.Number]): AreaRadial = ???
  def y1(cnst: js.Number): AreaRadial = ???
  def interpolate(): js.String = ???
  def interpolate(interpolate: js.String): AreaRadial = ???
  def tension(): js.Number = ???
  def tension(tension: js.Number): AreaRadial = ???
  def defined(): js.Function1[js.Any, Any] = ???
  def defined(defined: js.Function1[js.Any, Any]): AreaRadial = ???
  def radius(): js.Number = ???
  def radius(radius: js.Number): AreaRadial = ???
  def innerRadius(): js.Number = ???
  def innerRadius(radius: js.Number): AreaRadial = ???
  def outerRadius(): js.Number = ???
  def outerRadius(radius: js.Number): AreaRadial = ???
  def angle(): js.Number = ???
  def angle(angle: js.Number): AreaRadial = ???
  def startAngle(): js.Number = ???
  def startAngle(angle: js.Number): AreaRadial = ???
  def endAngle(): js.Number = ???
  def endAngle(angle: js.Number): AreaRadial = ???
}

trait Chord extends js.Object {
  def apply(datum: js.Any, index: js.Number = ???): js.String = ???
  def radius(): js.Number = ???
  def radius(radius: js.Number): Chord = ???
  def startAngle(): js.Number = ???
  def startAngle(angle: js.Number): Chord = ???
  def endAngle(): js.Number = ???
  def endAngle(angle: js.Number): Chord = ???
  def source(): js.Dynamic = ???
  def source(angle: js.Any): Chord = ???
  def target(): js.Dynamic = ???
  def target(angle: js.Any): Chord = ???
}

trait Diagonal extends js.Object {
  def apply(datum: js.Any, index: js.Number = ???): js.String = ???
  def projection(): js.Function2[js.Any, js.Number, js.Array[js.Number]] = ???
  def projection(proj: js.Function1[js.Any, js.Array[js.Number]]): Diagonal = ???
  def source(): js.Function2[js.Any, js.Number, Any] = ???
  def source(src: js.Function1[js.Any, Any]): Diagonal = ???
  def target(): js.Function2[js.Any, js.Number, Any] = ???
  def target(target: js.Function1[js.Any, Any]): Diagonal = ???
}
