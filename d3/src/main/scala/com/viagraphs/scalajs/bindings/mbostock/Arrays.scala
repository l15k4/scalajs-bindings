package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js
import scala.scalajs.js.Any

/**
 * Nesting allows elements in an array to be grouped into a hierarchical tree structure;
 * think of it like the GROUP BY operator in SQL, except you can have multiple levels of grouping, and the resulting output is a tree rather than a flat table.
 * The levels in the tree are specified by key functions. The leaf nodes of the tree can be sorted by value, while the internal nodes can be sorted by key. An optional rollup function will collapse the elements in each leaf node using a summary function. The nest operator (the object returned by d3.nest) is reusable, and does not retain any references to the data that is nested.

 * For example, consider the following tabular data structure of Barley yields, from various sites in Minnesota during 1931-2:

    var yields = [{yield: 27.00, variety: "Manchuria", year: 1931, site: "University Farm"},
                  {yield: 48.87, variety: "Manchuria", year: 1931, site: "Waseca"},
                  {yield: 27.43, variety: "Manchuria", year: 1931, site: "Morris"}, ...]

 * To facilitate visualization, it may be useful to nest the elements first by year, and then by variety, as follows:

    var nest = d3.nest()
        .key(function(d) { return d.year; })
        .key(function(d) { return d.variety; })
        .entries(yields);

 * This returns a nested array. Each element of the outer array is a key-values pair, listing the values for each distinct key:

    [{key: 1931, values: [
       {key: "Manchuria", values: [
         {yield: 27.00, variety: "Manchuria", year: 1931, site: "University Farm"},
         {yield: 48.87, variety: "Manchuria", year: 1931, site: "Waseca"},
         {yield: 27.43, variety: "Manchuria", year: 1931, site: "Morris"}, ...]},
       {key: "Glabron", values: [
         {yield: 43.07, variety: "Glabron", year: 1931, site: "University Farm"},
         {yield: 55.20, variety: "Glabron", year: 1931, site: "Waseca"}, ...]}, ...]},
     {key: 1932, values: ...}]

 * The nested form allows easy iteration and generation of hierarchical structures in SVG or HTML.
 */
trait Nest extends js.Object {

  def key[A <: js.Any](keyFunction: js.Function1[A, js.String]): Nest = ???

  def key[A <: js.Any](keyFunction: js.Function2[A, js.Number, js.String]): Nest = ???

  def sortKeys(comparator: js.Function2[js.Any, js.Any, js.Number]): Nest = ???

  def sortValues(comparator: js.Function2[js.Any, js.Any, js.Number]): Nest = ???

  def rollup[A <: Nest](rollupFunction: js.Function1[A, Any]): Nest = ???

  def rollup[A <: Nest](rollupFunction: js.Function2[A, js.Number, Any]): Nest = ???

  def map[A <: Any](values: js.Array[A]): js.Dynamic = ???

  def map[A <: js.Any](values: js.Function1[A, js.Number]): js.Dynamic = ???

  def entries(values: js.Array[js.Any]): js.Array[NestKeyValue] = ???
}

trait NestKeyValue extends js.Object {
  var key: js.String = ???
  var values: js.Any = ???
}

trait Map extends js.Object {
  def has(key: js.String): js.Boolean = ???

  def get(key: js.String): js.Dynamic = ???

  def set[T](key: js.String, value: T): T = ???

  def remove(key: js.String): js.Boolean = ???

  def keys(): js.Array[js.String] = ???

  def values(): js.Array[js.Any] = ???

  def entries(): js.Array[js.Any] = ???

  def forEach(func: js.Function2[js.String, js.Any, Unit]): Unit = ???
}

trait Set extends js.Object {
  def has(value: js.Any): js.Boolean = ???

  def add(value: js.Any): js.Dynamic = ???

  def remove(value: js.Any): js.Boolean = ???

  def values(): js.Array[js.Any] = ???

  def forEach(func: js.Function1[js.Any, Unit]): Unit = ???
}
