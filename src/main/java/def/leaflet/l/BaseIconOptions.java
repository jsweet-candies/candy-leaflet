package def.leaflet.l;
@jsweet.lang.Interface
public abstract class BaseIconOptions extends LayerOptions {
    @jsweet.lang.Optional
    public String iconUrl;
    @jsweet.lang.Optional
    public String iconRetinaUrl;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> iconSize;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> iconAnchor;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> popupAnchor;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> tooltipAnchor;
    @jsweet.lang.Optional
    public String shadowUrl;
    @jsweet.lang.Optional
    public String shadowRetinaUrl;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> shadowSize;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> shadowAnchor;
    @jsweet.lang.Optional
    public String className;
}

