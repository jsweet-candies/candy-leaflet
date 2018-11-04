package def.leaflet.l;
import def.dom.HTMLElement;
public class Layer extends Evented {
    public Layer(LayerOptions options){}
    native public Layer addTo(Map map);
    native public Layer remove();
    native public Layer removeFrom(Map map);
    native public HTMLElement getPane(String name);
    native public Layer bindPopup(String content, PopupOptions options);
    native public Layer unbindPopup();
    native public Layer openPopup(LatLng latlng);
    native public Layer closePopup();
    native public Layer togglePopup();
    native public Boolean isPopupOpen();
    native public Layer setPopupContent(String content);
    native public Popup getPopup();
    native public Layer bindTooltip(String content, TooltipOptions options);
    native public Layer unbindTooltip();
    native public Layer openTooltip(LatLng latlng);
    native public Layer closeTooltip();
    native public Layer toggleTooltip();
    native public Boolean isTooltipOpen();
    native public Layer setTooltipContent(String content);
    native public Tooltip getTooltip();
    native public Layer onAdd(Map map);
    native public Layer onRemove(Map map);
    native public GetEvents getEvents();
    native public String getAttribution();
    native public Layer beforeAdd(Map map);
    public Map _map;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class GetEvents extends def.js.Object {
        @SuppressWarnings("unchecked")
		native public java.util.function.Consumer<LeafletEvent> $get(String name);
    }
    public Layer(){}
    native public HTMLElement getPane();
    native public Layer bindPopup(String content);
    native public Layer openPopup();
    native public Layer bindTooltip(String content);
    native public Layer openTooltip();
    native public Layer addTo(LayerGroup<?> map);
    native public Layer bindPopup(HTMLElement content, PopupOptions options);
    native public Layer openPopup(LatLngLiteral latlng);
    native public Layer openPopup(jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public Layer setPopupContent(HTMLElement content);
    native public Layer setPopupContent(Popup content);
    native public Layer bindTooltip(HTMLElement content, TooltipOptions options);
    native public Layer openTooltip(LatLngLiteral latlng);
    native public Layer openTooltip(jsweet.util.tuple.Tuple2<Double,Double> latlng);
    native public Layer setTooltipContent(Tooltip content);
    native public Layer setTooltipContent(HTMLElement content);
    native public Layer bindPopup(HTMLElement content);
    native public Layer bindTooltip(HTMLElement content);
}

