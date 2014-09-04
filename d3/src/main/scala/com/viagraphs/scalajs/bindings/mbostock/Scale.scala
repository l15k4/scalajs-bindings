package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js
import scala.scalajs.js.Date

/**
 * Scales are functions that map from an input domain to an output range.
 * Ordinal scales have a discrete domain, such as a set of names or categories.
 * There are also quantitative scales, which have a continuous domain, such as the set of real numbers.
 * Scales are an optional feature in D3; you don't have to use them, if you prefer to do the math yourself.
 * However, using scales can greatly simplify the code needed to map a dimension of data to a visual representation.
 *
 * A scale object, such as that returned by d3.scale.ordinal, is both an object and a function.
 * That is: you can call the scale like any other function, and the scale has additional methods that change its behavior.
 * Like other classes in D3, scales follow the method chaining pattern where setter methods return the scale itself, allowing multiple setters to be invoked in a concise statement.
 *
 * var scale = d3.scale.linear();
 * scale(2.5);  //Returns 2.5
 * var scale = d3.scale.linear()
 *                   .domain([100, 500])
 *                   .range([10, 350]);
 *
 * scale(100);  //Returns 10
 * scale(300);  //Returns 180
 * scale(500);  //Returns 350
 *
 */

trait ScaleBase extends js.Object {
  /**
   * @return a new linear scale with the default domain [0,1] and the default range [0,1].
   *         Thus, the default linear scale is equivalent to the identity function for numbers; for example linear(0.5) returns 0.5.
   */
  def linear(): LinearScale = ???
  /**
   * @return a new ordinal scale with an empty domain and an empty range. The ordinal scale is invalid (always returning undefined) until an output range is specified.
   */
  def ordinal(): OrdinalScale = ???

  /**
   * @return a new quantize scale with the default domain [0,1] and the default range [0,1].
   *         Thus, the default quantize scale is equivalent to the round function for numbers; for example quantize(0.49) returns 0, and quantize(0.51) returns 1.
   *
   * var q = d3.scale.quantize().domain([0, 1]).range(['a', 'b', 'c']);
   */
  def quantize(): QuantizeScale = ???
  /**
   * @return a new ordinal scale with a range of ten categorical colors
   */
  def category10(): OrdinalScale = ???
  /**
   * @return a new ordinal scale with a range of twenty categorical colors
   */
  def category20(): OrdinalScale = ???
  /**
   * @return a new ordinal scale with a range of twenty categorical colors
   */
  def category20b(): OrdinalScale = ???
  /**
   * @return a new ordinal scale with a range of twenty categorical colors
   */
  def category20c(): OrdinalScale = ???

  /**
   * @return a new identity scale with the default domain [0, 1] and the default range [0, 1]. An identity scale is always equivalent to the identity function.
   */
  def identity(): IdentityScale = ???

  /**
   * @return a new log scale with the default domain [1,10], the default range [0,1], and the base 10.
   */
  def log(): LogScale = ???

  /**
   * @return a new power scale with the default domain [0,1], the default range [0,1], and the default exponent 1.
   *         Thus, the default power scale is equivalent to the identity function for numbers; for example pow(0.5) returns 0.5.
   */
  def pow(): PowerScale = ???

  /**
   * @return a new quantile scale with an empty domain and an empty range. The quantile scale is invalid until both a domain and range are specified.
   */
  def quantile(): QuantileScale = ???

  /**
   * @return a new power scale with the default domain [0,1], the default range [0,1], and the exponent .5. This method is shorthand for:
   *
   * d3.scale.pow().exponent(.5)
   *
   * The returned scale is a function that takes a single argument x representing a value in the input domain;
   * the return value is the corresponding value in the output range.
   * Thus, the returned scale is equivalent to the sqrt function for numbers; for example sqrt(0.25) returns 0.5.
   */
  def sqrt(): SqrtScale = ???

  /**
   *
   * @return a new threshold scale with the default domain [.5] and the default range [0,1].
   *         Thus, the default quantize scale is equivalent to the round function for numbers; for example threshold(0.49) returns 0, and threshold(0.51) returns 1.
   *
   * var t = d3.scale.threshold().domain([0, 1]).range(['a', 'b', 'c']);
   * t(-1) === 'a';
   * t(0) === 'b';
   * t(0.5) === 'b';
   * t(1) === 'c';
   * t(1000) === 'c';
   * t.invertExtent('a'); //returns [undefined, 0]
   * t.invertExtent('b'); //returns [0, 1]
   * t.invertExtent('c'); //returns [1, undefined]
   */
  def threshold(): ThresholdScale = ???
}

trait Scale extends js.Object {

  def apply(value: js.Any): js.Dynamic = ???

  def domain[A <: js.Number](values: js.Array[A]): Scale = ???

  /**
   * @return the scale's current input domain.
   */
  def domain(): js.Array[js.Any] = ???
  def range(values: js.Array[js.Any]): Scale = ???

  /**
   * @return the scale's current output range.
   */
  def range(): js.Array[js.Any] = ???
  def invertExtent(y: js.Any): js.Array[js.Any] = ???
  def copy(): Scale = ???
}


/**
 * Scales are functions that map from an input domain to an output range.
 * Quantitative scales have a continuous domain, such as the set of real numbers, or dates.
 * There are also ordinal scales, which have a discrete domain, such as a set of names or categories.
 * Scales are an optional feature in D3; you don't have to use them, if you prefer to do the math yourself.
 * However, using scales can greatly simplify the code needed to map a dimension of data to a visual representation.
 * A scale object, such as that returned by d3.scale.linear, is both an object and a function.
 * That is: you can call the scale like any other function, and the scale has additional methods that change its behavior.
 * Like other classes in D3, scales follow the method chaining pattern where setter methods return the scale itself, allowing multiple setters to be invoked in a concise statement.
 */
trait QuantitiveScale extends Scale {
  def apply(value: js.Number): js.Number = ???

  /**
   * @return the value in the input domain x for the corresponding value in the output range y.
   *         This represents the inverse mapping from range to domain.
   *         For a valid value y in the output range, linear(linear.invert(y)) equals y; similarly, for a valid value x in the input domain, linear.invert(linear(x)) equals x.
   *         Equivalently, you can construct the invert operator by building a new scale while swapping the domain and range.
   *         The invert operator is particularly useful for interaction, say to determine the value in the input domain that corresponds to the pixel location under the mouse.
   * Note: the invert operator is only supported if the output range is numeric!
   * D3 allows the output range to be any type; under the hood, d3.interpolate or a custom interpolator of your choice is used to map the normalized parameter t to a value in the output range.
   * Thus, the output range may be colors, strings, or even arbitrary objects.
   * As there is no facility to "uninterpolate" arbitrary types, the invert operator is currently supported only on numeric ranges.
   */
  def invert(value: js.Number): js.Number = ???

  /**
   * If numbers is specified, sets the scale's input domain to the specified array of numbers. The array must contain two or more numbers.
   * If the elements in the given array are not numbers, they will be coerced to numbers; this coercion happens similarly when the scale is called.
   * Thus, a linear scale can be used to encode types such as date objects that can be converted to numbers; however, it is often more convenient to use d3.time.scale for dates.
   * (You can implement your own convertible number objects using valueOf.) If numbers is not specified, returns the scale's current input domain.
   * Although linear scales typically have just two numeric values in their domain, you can specify more than two values for a polylinear scale.
   * In this case, there must be an equivalent number of values in the output range.
   * A polylinear scale represents multiple piecewise linear scales that divide a continuous domain and range.
   * This is particularly useful for defining diverging quantitative scales.
   * For example, to interpolate between white and red for negative values, and white and green for positive values, say:
   *
   * var color = d3.scale.linear()
   * .domain([-1, 0, 1])
   * .range(["red", "white", "green"]);
   *
   * The resulting value of color(-.5) is rgb(255, 128, 128), and the value of color(.5) is rgb(128, 192, 128).
   * Internally, polylinear scales perform a binary search for the output interpolator corresponding to the given domain value.
   * By repeating values in both the domain and range, you can also force a chunk of the input domain to map to a constant in the output range.
   */
  def domain(values: js.Array[js.Number]): QuantitiveScale = ???

  /**
   * If values is specified, sets the scale's output range to the specified array of values.
   * The array must contain two or more values, to match the cardinality of the input domain, otherwise the longer of the two is truncated to match the other.
   * The elements in the given array need not be numbers; any value that is supported by the underlying interpolator will work.
   * However, numeric ranges are required for the invert operator. If values is not specified, returns the scale's current output range.
   */
  def range[A <: js.Number](values: js.Array[A]): QuantitiveScale = ???

  /**
   * Sets the scale's output range to the specified array of values, while also setting the scale's interpolator to d3.interpolateRound.
   * This is a convenience routine for when the values output by the scale should be exact integers, such as to avoid antialiasing artifacts.
   * It is also possible to round the output values manually after the scale is applied.
   */
  def rangeRound[A <: js.Number](values: js.Array[A]): js.Function1[js.Array[js.Any], QuantitiveScale] = ???

  /**
   * @return the scale's interpolator factory.
   */
  def interpolate(): Interpolate = ???
  /**
   * sets the scale's output interpolator using the specified factory.
   * The interpolator factory defaults to d3.interpolate, and is used to map the normalized domain parameter t in [0,1] to the corresponding value in the output range.
   * The interpolator factory will be used to construct interpolators for each adjacent pair of values from the output range.
   */
  def interpolate(factory: Interpolate): QuantitiveScale = ???

  /**
   * If boolean is specified, enables or disables clamping accordingly.
   * By default, clamping is disabled, such that if a value outside the input domain is passed to the scale, the scale may return a value outside the output range through linear extrapolation.
   * For example, with the default domain and range of [0,1], an input value of 2 will return an output value of 2.
   * If clamping is enabled, the normalized domain parameter t is clamped to the range [0,1], such that the return value of the scale is always within the scale's output range.
   * If boolean is not specified, returns whether or not the scale currently clamps values to within the output range.
   */
  def clamp(clamp: js.Boolean): QuantitiveScale = ???

  /**
   * Extends the domain so that it starts and ends on nice round values.
   * This method typically modifies the scale's domain, and may only extend the bounds to the nearest round value.
   * The precision of the round value is dependent on the extent of the domain dx according to the following formula: exp(round(log(dx)) - 1).
   * Nicing is useful if the domain is computed from data and may be irregular.
   * For example, for a domain of [0.20147987687960267, 0.996679553296417], the nice domain is [0.2, 1].
   * If the domain has more than two values, nicing the domain only affects the first and last value.
   *
   * The optional tick count argument allows greater control over the step size used to extend the bounds, guaranteeing that the returned ticks will exactly cover the domain.
   */
  def nice(count: js.Number = ???): QuantitiveScale = ???

  /**
   * @return approximately count representative values from the scale's input domain.
   *         If count is not specified, it defaults to 10. The returned tick values are uniformly spaced, have human-readable values (such as multiples of powers of 10),
   *         and are guaranteed to be within the extent of the input domain. Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
   *         The specified count is only a hint; the scale may return more or fewer values depending on the input domain.
   */
  def ticks(count: js.Number): js.Array[Double] = ???

  /**
   * Returns a number format function suitable for displaying a tick value.
   * The specified count should have the same value as the count that is used to generate the tick values.
   * You don't have to use the scale's built-in tick format, but it automatically computes the appropriate precision based on the fixed interval between tick values.
   * The optional format argument allows a format specifier to be specified, where the precision of the format is automatically substituted by the scale to be appropriate for the tick interval.
   * For example, to format percentage change, you might say:
   *
   * var x = d3.scale.linear().domain([-1, 1]);
   * console.log(x.ticks(5).map(x.tickFormat(5, "+%"))); // ["-100%", "-50%", "+0%", "+50%", "+100%"]
   * Likewise, if format uses the format type s, the scale will compute a SI-prefix based on the largest value in the domain, and use that SI-prefix for all tick values.
   * If the format already specifies a precision, this method is equivalent to d3.format.
   *
   * Note that when using a log scale in conjunction with an axis, you typically want to use axis.ticks rather than axis.tickFormat to take advantage of the log scale’s custom tick format, as in bl.ocks.org/5537697.
   */
  def tickFormat(count: js.Number): js.Function1[js.Number, js.String] = ???

  /**
   * @return an exact copy of this linear scale. Changes to this scale will not affect the returned scale, and vice versa.
   */
  override def copy(): QuantitiveScale = ???
}

/**
 * Linear scales are the most common scale, and a good default choice to map a continuous input domain to a continuous output range.
 * The mapping is linear in that the output range value y can be expressed as a linear function of the input domain value x: y = mx + b.
 * The input domain is typically a dimension of the data that you want to visualize, such as the height of students (measured in meters) in a sample population.
 * The output range is typically a dimension of the desired output visualization, such as the height of bars (measured in pixels) in a histogram.
 */
trait LinearScale extends QuantitiveScale {
  /**
   * Given a value x in the input domain, returns the corresponding value in the output range.
   * Note: some interpolators reuse return values.
   * For example, if the domain values are arbitrary objects, then d3.interpolateObject is automatically applied and the scale reuses the returned object.
   * Often, the return value of a scale is immediately used to set an attribute or style, and you don’t have to worry about this;
   * however, if you need to store the scale’s return value, use string coercion or create a copy as appropriate.
   */
  override def apply(value: js.Number): js.Number = ???
}

/**
 * Identity scales are a special case of linear scales where the domain and range are identical; the scale and its invert method are both the identity function.
 * These scales are occasionally useful when working with pixel coordinates, say in conjunction with the axis and brush components.
 */
trait IdentityScale extends Scale {
  /**
   * @return the given value x.
   */
  def apply(value: js.Number): js.Number = ???
  def invert(value: js.Number): js.Number = ???

  /**
   * Returns approximately count representative values from the scale's input domain (or equivalently, output range).
   * If count is not specified, it defaults to 10. The returned tick values are uniformly spaced, have human-readable values (such as multiples of powers of 10),
   * and are guaranteed to be within the extent of the input domain. Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
   * The specified count is only a hint; the scale may return more or fewer values depending on the input domain.
   */
  def ticks(count: js.Number): js.Array[js.Any] = ???

  /**
   * @return a number format function suitable for displaying a tick value.
   *         The specified count should have the same value as the count that is used to generate the tick values.
   *         You don't have to use the scale's built-in tick format, but it automatically computes the appropriate precision based on the fixed interval between tick values.

   * The optional format argument allows a format specifier to be specified. If the format specifier doesn’t have a defined precision, the precision will be set automatically by the scale, returning the appropriate format. This provides a convenient, declarative way of specifying a format whose precision will be automatically set by the scale.
   */
  def tickFormat(count: js.Number): js.Function1[js.Number, js.String] = ???
}

trait SqrtScale extends QuantitiveScale {
  override def apply(value: js.Number): js.Number = ???
}

/**
 * Power scales are similar to linear scales, except there's an exponential transform that is applied to the input domain value before the output range value is computed.
 * The mapping to the output range value y can be expressed as a function of the input domain value x: y = mx2k + b, where k is the exponent value.
 * Power scales also support negative values, in which case the input value is multiplied by -1, and the resulting output value is also multiplied by -1.
 */
trait PowerScale extends QuantitiveScale {
  /**
   * Given a value x in the input domain, returns the corresponding value in the output range.
   *
   * Note: some interpolators reuse return values.
   * For example, if the domain values are arbitrary objects, then d3.interpolateObject is automatically applied and the scale reuses the returned object.
   * Often, the return value of a scale is immediately used to set an attribute or style, and you don’t have to worry about this; however, if you need to store the scale’s return value, use string coercion or create a copy as appropriate.
   */
  override def apply(value: js.Number): js.Number = ???
}

/**
 * Log scales are similar to linear scales, except there's a logarithmic transform that is applied to the input domain value before the output range value is computed.
 * The mapping to the output range value y can be expressed as a function of the input domain value x: y = m log(x) + b.
 * As log(0) is negative infinity, a log scale must have either an exclusively-positive or exclusively-negative domain; the domain must not include or cross zero.
 * A log scale with a positive domain has a well-defined behavior for positive values,
 * and a log scale with a negative domain has a well-defined behavior for negative values (the input value is multiplied by -1,
 * and the resulting output value is also multiplied by -1).
 * The behavior of the scale is undefined if you pass a negative value to a log scale with a positive domain or vice versa.
 */
trait LogScale extends QuantitiveScale {
  /**
   * Given a value x in the input domain, returns the corresponding value in the output range.
   * Note: some interpolators reuse return values.
   * For example, if the domain values are arbitrary objects, then d3.interpolateObject is automatically applied and the scale reuses the returned object.
   * Often, the return value of a scale is immediately used to set an attribute or style, and you don’t have to worry about this;
   * however, if you need to store the scale’s return value, use string coercion or create a copy as appropriate.
   */
  override def apply(value: js.Number): js.Number = ???
}

trait OrdinalScale extends Scale {
  /**
   * Given a value x in the input domain, returns the corresponding value in the output range.
   * If the range was specified explicitly (as by range, but not rangeBands, rangeRoundBands or rangePoints),
   * and the given value x is not in the scale’s domain, then x is implicitly added to the domain;
   * subsequent invocations of the scale given the same value x will return the same value y from the range.
   */
  override def apply(value: js.Any): js.Dynamic = ???

  /**
   * If values is specified, sets the input domain of the ordinal scale to the specified array of values.
   * The first element in values will be mapped to the first element in the output range, the second domain value to the second range value, and so on.
   * Domain values are stored internally in an associative array as a mapping from value to index;
   * the resulting index is then used to retrieve a value from the output range.
   * Thus, an ordinal scale's values must be coercible to a string, and the stringified version of the domain value uniquely identifies the corresponding range value.
   * If values is not specified, this method returns the current domain.
   *
   * Setting the domain on an ordinal scale is optional. If no domain is set, a range must be set explicitly.
   * Then, each unique value that is passed to the scale function will be assigned a new value from the output range;
   * in other words, the domain will be inferred implicitly from usage.
   * Although domains may thus be constructed implicitly, it is still a good idea to assign the ordinal scale's domain explicitly to ensure deterministic behavior,
   * as inferring the domain from usage will be dependent on ordering.
   */
  def domain(values: js.Array[js.Any]): OrdinalScale = ???

  override def domain(): js.Array[js.Any] = ???

  /**
   * If values is specified, sets the output range of the ordinal scale to the specified array of values.
   * The first element in the domain will be mapped to the first element in values, the second domain value to the second range value, and so on.
   * If there are fewer elements in the range than in the domain, the scale will recycle values from the start of the range.
   * If values is not specified, this method returns the current output range.
   *
   * This method is intended for when the set of discrete output values is computed explicitly, such as a set of categorical colors.
   * In other cases, such as determining the layout of an ordinal scatterplot or bar chart, you may find the rangePoints or rangeBands operators more convenient.
   */
  def range[A <: js.Any](values: js.Array[A]): OrdinalScale = ???
  override def range(): js.Array[js.Any] = ???

  /**
   * Sets the output range from the specified continuous interval.
   * The array interval contains two elements representing the minimum and maximum numeric value.
   * This interval is subdivided into n evenly-spaced points, where n is the number of (unique) values in the input domain.
   * The first and last point may be offset from the edge of the interval according to the specified padding, which defaults to zero.
   * The padding is expressed as a multiple of the spacing between points.
   * A reasonable value is 1.0, such that the first and last point will be offset from the minimum and maximum value by half the distance between points.
   */
  def rangePoints(interval: js.Array[js.Any], padding: js.Number = ???): OrdinalScale = ???

  /**
   * Sets the output range from the specified continuous interval.
   * The array interval contains two elements representing the minimum and maximum numeric value.
   * This interval is subdivided into n evenly-spaced bands, where n is the number of (unique) values in the input domain.
   * The bands may be offset from the edge of the interval and other bands according to the specified padding, which defaults to zero.
   * The padding is typically in the range [0,1] and corresponds to the amount of space in the range interval to allocate to padding.
   * A value of 0.5 means that the band width will be equal to the padding width.
   * The outerPadding argument is for the entire group of bands; a value of 0 means there will be padding only between rangeBands.
   */
  def rangeBands(interval: js.Array[js.Any], padding: js.Number = ???, outerPadding: js.Number = ???): OrdinalScale = ???

  /**
   * Like rangeBands, except guarantees that the band width and offset are integer values, so as to avoid antialiasing artifacts.
   */
  def rangeRoundBands(interval: js.Array[js.Any], padding: js.Number = ???, outerPadding: js.Number = ???): OrdinalScale = ???

  /**
   * @return the band width. When the scale’s range is configured with rangeBands or rangeRoundBands, the scale returns the lower value for the given input.
   * The upper value can then be computed by offsetting by the band width. If the scale’s range is set using range or rangePoints, the band width is zero.
   */
  def rangeBand(): js.Number = ???

  /**
   *
   * @return a two-element array representing the extent of the scale's range, i.e., the smallest and largest values.
   */
  def rangeExtent(): js.Array[js.Any] = ???

  /**
   * @return an exact copy of this ordinal scale. Changes to this scale will not affect the returned scale, and vice versa.
   */
  override def copy(): OrdinalScale = ???
}

/**
 * Quantize scales are a variant of linear scales with a discrete rather than continuous range.
 * The input domain is still continuous, and divided into uniform segments based on the number of values in (the cardinality of) the output range.
 * The mapping is linear in that the output range value y can be expressed as a linear function of the input domain value x: y = mx + b.
 * The input domain is typically a dimension of the data that you want to visualize, such as the height of students (measured in meters) in a sample population.
 * The output range is typically a dimension of the desired output visualization, such as the height of bars (measured in pixels) in a histogram.
 */
trait QuantizeScale extends Scale {
  /**
   * Given a value x in the input domain, returns the corresponding value in the output range.
   */
  override def apply(value: js.Any): js.Dynamic = ???

  /**
   * If numbers is specified, sets the scale's input domain to the specified two-element array of numbers.
   * If the array contains more than two numbers, only the first and last number are used.
   * If the elements in the given array are not numbers, they will be coerced to numbers; this coercion happens similarly when the scale is called.
   * Thus, a quantize scale can be used to encode any type that can be converted to numbers. If numbers is not specified, returns the scale's current input domain.
   */
  def domain(values: js.Array[js.Number]): QuantizeScale = ???
  override def domain(): js.Array[js.Any] = ???

  /**
   * If values is specified, sets the scale's output range to the specified array of values.
   * The array may contain any number of discrete values.
   * The elements in the given array need not be numbers; any value or type will work.
   * If values is not specified, returns the scale's current output range.
   */
  def range[A <: js.Any](values: js.Array[A]): QuantizeScale = ???
  override def range(): js.Array[js.Any] = ???

  /**
   * @return an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
   */
  override def copy(): QuantizeScale = ???
}

/**
 * Threshold scales are similar to quantize scales, except they allow you to map arbitrary subsets of the domain to discrete values in the range.
 * The input domain is still continuous, and divided into slices based on a set of threshold values.
 * The input domain is typically a dimension of the data that you want to visualize, such as the height of students (measured in meters) in a sample population.
 * The output range is typically a dimension of the desired output visualization, such as a set of colors (represented as strings).
 */
trait ThresholdScale extends Scale {
  /**
   * Given a value x in the input domain, returns the corresponding value in the output range.
   */
  override def apply(value: js.Any): js.Dynamic = ???

  /**
   * If domain is specified, sets the scale's input domain to the specified array of values.
   * The values must be in sorted ascending order, or the behavior of the scale is undefined.
   * The values are typically numbers, but any naturally ordered values (such as strings) will work.
   * Thus, a threshold scale can be used to encode any type that is ordered.
   * If the number of values in the scale's range is N + 1, the number of values in the scale's domain must be N.
   * If there are fewer than N elements in the domain, the additional values in the range are ignored.
   * If there are more than N elements in the domain, the scale may return undefined for some inputs. If domain is not specified, returns the scale's current input domain.
   */
  def domain(values: js.Array[js.Number]): ThresholdScale = ???
  override def domain(): js.Array[js.Any] = ???

  /**
   * If values is specified, sets the scale's output range to the specified array of values.
   * If the number of values in the scale's domain is N, the number of values in the scale's range must be N + 1.
   * If there are fewer than N+1 elements in the range, the scale may return undefined for some inputs.
   * If there are more than N + 1 elements in the range, the additional values are ignored. The elements in the given array need not be numbers; any value or type will work.
   * If values is not specified, returns the scale's current output range.
   */
  def range[A <: js.Any](values: js.Array[A]): ThresholdScale = ???
  override def range(): js.Array[js.Any] = ???

  /**
   * @return an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
   */
  override def copy(): ThresholdScale = ???
}

/**
 * Quantile scales map an input domain to a discrete range.
 * Although the input domain is continuous and the scale will accept any reasonable input value, the input domain is specified as a discrete set of values.
 * The number of values in (the cardinality of) the output range determines the number of quantiles that will be computed from the input domain.
 * To compute the quantiles, the input domain is sorted, and treated as a population of discrete values.
 * The input domain is typically a dimension of the data that you want to visualize, such as the daily change of the stock market.
 * The output range is typically a dimension of the desired output visualization, such as a diverging color scale.
 */
trait QuantileScale extends Scale {
  /**
   * @return a value x in the input domain, returns the corresponding value in the output range.
   */
  override def apply(value: js.Any): js.Dynamic = ???

  /**
   * If numbers is specified, sets the input domain of the quantile scale to the specified set of discrete numeric values.
   * The array must not be empty, and must contain at least one numeric value; NaN, null and undefined values are ignored and not considered part of the sample population.
   * If the elements in the given array are not numbers, they will be coerced to numbers; this coercion happens similarly when the scale is called.
   * A copy of the input array is sorted and stored internally. Thus, a quantile scale can be used to encode any type that can be converted to numbers.
   * If numbers is not specified, returns the scale's current input domain.
   */
  def domain(values: js.Array[js.Number]): QuantileScale = ???
  override def domain(): js.Array[js.Any] = ???

  /**
   * If values is specified, sets the discrete values in the output range.
   * The array must not be empty, and may contain any type of value.
   * The number of values in (the cardinality, or length, of) the values array determines the number of quantiles that are computed.
   * For example, to compute quartiles, values must be an array of four elements such as [0, 1, 2, 3].
   * If values is not specified, returns the current output range.
   */
  def range[A <: js.Any](values: js.Array[A]): QuantileScale = ???
  override def range(): js.Array[js.Any] = ???

  /**
   * @return the quantile thresholds. If the output range contains n discrete values, the returned threshold array will contain n - 1 values.
   *         Values less than the first element in the thresholds array, quantiles()[0], are considered in the first quantile; greater values less than the second threshold are in the second quantile, and so on.
   *         Internally, the thresholds array is used with d3.bisect to find the output quantile associated with the given input value.
   */
  def quantiles(): js.Array[js.Any] = ???

  /**
   * @return an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
   */
  override def copy(): QuantileScale = ???
}

/**
 * D3's time scale is an extension of d3.scale.linear that uses JavaScript Date objects as the domain representation.
 * Thus, unlike the normal linear scale, domain values are coerced to dates rather than numbers; similarly, the invert function returns a date.
 * Most conveniently, the time scale also provides suitable ticks based on time intervals, taking the pain out of generating axes for nearly any time-based domain.
 * A scale object, such as that returned by d3.time.scale, is both an object and a function.
 * That is: you can call the scale like any other function, and the scale has additional methods that change its behavior.
 * Like other classes in D3, scales follow the method chaining pattern where setter methods return the scale itself, allowing multiple setters to be invoked in a concise statement.
 */
trait TimeScale extends Scale {
  /**
   * @return Given a date x in the input domain, returns the corresponding value in the output range.
   */
  def apply(value: Date): js.Number = ???

  /**
   * Returns the date in the input domain x for the corresponding value in the output range y.
   * This represents the inverse mapping from range to domain.
   * For a valid value y in the output range, scale(scale.invert(y)) equals y; similarly, for a valid date x in the input domain, scale.invert(scale(x)) equals x.
   * The invert operator is particularly useful for interaction, say to determine the date in the input domain that corresponds to the pixel location under the mouse.
   */
  def invert(value: js.Number): Date = ???

  /**
   * If dates is specified, sets the scale's input domain to the specified array of dates.
   * The array must contain two or more dates.
   * If the elements in the given array are not dates, they will be coerced to dates; this coercion happens similarly when the scale is called.
   * If dates is not specified, returns the scale's current input domain.
   * Although time scales typically have just two dates in their domain, you can specify more than two dates for a polylinear scale.
   * In this case, there must be an equivalent number of values in the output range.
   */
  def domain(values: js.Array[js.Any]): TimeScale = ???
  override def domain(): js.Array[js.Any] = ???

  /**
   * If values is specified, sets the scale's output range to the specified array of values.
   * The array must contain two or more values, to match the cardinality of the input domain.
   * The elements in the given array need not be numbers; any value that is supported by the underlying interpolator will work.
   * However, numeric ranges are required for the invert operator. If values is not specified, returns the scale's current output range.
   */
  def range[A <: js.Any](values: js.Array[A]): QuantileScale = ???
  override def range(): js.Array[js.Any] = ???

  /**
   * Sets the scale's output range to the specified array of values, while also setting the scale's interpolator to d3.interpolateRound.
   * This is a convenience routine for when the values output by the scale should be exact integers, such as to avoid antialiasing artifacts.
   * It is also possible to round the output values manually after the scale is applied.
   */
  def rangeRound[A <: js.Any](values: js.Array[A]): js.Function1[js.Array[js.Any], TimeScale] = ???

  /**
   * If factory is specified, sets the scale's output interpolator using the specified factory.
   * The interpolator factory defaults to d3.interpolate, and is used to map the normalized domain parameter t in [0,1] to the corresponding value in the output range.
   * The interpolator factory will be used to construct interpolators for each adjacent pair of values from the output range.
   * If factory is not specified, returns the scale's interpolator factory.
   */
  def interpolate(factory: InterpolateFactory): TimeScale = ???
  def interpolate(): Interpolate = ???

  /**
   * If boolean is specified, enables or disables clamping accordingly.
   * By default, clamping is disabled, such that if a value outside the input domain is passed to the scale, the scale may return a value outside the output range through linear extrapolation.
   * For example, with the default domain and range of [0,1], an input value of 2 will return an output value of 2.
   * If clamping is enabled, the normalized domain parameter t is clamped to the range [0,1], such that the return value of the scale is always within the scale's output range.
   * If boolean is not specified, returns whether or not the scale currently clamps values to within the output range.
   */
  def clamp(clamp: js.Boolean): TimeScale = ???

  /**
   * Extends the domain so that it starts and ends on nice round values as determined by the specified time interval and optional step count.
   * As an alternative to specifying an explicit time interval, a numeric count can be specified, and a time interval will be chosen automatically to be consistent with scale.ticks.
   * If count is not specified, it defaults to 10.
   *
   * This method typically extends the scale's domain, and may only extend the bounds to the nearest round value.
   * Nicing is useful if the domain is computed from data and may be irregular.
   * For example, for a domain of [2009-07-13T00:02, 2009-07-13T23:48], the nice domain is [2009-07-13, 2009-07-14].
   * If the domain has more than two values, nicing the domain only affects the first and last value.
   */
  def nice(count: js.Number = ???): TimeScale = ???

  /**
   * Returns representative dates from the scale's input domain.
   * The returned tick dates are uniformly spaced (modulo irregular time intervals, such as months and leap years),
   * have human-readable values (such as midnights), and are guaranteed to be within the extent of the input domain.
   * Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
   *
   * If count is a number, then approximately count ticks will be returned. If count is not specified, it defaults to 10.
   * The specified count is only a hint; the scale may return more or fewer values depending on the input domain.
   * If a time interval is specified, then the time interval’s range function will be used to generate ticks, being passed the optional step argument, if any.
   * For example, to create ten default ticks, say:
   *
   * scale.ticks(10);
   * While to create ticks at 15-minute intervals, say:
   *
   * scale.ticks(d3.time.minute, 15);
   * Note: for UTC scales, be sure to use the appropriate UTC range method (such as d3.time.minute.utc).
   *
   * The following time intervals are considered for automatic ticks:
   *
   * 1-, 5-, 15- and 30-second.
   * 1-, 5-, 15- and 30-minute.
   * 1-, 3-, 6- and 12-hour.
   * 1- and 2-day.
   * 1-week.
   * 1- and 3-month.
   * 1-year.
   * This set of time intervals is somewhat arbitrary and additional values may be added in the future.
   */
  def ticks(count: js.Number): js.Array[js.Any] = ???
  def ticks(range: Range, count: js.Number): js.Array[js.Any] = ???

  /**
   * Returns a time format function suitable for displaying a tick value.
   * The specified count should have the same value as the count that is used to generate the tick values.
   * You don't have to use the scale's built-in tick format, but it automatically computes the appropriate display based on the input date.
   *
   * The following time formats are considered:
   *
   * %Y - for year boundaries, such as "2011".
   * %B - for month boundaries, such as "February".
   * %b %d - for week boundaries, such as "Feb 06".
   * %a %d - for day boundaries, such as "Mon 07".
   * %I %p - for hour boundaries, such as "01 AM".
   * %I:%M - for minute boundaries, such as "01:23".
   * :%S - for second boundaries, such as ":45".
   * .%L - milliseconds for all other times, such as ".012".
   *
   * By using multi-scale time formats, the default tick format provides both local and global context for each time interval. For example, by showing the sequence [11 PM, Mon 07, 01 AM], the tick formatter reveals information about hours, dates, and day simultaneously—rather than just the hours. If you'd prefer single-scale time formatting, you can always use your own d3.time.format. You can also roll your own custom multi-scale time format.
   */
  def tickFormat(count: js.Number): js.Function1[js.Number, js.String] = ???

  /**
   * @return an exact copy of this time scale. Changes to this scale will not affect the returned scale, and vice versa.
   */
  override def copy(): TimeScale = ???
}

