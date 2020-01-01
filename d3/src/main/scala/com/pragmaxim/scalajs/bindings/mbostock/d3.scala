package com.pragmaxim.scalajs.bindings.mbostock

import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.native

@native
object d3 extends Selectors with Ajax with Interpolations with Colors {

  var behavior: Behavior = js.native

  /**
   * Stores the current event, if any. This global is during an event listener callback registered with the on operator.
   * The current event is reset after the listener is notified in a finally block.
   * This allows the listener function to have the same form as other operator functions, being passed the current datum d and index i.

   * The d3.event object is a DOM event and implements the standard event fields like timeStamp and keyCode as well as methods like preventDefault() and stopPropagation().
   * While you can use the native event's pageX and pageY, it is often more convenient to transform the event position to the local coordinate system of the container that received the event.
   * For example, if you embed an SVG in the normal flow of your page, you may want the event position relative to the top-left corner of the SVG image.
   * If your SVG contains transforms, you might also want to know the position of the event relative to those transforms.
   * Use the d3.mouse operator for the standard mouse pointer, and use d3.touches for multitouch events on iOS.
   */
  var event: Event = js.native

  /**
   * D3 provides built-in support for parsing comma-separated values, tab-separated values and arbitrary delimiter-separated values.
   * These tabular formats are popular with spreadsheet programs such as Microsoft Excel.
   * Tabular formats are often more space-efficient than JSON, which can improve loading times for large datasets.
   */
  var csv: Dsv = js.native

  /**
   * Tab-separated values are equivalent to comma-separated values, except the tab character is used as a delimiter rather than the comma.
   */
  var tsv: Dsv = js.native

  var time: Time = js.native

  var scale: ScaleBase = js.native

  var layout: Layout = js.native

  var svg: Svg = js.native

  var random: Random = js.native

  var version: String = js.native

  /**
   * @return the root selection, equivalent to d3.select(document.documentElement).
   *
   * This function can also be used to check if an object is a selection: o instanceof d3.selection.
   * You can also add new methods to the selection prototype.
   * For example, to add a convenience method for setting the "checked" property of checkboxes, you might say:

      d3.selection.prototype.checked = function(value) {
        return arguments.length < 1
            ? this.property("checked")
            : this.property("checked", value);
      }
   */
  def selection(): Selection = js.native

  var ns: js.Any = js.native

  var ease: js.Function = js.native

  var geo: Geo = js.native

  var geom: Geom = js.native

  var timer: js.Any = js.native

  /**
   * Returns -1 if a is less than b, or 1 if a is greater than b, or 0.
   * This is the comparator function for natural order, and can be used in conjunction with the built-in array sort method to arrange elements in ascending order:

    function(a, b) {
      return a < b ? -1 : a > b ? 1 : 0;
    }

   * Note that if no comparator function is specified to the built-in sort method, the default order is lexicographic (alphabetical), not natural!
   * This can lead to bugs when sorting an array of numbers.
   */
  def ascending[T](a: T, b: T): Double = js.native

  /**
   * @return -1 if a is greater than b, or 1 if a is less than b, or 0.
   * This is the comparator function for reverse natural order, and can be used in conjunction with the built-in array sort method to arrange elements in descending order:

    function(a, b) {
      return b < a ? -1 : b > a ? 1 : 0;
    }

   * Note that if no comparator function is specified to the built-in sort method, the default order is lexicographic (alphabetical), not natural!
   * This can lead to bugs when sorting an array of numbers.
   */
  def descending[T](a: T, b: T): Double = js.native

  /**
   * @return the minimum value in the given array using natural order.
   *         If the array is empty, returns undefined.
   * Unlike the built-in Math.min, this method ignores undefined values; this is useful for computing the domain of a scale while only considering the defined region of the data.
   * In addition, elements are compared using natural order rather than numeric order. For example, the minimum of ["20", "3"] is "20", while the minimum of [20, 3] is 3.
   */
  def min[T](arr: js.Array[T]): T = js.native

  /**
   * @param map accessor function, which is equivalent to calling array.map(accessor) before computing the minimum value
   * @return the minimum value in the given array using natural order.
   *         If the array is empty, returns undefined.
   * Unlike the built-in Math.min, this method ignores undefined values; this is useful for computing the domain of a scale while only considering the defined region of the data.
   * In addition, elements are compared using natural order rather than numeric order. For example, the minimum of ["20", "3"] is "20", while the minimum of [20, 3] is 3.
   */
  def min[T, U](arr: js.Array[T], map: js.Function1[T, U]): U = js.native

  /**
   * @return the maximum value in the given array using natural order.
   *         If the array is empty, returns undefined.
   * Unlike the built-in Math.max, this method ignores undefined values; this is useful for computing the domain of a scale while only considering the defined region of the data.
   * In addition, elements are compared using natural order rather than numeric order. For example, the maximum of ["20", "3"] is "3", while the maximum of [20, 3] is 20.
   */
  def max[T](arr: js.Array[T]): T = js.native

  /**
   * @param map function which is equivalent to calling array.map(accessor) before computing the maximum value
   * @return the maximum value in the given array using natural order.
   *         If the array is empty, returns undefined.
   * Unlike the built-in Math.max, this method ignores undefined values; this is useful for computing the domain of a scale while only considering the defined region of the data.
   * In addition, elements are compared using natural order rather than numeric order. For example, the maximum of ["20", "3"] is "3", while the maximum of [20, 3] is 20.
   */
  def max[T, U](arr: js.Array[T], map: js.Function1[T, U]): U = js.native

  /**
   * the minimum and maximum value in the given array using natural order. This is equivalent to calling d3.min and d3.max simultaneously.
   */
  def extent[T](arr: js.Array[T]): js.Array[T] = js.native
  def extent[T, U](arr: js.Array[T], map: js.Function1[T, U]): js.Array[U] = js.native

  /**
   * @return the sum of the given array. If the array is empty, returns 0.
   *         This method ignores invalid values such as NaN and undefined; this is useful for computing the sum of data while only considering the well-defined values.
   */
  def sum(arr: js.Array[Double]): Double = js.native


  /**
   * @param map function which is equivalent to calling array.map(accessor) before computing the sum
   * @return the sum of the given array. If the array is empty, returns 0.
   *         This method ignores invalid values such as NaN and undefined; this is useful for computing the sum of data while only considering the well-defined values.
   */
  def sum[T](arr: js.Array[T], map: js.Function1[T, Double]): Double = js.native

  /**
   * @return the mean of the given array. If the array is empty, returns undefined.
   * This method ignores invalid values such as NaN and undefined; this is useful for computing the mean of data while only considering the well-defined values.
   */
  def mean(arr: js.Array[Double]): Double = js.native

  /**
   * @param map function which is equivalent to calling array.map(accessor) before computing the mean
   * @return the mean of the given array. If the array is empty, returns undefined.
   * This method ignores invalid values such as NaN and undefined; this is useful for computing the mean of data while only considering the well-defined values.
   */
  def mean[T](arr: js.Array[T], map: js.Function1[T, Double]): Double = js.native

  /**
   * @return the median of the given array using the R-7 algorithm. If the array is empty, returns undefined.
   *         This method ignores invalid values such as NaN and undefined; this is useful for computing the median of data while only considering the well-defined values.
   */
  def median(arr: js.Array[Double]): Double = js.native

  /**
   * @param map function which is equivalent to calling array.map(accessor) before computing the median.
   * @return the median of the given array using the R-7 algorithm. If the array is empty, returns undefined.
   *         This method ignores invalid values such as NaN and undefined; this is useful for computing the median of data while only considering the well-defined values.
   */
  def median[T](arr: js.Array[T], map: js.Function1[T, Double]): Double = js.native

  /**
   * @return the p-quantile of the given sorted array of numbers, where p is a number in the range [0,1].
   *
   * For example, the median can be computed using p = 0.5, the first quartile at p = 0.25, and the third quartile at p = 0.75.
   * This particular implementation uses the R-7 algorithm, which is the default for the R programming language and Excel.
   * This method requires that numbers contains numeric elements and is already sorted in ascending order, such as by d3.ascending.

    var a = [0, 1, 3];
    d3.quantile(a, 0); // return 0
    d3.quantile(a, 0.5); // return 1
    d3.quantile(a, 1); // return 3
    d3.quantile(a, 0.25); // return 0.5
    d3.quantile(a, 0.75); // return 2
    d3.quantile(a, 0.1); // return 0.19999999999999996
   */
  var quantile: js.Function2[js.Array[Double], Double, Double] = js.native


  def bisect[T](arr: js.Array[T], x: T, low: Double = js.native, high: Double = js.native): Double = js.native

  /**
   * Locate the insertion point for x in array to maintain sorted order.
   * The arguments lo and hi may be used to specify a subset of the array which should be considered; by default the entire array is used.
   * If x is already present in array, the insertion point will be before (to the left of) any existing entries.
   * The return value is suitable for use as the first argument to splice assuming that array is already sorted.
   * The returned insertion point i partitions the array into two halves
   * so that all v < x for v in array.slice(lo, i) for the left side and all v >= x for v in array.slice(i, hi) for the right side.
   */
  def bisectLeft[T](arr: js.Array[T], x: T, low: Double = js.native, high: Double = js.native): Double = js.native

  /**
   * Similar to bisectLeft, but returns an insertion point which comes after (to the right of) any existing entries of x in array.
   * The returned insertion point i partitions the array into two halves
   * so that all v <= x for v in array.slice(lo, i) for the left side and all v > x for v in array.slice(i, hi) for the right side.
   */
  def bisectRight[T](arr: js.Array[T], x: T, low: Double = js.native, high: Double = js.native): Double = js.native

  /**
   * Returns a bisector using the specified accessor or comparator function.
   * The returned object has left and right properties which are similar to bisectLeft and bisectRight, respectively.
   * This method can be used to bisect arrays of objects instead of being limited to simple arrays of primitives.
   * For example, given the following array of objects:

    var data = [
      {date: new Date(2011,  1, 1), value: 0.5},
      {date: new Date(2011,  2, 1), value: 0.6},
      {date: new Date(2011,  3, 1), value: 0.7},
      {date: new Date(2011,  4, 1), value: 0.8}
    ];

   * A suitable bisect function could be constructed as:

    var bisect = d3.bisector(function(d) { return d.date; }).right;

   * This is equivalent to specifying a comparator:

    var bisect = d3.bisector(function(a, b) { return a.date - b.date; }).right;

   * And then applied as bisect(data, new Date(2011, 1, 2)), returning an index.
   * Use a comparator rather than an accessor if you want values to be sorted in an order different than natural order, such as in descending rather than ascending order.
   */
  def bisector(accessor: js.Function2[js.Any, Double, Any]): js.Dynamic = js.native

  /**
   * Randomizes the order of the specified array using the Fisher–Yates shuffle.
   */
  def shuffle[T](arr: js.Array[T]): js.Array[T] = js.native

  /**
   * Returns an array containing the property names of the specified object (an associative array).
   * The order of the returned array is undefined.
   */
  def keys(map: js.Any): js.Array[String] = js.native

  /**
   * Returns an array containing the property values of the specified object (an associative array).
   * The order of the returned array is undefined.
   */
  def values(map: js.Array[js.Any]): js.Array[js.Any] = js.native

  /**
   * Returns an array containing the property keys and values of the specified object (an associative array).
   * Each entry is an object with a key and value attribute, such as {key: "foo", value: 42}.
   * The order of the returned array is undefined.

    var entry = d3.entries({ foo: 42 }); // returns [{key: "foo", value: 42}]
   */
  def entries(map: js.Any): js.Array[js.Any] = js.native

  /**
   * Returns a permutation of the specified array using the specified array of indexes.
   * The returned array contains the corresponding element in array for each index in indexes, in order.
   * For example, permute(["a", "b", "c"], [1, 2, 0]) returns ["b", "c", "a"].
   * It is acceptable for the array of indexes to be a different length from the array of elements, and for indexes to be duplicated or omitted.

   * This method can also be used to extract the values from an object into an array with a stable order.
   * (Array indexes in JavaScript are simply properties which have a special relationship to .length.)
   * Extracting keyed values in order can be useful for generating data arrays in nested selections.
   * For example, we could display some of the Minnesota barley yield data above in table form:

    var cols = ["site", "variety", "yield"];
    thead.selectAll('th').data(cols).enter().append('th').text(function (d) { return d.toUpperCase(); });
    tbody.selectAll('tr').data(yields)
        .enter().append('tr').selectAll('td').data(function (row) { return d3.permute(row, cols); })
        .enter().append('td').text(function (d) { return d; });
   */
  def permute(arr: js.Array[js.Any], indexes: js.Array[js.Any]): js.Array[js.Any] = js.native

  /**
   * Returns an array of arrays, where the ith array contains the ith element from each of the argument arrays.
   * The returned array is truncated in length to the shortest array in arrays.
   * If arrays contains only a single array, the returned array contains one-element arrays.
   * With no arguments, the returned array is empty.

    d3.zip([1, 2], [3, 4]); // returns [1, 3], [2, 4]
   */
  def zip(arrs: js.Any*): js.Array[js.Any] = js.native

  /**
   *
   */
  def transform(definition: String): js.Dynamic = js.native

  /**
   * Equivalent to d3.zip.apply(null, matrix); uses the zip operator as a two-dimensional matrix transpose.
   */
  def transpose(matrix: js.Array[js.Any]): js.Array[js.Any] = js.native

  /**
   * For each adjacent pair of elements in the specified array, returns a new array of tuples of element i and element i - 1.
   * For example:

    d3.pairs([1, 2, 3, 4]); // returns [1, 2], [2, 3], [3, 4]

   * If the specified array has fewer than two elements, returns the empty array.
   */
  def pairs(): js.Array[js.Array[js.Any]] = js.native

  /**
   * Merges the specified arrays into a single array.
   * This method is similar to the built-in array concat method; the only difference is that it is more convenient when you have an array of arrays.

    d3.merge([ [1], [2, 3] ]); // returns [1, 2, 3]
   */
  def merge(map: js.Any*): js.Array[js.Any] = js.native

  /**
   * Generates an array containing an arithmetic progression, similar to the Python built-in range. T
   * his method is often used to iterate over a sequence of numeric or integer values, such as the indexes into an array.
   * Unlike the Python version, the arguments are not required to be integers, though the results are more predictable if they are due to floating point precision.
   * If step is omitted, it defaults to 1. If start is omitted, it defaults to 0.
   * The stop value is not included in the result.
   * The full form returns an array of numbers [start, start + step, start + 2 * step, …]. If step is positive, the last element is the largest start + i * step less than stop;
   * if step is negative, the last element is the smallest start + i * step greater than stop.
   * If the returned array would contain an infinite number of values, an error is thrown rather than causing an infinite loop.
   */
  def range(stop: Double, step: Double): js.Array[Double] = js.native
  def range(start: Double, stop: Double = js.native, step: Double = js.native): js.Array[Double] = js.native

  def format(specifier: String): js.Function1[Double, String] = js.native

  def formatPrefix(value: Double, precision: Double = js.native): MetricPrefix = js.native

  def mouse(container: js.Any): js.Array[Double] = js.native

  def touches(container: js.Any): js.Array[js.Array[Double]] = js.native

  def functor[R, T](value: js.Function1[R, T]): js.Function1[R, T] = js.native

  def functor[T](value: T): js.Function1[js.Any, T] = js.native

  def nest(): Nest = js.native

  /**
   * @param object to copy all enumerable properties from the object into this map.
   * @return a new map.
   */
  def map(`object`: js.Any = js.native): Map = js.native

  /**
   * @param array to be added the given array of string values to the returned set.
   * @return a new set. If array is specified
   */
  def set(array: js.Array[js.Any] = js.native): Set = js.native


  def dispatch(types: String*): Dispatch = js.native

  def rebind(target: js.Any, source: js.Any, names: js.Any*): js.Dynamic = js.native

  def requote(str: String): String = js.native

  /**
   * Create an animated transition. This is equivalent to d3.select(document).transition().
   * This method is used rarely, as it is typically easier to derive a transition from an existing selection, rather than deriving a selection from an existing transition.

   * When called with an optional selection, this method typically returns the specified selection; i.e., it is a no-op.
   * However, within the context of transition.each, this method will create a new transition for the specified selection that inherits the delay,
   * duration and other properties of the parent transition.
   * This is useful for implementing reusable components that can be called either on selections or on transitions, in the latter case supporting deriving concurrent transitions.
   * An example of this is D3’s axis component.
   */
  def transition(): Transition = js.native

  def round(x: Double, n: Double): Double = js.native

}


/**
 * D3 provides two top-level methods for selecting elements: select and selectAll.
 * These methods accept selector strings; the former selects only the first matching element,
 * while the latter selects all matching elements in document traversal order.
 * These methods can also accept nodes, which is useful for integration with third-party libraries such as jQuery or developer tools.
 */
@native
trait Selectors extends js.Object {

  /**
   * Selects the first element that matches the specified selector string, returning a single-element selection.
   * If no elements in the current document match the specified selector, returns the empty selection.
   * If multiple elements match the selector, only the first matching element (in document traversal order) will be selected.
   */
  def select(selector: String): Selection = js.native

  /**
   * Selects the specified node. This is useful if you already have a reference to a node, such as d3.select(this) within an event listener, or a global such as document.body.
   */
  def select(element: EventTarget): Selection = js.native

  /**
   * Selects all elements that match the specified selector. The elements will be selected in document traversal order (top-to-bottom).
   * If no elements in the current document match the specified selector, returns the empty selection.
   */
  def selectAll(selector: String): Selection = js.native

  /**
   * Selects the specified array of elements.
   * This is useful if you already have a reference to nodes, such as d3.selectAll(this.childNodes) within an event listener, or a global such as document.links.
   * The nodes argument doesn't have to be an array, exactly; any pseudo-array that can be coerced into an array (e.g., a NodeList or arguments) will work.
   */
  def selectAll(elements: js.Array[EventTarget]): Selection = js.native
}

@native
trait Ajax extends js.Object {

  def xhr(url: String, callback: js.Function1[XMLHttpRequest, Unit]): Xhr = js.native

  def xhr(url: String, mime: String, callback: js.Function1[XMLHttpRequest, Unit] = js.native): Xhr = js.native

  def text(url: String, callback: js.Function1[String, Unit]): Xhr = js.native

  def text(url: String, mime: String, callback: js.Function1[String, Unit] = js.native): Xhr = js.native

  def json(url: String, callback: js.Function2[js.Any, js.Any, Unit]): Xhr = js.native

  def xml(url: String, callback: js.Function1[Document, Unit]): Xhr = js.native

  def xml(url: String, mime: String, callback: js.Function1[Document, Unit] = js.native): Xhr = js.native

  def html(url: String, callback: js.Function1[DocumentFragment, Unit]): Xhr = js.native
}

@native
trait Interpolations extends js.Object {

  def interpolate: BaseInterpolate = js.native

  def interpolateNumber: BaseInterpolate = js.native

  def interpolateRound: BaseInterpolate = js.native

  def interpolateString: BaseInterpolate = js.native

  def interpolateRgb: BaseInterpolate = js.native

  def interpolateHsl: BaseInterpolate = js.native

  def interpolateHcl: BaseInterpolate = js.native

  def interpolateLab: BaseInterpolate = js.native

  def interpolateArray: BaseInterpolate = js.native

  def interpolateObject: BaseInterpolate = js.native

  def interpolateTransform: BaseInterpolate = js.native

  def interpolators: js.Array[InterpolateFactory] = js.native
}

@native
trait Colors extends js.Object {

  def rgb(r: Double, g: Double, b: Double): RGBColor = js.native

  def rgb(color: String): RGBColor = js.native

  def hcl(h: Double, c: Double, l: Double): HCLColor = js.native

  def hcl(color: String): HCLColor = js.native

  def hsl(h: Double, s: Double, l: Double): HSLColor = js.native

  def hsl(color: String): HSLColor = js.native

  def lab(l: Double, a: Double, b: Double): LABColor = js.native

  def lab(color: String): LABColor = js.native
}



