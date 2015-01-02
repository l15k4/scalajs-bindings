package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js
import scala.scalajs.js.Any
import scala.scalajs.js.annotation.JSBracketAccess


trait Event extends js.Object {
  var dx: Double = js.native
  var dy: Double = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  var translate: js.Array[Double] = js.native
  var scale: Double = js.native
  var sourceEvent: Event = js.native
  var x: Double = js.native
  var y: Double = js.native
  var keyCode: Double = js.native
  var altKey: js.Any = js.native
  var `type`: String = js.native
}

trait Dispatch extends js.Object {
  @JSBracketAccess
  def apply(event: String): js.Any = js.native

  @JSBracketAccess
  def update(event: String, v: js.Any): Unit = js.native

  def on(`type`: String): js.Dynamic = js.native

  def on(`type`: String, listener: js.Any): js.Dynamic = js.native
}

trait MetricPrefix extends js.Object {
  var scale: js.Function1[Double, Double] = js.native
  var symbol: String = js.native
}

trait Dsv extends js.Object {

  /**
   * Issues an HTTP GET request for the comma-separated values (CSV) file at the specified url. The file contents are assumed to be RFC4180-compliant.
   * The mime type of the request will be "text/csv". The request is processed asynchronously, such that this method returns immediately after opening the request.
   * When the CSV data is available, the specified callback will be invoked with the parsed rows as the argument.
   * If an error occurs, the callback function will instead be invoked with null.
   * An optional accessor function may be specified, which is then passed to d3.csv.parse;
   * the accessor may also be specified by using the return request object’s row function. For example:

    d3.csv("path/to/file.csv")
        .row(function(d) { return {key: d.key, value: +d.value}; })
        .get(function(error, rows) { console.log(rows); });

   * See the unemployment choropleth for an example.
   */
  def apply[A <: js.Object](url: String, callback: js.Function2[js.Any, js.Array[A], Unit] = js.native): Xhr = js.native

  /**
   * Parses the specified string, which is the contents of a CSV file, returning an array of objects representing the parsed rows.
   * The string is assumed to be RFC4180-compliant.
   * Unlike the parseRows method, this method requires that the first line of the CSV file contains a comma-separated list of column names;
   * these column names become the attributes on the returned objects. For example, consider the following CSV file:

    Year,Make,Model,Length
    1997,Ford,E350,2.34
    2000,Mercury,Cougar,2.38

   * The resulting JavaScript array is:

    [
      {"Year": "1997", "Make": "Ford", "Model": "E350", "Length": "2.34"},
      {"Year": "2000", "Make": "Mercury", "Model": "Cougar", "Length": "2.38"}
    ]

   * Note that the values themselves are always strings; they will not be automatically converted to numbers. JavaScript may coerce strings to numbers for you automatically (for example, using the + operator). By specifying an accessor function, you can convert the strings to numbers or other specific types, such as dates:

    d3.csv("example.csv", function(d) {
      return {
        year: new Date(+d.Year, 0, 1), // convert "Year" column to Date
        make: d.Make,
        model: d.Model,
        length: +d.Length // convert "Length" column to number
      };
    }, function(error, rows) {
      console.log(rows);
    });

   * Using + rather than parseInt or parseFloat is typically faster, though more restrictive. For example, "30px" when coerced using + returns NaN, while parseInt and parseFloat return 30.
   */
  def parse(string: String): js.Array[js.Any] = js.native

  /**
   * Parses the specified string, which is the contents of a CSV file, returning an array of arrays representing the parsed rows.
   * The string is assumed to be RFC4180-compliant.
   * Unlike the parse method, this method treats the header line as a standard row, and should be used whenever the CSV file does not contain a header.
   * Each row is represented as an array rather than an object. Rows may have variable length. For example, consider the following CSV file:

    1997,Ford,E350,2.34
    2000,Mercury,Cougar,2.38
    The resulting JavaScript array is:

    [
      ["1997", "Ford", "E350", "2.34"],
      ["2000", "Mercury", "Cougar", "2.38"]
    ]

   * Note that the values themselves are always strings; they will not be automatically converted to numbers. See parse for details.

   * An optional accessor function may be specified as the second argument.
   * This function is invoked for each row in the CSV file, being passed the current row and index as two arguments.
   * The return value of the function replaces the element in the returned array of rows; if the function returns null, the row is stripped from the returned array of rows.
   * In effect, the accessor is similar to applying a map and filter operator to the returned rows.
   * The accessor function is used by parse to convert each row to an object with named attributes.
   */
  def parseRows(string: String, accessor: js.Function2[js.Array[js.Any], Double, Any]): js.Dynamic = js.native

  /**
   * Converts the specified array of rows into comma-separated values format, returning a string.
   * This operation is the reverse of parse. Each row will be separated by a newline (\n), and each column within each row will be separated by a comma (,).
   * Values that contain either commas, double-quotes (") or newlines will be escaped using double-quotes.

   * Each row should be an object, and all object properties will be converted into fields.
   * For greater control over which properties are converted, convert the rows into arrays containing only the properties that should be converted and use formatRows.
   */
  def format(rows: js.Array[js.Any]): String = js.native

  /**
   * Converts the specified array of rows into comma-separated values format, returning a string.
   * This operation is the reverse of parseRows. Each row will be separated by a newline (\n), and each column within each row will be separated by a comma (,).
   * Values that contain either commas, double-quotes (") or newlines will be escaped using double-quotes.
   */
  def formatRows(rows: js.Array[js.Any]): String = js.native
}

trait Random extends js.Object {
  def normal(mean: Double = js.native, deviation: Double = js.native): js.Function0[Double] = js.native

  def logNormal(mean: Double = js.native, deviation: Double = js.native): js.Function0[Double] = js.native

  def irwinHall(count: Double): js.Function0[Double] = js.native

  def bates(mean: Double): js.Function0[Double] = js.native
}
