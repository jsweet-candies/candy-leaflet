package def.leaflet.l;
/** Utility class. */
public class LineUtil extends def.js.Object {
    private LineUtil(){}
    native public static Point[] simplify(Point[] points, double tolerance);
    native public static double pointToSegmentDistance(Point p, Point p1, Point p2);
    native public static Point closestPointOnSegment(Point p, Point p1, Point p2);
    native public static Boolean isFlat(LatLng[] latlngs);
    native public static Boolean isFlat(jsweet.util.tuple.Tuple2<Double,Double>[] latlngs);
    native public static Boolean isFlat(LatLngLiteral[] latlngs);
}

