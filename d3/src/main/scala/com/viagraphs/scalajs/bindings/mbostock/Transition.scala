package com.viagraphs.scalajs.bindings.mbostock

import org.scalajs.dom.{Element, EventTarget}

import scala.scalajs.js

/**
 * Transitions are created using the transition operator on a selection.
 * Transitions start automatically upon creation after a delay which defaults to zero;
 * however, note that a zero-delay transition actually starts after a minimal (~17ms) delay, pending the first timer callback.
 * Transitions have a default duration of 250ms.
 */
trait Transition extends js.Object {

  /**
   * Specifies the transition delay in milliseconds.
   * If delay is a constant, then all elements are given the same delay
   * The default delay is 0

   * Setting the delay to be a multiple of the index i is a convenient way to stagger transitions for elements.
   * For example, if you used a fixed duration of duration, and have n elements in the current selection, you can stagger the transition over 2 * duration by saying:

      .delay(function(d, i) { return i / n * duration; })

   * You may also compute the delay as a function of the data, thereby creating a data-driven animation.
   */
  def delay(delay: Double): Transition = js.native

  /**
   * the function is evaluated for each selected element (in order),
   * being passed the current datum d and the current index i, with the this context as the current DOM element.
   * The function's return value is then used to set each element's delay.
   */
  def delay(valueFunction: js.Function2[js.Any, Double, Any]): Unit = js.native

  /**
   * @return the delay bound to the first non-null element in the transition
   */
  def delay(): Double = js.native

  /**
   * Specifies per-element duration in milliseconds. all elements are given the same duration
   */
  def duration(duration: Double): Transition = js.native

  /**
   * the function is evaluated for each selected element (in order), being passed the current datum d and the current index i, with the this context as the current DOM element.
   * The function's return value is then used to set each element's duration.
   * The default duration is 250ms.
   */
  def duration(valueFunction: js.Function2[js.Any, Double, Any]): Unit = js.native

  /**
   * @return the duration bound to the first non-null element in the transition.
   */
  def duration(): Double = js.native

  /**
   * Specifies the transition easing function which is used to ease the current parametric timing value t, which is typically in the range [0,1].
   * (At the end of a transition, t may be slightly greater than 1.)
   *
   * The default easing function is "cubic-in-out". Note that it is not possible to customize the easing function per-element or per-attribute;
   * however, if you use the "linear" easing function, you can apply custom easing inside your interpolator using attrTween or styleTween.
   */
  def ease(fn: js.Function1[Double, String]):Transition = js.native

  /**
   * value is assumed to be a string and the arguments are passed to the d3.ease method to generate an easing function.
   */
  def ease(value: String):Transition = js.native

  /**
   * @return the easing function bound to the first non-null element in the
   */
  def ease: js.Function = js.native

  /**
   * Transitions the value of the attribute with the specified name to the specified value.
   * The starting value of the transition is the current attribute value(be sure to set an initial value beforehand if you don't want bad surprises),
   * and the ending value is the specified value.
   *
   * With value being string, not function, then all elements are transitioned to the same attribute value
   * Null values are not supported because the interpolator would be undefined; if you want to remove the attribute after the transition finishes, listen to the end event.
   * An interpolator is selected automatically based on the ending value.
   * If the ending value is a number, the starting value is coerced to a number and interpolateNumber is used.
   * If the ending value is a string, a check is performed to see if the string represents a color of the form /^(#|rgb\(|hsl\()/, or one of the CSS named colors;
   * if so, the starting value is coerced to an RGB color and interpolateRgb is used.
   * Otherwise, interpolateString is used, which interpolates numbers embedded within strings.
   */
  def attr(name: String, value: js.Any): Transition = js.native

  /**
   * the function is evaluated for each selected element (in order), being passed the current datum d and the current index i, with the this context as the current DOM element.
   * The function's return value is then used to transition each element's attribute.
   * Null values are not supported because the interpolator would be undefined; if you want to remove the attribute after the transition finishes, listen to the end event.
   */
  def attr(name: String, valueFunction: js.Function2[js.Any, Double, Any]): Transition = js.native
  def attr(name: String): String = js.native
  def attr(attrValueMap: js.Any): Transition = js.native

  /**
   * Transitions the value of the attribute with the specified name according to the specified tween function.
   * The starting and ending value of the transition are determined by tween;
   * the tween function is invoked when the transition starts on each element, being passed the current datum d,
   * the current index i and the current attribute value a, with the this context as the current DOM element.
   * The return value of tween must be an interpolator: a function that maps a parametric value t in the domain [0,1] to a color, number or arbitrary value.

   * For example, the attr operator is built on top of the attrTween operator.
   * The tween function used by the attr operator depends on whether the end value is a function or a constant.
   * If the end value is a function:

    function tween(d, i, a) {
      return d3.interpolate(a, String(value.call(this, d, i)));
    }

   * Otherwise, if the end value is a constant:

    function tween(d, i, a) {
      return d3.interpolate(a, String(value));
    }

   * The attrTween operator is used when you need a custom interpolator, such as one that understands the semantics of SVG path data. One common technique is dataspace interpolation, where interpolateObject is used to interpolate two data values, and the result of this interpolation is then used (say, with a shape) to compute the new attribute value. Use the attr operator for the simpler common case where an interpolator can be automatically derived from the current attribute value to the desired end value.
   */
  def attrTween(name: String, tweenFn: js.Function3[js.Any, Double, js.Any, BaseInterpolate]): Transition = js.native

  /**
   * Transitions the value of the CSS style property with the specified name to the specified value.
   * An optional priority may also be specified, either as null or the string "important" (without the exclamation point).
   * The starting value of the transition is the current computed style property value, and the ending value is the specified value.
   *
   * With value being string, not function, then all elements are transitioned to the same style property value;
   * Null values are not supported because the interpolator would be undefined;
   * if you want to remove the style property after the transition finishes, listen to the end event.

   * An interpolator is selected automatically based on the ending value.
   * If the ending value is a number, the starting value is coerced to a number and interpolateNumber is used.
   * If the ending value is a string, a check is performed to see if the string represents a color of the form /^(#|rgb\(|hsl\()/,
   * or one of the CSS named colors; if so, the starting value is coerced to an RGB color and interpolateRgb is used.
   * Otherwise, interpolateString is used, which interpolates numbers embedded within strings.

   * Note that the computed starting value may be different than the value that was previously set,
   * particularly if the style property was set using a shorthand property (such as the "font" style, which is shorthand for "font-size", "font-face", etc.).
   * Moreover, computed dimensions such as "font-size" and "line-height" are always in pixels, so you should specify the ending value in pixels too if appropriate.
   */
  def style(name: String, value: js.Any, priority: String): Transition = js.native

  /**
   * @return style value
   */
  def style(name: String): String = js.native

  /**
   * the function is evaluated for each selected element (in order),
   * being passed the current datum d and the current index i, with the this context as the current DOM element.
   * The function's return value is then used to transition each element's style property.
   * Null values are not supported because the interpolator would be undefined;
   * if you want to remove the style property after the transition finishes, listen to the end event.
   */
  def style(name: String, valueFunction: js.Function2[js.Any, Double, Any], priority: String = js.native): Transition = js.native

  /**
   * Transitions the value of the CSS style property with the specified name according to the specified tween function.
   * An optional priority may also be specified, either as null or the string "important" (without the exclamation point).
   * The starting and ending value of the transition are determined by tween; the tween function is invoked when the transition starts on each element,
   * being passed the current datum d, the current index i and the current attribute value a, with the this context as the current DOM element.
   * The return value of tween must be an interpolator: a function that maps a parametric value t in the domain [0,1] to a color, number or arbitrary value.

   * For example, the style operator is built on top of the styleTween operator.
   * The tween function used by the style operator depends on whether the end value is a function or a constant.
   * If the end value is a function:

    function tween(d, i, a) {
      return d3.interpolate(a, String(value.call(this, d, i)));
    }

   * Otherwise, if the end value is a constant:

    function tween(d, i, a) {
      return d3.interpolate(a, String(value));
    }

   * The styleTween operator is used when you need a custom interpolator, such as one that understands the semantics of CSS3 transforms. Use the style operator for the simpler common case where an interpolator can be automatically derived from the current computed style property value to the desired end value.
   */
  def styleTween(name: String, tween: js.Function3[js.Any, Double, js.Any, BaseInterpolate], priority: String = js.native): Transition = js.native

  /**
   * The text operator is based on the textContent property; setting the text content will replace any existing child elements.

   * Set the text content to the specified value on all selected elements when the transition starts.
   * With value being string, not function, all elements are given the same text content; otherwise,
   * A null value will clear the content.
   */
  def text(text: String): Transition = js.native

  /**
   * the function is evaluated for each selected element (in order),
   * being passed the current datum d and the current index i, with the this context as the current DOM element.
   * The function's return value is then used to set each element's text content. A null value will clear the content.
   */
  def text(fn: js.Function2[js.Any, Double, js.Any]): Transition = js.native

  /**
   * Registers a custom tween for the specified name.
   * When the transition starts, the specified factory function will be invoked for each selected element in the transition,
   * being passed that element's data (d) and index (i) as arguments, with the element as the context (this).
   * The factory should return the tween function to be called over the course of the transition.
   * The tween function is then called repeatedly, being passed the current normalized time t in [0, 1]. If the factory returns null, then the tween is not run on the selected element.

   * The tween method is used internally to implement attr and style tweens, and can be used to interpolate other document content.
   * For example, to interpolate text content from 0 to 100:

    selection.transition().tween("text", function() {
      var i = d3.interpolateRound(0, 100);
      return function(t) {
        this.textContent = i(t);
      };
    });

   * Tweens are often written using closures to capture state created when the transition starts.
   * In the example above, the interpolator i is initialized when the transition starts, and then used subsequently over the course of the transition.
   * (Though note that in the above example, the starting value of the transition is hard-coded to zero,
   * whereas more commonly the starting value of the transition is based on the current state in the DOM.)
   */
  def tween(name: String, factory: InterpolateFactory): Transition = js.native

  /**
   * Remove the selected elements at the end of a transition.
   * If a newer transition is scheduled on any of the selected elements, these elements will not be removed; however, the "end" event will still be dispatched.
   */
  def remove(): Transition = js.native

  /**
   * Invokes the specified function once, passing in the current transition along with any optional arguments.
   * The call operator always returns the current transition, regardless of the return value of the specified function.
   * The call operator is identical to invoking a function by hand; but it makes it easier to use method chaining.
   * For example, say we want to set a number of attributes the same way in a number of different places.
   * So we take the code and wrap it in a reusable function:

    function foo(transition) {
      transition
          .attr("name1", "value1")
          .attr("name2", "value2");
    }

   * Now, we can say this:

    foo(d3.selectAll("div").transition())

   * Or equivalently:

    d3.selectAll("div").transition().call(foo);

   * In many cases, it is possible to call the same function foo on both transitions and selections, due to identical methods on both selections and transitions! The this context of the called function is also the current transition. This is slightly redundant with the first argument, which we might fix in the future.
   */
  def call(callback: js.Function1[Selection, Unit]): Transition = js.native

  /**
   * For each element in the current transition, selects the first descendant element that matches the specified selector string.
   * If no element matches the specified selector for the current element, the element at the current index will be null in the returned selection;
   * operators (with the exception of data) automatically skip null elements, thereby preserving the index of the existing selection.
   * If the current element has associated data, this data is inherited by the returned subselection, and automatically bound to the newly selected elements.
   * If multiple elements match the selector, only the first matching element in document traversal order will be selected.

   * This method is approximately equivalent to:

    selection.select(selector).transition()

   * where selection is the current transition's underlying selection.
   * In addition, the returned new transition inherits easing, duration and delay from the current transition.
   */
  def select(selector: String): Transition = js.native
  def select(element: EventTarget): Transition = js.native

  /**
   * For each element in the current transition, selects descendant elements that match the specified selector string.
   * The returned selection is grouped by the ancestor node in the current selection.
   * If no element matches the specified selector for the current element, the group at the current index will be empty in the returned selection.
   * The subselection does not inherit data from the current selection; however, if data was previously bound to the selected elements, that data will be available to operators.

   * This method is approximately equivalent to:

    selection.selectAll(selector).transition()

   * where selection is the current transition's underlying selection.
   * In addition, the returned new transition inherits easing, duration and delay from the current transition.
   * The duration and delay for each subelement is inherited from the duration and delay of the parent element in the current transition.
   */
  def selectAll(selector: String): Transition = js.native
  def selectAll(elements: js.Array[EventTarget]): Transition = js.native

  /**
   * Filters the transition, returning a new transition that contains only the elements for which the specified selector is true.
   * The selector may be specified either as a function or as a selector string, such as ".foo".
   * As with other operators, the function is passed the current datum d and index i, with the this context as the current DOM element.
   * Like the built-in array filter method, the returned selection does not preserve the index of the original selection; it returns a copy with elements removed.
   * If you want to preserve the index, use select instead. For example, to select every other element:

    var odds = transition.select(function(d, i) { return i & 1 ? this : null; });

   * Equivalently, using a filter function:

    var odds = transition.filter(function(d, i) { return i & 1; });

  * Or a filter selector:

    var odds = transition.filter(":nth-child(odd)");

   * Thus, you can use either select or filter to apply tweens to a subset of elements.
   */
  def filter(selector: String): Transition = js.native

  /**
   * If type is specified, adds a listener for transition events, supporting both "start" and "end" events.
   * The listener will be invoked for each individual element in the transition.
   *
   * The start event is invoked during the first asynchronous callback (tick) of the transition, before any tweens are invoked.
   * For transitions with zero delay, this is typically about 17ms after the transition is scheduled.
   * State events are useful for triggering instantaneous changes to each element, such as changing attributes that cannot be interpolated.
   *
   * The end event is invoked during the last asynchronous callback (tick) after the transition duration and delay expires,
   * after all tweens are invoked with t=1.
   * Note that if the transition is superseded by a later-scheduled transition on a given element, no end event will be dispatched for that element;
   * interrupted transitions do not trigger end events.
   * For example, transition.remove schedules each element to be removed when the transition ends, but if the transition is interrupted, the element will not be removed.
   * End events can be used as an alternative to transition.transition to create chained transitions by selecting the current element, this, and deriving a new transition.
   *
   * If type is not specified, behaves similarly to selection.each:
   * immediately invokes the specified function for each element in the current transition,
   * passing in the current datum d and index i, with the this context of the current DOM element.
   * Any transitions created within the scope of transition.each will inherit transition parameters from the parent transition, including id, delay, duration and easing.
   * Thus, transitions created within a transition.each will not interrupt the parent transition, similar to subtransitions.
   *
   * The transition.each method can be used to chain transitions and apply shared timing across a set of transitions. For example:

    d3.transition()
        .duration(750)
        .ease("linear")
        .each(function() {
          d3.selectAll(".foo").transition()
              .style("opacity", 0)
             .remove();
        })
      .transition()
        .each(function() {
          d3.selectAll(".bar").transition()
            .style("opacity", 0)
            .remove();
        });

   * By using d3.select(this) within transition.each, you can even inherit staggered delay across a set of selected elements. This technique is used by the Axis component to support automatic transitions.
   */
  var each: js.Function2[String, js.Function2[js.Any, Double, Any], Transition] = js.native

  /**
   * Creates a new transition on the same selected elements that starts when this transition ends.
   * The new transition inherits this transition’s duration and easing.
   * This can be used to define chained transitions without needing to listen for "end" events.
   */
  var transition: js.Function0[Transition] = js.native

  /**
   * @return true if the current transition is empty; a transition is empty if it contains no non-null elements.
   */
  def empty(): js.Function0[Transition] = js.native

  /**
   * @return the first non-null element in the current transition. If the transition is empty, returns null.
   */
  def node(): Element = js.native

  /**
   * @return the total number of elements in the current transition.
   */
  def size(): Transition = js.native

}

trait InterpolateFactory extends js.Object {
  def apply(a: js.Any = js.native, b: js.Any = js.native): BaseInterpolate = js.native
}

trait BaseInterpolate extends js.Object {
  def apply(a: js.Any, b: js.Any = js.native): js.Dynamic = js.native
}

trait Interpolate extends js.Object {
  def apply(t: js.Any): js.Dynamic = js.native
}