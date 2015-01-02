package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js

trait Color extends js.Object {
  def brighter(k: Double): Color = js.native
  def darker(k: Double = js.native): Color = js.native
  override def toString: String = js.native
}

trait RGBColor extends Color {
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
  def hsl(): HSLColor = js.native
}

trait HSLColor extends Color {
  var h: Double = js.native
  var s: Double = js.native
  var l: Double = js.native
  def rgb(): RGBColor = js.native
}

trait LABColor extends Color {
  var l: Double = js.native
  var a: Double = js.native
  var b: Double = js.native
  def rgb(): RGBColor = js.native
}

trait HCLColor extends Color {
  var h: Double = js.native
  var c: Double = js.native
  var l: Double = js.native
  def rgb(): RGBColor = js.native
}
