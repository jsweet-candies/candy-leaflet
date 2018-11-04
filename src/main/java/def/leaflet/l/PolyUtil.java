package def.leaflet.l;
/** Utility class. */
public class PolyUtil extends def.js.Object {
    private PolyUtil(){}
    native public static Point[] clipPolygon(Point[] points, Bounds bounds, Boolean round);
    native public static Point[] clipPolygon(Point[] points, Bounds bounds);
    native public static Point[] clipPolygon(Point[] points, jsweet.util.tuple.Tuple2<jsweet.util.tuple.Tuple2<Double,Double>,jsweet.util.tuple.Tuple2<Double,Double>> bounds, Boolean round);
    native public static Point[] clipPolygon(Point[] points, jsweet.util.tuple.Tuple2<jsweet.util.tuple.Tuple2<Double,Double>,jsweet.util.tuple.Tuple2<Double,Double>> bounds);
}

