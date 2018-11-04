package def.leaflet.l.tilelayer;
import def.leaflet.l.TileLayer;
import def.leaflet.l.WMSParams;
import def.leaflet.l.WMSOptions;
public class WMS extends TileLayer {
    public WMS(String baseUrl, WMSOptions options){}
    native public WMS setParams(WMSParams params, Boolean noRedraw);
    public WMSParams wmsParams;
    public WMSOptions options;
    native public WMS setParams(WMSParams params);
    protected WMS(){}
}

