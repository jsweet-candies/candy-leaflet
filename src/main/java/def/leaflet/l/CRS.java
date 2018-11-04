package def.leaflet.l;
@jsweet.lang.Interface
public abstract class CRS extends def.js.Object {
    native public Point latLngToPoint(LatLng latlng, double zoom);
    native public LatLng pointToLatLng(Point point, double zoom);
    native public Point project(LatLng latlng);
    native public LatLng unproject(Point point);
    native public double scale(double zoom);
    native public double zoom(double scale);
    native public Bounds getProjectedBounds(double zoom);
    native public double distance(LatLng latlng1, LatLng latlng2);
    native public LatLng wrapLatLng(LatLng latlng);
    @jsweet.lang.Optional
    public String code;
    @jsweet.lang.Optional
    public jsweet.util.tuple.Tuple2<Double,Double> wrapLng;
    @jsweet.lang.Optional
    public jsweet.util.tuple.Tuple2<Double,Double> wrapLat;
    public Boolean infinite;
    public static final CRS EPSG3395=null;
    public static final CRS EPSG3857=null;
    public static final CRS EPSG4326=null;
    public static final CRS Earth=null;
    public static final CRS Simple=null;
    native public Point latLngToPoint(LatLngLiteral latlng, double zoom);
    native public Point latLngToPoint(jsweet.util.tuple.Tuple2<Double,Double> latlng, double zoom);
    native public LatLng pointToLatLng(jsweet.util.tuple.Tuple2<Double,Double> point, double zoom);
    native public Point project(LatLngLiteral latlng);
    native public LatLng unproject(jsweet.util.tuple.Tuple2<Double,Double> point);
    native public double distance(LatLngLiteral latlng1, LatLngLiteral latlng2);
    native public double distance(LatLng latlng1, jsweet.util.tuple.Tuple2<Double,Double> latlng2);
    native public double distance(jsweet.util.tuple.Tuple2<Double,Double> latlng1, jsweet.util.tuple.Tuple2<Double,Double> latlng2);
    native public double distance(jsweet.util.tuple.Tuple2<Double,Double> latlng1, LatLngLiteral latlng2);
    native public double distance(jsweet.util.tuple.Tuple2<Double,Double> latlng1, LatLng latlng2);
    native public double distance(LatLng latlng1, LatLngLiteral latlng2);
    native public double distance(LatLngLiteral latlng1, jsweet.util.tuple.Tuple2<Double,Double> latlng2);
    native public double distance(LatLngLiteral latlng1, LatLng latlng2);
    native public LatLng wrapLatLng(LatLngLiteral latlng);
}

