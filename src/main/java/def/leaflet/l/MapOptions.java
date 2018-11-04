package def.leaflet.l;
import jsweet.util.union.Union3;
@jsweet.lang.Interface
public abstract class MapOptions extends def.js.Object {
    @jsweet.lang.Optional
    public Boolean preferCanvas;
    @jsweet.lang.Optional
    public Boolean attributionControl;
    @jsweet.lang.Optional
    public Boolean zoomControl;
    @jsweet.lang.Optional
    public Boolean closePopupOnClick;
    @jsweet.lang.Optional
    public double zoomSnap;
    @jsweet.lang.Optional
    public double zoomDelta;
    @jsweet.lang.Optional
    public Boolean trackResize;
    @jsweet.lang.Optional
    public Boolean boxZoom;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,def.leaflet.StringTypes.center> doubleClickZoom;
    @jsweet.lang.Optional
    public Boolean dragging;
    @jsweet.lang.Optional
    public CRS crs;
    @jsweet.lang.Optional
    public Union3<LatLng,LatLngLiteral,jsweet.util.tuple.Tuple2<Double,Double>> center;
    @jsweet.lang.Optional
    public double zoom;
    @jsweet.lang.Optional
    public double minZoom;
    @jsweet.lang.Optional
    public double maxZoom;
    @jsweet.lang.Optional
    public Layer[] layers;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<LatLngBounds,jsweet.util.tuple.Tuple2<Double,Double>[]> maxBounds;
    @jsweet.lang.Optional
    public Renderer renderer;
    @jsweet.lang.Optional
    public Boolean fadeAnimation;
    @jsweet.lang.Optional
    public Boolean markerZoomAnimation;
    @jsweet.lang.Optional
    public double transform3DLimit;
    @jsweet.lang.Optional
    public Boolean zoomAnimation;
    @jsweet.lang.Optional
    public double zoomAnimationThreshold;
    @jsweet.lang.Optional
    public Boolean inertia;
    @jsweet.lang.Optional
    public double inertiaDeceleration;
    @jsweet.lang.Optional
    public double inertiaMaxSpeed;
    @jsweet.lang.Optional
    public double easeLinearity;
    @jsweet.lang.Optional
    public Boolean worldCopyJump;
    @jsweet.lang.Optional
    public double maxBoundsViscosity;
    @jsweet.lang.Optional
    public Boolean keyboard;
    @jsweet.lang.Optional
    public double keyboardPanDelta;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,def.leaflet.StringTypes.center> scrollWheelZoom;
    @jsweet.lang.Optional
    public double wheelDebounceTime;
    @jsweet.lang.Optional
    public double wheelPxPerZoomLevel;
    @jsweet.lang.Optional
    public Boolean tap;
    @jsweet.lang.Optional
    public double tapTolerance;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,def.leaflet.StringTypes.center> touchZoom;
    @jsweet.lang.Optional
    public Boolean bounceAtZoomLimits;
}

