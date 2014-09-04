package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js

trait Color extends js.Object {
  def brighter(k: js.Number): Color = ???
  def darker(k: js.Number = ???): Color = ???
  override def toString: js.String = ???
}

trait RGBColor extends Color {
  var r: js.Number = ???
  var g: js.Number = ???
  var b: js.Number = ???
  def hsl(): HSLColor = ???
}

trait HSLColor extends Color {
  var h: js.Number = ???
  var s: js.Number = ???
  var l: js.Number = ???
  def rgb(): RGBColor = ???
}

trait LABColor extends Color {
  var l: js.Number = ???
  var a: js.Number = ???
  var b: js.Number = ???
  def rgb(): RGBColor = ???
}

trait HCLColor extends Color {
  var h: js.Number = ???
  var c: js.Number = ???
  var l: js.Number = ???
  def rgb(): RGBColor = ???
}
