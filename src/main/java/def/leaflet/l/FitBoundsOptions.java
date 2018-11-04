package def.leaflet.l;
@jsweet.lang.Interface
@jsweet.lang.Extends({PanOptions.class})
public abstract class FitBoundsOptions extends ZoomOptions {
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> paddingTopLeft;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> paddingBottomRight;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> padding;
    @jsweet.lang.Optional
    public double maxZoom;
    @jsweet.lang.Optional
    public Boolean animate;
    @jsweet.lang.Optional
    public double duration;
    @jsweet.lang.Optional
    public double easeLinearity;
    @jsweet.lang.Optional
    public Boolean noMoveStart;
}

