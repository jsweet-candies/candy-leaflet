package def.leaflet.l;
public class Bounds extends def.js.Object {
    public Bounds(Point topLeft, Point bottomRight){}
    public Bounds(Point[] points){}
    native public Bounds extend(Point point);
    native public Point getCenter(Boolean round);
    native public Point getBottomLeft();
    native public Point getTopRight();
    native public Point getSize();
    native public Boolean contains(Object pointOrBounds);
    native public Boolean intersects(Bounds otherBounds);
    native public Boolean overlaps(Bounds otherBounds);
    @jsweet.lang.Optional
    public Point min;
    @jsweet.lang.Optional
    public Point max;
    native public Point getCenter();
    public Bounds(Point topLeft, jsweet.util.tuple.Tuple2<Double,Double> bottomRight){}
    public Bounds(jsweet.util.tuple.Tuple2<Double,Double> topLeft, Point bottomRight){}
    public Bounds(jsweet.util.tuple.Tuple2<Double,Double> topLeft, jsweet.util.tuple.Tuple2<Double,Double> bottomRight){}
    public Bounds(jsweet.util.tuple.Tuple2<jsweet.util.tuple.Tuple2<Double,Double>,jsweet.util.tuple.Tuple2<Double,Double>> points){}
    native public Bounds extend(jsweet.util.tuple.Tuple2<Double,Double> point);
    native public Boolean intersects(jsweet.util.tuple.Tuple2<jsweet.util.tuple.Tuple2<Double,Double>,jsweet.util.tuple.Tuple2<Double,Double>> otherBounds);
    native public Boolean overlaps(jsweet.util.tuple.Tuple2<jsweet.util.tuple.Tuple2<Double,Double>,jsweet.util.tuple.Tuple2<Double,Double>> otherBounds);
    protected Bounds(){}
}

