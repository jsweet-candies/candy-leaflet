package def.leaflet.l;
public class Point extends def.js.Object {
    public Point(double x, double y, Boolean round){}
    @jsweet.lang.Name("clone")
    native public Point Clone();
    native public Point add(Point otherPoint);
    native public Point subtract(Point otherPoint);
    native public Point divideBy(double num);
    native public Point multiplyBy(double num);
    native public Point scaleBy(Point scale);
    native public Point unscaleBy(Point scale);
    native public Point round();
    native public Point floor();
    native public Point ceil();
    native public double distanceTo(Point otherPoint);
    @jsweet.lang.Name("equals")
    native public Boolean Equals(Point otherPoint);
    native public Boolean contains(Point otherPoint);
    native public String toString();
    public double x;
    public double y;
    public Point(double x, double y){}
    native public Point add(jsweet.util.tuple.Tuple2<Double,Double> otherPoint);
    native public Point subtract(jsweet.util.tuple.Tuple2<Double,Double> otherPoint);
    native public Point scaleBy(jsweet.util.tuple.Tuple2<Double,Double> scale);
    native public Point unscaleBy(jsweet.util.tuple.Tuple2<Double,Double> scale);
    native public double distanceTo(jsweet.util.tuple.Tuple2<Double,Double> otherPoint);
    @jsweet.lang.Name("equals")
    native public Boolean Equals(jsweet.util.tuple.Tuple2<Double,Double> otherPoint);
    native public Boolean contains(jsweet.util.tuple.Tuple2<Double,Double> otherPoint);
    protected Point(){}
}

