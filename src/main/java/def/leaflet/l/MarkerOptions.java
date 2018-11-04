package def.leaflet.l;
@jsweet.lang.Interface
public abstract class MarkerOptions extends InteractiveLayerOptions {
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Icon<?>,DivIcon> icon;
    @jsweet.lang.Optional
    public Boolean clickable;
    @jsweet.lang.Optional
    public Boolean draggable;
    @jsweet.lang.Optional
    public Boolean keyboard;
    @jsweet.lang.Optional
    public String title;
    @jsweet.lang.Optional
    public String alt;
    @jsweet.lang.Optional
    public double zIndexOffset;
    @jsweet.lang.Optional
    public double opacity;
    @jsweet.lang.Optional
    public Boolean riseOnHover;
    @jsweet.lang.Optional
    public double riseOffset;
}

