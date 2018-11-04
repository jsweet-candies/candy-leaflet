package def.leaflet.l;

import def.geojson.geojson.Feature;

@jsweet.lang.Interface
public abstract class GeoJSONOptions<P> extends LayerOptions {
	/**
	 * A Function defining how GeoJSON points spawn Leaflet layers. It is internally called when data is added, passing the GeoJSON point feature and its
	 * LatLng.
	 *
	 * The default is to spawn a default Marker:
	 *
	 * ``` function(geoJsonPoint, latlng) { return L.marker(latlng); } ```
	 */
	native public Layer pointToLayer(Feature geoJsonPoint, LatLng latlng);

	/**
	 * A Function defining the Path options for styling GeoJSON lines and polygons, called internally when data is added.
	 *
	 * The default value is to not override any defaults:
	 *
	 * ``` function (geoJsonFeature) { return {} } ```
	 */
	@jsweet.lang.Optional
	public java.util.function.Function<Feature, PathOptions> style;

	/**
	 * A Function that will be called once for each created Feature, after it has been created and styled. Useful for attaching events and popups to features.
	 *
	 * The default is to do nothing with the newly created layers:
	 *
	 * ``` function (feature, layer) {} ```
	 */
	native public void onEachFeature(Feature feature, Layer layer);

	/**
	 * A Function that will be used to decide whether to show a feature or not.
	 *
	 * The default is to show all features:
	 *
	 * ``` function (geoJsonFeature) { return true; } ```
	 */
	native public Boolean filter(Feature geoJsonFeature);

	/**
	 * A Function that will be used for converting GeoJSON coordinates to LatLngs. The default is the coordsToLatLng static method.
	 */
	native public LatLng coordsToLatLng(jsweet.util.tuple.Tuple2<Double, Double> coords);

	/**
	 * A Function that will be used for converting GeoJSON coordinates to LatLngs. The default is the coordsToLatLng static method.
	 */
	native public LatLng coordsToLatLng(jsweet.util.tuple.Tuple3<Double, Double, Double> coords);
}
