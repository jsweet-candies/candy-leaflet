package def.leaflet.l;
@jsweet.lang.Interface
public abstract class GeoJSONEvent extends LeafletEvent {
    public Layer layer;
    public Object properties;
    public String geometryType;
    public String id;
}

