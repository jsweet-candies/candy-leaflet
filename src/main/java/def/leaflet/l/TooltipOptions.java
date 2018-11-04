package def.leaflet.l;
@jsweet.lang.Interface
public abstract class TooltipOptions extends DivOverlayOptions {
    @jsweet.lang.Optional
    public String pane;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> offset;
    @jsweet.lang.Optional
    public Object direction;
    @jsweet.lang.Optional
    public Boolean permanent;
    @jsweet.lang.Optional
    public Boolean sticky;
    @jsweet.lang.Optional
    public Boolean interactive;
    @jsweet.lang.Optional
    public double opacity;
}

