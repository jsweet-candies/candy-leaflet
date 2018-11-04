package def.leaflet.l;
import def.dom.HTMLElement;
import def.dom.MouseEvent;
public class Map extends Evented {
    public Map(String element, MapOptions options){}
    native public Renderer getRenderer(Path layer);
    native public Map addControl(Control control);
    native public Map removeControl(Control control);
    native public Map addLayer(Layer layer);
    native public Map removeLayer(Layer layer);
    native public Boolean hasLayer(Layer layer);
    native public Map eachLayer(java.util.function.Consumer<Layer> fn, Object context);
    native public Map openPopup(Popup popup);
    native public Map openPopup(String content, LatLng latlng, PopupOptions options);
    native public Map closePopup(Popup popup);
    native public Map openTooltip(Tooltip tooltip);
    native public Map openTooltip(String content, LatLng latlng, TooltipOptions options);
    native public Map closeTooltip(Tooltip tooltip);
    native public Map setView(LatLng center, double zoom, ZoomPanOptions options);
    native public Map setZoom(double zoom, ZoomPanOptions options);
    native public Map zoomIn(double delta, ZoomOptions options);
    native public Map zoomOut(double delta, ZoomOptions options);
    native public Map setZoomAround(Object position, double zoom, ZoomOptions options);
    native public Map fitBounds(LatLngBounds bounds, FitBoundsOptions options);
    native public Map fitWorld(FitBoundsOptions options);
    native public Map panTo(LatLng latlng, PanOptions options);
    native public Map panBy(Point offset);
    native public Map setMaxBounds(LatLngBounds bounds);
    native public Map setMinZoom(double zoom);
    native public Map setMaxZoom(double zoom);
    native public Map panInsideBounds(LatLngBounds bounds, PanOptions options);
    /**
     * Boolean for animate or advanced ZoomPanOptions
     */
    native public Map invalidateSize(Boolean options);
    native public Map stop();
    native public Map flyTo(LatLng latlng, double zoom, ZoomPanOptions options);
    native public Map flyToBounds(LatLngBounds bounds, FitBoundsOptions options);
    native public Map addHandler(String name, Handler HandlerClass);
    native public Map remove();
    native public HTMLElement createPane(String name, HTMLElement container);
    /**
     * Name of the pane or the pane as HTML-Element
     */
    native public HTMLElement getPane(String pane);
    native public jsweet.util.union.Union<GetPanes,DefaultMapPanes> getPanes();
    native public HTMLElement getContainer();
    native public Map whenReady(java.lang.Runnable fn, Object context);
    native public LatLng getCenter();
    native public double getZoom();
    native public LatLngBounds getBounds();
    native public double getMinZoom();
    native public double getMaxZoom();
    native public double getBoundsZoom(LatLngBounds bounds, Boolean inside);
    native public Point getSize();
    native public Bounds getPixelBounds();
    native public Point getPixelOrigin();
    native public Bounds getPixelWorldBounds(double zoom);
    native public double getZoomScale(double toZoom, double fromZoom);
    native public double getScaleZoom(double scale, double fromZoom);
    native public Point project(LatLng latlng, double zoom);
    native public LatLng unproject(Point point, double zoom);
    native public LatLng layerPointToLatLng(Point point);
    native public Point latLngToLayerPoint(LatLng latlng);
    native public LatLng wrapLatLng(LatLng latlng);
    native public LatLngBounds wrapLatLngBounds(LatLngBounds bounds);
    native public double distance(LatLng latlng1, LatLng latlng2);
    native public Point containerPointToLayerPoint(Point point);
    native public LatLng containerPointToLatLng(Point point);
    native public Point layerPointToContainerPoint(Point point);
    native public Point latLngToContainerPoint(LatLng latlng);
    native public Point mouseEventToContainerPoint(MouseEvent ev);
    native public Point mouseEventToLayerPoint(MouseEvent ev);
    native public LatLng mouseEventToLatLng(MouseEvent ev);
    native public Map locate(LocateOptions options);
    native public Map stopLocate();
    public Handler boxZoom;
    public Handler doubleClickZoom;
    public Handler dragging;
    public Handler keyboard;
    public Handler scrollWheelZoom;
    @jsweet.lang.Optional
    public Handler tap;
    public Handler touchZoom;
    public def.leaflet.l.control.Zoom zoomControl;
    public MapOptions options;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class GetPanes extends def.js.Object {
        @SuppressWarnings("unchecked")
		native public HTMLElement $get(String name);
    }
    public Map(String element){}
    native public Map eachLayer(java.util.function.Consumer<Layer> fn);
    native public Map openPopup(String content, LatLng latlng);
    native public Map closePopup();
    native public Map openTooltip(String content, LatLng latlng);
    native public Map closeTooltip();
    native public Map setView(LatLng center, double zoom);
    native public Map setZoom(double zoom);
    native public Map zoomIn(double delta);
    native public Map zoomIn();
    native public Map zoomOut(double delta);
    native public Map zoomOut();
    native public Map setZoomAround(Object position, double zoom);
    native public Map fitBounds(LatLngBounds bounds);
    native public Map fitWorld();
    native public Map panTo(LatLng latlng);
    native public Map panInsideBounds(LatLngBounds bounds);
    /**
     * Boolean for animate or advanced ZoomPanOptions
     */
    native public Map invalidateSize();
    native public Map flyTo(LatLng latlng, double zoom);
    native public Map flyTo(LatLng latlng);
    native public Map flyToBounds(LatLngBounds bounds);
    native public HTMLElement createPane(String name);
    native public Map whenReady(java.lang.Runnable fn);
    native public double getBoundsZoom(LatLngBounds bounds);
    native public Bounds getPixelWorldBounds();
    native public Map locate();
    public Map(HTMLElement element, MapOptions options){}
    native public Map openPopup(HTMLElement content, jsweet.util.tuple.Tuple2<Double,Double> latlng, PopupOptions options);
    native public Map openPopup(String content, jsweet.util.tuple.Tuple2<Double,Double> latlng, PopupOptions options);
    native public Map openPopup(HTMLElement content, LatLng latlng, PopupOptions options);
    native public Map openPopup(HTMLElement content, LatLngLiteral latlng, PopupOptions options);
    native public Map openPopup(String content, LatLngLiteral latlng, PopupOptions options);
    native public Map openTooltip(HTMLElement content, jsweet.util.tuple.Tuple2<Double,Double> latlng, TooltipOptions options);
    native public Map openTooltip(HTMLElement content, LatLngLiteral latlng, TooltipOptions options);
    native public Map openTooltip(String content, LatLngLiteral latlng, TooltipOptions options);
    native public Map openTooltip(HTMLElement content, LatLng latlng, TooltipOptions options);
    native public Map openTooltip(String content, jsweet.util.tuple.Tuple2<Double,Double> latlng, TooltipOptions options);
    native public Map setView(LatLngLiteral center, double zoom, ZoomPanOptions options);
    native public Map setView(jsweet.util.tuple.Tuple2<Double,Double> center, double zoom, ZoomPanOptions options);
    native public Map fitBounds(jsweet.util.tuple.Tuple2<Double,Double>[] bounds, FitBoundsOptions options);
    native public Map panTo(jsweet.util.tuple.Tuple2<Double,Double> latlng, PanOptions options);
    native public Map panTo(LatLngLiteral latlng, PanOptions options);
    native public Map panBy(jsweet.util.tuple.Tuple2<Double,Double> offset);
    native public Map setMaxBounds(jsweet.util.tuple.Tuple2<Double,Double>[] bounds);
    native public Map panInsideBounds(jsweet.util.tuple.Tuple2<Double,Double>[] bounds, PanOptions options);
    /**
     * Boolean for animate or advanced ZoomPanOptions
     */
    native public Map invalidateSize(ZoomPanOptions options);
    native public Map flyTo(jsweet.util.tuple.Tuple2<Double,Double> latlng, double zoom, ZoomPanOptions options);
    native public Map flyTo(LatLngLiteral latlng, double zoom, ZoomPanOptions options);
    native public Map flyToBounds(jsweet.util.tuple.Tuple2<Double,Double>[] bounds, FitBoundsOptions options);
    /**
     * Name of the pane or the pane as HTML-Element
     */
    native public HTMLElement getPane(HTMLElement pane);
    native public double getBoundsZoom(jsweet.util.tuple.Tuple2<Double,Double>[] bounds, Boolean inside);
    native public Point project(LatLngLiteral latlng, double zoom);
    native public Point project(jsweet.util.tuple.Tuple2<Double,Double> latlng, double zoom);
    native public LatLng unproject(jsweet.util.tuple.Tuple2<Double,Double> point, double zoom);
    native public LatLng layerPointToLatLng(jsweet.util.tuple.Tuple2<Double,Double> point);
    native public Point latLngToLayerPoint(jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public Point latLngToLayerPoint(LatLngLiteral latlng);
    native public LatLng wrapLatLng(jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public LatLng wrapLatLng(LatLngLiteral latlng);
    native public double distance(LatLngLiteral latlng1, jsweet.util.tuple.Tuple2<Double,Double> latlng2);
    native public double distance(jsweet.util.tuple.Tuple2<Double,Double> latlng1, jsweet.util.tuple.Tuple2<Double,Double> latlng2);
    native public double distance(jsweet.util.tuple.Tuple2<Double,Double> latlng1, LatLngLiteral latlng2);
    native public double distance(LatLng latlng1, LatLngLiteral latlng2);
    native public double distance(LatLng latlng1, jsweet.util.tuple.Tuple2<Double,Double> latlng2);
    native public double distance(LatLngLiteral latlng1, LatLng latlng2);
    native public double distance(LatLngLiteral latlng1, LatLngLiteral latlng2);
    native public double distance(jsweet.util.tuple.Tuple2<Double,Double> latlng1, LatLng latlng2);
    native public Point containerPointToLayerPoint(jsweet.util.tuple.Tuple2<Double,Double> point);
    native public LatLng containerPointToLatLng(jsweet.util.tuple.Tuple2<Double,Double> point);
    native public Point layerPointToContainerPoint(jsweet.util.tuple.Tuple2<Double,Double> point);
    native public Point latLngToContainerPoint(jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public Point latLngToContainerPoint(LatLngLiteral latlng);
    public Map(HTMLElement element){}
    native public Map openPopup(String content, jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public Map openPopup(String content, LatLngLiteral latlng);
    native public Map openPopup(HTMLElement content, LatLng latlng);
    native public Map openPopup(HTMLElement content, jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public Map openPopup(HTMLElement content, LatLngLiteral latlng);
    native public Map openTooltip(String content, LatLngLiteral latlng);
    native public Map openTooltip(HTMLElement content, LatLng latlng);
    native public Map openTooltip(String content, jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public Map openTooltip(HTMLElement content, LatLngLiteral latlng);
    native public Map openTooltip(HTMLElement content, jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public Map setView(LatLngLiteral center, double zoom);
    native public Map setView(jsweet.util.tuple.Tuple2<Double,Double> center, double zoom);
    native public Map fitBounds(jsweet.util.tuple.Tuple2<Double,Double>[] bounds);
    native public Map panTo(jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public Map panTo(LatLngLiteral latlng);
    native public Map panInsideBounds(jsweet.util.tuple.Tuple2<Double,Double>[] bounds);
    native public Map flyTo(LatLngLiteral latlng, double zoom);
    native public Map flyTo(jsweet.util.tuple.Tuple2<Double,Double> latlng, double zoom);
    native public Map flyTo(LatLngLiteral latlng);
    native public Map flyTo(jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public Map flyToBounds(jsweet.util.tuple.Tuple2<Double,Double>[] bounds);
    native public double getBoundsZoom(jsweet.util.tuple.Tuple2<Double,Double>[] bounds);
    protected Map(){}
}

