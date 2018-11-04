package def.leaflet.l.control;
/** This class holds all the global functions and variables of the control package. */
public final class Globals {
    private Globals(){}
    native public static def.leaflet.l.control.Zoom zoom(def.leaflet.l.control.ZoomOptions options);
    native public static def.leaflet.l.control.Attribution attribution(def.leaflet.l.control.AttributionOptions options);
    native public static def.leaflet.l.control.Layers layers(def.leaflet.l.control.LayersObject baseLayers, def.leaflet.l.control.LayersObject overlays, def.leaflet.l.control.LayersOptions options);
    native public static def.leaflet.l.control.Scale scale(def.leaflet.l.control.ScaleOptions options);
    native public static def.leaflet.l.control.Zoom zoom();
    native public static def.leaflet.l.control.Attribution attribution();
    native public static def.leaflet.l.control.Layers layers(def.leaflet.l.control.LayersObject baseLayers, def.leaflet.l.control.LayersObject overlays);
    native public static def.leaflet.l.control.Layers layers(def.leaflet.l.control.LayersObject baseLayers);
    native public static def.leaflet.l.control.Layers layers();
    native public static def.leaflet.l.control.Scale scale();
}

