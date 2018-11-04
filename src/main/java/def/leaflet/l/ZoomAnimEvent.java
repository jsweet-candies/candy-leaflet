package def.leaflet.l;
@jsweet.lang.Interface
public abstract class ZoomAnimEvent extends LeafletEvent {
    public LatLng center;
    public double zoom;
    public Boolean noUpdate;
}

