package def.leaflet.l;

import def.geojson.geojson.Feature;

public class CircleMarker<P> extends Path {
	public CircleMarker(LatLng latlng, CircleMarkerOptions options) {
	}

	native public Feature toGeoJSON();

	native public CircleMarker<?> setLatLng(LatLng latLng);

	native public LatLng getLatLng();

	native public CircleMarker<?> setRadius(double radius);

	native public double getRadius();

	public CircleMarkerOptions options;
	@jsweet.lang.Optional
	public Feature feature;

	public CircleMarker(LatLng latlng) {
	}

	public CircleMarker(jsweet.util.tuple.Tuple2<Double, Double> latlng, CircleMarkerOptions options) {
	}

	public CircleMarker(LatLngLiteral latlng, CircleMarkerOptions options) {
	}

	native public CircleMarker<?> setLatLng(LatLngLiteral latLng);

	native public CircleMarker<?> setLatLng(jsweet.util.tuple.Tuple2<Double, Double> latLng);

	public CircleMarker(LatLngLiteral latlng) {
	}

	public CircleMarker(jsweet.util.tuple.Tuple2<Double, Double> latlng) {
	}

	protected CircleMarker() {
	}
}
