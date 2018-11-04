package def.leaflet.l;
public class LatLng extends def.js.Object {
    public LatLng(double latitude, double longitude, double altitude){}
    native public Boolean equals(LatLng otherLatLng, double maxMargin);
    native public String toString();
    native public double distanceTo(LatLng otherLatLng);
    native public LatLng wrap();
    native public LatLngBounds toBounds(double sizeInMeters);
    public double lat;
    public double lng;
    @jsweet.lang.Optional
    public double alt;
    public LatLng(double latitude, double longitude){}
    @jsweet.lang.Name("equals")
    native public Boolean Equals(LatLng otherLatLng);
    native public Boolean equals(jsweet.util.tuple.Tuple2<Double,Double> otherLatLng, double maxMargin);
    native public Boolean equals(LatLngLiteral otherLatLng, double maxMargin);
    native public double distanceTo(jsweet.util.tuple.Tuple2<Double,Double> otherLatLng);
    native public double distanceTo(LatLngLiteral otherLatLng);
    @jsweet.lang.Name("equals")
    native public Boolean Equals(LatLngLiteral otherLatLng);
    @jsweet.lang.Name("equals")
    native public Boolean Equals(jsweet.util.tuple.Tuple2<Double,Double> otherLatLng);
    protected LatLng(){}
}

