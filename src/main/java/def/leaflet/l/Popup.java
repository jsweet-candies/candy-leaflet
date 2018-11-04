package def.leaflet.l;
import def.dom.HTMLElement;
public class Popup extends Layer {
    public Popup(PopupOptions options, Layer source){}
    native public LatLng getLatLng();
    native public Popup setLatLng(LatLng latlng);
    native public jsweet.util.union.Union<String,HTMLElement> getContent();
    native public Popup setContent(String htmlContent);
    native public HTMLElement getElement();
    native public void update();
    native public Boolean isOpen();
    native public Popup bringToFront();
    native public Popup bringToBack();
    native public Popup openOn(Map map);
    public PopupOptions options;
    public Popup(PopupOptions options){}
    public Popup(){}
    native public Popup setLatLng(jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public Popup setLatLng(LatLngLiteral latlng);
    native public Popup setContent(HTMLElement htmlContent);
}

