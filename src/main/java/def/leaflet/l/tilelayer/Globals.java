package def.leaflet.l.tilelayer;
import def.leaflet.l.WMSOptions;
/** This class holds all the global functions and variables of the tileLayer package. */
public final class Globals {
    private Globals(){}
    native public static def.leaflet.l.tilelayer.WMS wms(String baseUrl, WMSOptions options);
    native public static def.leaflet.l.tilelayer.WMS wms(String baseUrl);
}

