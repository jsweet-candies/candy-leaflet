package def.leaflet.l;

import def.geojson.geojson.Feature;
import def.geojson.geojson.FeatureCollection;
import def.geojson.geojson.GeometryCollection;
import jsweet.util.union.Union3;

/**
 * Used to group several layers and handle them as one. If you add it to the map, any layers added or removed from the group will be added/removed on the map as
 * well. Extends Layer.
 */
public class LayerGroup<P> extends Layer {
	public LayerGroup(Layer[] layers, LayerOptions options) {
	}

	/**
	 * Returns a GeoJSON representation of the layer group (as a GeoJSON GeometryCollection, GeoJSONFeatureCollection or Multipoint).
	 */
	native public Union3<FeatureCollection, Feature, GeometryCollection> toGeoJSON();

	/**
	 * Adds the given layer to the group.
	 */
	native public LayerGroup<?> addLayer(Layer layer);

	/**
	 * Removes the layer with the given internal ID or the given layer from the group.
	 */
	native public LayerGroup<?> removeLayer(double layer);

	/**
	 * Returns true if the given layer is currently added to the group.
	 */
	native public Boolean hasLayer(Layer layer);

	/**
	 * Removes all the layers from the group.
	 */
	native public LayerGroup<?> clearLayers();

	/**
	 * Calls methodName on every layer contained in this group, passing any additional parameters. Has no effect if the layers contained do not implement
	 * methodName.
	 */
	native public LayerGroup<?> invoke(String methodName, Object... params);

	/**
	 * Iterates over the layers of the group, optionally specifying context of the iterator function.
	 */
	native public LayerGroup<?> eachLayer(java.util.function.Consumer<Layer> fn, Object context);

	/**
	 * Returns the layer with the given internal ID.
	 */
	native public Layer getLayer(double id);

	/**
	 * Returns an array of all the layers added to the group.
	 */
	native public Layer[] getLayers();

	/**
	 * Calls setZIndex on every layer contained in this group, passing the z-index.
	 */
	native public LayerGroup<?> setZIndex(double zIndex);

	/**
	 * Returns the internal ID for a layer
	 */
	native public double getLayerId(Layer layer);

	@jsweet.lang.Optional
	public Union3<FeatureCollection, Feature, GeometryCollection> feature;

	public LayerGroup(Layer[] layers) {
	}

	public LayerGroup() {
	}

	/**
	 * Iterates over the layers of the group, optionally specifying context of the iterator function.
	 */
	native public LayerGroup<P> eachLayer(java.util.function.Consumer<Layer> fn);

	/**
	 * Removes the layer with the given internal ID or the given layer from the group.
	 */
	native public LayerGroup<P> removeLayer(Layer layer);
}
