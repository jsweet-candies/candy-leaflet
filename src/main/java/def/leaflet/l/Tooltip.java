package def.leaflet.l;
import def.dom.HTMLElement;
import jsweet.util.union.Union;
public class Tooltip extends Layer {
    public Tooltip(TooltipOptions options, Layer source){}
    native public void setOpacity(double val);
    native public LatLng getLatLng();
    native public Tooltip setLatLng(LatLng latlng);
    native public Union<String,HTMLElement> getContent();
    native public Tooltip setContent(String htmlContent);
    native public HTMLElement getElement();
    native public void update();
    native public Boolean isOpen();
    native public Tooltip bringToFront();
    native public Tooltip bringToBack();
    public TooltipOptions options;
    public Tooltip(TooltipOptions options){}
    public Tooltip(){}
    native public Tooltip setLatLng(LatLngLiteral latlng);
    native public Tooltip setLatLng(jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public Tooltip setContent(HTMLElement htmlContent);
}

