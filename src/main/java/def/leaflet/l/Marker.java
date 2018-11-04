package def.leaflet.l;

import def.dom.HTMLElement;
import def.geojson.geojson.Feature;

public class Marker<P> extends Layer {
	public Marker(LatLng latlng, MarkerOptions options) {
	}

	native public Feature toGeoJSON();

	native public LatLng getLatLng();

	native public Marker<?> setLatLng(LatLng latlng);

	native public Marker<?> setZIndexOffset(double offset);

	native public Marker<?> setIcon(Icon<?> icon);

	native public Marker<?> setOpacity(double opacity);

	native public HTMLElement getElement();

	public MarkerOptions options;
	@jsweet.lang.Optional
	public Handler dragging;
	@jsweet.lang.Optional
	public Feature feature;

	public Marker(LatLng latlng) {
	}

	public Marker(LatLngLiteral latlng, MarkerOptions options) {
	}

	public Marker(jsweet.util.tuple.Tuple2<Double, Double> latlng, MarkerOptions options) {
	}

	native public Marker<?> setLatLng(jsweet.util.tuple.Tuple2<Double, Double> latlng);

	native public Marker<?> setLatLng(LatLngLiteral latlng);

	native public Marker<?> setIcon(DivIcon icon);

	public Marker(jsweet.util.tuple.Tuple2<Double, Double> latlng) {
	}

	public Marker(LatLngLiteral latlng) {
	}

	protected Marker() {
	}
}
