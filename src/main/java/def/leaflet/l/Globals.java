package def.leaflet.l;
import def.dom.HTMLElement;
import def.geojson.geojson.GeoJsonObject;
/** This class holds all the global functions and variables of the L package. */
public final class Globals {
    private Globals(){}
    native public static LatLng latLng(double latitude, double longitude, double altitude);
    native public static LatLng latLng(Object coords);
    native public static LatLngBounds latLngBounds(LatLng southWest, LatLng northEast);
    native public static LatLngBounds latLngBounds(LatLng[] latlngs);
    native public static Point point(double x, double y, Boolean round);
    native public static Point point(jsweet.util.tuple.Tuple2<Double,Double> coords);
    native public static Bounds bounds(Point topLeft, Point bottomRight);
    native public static Bounds bounds(Point[] points);
    native public static GridLayer gridLayer(GridLayerOptions options);
    native public static TileLayer tileLayer(String urlTemplate, TileLayerOptions options);
    native public static ImageOverlay imageOverlay(String imageUrl, LatLngBounds bounds, ImageOverlayOptions options);
    native public static Polyline<?, ?> polyline(LatLng[] latlngs, PolylineOptions options);
    native public static Polygon<?> polygon(LatLng[] latlngs, PolylineOptions options);
    native public static Rectangle<?> rectangle(LatLngBounds latLngBounds, PolylineOptions options);
    native public static CircleMarker<?> circleMarker(LatLng latlng, CircleMarkerOptions options);
    native public static Circle<?> circle(LatLng latlng, CircleMarkerOptions options);
    native public static Circle<?> circle(LatLng latlng, double radius, CircleMarkerOptions options);
    native public static SVG svg(RendererOptions options);
    native public static Canvas canvas(RendererOptions options);
    /**
 * Create a layer group, optionally given an initial set of layers and an `options` object.
 */
    native public static <P> LayerGroup<P> layerGroup(Layer[] layers, LayerOptions options);
    /**
 * Create a feature group, optionally given an initial set of layers.
 */
    native public static <P> FeatureGroup<P> featureGroup(Layer[] layers);
    /**
 * Creates a GeoJSON layer.
 *
 * Optionally accepts an object in GeoJSON format to display on the
 * map (you can alternatively add it later with addData method) and
 * an options object.
 */
    native public static <P> GeoJSON<P> geoJSON(GeoJsonObject geojson, GeoJSONOptions<P> options);
    native public static Popup popup(PopupOptions options, Layer source);
    native public static Tooltip tooltip(TooltipOptions options, Layer source);
    /**
 * ID of a HTML-Element as string or the HTML-ELement itself
 */
    native public static Map map(String element, MapOptions options);
    native public static Icon<?> icon(IconOptions options);
    native public static DivIcon divIcon(DivIconOptions options);
    native public static Marker<?> marker(LatLng latlng, MarkerOptions options);
    native public static LatLng latLng(double latitude, double longitude);
    native public static Point point(double x, double y);
    native public static GridLayer gridLayer();
    native public static TileLayer tileLayer(String urlTemplate);
    native public static ImageOverlay imageOverlay(String imageUrl, LatLngBounds bounds);
    native public static Polyline<?, ?> polyline(LatLng[] latlngs);
    native public static Polygon<?> polygon(LatLng[] latlngs);
    native public static Rectangle<?> rectangle(LatLngBounds latLngBounds);
    native public static CircleMarker<?> circleMarker(LatLng latlng);
    native public static Circle<?> circle(LatLng latlng);
    native public static Circle<?> circle(LatLng latlng, double radius);
    native public static SVG svg();
    native public static Canvas canvas();
    /**
 * Create a layer group, optionally given an initial set of layers and an `options` object.
 */
    native public static LayerGroup<?> layerGroup(Layer[] layers);
    /**
 * Create a layer group, optionally given an initial set of layers and an `options` object.
 */
    native public static LayerGroup<?> layerGroup();
    /**
 * Create a feature group, optionally given an initial set of layers.
 */
    native public static FeatureGroup<?> featureGroup();
    /**
 * Creates a GeoJSON layer.
 *
 * Optionally accepts an object in GeoJSON format to display on the
 * map (you can alternatively add it later with addData method) and
 * an options object.
 */
    native public static <P> GeoJSON<P> geoJSON(GeoJsonObject geojson);
    /**
 * Creates a GeoJSON layer.
 *
 * Optionally accepts an object in GeoJSON format to display on the
 * map (you can alternatively add it later with addData method) and
 * an options object.
 */
    native public static <P> GeoJSON<P> geoJSON();
    native public static Popup popup(PopupOptions options);
    native public static Popup popup();
    native public static Tooltip tooltip(TooltipOptions options);
    native public static Tooltip tooltip();
    /**
 * ID of a HTML-Element as string or the HTML-ELement itself
 */
    native public static Map map(String element);
    native public static DivIcon divIcon();
    native public static Marker<?> marker(LatLng latlng);
    native public static LatLngBounds latLngBounds(LatLngLiteral southWest, LatLngLiteral northEast);
    native public static LatLngBounds latLngBounds(LatLng southWest, jsweet.util.tuple.Tuple2<Double,Double> northEast);
    native public static LatLngBounds latLngBounds(jsweet.util.tuple.Tuple2<Double,Double> southWest, LatLng northEast);
    native public static LatLngBounds latLngBounds(LatLngLiteral southWest, jsweet.util.tuple.Tuple2<Double,Double> northEast);
    native public static LatLngBounds latLngBounds(LatLng southWest, LatLngLiteral northEast);
    native public static LatLngBounds latLngBounds(LatLngLiteral southWest, LatLng northEast);
    native public static LatLngBounds latLngBounds(jsweet.util.tuple.Tuple2<Double,Double> southWest, LatLngLiteral northEast);
    native public static LatLngBounds latLngBounds(jsweet.util.tuple.Tuple2<Double,Double> southWest, jsweet.util.tuple.Tuple2<Double,Double> northEast);
    native public static LatLngBounds latLngBounds(jsweet.util.tuple.Tuple2<Double,Double>[] latlngs);
    native public static LatLngBounds latLngBounds(LatLngLiteral[] latlngs);
    native public static Point point(CoordsDto coords);
    native public static Bounds bounds(jsweet.util.tuple.Tuple2<Double,Double> topLeft, jsweet.util.tuple.Tuple2<Double,Double> bottomRight);
    native public static Bounds bounds(Point topLeft, jsweet.util.tuple.Tuple2<Double,Double> bottomRight);
    native public static Bounds bounds(jsweet.util.tuple.Tuple2<Double,Double> topLeft, Point bottomRight);
    native public static Bounds bounds(jsweet.util.tuple.Tuple2<jsweet.util.tuple.Tuple2<Double,Double>,jsweet.util.tuple.Tuple2<Double,Double>> points);
    native public static ImageOverlay imageOverlay(String imageUrl, jsweet.util.tuple.Tuple2<Double,Double>[] bounds, ImageOverlayOptions options);
    native public static Polyline<?, ?> polyline(jsweet.util.tuple.Tuple2<Double,Double>[][] latlngs, PolylineOptions options);
    native public static Polyline<?, ?> polyline(LatLngLiteral[][] latlngs, PolylineOptions options);
    native public static Polyline<?, ?> polyline(LatLng[][] latlngs, PolylineOptions options);
    native public static Polyline<?, ?> polyline(jsweet.util.tuple.Tuple2<Double,Double>[] latlngs, PolylineOptions options);
    native public static Polyline<?, ?> polyline(LatLngLiteral[] latlngs, PolylineOptions options);
    native public static Polygon<?> polygon(jsweet.util.tuple.Tuple2<Double,Double>[][][] latlngs, PolylineOptions options);
    native public static Polygon<?> polygon(LatLng[][] latlngs, PolylineOptions options);
    native public static Polygon<?> polygon(LatLng[][][] latlngs, PolylineOptions options);
    native public static Polygon<?> polygon(LatLngLiteral[][][] latlngs, PolylineOptions options);
    native public static Polygon<?> polygon(jsweet.util.tuple.Tuple2<Double,Double>[][] latlngs, PolylineOptions options);
    native public static Polygon<?> polygon(jsweet.util.tuple.Tuple2<Double,Double>[] latlngs, PolylineOptions options);
    native public static Polygon<?> polygon(LatLngLiteral[] latlngs, PolylineOptions options);
    native public static Polygon<?> polygon(LatLngLiteral[][] latlngs, PolylineOptions options);
    native public static Rectangle<?> rectangle(jsweet.util.tuple.Tuple2<Double,Double>[] latLngBounds, PolylineOptions options);
    native public static CircleMarker<?> circleMarker(jsweet.util.tuple.Tuple2<Double,Double> latlng, CircleMarkerOptions options);
    native public static CircleMarker<?> circleMarker(LatLngLiteral latlng, CircleMarkerOptions options);
    native public static Circle<?> circle(jsweet.util.tuple.Tuple2<Double,Double> latlng, CircleMarkerOptions options);
    native public static Circle<?> circle(LatLngLiteral latlng, CircleMarkerOptions options);
    native public static Circle<?> circle(jsweet.util.tuple.Tuple2<Double,Double> latlng, double radius, CircleMarkerOptions options);
    native public static Circle<?> circle(LatLngLiteral latlng, double radius, CircleMarkerOptions options);
    /**
 * ID of a HTML-Element as string or the HTML-ELement itself
 */
    native public static Map map(HTMLElement element, MapOptions options);
    native public static Marker<?> marker(jsweet.util.tuple.Tuple2<Double,Double> latlng, MarkerOptions options);
    native public static Marker<?> marker(LatLngLiteral latlng, MarkerOptions options);
    native public static ImageOverlay imageOverlay(String imageUrl, jsweet.util.tuple.Tuple2<Double,Double>[] bounds);
    native public static Polyline<?, ?> polyline(jsweet.util.tuple.Tuple2<Double,Double>[][] latlngs);
    native public static Polyline<?, ?> polyline(LatLng[][] latlngs);
    native public static Polyline<?, ?> polyline(jsweet.util.tuple.Tuple2<Double,Double>[] latlngs);
    native public static Polyline<?, ?> polyline(LatLngLiteral[][] latlngs);
    native public static Polyline<?, ?> polyline(LatLngLiteral[] latlngs);
    native public static Polygon<?> polygon(LatLngLiteral[][] latlngs);
    native public static Polygon<?> polygon(LatLng[][][] latlngs);
    native public static Polygon<?> polygon(jsweet.util.tuple.Tuple2<Double,Double>[][] latlngs);
    native public static Polygon<?> polygon(jsweet.util.tuple.Tuple2<Double,Double>[] latlngs);
    native public static Polygon<?> polygon(LatLngLiteral[] latlngs);
    native public static Polygon<?> polygon(jsweet.util.tuple.Tuple2<Double,Double>[][][] latlngs);
    native public static Polygon<?> polygon(LatLngLiteral[][][] latlngs);
    native public static Polygon<?> polygon(LatLng[][] latlngs);
    native public static Rectangle<?> rectangle(jsweet.util.tuple.Tuple2<Double,Double>[] latLngBounds);
    native public static CircleMarker<?> circleMarker(LatLngLiteral latlng);
    native public static CircleMarker<?> circleMarker(jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public static Circle<?> circle(LatLngLiteral latlng);
    native public static Circle<?> circle(jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public static Circle<?> circle(jsweet.util.tuple.Tuple2<Double,Double> latlng, double radius);
    native public static Circle<?> circle(LatLngLiteral latlng, double radius);
    /**
 * ID of a HTML-Element as string or the HTML-ELement itself
 */
    native public static Map map(HTMLElement element);
    native public static Marker<?> marker(LatLngLiteral latlng);
    native public static Marker<?> marker(jsweet.util.tuple.Tuple2<Double,Double> latlng);
}

