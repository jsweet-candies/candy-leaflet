package def.leaflet.l;

import jsweet.util.union.Union3;

public class Polyline<T extends Union3<def.geojson.geojson.GeometryObject, def.geojson.geojson.LineString, def.geojson.geojson.MultiLineString>, P>
		extends Path {
	public Polyline(LatLng[] latlngs, PolylineOptions options) {
	}

	native public def.geojson.geojson.Feature toGeoJSON();

	native public Union3<LatLng[], LatLng[][], LatLng[][][]> getLatLngs();

	native public Polyline<?, ?> setLatLngs(LatLng[] latlngs);

	native public Boolean isEmpty();

	native public LatLng getCenter();

	native public LatLngBounds getBounds();

	native public Polyline<?, ?> addLatLng(Object latlng);

	@jsweet.lang.Optional
	public def.geojson.geojson.Feature feature;
	public PolylineOptions options;

	public Polyline(LatLng[] latlngs) {
	}

	public Polyline(LatLngLiteral[][] latlngs, PolylineOptions options) {
	}

	public Polyline(jsweet.util.tuple.Tuple2<Double, Double>[][] latlngs, PolylineOptions options) {
	}

	public Polyline(LatLngLiteral[] latlngs, PolylineOptions options) {
	}

	public Polyline(LatLng[][] latlngs, PolylineOptions options) {
	}

	public Polyline(jsweet.util.tuple.Tuple2<Double, Double>[] latlngs, PolylineOptions options) {
	}

	native public Polyline<?, ?> setLatLngs(LatLngLiteral[][] latlngs);

	native public Polyline<?, ?> setLatLngs(LatLng[][] latlngs);

	native public Polyline<?, ?> setLatLngs(LatLng[][][] latlngs);

	native public Polyline<?, ?> setLatLngs(LatLngLiteral[][][] latlngs);

	native public Polyline<?, ?> setLatLngs(jsweet.util.tuple.Tuple2<Double, Double>[] latlngs);

	native public Polyline<?, ?> setLatLngs(jsweet.util.tuple.Tuple2<Double, Double>[][][] latlngs);

	native public Polyline<?, ?> setLatLngs(jsweet.util.tuple.Tuple2<Double, Double>[][] latlngs);

	native public Polyline<?, ?> setLatLngs(LatLngLiteral[] latlngs);

	public Polyline(LatLng[][] latlngs) {
	}

	public Polyline(jsweet.util.tuple.Tuple2<Double, Double>[] latlngs) {
	}

	public Polyline(LatLngLiteral[][] latlngs) {
	}

	public Polyline(LatLngLiteral[] latlngs) {
	}

	public Polyline(jsweet.util.tuple.Tuple2<Double, Double>[][] latlngs) {
	}

	protected Polyline() {
	}
}
