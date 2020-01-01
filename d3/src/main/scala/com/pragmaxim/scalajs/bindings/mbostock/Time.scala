package com.pragmaxim.scalajs.bindings.mbostock

import scala.scalajs.js
import scala.scalajs.js.{native,Date}

@native
trait Time extends js.Object {
  var second: Interval = js.native
  var minute: Interval = js.native
  var hour: Interval = js.native
  var day: Interval = js.native
  var week: Interval = js.native
  var sunday: Interval = js.native
  var monday: Interval = js.native
  var tuesday: Interval = js.native
  var wednesday: Interval = js.native
  var thursday: Interval = js.native
  var friday: Interval = js.native
  var saturday: Interval = js.native
  var month: Interval = js.native
  var year: Interval = js.native
  var seconds: Range = js.native
  var minutes: Range = js.native
  var hours: Range = js.native
  var days: Range = js.native
  var weeks: Range = js.native
  var months: Range = js.native
  var years: Range = js.native
  var sundays: Range = js.native
  var mondays: Range = js.native
  var tuesdays: Range = js.native
  var wednesdays: Range = js.native
  var thursdays: Range = js.native
  var fridays: Range = js.native
  var saturdays: Range = js.native
  var format: js.Any = js.native

  /**
   * @return a new time scale with the default domain and range; the ticks and tick format are configured for local time.
   */
  def scale: TimeScale = js.native
}

@native
trait Range extends js.Object {
  def apply(start: Date, end: Date, step: Double = js.native): js.Array[Date] = js.native
}

@native
trait Interval extends js.Object {
  def apply(date: Date): Date = js.native
  var floor: js.Function1[Date, Date] = js.native
  var round: js.Function1[Date, Date] = js.native
  var ceil: js.Function1[Date, Date] = js.native
  var range: Range = js.native
  var offset: js.Function2[Date, Double, Date] = js.native
  var utc: Interval = js.native
}

@native
trait TimeFormat extends js.Object {
  def apply(date: Date): String = js.native
  var parse: js.Function1[String, Date] = js.native
}

