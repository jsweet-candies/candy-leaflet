package def.leaflet.l;
public class LatLngBounds extends def.js.Object {
    public LatLngBounds(LatLng southWest, LatLng northEast){}
    public LatLngBounds(jsweet.util.tuple.Tuple2<Double,Double>[] latlngs){}
    native public LatLngBounds extend(Object latlngOrBounds);
    native public LatLngBounds pad(double bufferRatio);
    native public LatLng getCenter();
    native public LatLng getSouthWest();
    native public LatLng getNorthEast();
    native public LatLng getNorthWest();
    native public LatLng getSouthEast();
    native public double getWest();
    native public double getSouth();
    native public double getEast();
    native public double getNorth();
    native public Boolean contains(Object otherBoundsOrLatLng);
    native public Boolean intersects(LatLngBounds otherBounds);
    native public Boolean overlaps(Bounds otherBounds);
    native public String toBBoxString();
    @jsweet.lang.Name("equals")
    native public Boolean Equals(LatLngBounds otherBounds);
    native public Boolean isValid();
    public LatLngBounds(LatLng southWest, LatLngLiteral northEast){}
    public LatLngBounds(jsweet.util.tuple.Tuple2<Double,Double> southWest, jsweet.util.tuple.Tuple2<Double,Double> northEast){}
    public LatLngBounds(jsweet.util.tuple.Tuple2<Double,Double> southWest, LatLngLiteral northEast){}
    public LatLngBounds(LatLng southWest, jsweet.util.tuple.Tuple2<Double,Double> northEast){}
    public LatLngBounds(LatLngLiteral southWest, jsweet.util.tuple.Tuple2<Double,Double> northEast){}
    public LatLngBounds(LatLngLiteral southWest, LatLng northEast){}
    public LatLngBounds(jsweet.util.tuple.Tuple2<Double,Double> southWest, LatLng northEast){}
    public LatLngBounds(LatLngLiteral southWest, LatLngLiteral northEast){}
    native public Boolean intersects(jsweet.util.tuple.Tuple2<Double,Double>[] otherBounds);
    native public Boolean overlaps(jsweet.util.tuple.Tuple2<jsweet.util.tuple.Tuple2<Double,Double>,jsweet.util.tuple.Tuple2<Double,Double>> otherBounds);
    @jsweet.lang.Name("equals")
    native public Boolean Equals(jsweet.util.tuple.Tuple2<Double,Double>[] otherBounds);
    protected LatLngBounds(){}
}

