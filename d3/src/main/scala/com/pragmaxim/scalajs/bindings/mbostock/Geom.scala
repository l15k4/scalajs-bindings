package com.pragmaxim.scalajs.bindings.mbostock

import scala.scalajs.js
import scala.scalajs.js.native

@native
trait Geom extends js.Object {
  def voronoi[T](): Voronoi[T] = js.native
  def voronoi(vertices: js.Array[Vertice]): js.Array[Polygon] = js.native
  def delaunay(vertices: js.Array[Vertice] = js.native): js.Array[Polygon] = js.native
  def quadtree(): QuadtreeFactory = js.native
  def quadtree(points: js.Array[Point], x1: Double, y1: Double, x2: Double, y2: Double): Quadtree = js.native
  def quadtree(points: js.Array[Point], width: Double, height: Double): Quadtree = js.native
  def polygon(vertices: js.Array[Vertice]): Polygon = js.native
  def hull(): Hull = js.native
  def hull(vertices: js.Array[Vertice]): js.Array[Vertice] = js.native
}

@native
trait Vertice extends js.Array[Double] {
  var angle: Double = js.native
}

@native
trait Polygon extends js.Array[Vertice] {
  def area(): Double = js.native
  def centroid(): js.Array[Double] = js.native
  def clip(subject: Polygon): Polygon = js.native
}

@native
trait QuadtreeFactory extends js.Object {
  def apply(): Quadtree = js.native
  def apply(points: js.Array[Point], x1: Double, y1: Double, x2: Double, y2: Double): Quadtree = js.native
  def apply(points: js.Array[Point], width: Double, height: Double): Quadtree = js.native
  def x(): js.Function1[js.Any, Any] = js.native
  def x(accesor: js.Function1[js.Any, Any]): QuadtreeFactory = js.native
  def y(): js.Function1[js.Any, Any] = js.native
  def y(accesor: js.Function1[js.Any, Any]): QuadtreeFactory = js.native
  def size(): js.Array[Double] = js.native
  def size(size: js.Array[Double]): QuadtreeFactory = js.native
  def extent(): js.Array[js.Array[Double]] = js.native
  def extent(points: js.Array[js.Array[Double]]): QuadtreeFactory = js.native
}

@native
trait Quadtree extends js.Object {
  def add(point: Point): Unit = js.native
  def visit(callback: js.Any): Unit = js.native
}

@native
trait Point extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
}

@native
trait Voronoi[T] extends js.Object {
  def apply(data: js.Array[T]): js.Array[Polygon] = js.native
  def links(data: js.Array[T]): js.Array[GraphLink] = js.native
  def triangles(data: js.Array[T]): js.Array[js.Array[Double]] = js.native
  def x(): js.Function2[T, Double, Double] = js.native
  def x(accessor: js.Function2[T, Double, Double]): Voronoi[T] = js.native
  def x(constant: Double): Voronoi[T] = js.native
  def y(): js.Function2[T, Double, Double] = js.native
  def y(accessor: js.Function2[T, Double, Double]): Voronoi[T] = js.native
  def y(constant: Double): Voronoi[T] = js.native
  def clipExtent(): js.Array[js.Array[Double]] = js.native
  def clipExtent(extent: js.Array[js.Array[Double]]): Voronoi[T] = js.native
  def size(): js.Array[Double] = js.native
  def size(size: js.Array[Double]): Voronoi[T] = js.native
}

@native
trait Hull extends js.Object {
  def apply(vertices: js.Array[Vertice]): js.Array[Vertice] = js.native
  def x(): js.Function1[js.Any, Any] = js.native
  def x(accesor: js.Function1[js.Any, Any]): js.Dynamic = js.native
  def y(): js.Function1[js.Any, Any] = js.native
  def y(accesor: js.Function1[js.Any, Any]): js.Dynamic = js.native
}

