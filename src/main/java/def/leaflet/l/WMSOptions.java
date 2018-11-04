package def.leaflet.l;
@jsweet.lang.Interface
public abstract class WMSOptions extends TileLayerOptions {
    @jsweet.lang.Optional
    public String layers;
    @jsweet.lang.Optional
    public String styles;
    @jsweet.lang.Optional
    public String format;
    @jsweet.lang.Optional
    public Boolean transparent;
    @jsweet.lang.Optional
    public String version;
    @jsweet.lang.Optional
    public CRS crs;
    @jsweet.lang.Optional
    public Boolean uppercase;
}

