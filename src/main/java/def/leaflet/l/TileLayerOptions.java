package def.leaflet.l;
@jsweet.lang.Interface
public abstract class TileLayerOptions extends GridLayerOptions {
    @jsweet.lang.Optional
    public double minZoom;
    @jsweet.lang.Optional
    public double maxZoom;
    @jsweet.lang.Optional
    public double maxNativeZoom;
    @jsweet.lang.Optional
    public double minNativeZoom;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,String[]> subdomains;
    @jsweet.lang.Optional
    public String errorTileUrl;
    @jsweet.lang.Optional
    public double zoomOffset;
    @jsweet.lang.Optional
    public Boolean tms;
    @jsweet.lang.Optional
    public Boolean zoomReverse;
    @jsweet.lang.Optional
    public Boolean detectRetina;
    @jsweet.lang.Optional
    public Boolean crossOrigin;
    native public <T> T $get(String name);
}

