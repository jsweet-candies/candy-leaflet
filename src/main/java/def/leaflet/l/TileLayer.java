package def.leaflet.l;
public class TileLayer extends GridLayer {
    public TileLayer(String urlTemplate, TileLayerOptions options){}
    native public TileLayer setUrl(String url, Boolean noRedraw);
    native public void _abortLoading();
    native public double _getZoomForUrl();
    public TileLayerOptions options;
    public TileLayer(String urlTemplate){}
    native public TileLayer setUrl(String url);
    protected TileLayer(){}
}

