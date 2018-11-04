package def.leaflet.l;
@jsweet.lang.Interface
@jsweet.lang.Extends({PanOptions.class})
public abstract class ZoomPanOptions extends ZoomOptions {
    @jsweet.lang.Optional
    public Boolean animate;
    @jsweet.lang.Optional
    public double duration;
    @jsweet.lang.Optional
    public double easeLinearity;
    @jsweet.lang.Optional
    public Boolean noMoveStart;
}

