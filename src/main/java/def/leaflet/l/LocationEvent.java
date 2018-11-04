package def.leaflet.l;
@jsweet.lang.Interface
public abstract class LocationEvent extends LeafletEvent {
    public LatLng latlng;
    public LatLngBounds bounds;
    public double accuracy;
    public double altitude;
    public double altitudeAccuracy;
    public double heading;
    public double speed;
    public double timestamp;
}

