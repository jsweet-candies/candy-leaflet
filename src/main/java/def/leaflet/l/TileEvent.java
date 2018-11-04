package def.leaflet.l;
import def.dom.HTMLImageElement;
@jsweet.lang.Interface
public abstract class TileEvent extends LeafletEvent {
    public HTMLImageElement tile;
    public Point coords;
}

