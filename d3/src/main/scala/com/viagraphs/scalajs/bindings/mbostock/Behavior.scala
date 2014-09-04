package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js

trait Behavior extends js.Object {
  def drag(): Drag = ???
  def zoom(): Zoom = ???
}

trait Zoom extends js.Object {
  def apply(selection: Selection): Unit = ???
  var on: js.Function2[js.String, js.Function2[js.Any, js.Number, Any], Zoom] = ???
  def scale(): js.Number = ???
  def scale(scale: js.Number): Zoom = ???
  def translate(): js.Array[js.Number] = ???
  def translate(translate: js.Array[js.Number]): Zoom = ???
  def scaleExtent(): js.Array[js.Number] = ???
  def scaleExtent(extent: js.Array[js.Number]): Zoom = ???
  def x(): Scale = ???
  def x(x: Scale): Zoom = ???
  def y(): Scale = ???
  def y(y: Scale): Zoom = ???
}

trait Drag extends js.Object {
  def apply(): js.Dynamic = ???
  var on: js.Function2[js.String, js.Function2[js.Any, js.Number, Any], Drag] = ???
  def origin(): js.Dynamic = ???
  def origin(origin: js.Any = ???): Drag = ???
}

