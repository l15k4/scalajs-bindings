package com.viagraphs.scalajs.bindings.mbostock

import org.scalajs.dom.Element

import scala.scalajs.js

trait Selection extends js.Array[js.Any] with Selectors with EnterSelection {

  /**
   * @return the value of the specified attribute for the first non-null element in the selection. This is generally useful only if you know that the selection contains exactly one element.
   */
  def attr(name: String): String = js.native

  /**
   * sets the attribute with the specified name to the specified value on all selected elements.
   * all elements are given the same attribute value;

   * The specified name may have a namespace prefix, such as xlink:href, to specify an "href" attribute in the XLink namespace.
   * By default, D3 supports svg, xhtml, xlink, xml, and xmlns namespaces. Additional namespaces can be registered by adding to d3.ns.prefix.

   * name can also be an Object of name and value attributes.
   */
  def attr(name: String, value: js.Any): Selection = js.native

  /**
   * the function is evaluated for each selected element (in order), being passed the current datum d and the current index i, with the this context as the current DOM element.
   * The function's return value is then used to set each element's attribute. A null value will remove the specified attribute.
   */
  def attr[A <: Any](name: String, valueFunction: js.Function2[A, Double, Any]): Selection = js.native

  /**
   * If you want to set several attributes at once, use an object literal
   */
  def attr(attrValueMap: Object): Selection = js.native

  /**
   * @return true if and only if the first non-null element in this selection has the specified class. This is generally useful only if you know the selection contains exactly one element.
   */
  def classed(name: String): String = js.native

  /**
   * This operator is a convenience routine for setting the "class" attribute; it understands that the "class" attribute is a set of tokens separated by spaces.
   * Under the hood, it will use the classList if available, for convenient adding, removing and toggling of CSS classes.

   * sets whether or not the specified class is associated with the selected elements.
   * If value is a constant and truthy, then all elements are assigned the specified class, if not already assigned;
   * if falsey, then the class is removed from all selected elements, if assigned.

   * If you want to set several classes at once, use an object literal like so: selection.classed({'foo': true, 'bar': false}), or use a space-separated list of class names like so: selection.classed('foo bar', true).
   */
  def classed(name: String, value: js.Any): Selection = js.native

  /**
   * the function is evaluated for each selected element (in order), being passed the current datum d and the current index i, with the this context as the current DOM element.
   * The function's return value is then used to assign or unassign the specified class on each element.
   */
  def classed(name: String, valueFunction: js.Function2[js.Any, Double, Any]): Selection = js.native


  /**
   * the current computed value of the specified style property for the first non-null element in the selection.
   * This is generally useful only if you know the selection contains exactly one element.
   * @note that the computed value may be different than the value that was previously set,
   * particularly if the style property was set using a shorthand property (such as the "font" style, which is shorthand for "font-size", "font-face", etc.).
   */
  def style(name: String): String = js.native

  /**
   * sets the CSS style property with the specified name to the specified value on all selected elements.
   * If value is a constant, then all elements are given the same style value;
   * A null value will remove the style property. An optional priority may also be specified, either as null or the string "important" (without the exclamation point).
   */
  def style(name: String, value: js.Any, priority: String): Selection = js.native

  /**
   * the function is evaluated for each selected element (in order), being passed the current datum d and the current index i, with the this context as the current DOM element.
   * The function's return value is then used to set each element's style property. A null value will remove the style property.
   */
  def style[A <: js.Object](name: String, valueFunction: Function2[A, Double, js.Dynamic], priority: String = js.native): Selection = js.native

  /**
   * If you want to set several style properties at once, use an object literal like so: selection.style({'stroke': 'black', 'stroke-width': 2})
   */
  def style(styleValueMap: Object): Selection = js.native


  /**
   * the value of the specified property for the first non-null element in the selection. This is generally useful only if you know the selection contains exactly one element.
   */
  def property(name: String): Unit = js.native

  /**
   * Some HTML elements have special properties that are not addressable using standard attributes or styles.
   * For example, form text fields have a value string property, and checkboxes have a checked boolean property.
   * You can use the property operator to get or set these properties, or any other addressable field on the underlying element, such as className.

   * sets the property with the specified name to the specified value on all selected elements.
   * If value is a constant, then all elements are given the same property value;
   * A null value will delete the specified attribute.
   */
  def property(name: String, value: js.Any): Selection = js.native

  /**
   * the function is evaluated for each selected element (in order), being passed the current datum d and the current index i, with the this context as the current DOM element.
   * The function's return value is then used to set each element's property.A null value will delete the specified attribute.
   */
  def property(name: String, valueFunction: js.Function2[js.Any, Double, Any]): Selection = js.native

  /**
   * If you want to set several properties at once, use an object literal like so: selection.property({'foo': 'bar', 'baz': 'qux'}).
   */
  def property(propertyValueMap: Object): Selection = js.native

  /**
   * @return the text content for the first non-null element in the selection.
   *         This is generally useful only if you know the selection contains exactly one element.
   */
  def text(): String = js.native

  /**
   * The text operator is based on the textContent property; setting the text content will replace any existing child elements.

   * sets the text content to the specified value on all selected elements.
   * If value is a constant, then all elements are given the same text content;
   * A null value will clear the content.
   */
  def text(value: String): Selection = js.native

  /**
   * the function is evaluated for each selected element (in order), being passed the current datum d and the current index i, with the this context as the current DOM element.
   * The function's return value is then used to set each element's text content.
   *
   */
  def text[A <: js.Any](valueFunction: js.Function2[A, Double, String]): Selection = js.native


  /**
   * @return the inner HTML content for the first non-null element in the selection.
   *         This is generally useful only if you know the selection contains exactly one element.
   */
  def html(): String = js.native

  /**
   * The html operator is based on the innerHTML property; setting the inner HTML content will replace any existing child elements.
   * Also, you may prefer to use the append or insert operators to create HTML content in a data-driven way;
   * this operator is intended for when you want a little bit of HTML, say for rich formatting.

   * sets the inner HTML content to the specified value on all selected elements.
   * If value is a constant, then all elements are given the same inner HTML content;
   * A null value will clear the content.

   * Note: as its name suggests, selection.html is only supported on HTML elements.
   * SVG elements and other non-HTML elements do not support the innerHTML property, and thus are incompatible with selection.html.
   * Consider using XMLSerializer to convert a DOM subtree to text.
   *
   * See also the innersvg polyfill, which provides a shim to support the innerHTML property on SVG elements.
   */
  def html(value: js.Any): Selection = js.native

  /**
   * the function is evaluated for each selected element (in order), being passed the current datum d and the current index i, with the this context as the current DOM element.
   * The function's return value is then used to set each element's inner HTML content.
   * A null value will clear the content.
   */
  def html(valueFunction: js.Function2[js.Any, Double, Any]): Selection = js.native

  /**
   * Removes the elements in the current selection from the current document.
   *
   * @note that there is not currently a dedicated API to add removed elements back to the document; however, you can pass a function to selection.append or selection.insert to re-add elements.
   *
   * @return the current selection (the same elements that were removed) which are now “off-screen”, detached from the DOM.
   */
  var remove: js.Function0[Selection] = js.native

  /**
   * Joins the specified array of data with the current selection.
   * If a key function is not specified, then the first datum in the specified array is assigned to the first element in the current selection, the second datum to the second selected element, and so on.
   * When data is assigned to an element, it is stored in the property __data__, thus making the data "sticky" so that the data is available on re-selection.

   * The values array specifies the data for each group in the selection.
   * Thus, if the selection has multiple groups (such as a d3.selectAll followed by a selection.selectAll), then data should be specified as a function that returns an array (assuming that you want different data for each group).
   * For example, you may bind a two-dimensional array to an initial selection, and then bind the contained inner arrays to each subselection.
   * The values function in this case is the identity function: it is invoked for each group of child elements, being passed the data bound to the parent element, and returns this array of data.

    var matrix = [
      [11975,  5871, 8916, 2868],
      [ 1951, 10048, 2060, 6171],
      [ 8010, 16145, 8090, 8045],
      [ 1013,   990,  940, 6907]
    ];

    var tr = d3.select("body").append("table").selectAll("tr")
        .data(matrix)
      .enter().append("tr");

    var td = tr.selectAll("td")
        .data(function(d) { return d; })
      .enter().append("td")
        .text(function(d) { return d; });

   * To control how data is joined to elements, a key function may be specified.
   * This replaces the default by-index behavior; the key function is invoked once for each element in the new data array, and once again for each existing element in the selection.
   * In both cases the key function is passed the datum d and the index i. When the key function is evaluated on new data elements, the this context is the data array;
   * when the key function is evaluated on the existing selection, the this context is the associated DOM element.
   * The key function returns a string which is used to join a datum with its corresponding element, based on the previously-bound data.
   * For example, if each datum has a unique field name, the join might be specified as:

    .data(data, function(d) { return d.name; })

   * The result of the data operator is the update selection; this represents the selected DOM elements that were successfully bound to the specified data elements.
   * The update selection also contains a reference to the enter and exit selections, for adding and removing nodes in correspondence with data.
   * For example, if the default by-index key is used, and the existing selection contains fewer elements than the specified data, then the enter selection will contain placeholders for the new data.
   * On the other hand, if the existing contains more elements than the data, then the exit selection will contain the extra elements.
   * And, if the existing selection exactly matches the data, then both the enter and exit selections will be empty, with all nodes in the update selection.

   * If a key function is specified, the data operator also affects the index of nodes; this index is passed as the second argument i to any operator function values.
   * However, @note that existing DOM elements are not automatically reordered; use sort or order as needed.
   *
   * Note: the data method cannot be used to clear previously-bound data; use selection.datum instead.

   * @param values array of data values, such as an array of numbers or objects
   */
  def data[A](values: js.Array[A]): UpdateSelection = js.native

  /**
   * @param values function that returns an array of values
   */
  def data[A](values: js.Function2[Double, Int, js.Array[A]]): UpdateSelection = js.native

  /**
   * @return the array of data for the first group in the selection.
             The length of the returned array will match the length of the first group, and the index of each datum in the returned array will match the corresponding index in the selection.
             If some of the elements in the selection are null, or if they have no associated data, then the corresponding element in the array will be undefined.
   *
   */
  def data(): js.Array[js.Any] = js.native

  /**
   * Gets or sets the bound data for each selected element. Unlike the selection.data method, this method does not compute a join (and thus does not compute enter and exit selections).
   * This method is implemented on top of selection.property:

    d3.selection.prototype.datum = function(value) {
      return arguments.length < 1
          ? this.property("__data__")
          : this.property("__data__", value);
    };

   * sets the element's bound data to the specified value on all selected elements.
   *
   * The function is evaluated for each selected element, being passed the previous datum d and the current index i, with the this context as the current DOM element.
   * The function is then used to set each element's data. A null value will delete the bound data. This operator has no effect on the index.

   * The datum method is useful for accessing HTML5 custom data attributes with D3. For example, given the following elements:

    <ul id="list">
      <li data-username="shawnbot">Shawn Allen</li>
      <li data-username="mbostock">Mike Bostock</li>
    </ul>

   * You can expose the custom data attributes to D3 by setting each element’s data as the built-in dataset property:

    selection.datum(function() { return this.dataset; })

   * This can then be used, for example, to sort elements by username.
   */
  def datum(values: js.Function2[js.Any, Double, Any]): UpdateSelection = js.native

  /**
   * all elements are given the same value data
   * A null value will delete the bound data. This operator has no effect on the index.
   */
  def datum(value: js.Any): Selection = js.native

  /**
   * @return the bound datum for the first non-null element in the selection. This is generally useful only if you know the selection contains exactly one element.
   */
  def datum(): js.Dynamic = js.native

  /**
   * Filters the selection, returning a new selection that contains only the elements for which the specified selector is true.
   * The selector may be specified either as a function or as a selector string, such as ".foo".
   * As with other operators, the function is passed the current datum d and index i, with the this context as the current DOM element.
   * Filter should only be called on selections with DOM elements bound, e.g. from append or insert.
   * To bind elements to only a subset of the data, call the built-in array filter on the argument to data.
   * Like the built-in function, D3's filter does not preserve the index of the original selection in the returned selection; it returns a copy with elements removed.
   * If you want to preserve the index, use select instead.

   * For example, to select every element with an odd index (relative to the zero-based index):

    var odds = selection.select(function(d, i) { return i & 1 ? this : null; });

   * Equivalently, using a filter function:

    var odds = selection.filter(function(d, i) { return i & 1; });

   * Or a filter selector (noting that the :nth-child pseudo-class is a one-based index rather than a zero-based index):

    var odds = selection.filter(":nth-child(even)");

   * Thus, you can use either select or filter to apply operators to a subset of elements.
   */
  def filter(filter: js.Function2[js.Any, Double, Boolean], thisArg: js.Any = js.native): UpdateSelection = js.native

  /**
   * Invokes the specified function for each element in the current selection, passing in the current datum d and index i, with the this context of the current DOM element.
   * This operator is used internally by nearly every other operator, and can be used to invoke arbitrary code for each selected element.
   * The each operator can be used to process selections recursively, by using d3.select(this) within the callback function.
   */
  def each(eachFunction: js.Function2[js.Any, Double, Any]): Selection = js.native

  /**
   * Adds or removes an event listener to each element in the current selection, for the specified type.
   * The type is a string event type name, such as "click", "mouseover", or "submit".
   * The specified listener is invoked in the same manner as other operator functions, being passed the current datum d and index i, with the this context as the current DOM element.
   * To access the current event within a listener, use the global d3.event.
   * The return value of the event listener is ignored.
   *
   * If an event listener was already registered for the same type on the selected element, the existing listener is removed before the new listener is added.
   * To register multiple listeners for the same event type, the type may be followed by an optional namespace, such as "click.foo" and "click.bar".

   * To remove a listener, pass null as the listener. To remove all listeners for a particular event type, pass null as the listener, and .type as the type, e.g. selection.on(".foo", null).

   * An optional capture flag may be specified, which corresponds to the W3C useCapture flag:
   * "After initiating capture, all events of the specified type will be dispatched to the registered EventListener before being dispatched to any EventTargets beneath them in the tree.
   * Events which are bubbling upward through the tree will not trigger an EventListener designated to use capture."
   */
  def on(`type`: String, listener: js.Function2[js.Any, Double, Any], capture: Boolean = js.native): Selection = js.native

  /**
   * @return the currently-assigned listener for the specified type, if any.
   */
  def on(`type`: String): js.Function2[js.Any, Double, Any] = js.native

  /**
   * Starts a transition for the current selection.
   * Transitions behave much like selections, except operators animate smoothly over time rather than applying instantaneously.
   */
  def transition(): Transition = js.native

  /**
   * Sorts the elements in the current selection according to the specified comparator function.
   * The comparator function is passed two data elements a and b to compare, returning either a negative, positive, or zero value.
   * If negative, then a should be before b; if positive, then a should be after b; otherwise, a and b are considered equal and the order is arbitrary.
   * 
   * @note that the sort is not guaranteed to be stable; however, it is guaranteed to have the same behavior as your browser's built-in sort method on arrays.
   */
  def sort[T](comparator: js.Function2[T, T, Double]): Selection = js.native

  /**
   * Re-inserts elements into the document such that the document order matches the selection order.
   * This is equivalent to calling sort() if the data is already sorted, but much faster.
   */
  var order: js.Function0[Selection] = js.native
}

/**
  * for adding and removing nodes in correspondence with data
  */
trait EnterSelection extends js.Object {

  /**
   * Appends a new element with the specified name as the last child of each element in the current selection.
   * Each new element inherits the data of the current elements, if any, in the same manner as select for subselections.

   * The name may be specified either as a constant string or as a function that returns the DOM element to append.
   * When the name is specified as a string, it may have a namespace prefix of the form "namespace:tag".
   * For example, "svg:text" will create a "text" element in the SVG namespace. By default, D3 supports svg, xhtml, xlink, xml and xmlns namespaces.
   * Additional namespaces can be registered by adding to d3.ns.prefix.
   * If no namespace is specified, then the namespace will be inherited from the enclosing element;
   * or, if the name is one of the known prefixes, the corresponding namespace will be used (for example, "svg" implies "svg:svg").

   * @return a new selection containing the appended elements.
   */
  def append(sel: String): Selection = js.native

  /**
   * Inserts a new element with the specified name before the element matching the specified before selector,
   * for each element in the current selection, returning a new selection containing the inserted elements.
   * If the before selector does not match any elements, then the new element will be the last child as with append.
   * Each new element inherits the data of the current elements (if any), in the same manner as select for subselections.

   * The name may be specified either as a constant string or as a function that returns the DOM element to append.
   * When the name is specified as a string, it may have a namespace prefix of the form "namespace:tag".
   * For example, "svg:text" will create a "text" element in the SVG namespace. By default, D3 supports svg, xhtml, xlink, xml and xmlns namespaces.
   * Additional namespaces can be registered by adding to d3.ns.prefix.
   * If no namespace is specified, then the namespace will be inherited from the enclosing element; or, if the name is one of the known prefixes, the corresponding namespace will be used (for example, "svg" implies "svg:svg").

   * Likewise, the before selector may be specified as a selector string or a function which returns a DOM element.
   * For instance, insert("div", ":first-child") will prepend child div nodes to the current selection.
   * For enter selections, the before selector may be omitted, in which case entering elements will be inserted immediately before the next following sibling in the update selection, if any.
   * This allows you to insert elements into the DOM in an order consistent with bound data. Note, however, the slower selection.order may still be required if updating elements change order.

   * @return a new selection containing the inserted elements.
   */
  def insert(el: String, s: String): Selection = js.native

  // def select(selector: String): Selection = js.native
  // select is also supported, but Selection couldn't extend this trait then

  /**
   * @return true if the current selection is empty; a selection is empty if it contains no elements or only null elements.
   */
  def empty: Boolean = js.native

  /**
   * @return the first non-null element in the current selection. If the selection is empty, returns null.
   */
  def node: Element = js.native

  /**
   * Invokes the specified function once, passing in the current selection along with any optional arguments.
   * The call operator always returns the current selection, regardless of the return value of the specified function.
   * The call operator is identical to invoking a function by hand; but it makes it easier to use method chaining.
   * For example, say we want to set a number of attributes the same way in a number of different places.
   * So we take the code and wrap it in a reusable function:

    function foo(selection) {
      selection
          .attr("name1", "value1")
          .attr("name2", "value2");
    }

    Now, we can say this:

    foo(d3.selectAll("div"))

   * Or equivalently:

    d3.selectAll("div").call(foo);

   * The this context of the called function is also the current selection. This is slightly redundant with the first argument, which we might fix in the future.
   * If you use an objects method in selection.call and need this to point to that object you create a function bound to the object before calling.

    function Foo(text) {
        this.text = text;
    }

    Foo.prototype.setText = function(selection) {
        selection.text(this.text);
    }

    var bar = new Foo("Bar");

    d3.selectAll("span").call(bar.setText.bind(bar));

   * Or

    d3.selectAll("span").call(Foo.prototype.setText.bind(bar));

   */
  def call(callback: js.Function, args: js.Any*): Selection = js.native

  def call(f: Layout): Selection = js.native

  def call(f: Axis): Selection = js.native

  /**
   * @return the total number of elements in the current selection.
   */
  def size: Double = js.native
}


/**
 * UpdateSelection is the result fo Selection#data operator
 */
trait UpdateSelection extends Selection {

  /**
   * Returns the entering selection: placeholder nodes for each data element for which no corresponding existing DOM element was found in the current selection.
   * This method is only defined on a selection returned by the data operator.
   * In addition, the entering selection only defines append, insert, select and call operators;
   * you must use these operators to instantiate the entering nodes before modifying any content.
   * (Enter selections also support empty to check if they are empty.)
   * @note that the enter operator merely returns a reference to the entering selection, and it is up to you to add the new nodes.

   * As a simple example, consider the case where the existing selection is empty, and we wish to create new nodes to match our data:

    d3.select("body").selectAll("div")
        .data([4, 8, 15, 16, 23, 42])
      .enter().append("div")
        .text(function(d) { return d; });

   * Assuming that the body is initially empty,
   * the above code will create six new DIV elements, append them to the body in order, and assign their text content as the associated (string-coerced) number:

    <div>4</div>
    <div>8</div>
    <div>15</div>
    <div>16</div>
    <div>23</div>
    <div>42</div>

   * Another way to think about the entering placeholder nodes is that they are pointers to the parent node (in this example, the document body); however, they only support append and insert.

   * The enter selection merges into the update selection when you append or insert.
   * This approach reduces code duplication between enter and update.
   * Rather than applying operators to both the enter and update selection separately, you can now apply them to the update selection after entering the nodes.
   * In the rare case that you want to run operators only on the updating nodes, you can run them on the update selection before entering new nodes.
   */
  def enter(): EnterSelection = js.native

  /**
   * Returns the exiting selection: existing DOM elements in the current selection for which no new data element was found.
   * This method is only defined on a selection returned by the data operator.
   * The exiting selection defines all the normal operators, though typically the main one you'll want to use is remove;
   * the other operators exist primarily so you can define an exiting transition as desired.
   * @note that the exit operator merely returns a reference to the exiting selection, and it is up to you to remove the new nodes.

   * As a simple example, consider updating the six DIV elements created in the above example for the enter operator.
   * Here we bind those elements to a new array of data with some new and some old:

    var div = d3.select("body").selectAll("div").data([1, 2, 4, 8, 16, 32], function(d) { return d; });

   * Now div—the result of the data operator—refers to the updating selection.
   * Since we specified a key function using the identity function, and the new data array contains the numbers [4, 8, 16] which also exist in the old data array,
   * this updating selection contains three DIV elements. Let's say we leave those elements as-is.
   * We can instantiate and add the new elements [1, 2, 32] using the entering selection:

    div.enter().append("div").text(function(d) { return d; });

   * Likewise, we can remove the exiting elements [15, 23, 42]:

    div.exit().remove();

   * Now the document body looks like this:

    <div>4</div>
    <div>8</div>
    <div>16</div>
    <div>1</div>
    <div>2</div>
    <div>32</div>

   * @note that the DOM elements are now out-of-order. However, the selection index i (the second argument to operator functions), will correctly match the new data array. For example, we could assign an index attribute:

    d3.selectAll("div").attr("index", function(d, i) { return i; });

   * This would result in:

    <div index="2">4</div>
    <div index="3">8</div>
    <div index="4">16</div>
    <div index="0">1</div>
    <div index="1">2</div>
    <div index="5">32</div>

   * If you want the document traversal order to match the selection data order, you can use sort or order.
   */
  def exit: Selection = js.native
}