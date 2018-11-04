package def.leaflet.l.control;
import def.leaflet.l.Control;
public class Attribution extends Control {
    public Attribution(AttributionOptions options){}
    native public Attribution setPrefix(String prefix);
    native public Attribution addAttribution(String text);
    native public Attribution removeAttribution(String text);
    public AttributionOptions options;
    public Attribution(){}
}

