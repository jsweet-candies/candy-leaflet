package def.leaflet.l;
import def.dom.MouseEvent;
@jsweet.lang.Interface
public abstract class LeafletMouseEvent extends LeafletEvent {
    public LatLng latlng;
    public Point layerPoint;
    public Point containerPoint;
    public MouseEvent originalEvent;
}

