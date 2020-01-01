package com.pragmaxim.scalajs.bindings.mbostock

import scala.scalajs.js
import scala.scalajs.js.native

@native
trait Behavior extends js.Object {
  def drag(): Drag = js.native
  def zoom(): Zoom = js.native
}

@native
trait Zoom extends js.Object {
  def apply(selection: Selection): Unit = js.native
  var on: js.Function2[String, js.Function2[js.Any, Double, Any], Zoom] = js.native
  def scale(): Double = js.native
  def scale(scale: Double): Zoom = js.native
  def translate(): js.Array[Double] = js.native
  def translate(translate: js.Array[Double]): Zoom = js.native
  def scaleExtent(): js.Array[Double] = js.native
  def scaleExtent(extent: js.Array[Double]): Zoom = js.native
  def x(): Scale = js.native
  def x(x: Scale): Zoom = js.native
  def y(): Scale = js.native
  def y(y: Scale): Zoom = js.native
}

@native
trait Drag extends js.Object {
  def apply(): js.Dynamic = js.native
  var on: js.Function2[String, js.Function2[js.Any, Double, Any], Drag] = js.native
  def origin(): js.Dynamic = js.native
  def origin(origin: js.Any = js.native): Drag = js.native
}

