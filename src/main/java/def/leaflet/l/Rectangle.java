package def.leaflet.l;
public class Rectangle<P> extends Polygon<P> {
    public Rectangle(LatLngBounds latLngBounds, PolylineOptions options){}
    native public Rectangle<?> setBounds(LatLngBounds latLngBounds);
    public Rectangle(LatLngBounds latLngBounds){}
    public Rectangle(jsweet.util.tuple.Tuple2<Double,Double>[] latLngBounds, PolylineOptions options){}
    native public Rectangle<?> setBounds(jsweet.util.tuple.Tuple2<Double,Double>[] latLngBounds);
    public Rectangle(jsweet.util.tuple.Tuple2<Double,Double>[] latLngBounds){}
    protected Rectangle(){}
}

