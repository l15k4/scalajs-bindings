package com.viagraphs.scalajs.bindings.mbostock

import org.scalajs.dom.XMLHttpRequest

import scala.scalajs.js
import scala.scalajs.js.Any

trait Xhr extends js.Object {

  def header(name: js.String): js.String = ???

  def header(name: js.String, value: js.String): Xhr = ???

  def mimeType(): js.String = ???

  def mimeType(`type`: js.String): Xhr = ???

  def response(): js.Function1[XMLHttpRequest, Any] = ???

  def response(value: js.Function1[XMLHttpRequest, Any]): Xhr = ???

  def get(callback: js.Function1[XMLHttpRequest, Unit] = ???): Xhr = ???

  def post(callback: js.Function1[XMLHttpRequest, Unit]): Xhr = ???

  def post(data: js.Any, callback: js.Function1[XMLHttpRequest, Unit] = ???): Xhr = ???

  def send(method: js.String, callback: js.Function1[XMLHttpRequest, Unit]): Xhr = ???

  def send(method: js.String, data: js.Any, callback: js.Function1[XMLHttpRequest, Unit] = ???): Xhr = ???

  def abort(): Xhr = ???

  var on: js.Function2[js.String, js.Function2[js.Any, js.Number, Any], Xhr] = ???
}
