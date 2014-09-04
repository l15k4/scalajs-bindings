package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js

trait Geom extends js.Object {
  def voronoi[T](): Voronoi[T] = ???
  def voronoi(vertices: js.Array[Vertice]): js.Array[Polygon] = ???
  def delaunay(vertices: js.Array[Vertice] = ???): js.Array[Polygon] = ???
  def quadtree(): QuadtreeFactory = ???
  def quadtree(points: js.Array[Point], x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number): Quadtree = ???
  def quadtree(points: js.Array[Point], width: js.Number, height: js.Number): Quadtree = ???
  def polygon(vertices: js.Array[Vertice]): Polygon = ???
  def hull(): Hull = ???
  def hull(vertices: js.Array[Vertice]): js.Array[Vertice] = ???
}

trait Vertice extends js.Array[js.Number] {
  var angle: js.Number = ???
}

trait Polygon extends js.Array[Vertice] {
  def area(): js.Number = ???
  def centroid(): js.Array[js.Number] = ???
  def clip(subject: Polygon): Polygon = ???
}

trait QuadtreeFactory extends js.Object {
  def apply(): Quadtree = ???
  def apply(points: js.Array[Point], x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number): Quadtree = ???
  def apply(points: js.Array[Point], width: js.Number, height: js.Number): Quadtree = ???
  def x(): js.Function1[js.Any, Any] = ???
  def x(accesor: js.Function1[js.Any, Any]): QuadtreeFactory = ???
  def y(): js.Function1[js.Any, Any] = ???
  def y(accesor: js.Function1[js.Any, Any]): QuadtreeFactory = ???
  def size(): js.Array[js.Number] = ???
  def size(size: js.Array[js.Number]): QuadtreeFactory = ???
  def extent(): js.Array[js.Array[js.Number]] = ???
  def extent(points: js.Array[js.Array[js.Number]]): QuadtreeFactory = ???
}

trait Quadtree extends js.Object {
  def add(point: Point): Unit = ???
  def visit(callback: js.Any): Unit = ???
}

trait Point extends js.Object {
  var x: js.Number = ???
  var y: js.Number = ???
}

trait Voronoi[T] extends js.Object {
  def apply(data: js.Array[T]): js.Array[Polygon] = ???
  def links(data: js.Array[T]): js.Array[GraphLink] = ???
  def triangles(data: js.Array[T]): js.Array[js.Array[js.Number]] = ???
  def x(): js.Function2[T, js.Number, js.Number] = ???
  def x(accessor: js.Function2[T, js.Number, js.Number]): Voronoi[T] = ???
  def x(constant: js.Number): Voronoi[T] = ???
  def y(): js.Function2[T, js.Number, js.Number] = ???
  def y(accessor: js.Function2[T, js.Number, js.Number]): Voronoi[T] = ???
  def y(constant: js.Number): Voronoi[T] = ???
  def clipExtent(): js.Array[js.Array[js.Number]] = ???
  def clipExtent(extent: js.Array[js.Array[js.Number]]): Voronoi[T] = ???
  def size(): js.Array[js.Number] = ???
  def size(size: js.Array[js.Number]): Voronoi[T] = ???
}

trait Hull extends js.Object {
  def apply(vertices: js.Array[Vertice]): js.Array[Vertice] = ???
  def x(): js.Function1[js.Any, Any] = ???
  def x(accesor: js.Function1[js.Any, Any]): js.Dynamic = ???
  def y(): js.Function1[js.Any, Any] = ???
  def y(accesor: js.Function1[js.Any, Any]): js.Dynamic = ???
}

