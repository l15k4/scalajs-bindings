package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js
import scala.scalajs.js.Date

trait Time extends js.Object {
  var second: Interval = ???
  var minute: Interval = ???
  var hour: Interval = ???
  var day: Interval = ???
  var week: Interval = ???
  var sunday: Interval = ???
  var monday: Interval = ???
  var tuesday: Interval = ???
  var wednesday: Interval = ???
  var thursday: Interval = ???
  var friday: Interval = ???
  var saturday: Interval = ???
  var month: Interval = ???
  var year: Interval = ???
  var seconds: Range = ???
  var minutes: Range = ???
  var hours: Range = ???
  var days: Range = ???
  var weeks: Range = ???
  var months: Range = ???
  var years: Range = ???
  var sundays: Range = ???
  var mondays: Range = ???
  var tuesdays: Range = ???
  var wednesdays: Range = ???
  var thursdays: Range = ???
  var fridays: Range = ???
  var saturdays: Range = ???
  var format: js.Any = ???

  /**
   * @return a new time scale with the default domain and range; the ticks and tick format are configured for local time.
   */
  def scale: TimeScale = ???
}

trait Range extends js.Object {
  def apply(start: Date, end: Date, step: js.Number = ???): js.Array[Date] = ???
}

trait Interval extends js.Object {
  def apply(date: Date): Date = ???
  var floor: js.Function1[Date, Date] = ???
  var round: js.Function1[Date, Date] = ???
  var ceil: js.Function1[Date, Date] = ???
  var range: Range = ???
  var offset: js.Function2[Date, js.Number, Date] = ???
  var utc: Interval = ???
}

trait TimeFormat extends js.Object {
  def apply(date: Date): js.String = ???
  var parse: js.Function1[js.String, Date] = ???
}

