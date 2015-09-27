package com.viagraphs.scalajs.bindings.mbostock

import scala.scalajs.js
import scala.scalajs.js.native

@native
trait Layout extends js.Object {
  def stack(): StackLayout = js.native
  def pie(): PieLayout = js.native

  /**
   * @return a new force-directed layout with the default settings: size 1×1, link strength 1, friction 0.9, distance 20, charge strength -30, gravity strength 0.1, and theta parameter 0.8.
   *         The default nodes and links are the empty array, and when the layout is started, the internal alpha cooling parameter is set to 0.1.
   *         The general pattern for constructing force-directed layouts is to set all the configuration properties, and then call start:

    var force = d3.layout.force()
        .nodes(nodes)
        .links(links)
        .size([w, h])
        .start();

      Note that, like D3's other layouts, the force-directed layout doesn't mandate a particular visual representation.
      Most commonly, nodes are mapped to SVG circle elements, and links are mapped to SVG line elements. But you might also display nodes as symbols or images.
   */
  def force(): ForceLayout = js.native
  def tree(): TreeLayout = js.native
  def bundle(): BundleLayout = js.native
  def chord(): ChordLayout = js.native
  def cluster(): ClusterLayout = js.native
  def hierarchy(): HierarchyLayout = js.native
  def histogram(): HistogramLayout = js.native
  def pack(): PackLayout = js.native
  def partition(): PartitionLayout = js.native
  def treemap(): TreeMapLayout = js.native
}

@native
trait StackLayout extends js.Object {
  def apply[T](layers: js.Array[T], index: Double = js.native): js.Array[T] = js.native
  def values(accessor: js.Function1[js.Any, Any] = js.native): StackLayout = js.native
  def offset(offset: String): StackLayout = js.native
}

@native
trait TreeLayout extends js.Object {
  def sort(): js.Function2[js.Any, js.Any, Double] = js.native
  def sort(comparator: js.Function2[js.Any, js.Any, Double]): TreeLayout = js.native
  def children(): js.Function1[js.Any, Any] = js.native
  def children(children: js.Function1[js.Any, Any]): TreeLayout = js.native
  def nodes[A <: GraphNode](root: A): TreeLayout = js.native
  def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = js.native
  def seperation(): js.Function2[GraphNode, GraphNode, Double] = js.native
  def seperation(seperation: js.Function2[GraphNode, GraphNode, Double]): TreeLayout = js.native
  def size(): js.Array[Double] = js.native
  def size(size: js.Array[Double]): TreeLayout = js.native
}

@native
trait PieLayout extends js.Object {
  def apply(values: js.Array[js.Any], index: Double = js.native): js.Array[ArcDescriptor] = js.native
  def value(): js.Function2[js.Any, Double, Double] = js.native
  def value(accessor: js.Function2[js.Any, Double, Double]): PieLayout = js.native
  def sort(): js.Function2[js.Any, js.Any, Double] = js.native
  def sort(comparator: js.Function2[js.Any, js.Any, Double]): PieLayout = js.native
  def startAngle(): Double = js.native
  def startAngle(angle: Double): PieLayout = js.native
  def endAngle(): Double = js.native
  def endAngle(angle: Double): PieLayout = js.native
}

@native
trait ArcDescriptor extends js.Object {
  var value: js.Any = js.native
  var data: js.Any = js.native
  var startAngle: Double = js.native
  var endAngle: Double = js.native
  var index: Double = js.native
}

@native
trait GraphNode extends js.Object {
  var id: Double = js.native
  var index: Double = js.native
  var name: String = js.native
  var px: Double = js.native
  var py: Double = js.native
  var size: Double = js.native
  var weight: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var subindex: Double = js.native
  var startAngle: Double = js.native
  var endAngle: Double = js.native
  var value: Double = js.native
  var fixed: Boolean = js.native
  var children: js.Array[GraphNode] = js.native
  var _children: js.Array[GraphNode] = js.native
  var parent: GraphNode = js.native
  var depth: Double = js.native
}

@native
trait GraphLink extends js.Object {
  var source: GraphNode = js.native
  var target: GraphNode = js.native
}
@native
trait ForceLayout extends js.Function {
  def apply(): ForceLayout = js.native

  /**
   * @return the current size, which defaults to 1×1.
   */
  def size(): Double = js.native

  /**
   * sets the available layout size to the specified two-element array of numbers representing x and y.
   *
   * The size affects two aspects of the force-directed layout: the gravitational center, and the initial random position.
   * The center of gravity is simply [ x / 2, y / 2 ].
   * When nodes are added to the force layout, if they do not have x and y attributes already set,
   * then these attributes are initialized using a uniform random distribution in the range [0, x] and [0, y], respectively.
   */
  def size(mysize: js.Array[Double]): ForceLayout = js.native
  def size(accessor: js.Function2[js.Any, Double, js.Any]): ForceLayout = js.native

  /**
   * @return the layout's current link distance, which defaults to 20.
   */
  def linkDistance(): Double = js.native
  /**
   * sets the target distance between linked nodes to the specified value.
   *
   * If distance is a constant, then all links are the same distance.
   * Otherwise, if distance is a function, then the function is evaluated for each link (in order),
   * being passed the link and its index, with the this context as the force layout; the function's return value is then used to set each link's distance.
   * The function is evaluated whenever the layout starts.
   *
   * Links are not implemented as "spring forces", as is common in other force-directed layouts, but as weak geometric constraints.
   * For each tick of the layout, the distance between each pair of linked nodes is computed and compared to the target distance;
   * the links are then moved towards each other, or away from each other, so as to converge on the desired distance.
   * This method of constraints relaxation on top of position Verlet integration is vastly more stable than previous methods using spring forces,
   * and also allows for the flexible implementation of other constraints in the tick event listener, such as hierarchical layering.
   */
  def linkDistance(number: Double): ForceLayout = js.native
  def linkDistance(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native

  /**
   * @return the layout's current link strength, which defaults to 1.
   */
  def linkStrength(): Double = js.native

  /**
   * sets the strength (rigidity) of links to the specified value in the range [0,1].
   *
   * If strength is a constant, then all links have the same strength.
   * Otherwise, if strength is a function, then the function is evaluated for each link (in order), being passed the link and its index, with the this context as the force layout;
   * the function's return value is then used to set each link's strength.
   * The function is evaluated whenever the layout starts.
   */
  def linkStrength(number: Double): ForceLayout = js.native
  def linkStrength(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native

  /**
   * @return the current coefficient, which defaults to 0.9.
   */
  def friction(): Double = js.native
  /**
   * sets the friction coefficient to the specified value.
   *
   * The name of this parameter is perhaps misleading; it does not correspond to a standard physical coefficient of friction.
   * Instead, it more closely approximates velocity decay: at each tick of the simulation, the particle velocity is scaled by the specified friction.
   * Thus, a value of 1 corresponds to a frictionless environment, while a value of 0 freezes all particles in place.
   * Values outside the range [0,1] are not recommended and may have destabilizing effects.
   */
  def friction(number: Double): ForceLayout = js.native
  def friction(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native

  /**
   * @return the force layout's cooling parameter, alpha.
   */
  def alpha(): Double = js.native
  /**
   * sets alpha to the specified value and returns the force layout.
   *
   * If value is greater than zero, this method also restarts the force layout if it is not already running, dispatching a "start" event and enabling the tick timer.
   * If value is nonpositive, and the force layout is running, this method stops the force layout on the next tick and dispatches an "end" event.
   * If value is not specified, this method returns the current alpha value.
   */
  def alpha(number: Double): ForceLayout = js.native
  def alpha(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native

  /**
   * @return the current charge strength, which defaults to -30.
   */
  def charge(): Double = js.native
  /**
   * sets the charge strength to the specified value.
   *
   * If charge is a constant, then all nodes have the same charge.
   * Otherwise, if charge is a function, then the function is evaluated for each node (in order),
   * being passed the node and its index, with the this context as the force layout; the function's return value is then used to set each node's charge.
   * The function is evaluated whenever the layout starts.
   * A negative value results in node repulsion, while a positive value results in node attraction.
   * For graph layout, negative values should be used; for n-body simulation, positive values can be used.
   * All nodes are assumed to be infinitesimal points with equal charge and mass.
   * Charge forces are implemented efficiently via the Barnes–Hut algorithm, computing a quadtree for each tick.
   * Setting the charge force to zero disables computation of the quadtree, which can noticeably improve performance if you do not need n-body forces.
   */
  def charge(number: Double): ForceLayout = js.native
  def charge(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native

  /**
   * @return the current value, which defaults to 0.8.
   */
  def theta(): Double = js.native
  /**
   * sets the Barnes–Hut approximation criterion to the specified value.
   *
   * Unlike links, which only affect two linked nodes, the charge force is global: every node affects every other node, even if they are on disconnected subgraphs.

   * To avoid quadratic performance slowdown for large graphs, the force layout uses the Barnes–Hut approximation which takes O(n log n) per tick.
   * For each tick, a quadtree is created to store the current node positions; then for each node, the sum charge force of all other nodes on the given node are computed.
   * For clusters of nodes that are far away, the charge force is approximated by treating the distance cluster of nodes as a single, larger node.
   * Theta determines the accuracy of the computation:
   *    if the ratio of the area of a quadrant in the quadtree to the distance between a node to the quadrant's center of mass is less than theta,
   *    all nodes in the given quadrant are treated as a single, larger node rather than computed individually.
   */
  def theta(number: Double): ForceLayout = js.native
  def theta(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native

  /**
   * @return the current gravitational strength, which defaults to 0.1.
   */
  def gravity(): Double = js.native
  /**
   * sets the gravitational strength to the specified value.
   * The name of this parameter is perhaps misleading; it does not corresponding to physical gravity (which can be simulated using a positive charge parameter).
   * Instead, gravity is implemented as a weak geometric constraint similar to a virtual spring connecting each node to the center of the layout's size.
   * This approach has nice properties: near the center of the layout, the gravitational strength is almost zero, avoiding any local distortion of the layout;
   * as nodes get pushed farther away from the center, the gravitational strength becomes stronger in linear proportion to the distance.
   * Thus, gravity will always overcome repulsive charge forces at some threshold, preventing disconnected nodes from escaping the layout.

   * Gravity can be disabled by setting the gravitational strength to zero.
   * If you disable gravity, it is recommended that you implement some other geometric constraint to prevent nodes from escaping the layout,
   * such as constraining them within the layout's bounds.
   */
  def gravity(number: Double): ForceLayout = js.native
  def gravity(accessor: js.Function2[js.Any, Double, Double]): ForceLayout = js.native

  /**
   * @return the current array, which defaults to the empty array.
   */
  def links(): js.Array[GraphLink] = js.native
  /**
   * sets the layout's associated links to the specified array.
   * Each link has the following attributes:

    source - the source node (an element in nodes).
    target - the target node (an element in nodes).

   * Note: the values of the source and target attributes may be initially specified as indexes into the nodes array;
   * these will be replaced by references after the call to start.
   * Link objects may have additional fields that you specify; this data can be used to compute link strength and distance on a per-link basis using an accessor function.
   */
  def links[A <: GraphLink](arLinks: js.Array[A]): ForceLayout = js.native

  /**
   * @return the current array, which defaults to the empty array.
   */
  def nodes[A](): js.Array[A] = js.native
  /**
   * sets the layout's associated nodes to the specified array.
   * Each node has the following attributes:

    index - the zero-based index of the node within the nodes array.
    x - the x-coordinate of the current node position.
    y - the y-coordinate of the current node position.
    px - the x-coordinate of the previous node position.
    py - the y-coordinate of the previous node position.
    fixed - a boolean indicating whether node position is locked.
    weight - the node weight; the number of associated links.

   * These attributes do not need to be set before passing the nodes to the layout;
   * if they are not set, suitable defaults will be initialized by the layout when start is called.
   * However, be aware that if you are storing other data on your nodes, your data attributes should not conflict with the above properties used by the layout.
   */
  def nodes[A <: GraphNode](arNodes: js.Array[A]): ForceLayout = js.native

  /**
   * Starts the simulation; this method must be called when the layout is first created, after assigning the nodes and links.
   * In addition, it should be called again whenever the nodes or links change.
   * Internally, the layout uses a cooling parameter alpha which controls the layout temperature: as the physical simulation converges on a stable layout,
   * the temperature drops, causing nodes to move more slowly. Eventually, alpha drops below a threshold and the simulation stops completely, freeing the CPU and avoiding battery drain.
   * The layout can be reheated using resume or by restarting; this happens automatically when using the drag behavior.

   * On start, the layout initializes various attributes on the associated nodes.
   * The index of each node is computed by iterating over the array, starting at zero.
   * The initial x and y coordinates, if not already set externally to a valid number, are computed by examining neighboring nodes:
   * if a linked node already has an initial position in x or y, the corresponding coordinates are applied to the new node.
   * This increases the stability of the graph layout when new nodes are added, rather than using the default which is to initialize the position randomly within the layout's size.
   * The previous px and py position is set to the initial position, if not already set, giving new nodes an initial velocity of zero.
   * Finally, the fixed boolean defaults to false.

   * The layout also initializes the source and target attributes on the associated links:
   * for convenience, these attributes may be specified as a numeric index rather than a direct link,
   * such that the nodes and links can be read-in from a JSON file or other static description that may not allow circular linking.
   * The source and target attributes on incoming links are only replaced with the corresponding entries in nodes if these attributes are numbers;
   * thus, these attributes on existing links are unaffected when the layout is restarted. The link distances and strengths are also computed on start.
   */
  def start(): ForceLayout = js.native

  /**
   * Equivalent to:

      force.alpha(.1);

   * Sets the cooling parameter alpha to 0.1. This method sets the internal alpha parameter to 0.1, and then restarts the timer.
   * Typically, you don't need to call this method directly; it is called automatically by start. It is also called automatically by drag during a drag gesture.
   */
  def resume(): ForceLayout = js.native

  /**
   * Equivalent to:

    force.alpha(0);

   * Terminates the simulation, setting the cooling parameter alpha to zero.
   * This can be used to stop the simulation explicitly, for example, if you want to show animation or allow other interaction.
   * If you do not stop the layout explicitly, it will still stop automatically after the layout's cooling parameter decays below some threshold.
   */
  def stop(): ForceLayout = js.native

  /**
   * Runs the force layout simulation one step. This method can be used in conjunction with start and stop to compute a static layout.
   * For example:

    force.start();
    for (var i = 0; i < n; ++i) force.tick();
    force.stop();

   * The number of iterations depends on the graph size and complexity.
   * The choice of initial positions can also have a dramatic impact on how quickly the graph converges on a good solution.
   * For example, here the nodes are arranged along the diagonal:

    var n = nodes.length;
    nodes.forEach(function(d, i) {
      d.x = d.y = width / n * i;
    });

   * If you do not initialize the positions manually, the force layout will initialize them randomly, resulting in somewhat unpredictable behavior.
   */
  def tick(): ForceLayout = js.native

  /**
   * Registers the specified listener to receive events of the specified type from the force layout.
   * Currently, only "start", "tick", and "end" events are supported. "tick" events are dispatched for each tick of the simulation.
   * Listen to tick events to update the displayed positions of nodes and links. For example, if you initially display the nodes and links like so:

    var link = vis.selectAll("line")
        .data(links)
        .enter().append("line");

    var node = vis.selectAll("circle")
        .data(nodes)
        .enter().append("circle")
        .attr("r", 5);

   * You can set their positions on tick:

    force.on("tick", function() {
      link.attr("x1", function(d) { return d.source.x; })
          .attr("y1", function(d) { return d.source.y; })
          .attr("x2", function(d) { return d.target.x; })
          .attr("y2", function(d) { return d.target.y; });

      node.attr("cx", function(d) { return d.x; })
          .attr("cy", function(d) { return d.y; });
    });

   * In this case, we've stored the selections node and link on initialization, so that we don't need to reselect the nodes on every tick.
   * If you prefer, you can display nodes and links differently; for example, you might use symbols rather than circles.

   * The "end" event is dispatched when the simulations internal alpha cooling parameter reaches zero.
   */
  def on(`type`: String, listener: js.Function0[Unit]): ForceLayout = js.native

  /**
   * Bind a behavior to nodes to allow interactive dragging, either using the mouse or touch.
   * Use this in conjunction with the call operator on the nodes; for example, say node.call(force.drag) on initialization.
   * The drag event sets the fixed attribute of nodes on mouseover, such that as soon as the mouse is over a node, it stops moving.
   * Fixing on mouseover, rather than on mousedown, makes it easier to catch moving nodes.
   * When a mousedown event is received, and on each subsequent mousemove until mouseup, the node center is set to the current mouse position.
   * In addition, each mousemove triggers a resume of the force layout, reheating the simulation.
   * If you want dragged nodes to remain fixed after dragging, set the fixed attribute to true on dragstart, as in the sticky force layout example.

   * Implementation note: the mousemove and mouseup event listeners are registered on the current window,
   * such that when the user starts dragging a node, they can continue to drag the node even if the mouse leaves the window.
   * Each event listener uses the "force" namespace, so as to avoid collision with other event listeners you may wish to bind to nodes or to the window.
   * If a node is moved by the drag behavior, the subsequent click event that would be triggered by the final mouseup is captured and the default behavior prevented.
   * If you register a click event listener, you can ignore these clicks on drag by seeing if the default behavior was prevented:

    selection.on("click", function(d) {
      if (d3.event.defaultPrevented) return; // ignore drag
      otherwiseDoAwesomeThing();
    });
   */
  def drag(): ForceLayout = js.native
}

@native
trait BundleLayout extends js.Object {
  def apply(links: js.Array[GraphLink]): js.Array[js.Array[GraphNode]] = js.native
}

@native
trait ChordLayout extends js.Object {
  def matrix(): js.Array[js.Array[Double]] = js.native
  def matrix(matrix: js.Array[js.Array[Double]]): ChordLayout = js.native
  def padding(): Double = js.native
  def padding(padding: Double): ChordLayout = js.native
  def sortGroups(): js.Function2[Double, Double, Double] = js.native
  def sortGroups(comparator: js.Function2[Double, Double, Double]): ChordLayout = js.native
  def sortSubgroups(): js.Function2[Double, Double, Double] = js.native
  def sortSubgroups(comparator: js.Function2[Double, Double, Double]): ChordLayout = js.native
  def sortChords(): js.Function2[Double, Double, Double] = js.native
  def sortChords(comparator: js.Function2[Double, Double, Double]): ChordLayout = js.native
  def chords(): js.Array[GraphLink] = js.native
  def groups(): js.Array[ArcDescriptor] = js.native
}

@native
trait ClusterLayout extends js.Object {
  def sort(): js.Function2[GraphNode, GraphNode, Double] = js.native
  def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): ClusterLayout = js.native
  def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = js.native
  def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): ClusterLayout = js.native
  def nodes(root: GraphNode): js.Array[GraphNode] = js.native
  def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = js.native
  def seperation(): js.Function2[GraphNode, GraphNode, Double] = js.native
  def seperation(seperation: js.Function2[GraphNode, GraphNode, Double]): ClusterLayout = js.native
  def size(): js.Array[Double] = js.native
  def size(size: js.Array[Double]): ClusterLayout = js.native
  def value(): js.Function1[GraphNode, Double] = js.native
  def value(value: js.Function1[GraphNode, Double]): ClusterLayout = js.native
}

@native
trait HierarchyLayout extends js.Object {
  def sort(): js.Function2[GraphNode, GraphNode, Double] = js.native
  def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): HierarchyLayout = js.native
  def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = js.native
  def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): HierarchyLayout = js.native
  def nodes(root: GraphNode): js.Array[GraphNode] = js.native
  def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = js.native
  def value(): js.Function1[GraphNode, Double] = js.native
  def value(value: js.Function1[GraphNode, Double]): HierarchyLayout = js.native
  def reValue(root: GraphNode): HierarchyLayout = js.native
}

@native
trait Bin extends js.Array[js.Any] {
  var x: Double = js.native
  var dx: Double = js.native
  var y: Double = js.native
}

@native
trait HistogramLayout extends js.Object {
  def apply(values: js.Array[Double], index: Double = js.native): js.Array[Bin] = js.native
  def value(): js.Function1[js.Any, Any] = js.native
  def value(accessor: js.Function1[js.Any, Any]): HistogramLayout = js.native
  def range(): js.Function2[js.Any, Double, js.Array[Double]] = js.native
  def range(range: js.Function2[js.Any, Double, js.Array[Double]]): HistogramLayout = js.native
  def bins(): js.Function2[js.Array[js.Any], Double, js.Array[Double]] = js.native
  def bins(bins: js.Function2[js.Array[js.Any], Double, js.Array[Double]]): HistogramLayout = js.native
  def bins(threshold: js.Array[Double]): HistogramLayout = js.native
  def frequency(): Boolean = js.native
  def frequency(frequency: Boolean): HistogramLayout = js.native
}

@native
trait PackLayout extends js.Object {
  def sort(): js.Function2[GraphNode, GraphNode, Double] = js.native
  def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): PackLayout = js.native
  def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = js.native
  def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): PackLayout = js.native
  def nodes(root: GraphNode): js.Array[GraphNode] = js.native
  def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = js.native
  def value(): js.Function1[GraphNode, Double] = js.native
  def value(value: js.Function1[GraphNode, Double]): PackLayout = js.native
  def size(): js.Array[Double] = js.native
  def size(size: js.Array[Double]): PackLayout = js.native
  def padding(): Double = js.native
  def padding(padding: Double): PackLayout = js.native
}

@native
trait PartitionLayout extends js.Object {
  def sort(): js.Function2[GraphNode, GraphNode, Double] = js.native
  def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): PackLayout = js.native
  def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = js.native
  def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): PackLayout = js.native
  def nodes(root: GraphNode): js.Array[GraphNode] = js.native
  def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = js.native
  def value(): js.Function1[GraphNode, Double] = js.native
  def value(value: js.Function1[GraphNode, Double]): PackLayout = js.native
  def size(): js.Array[Double] = js.native
  def size(size: js.Array[Double]): PackLayout = js.native
}

@native
trait TreeMapLayout extends js.Object {
  def sort(): js.Function2[GraphNode, GraphNode, Double] = js.native
  def sort(comparator: js.Function2[GraphNode, GraphNode, Double]): TreeMapLayout = js.native
  def children(): js.Function2[js.Any, Double, js.Array[GraphNode]] = js.native
  def children(children: js.Function2[js.Any, Double, js.Array[GraphNode]]): TreeMapLayout = js.native
  def nodes(root: GraphNode): js.Array[GraphNode] = js.native
  def links(nodes: js.Array[GraphNode]): js.Array[GraphLink] = js.native
  def value(): js.Function1[GraphNode, Double] = js.native
  def value(value: js.Function1[GraphNode, Double]): TreeMapLayout = js.native
  def size(): js.Array[Double] = js.native
  def size(size: js.Array[Double]): TreeMapLayout = js.native
  def padding(): Double = js.native
  def padding(padding: Double): TreeMapLayout = js.native
  def round(): Boolean = js.native
  def round(round: Boolean): TreeMapLayout = js.native
  def sticky(): Boolean = js.native
  def sticky(sticky: Boolean): TreeMapLayout = js.native
  def mode(): String = js.native
  def mode(mode: String): TreeMapLayout = js.native
}