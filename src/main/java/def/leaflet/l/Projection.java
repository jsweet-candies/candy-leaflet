package def.leaflet.l;
@jsweet.lang.Interface
public abstract class Projection extends def.js.Object {
    native public Point project(LatLng latlng);
    native public LatLng unproject(Point point);
    public Bounds bounds;
    public static final Projection LonLat=null;
    public static final Projection Mercator=null;
    public static final Projection SphericalMercator=null;
    native public Point project(LatLngLiteral latlng);
    native public LatLng unproject(jsweet.util.tuple.Tuple2<Double,Double> point);
}

