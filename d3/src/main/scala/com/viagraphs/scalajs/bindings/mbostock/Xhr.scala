package com.viagraphs.scalajs.bindings.mbostock

import org.scalajs.dom.XMLHttpRequest

import scala.scalajs.js
import scala.scalajs.js.Any

trait Xhr extends js.Object {

  def header(name: String): String = js.native

  def header(name: String, value: String): Xhr = js.native

  def mimeType(): String = js.native

  def mimeType(`type`: String): Xhr = js.native

  def response(): js.Function1[XMLHttpRequest, Any] = js.native

  def response(value: js.Function1[XMLHttpRequest, Any]): Xhr = js.native

  def get(callback: js.Function1[XMLHttpRequest, Unit] = js.native): Xhr = js.native

  def post(callback: js.Function1[XMLHttpRequest, Unit]): Xhr = js.native

  def post(data: js.Any, callback: js.Function1[XMLHttpRequest, Unit] = js.native): Xhr = js.native

  def send(method: String, callback: js.Function1[XMLHttpRequest, Unit]): Xhr = js.native

  def send(method: String, data: js.Any, callback: js.Function1[XMLHttpRequest, Unit] = js.native): Xhr = js.native

  def abort(): Xhr = js.native

  var on: js.Function2[String, js.Function2[js.Any, Double, Any], Xhr] = js.native
}
