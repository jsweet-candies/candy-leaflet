package def.leaflet.l;
/**
 * Extended LayerGroup that also has mouse events (propagated from
 * members of the group) and a shared bindPopup method.
 */
public class FeatureGroup<P> extends LayerGroup<P> {
    /**
     * Sets the given path options to each layer of the group that has a setStyle method.
     */
    native public FeatureGroup<?> setStyle(PathOptions style);
    /**
     * Brings the layer group to the top of all other layers
     */
    native public FeatureGroup<?> bringToFront();
    /**
     * Brings the layer group to the top [sic] of all other layers
     */
    native public FeatureGroup<?> bringToBack();
    /**
     * Returns the LatLngBounds of the Feature Group (created from
     * bounds and coordinates of its children).
     */
    native public LatLngBounds getBounds();
}

