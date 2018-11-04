package def.leaflet.l;
import def.dom.HTMLImageElement;
public class ImageOverlay extends Layer {
    public ImageOverlay(String imageUrl, LatLngBounds bounds, ImageOverlayOptions options){}
    native public ImageOverlay setOpacity(double opacity);
    native public ImageOverlay bringToFront();
    native public ImageOverlay bringToBack();
    native public ImageOverlay setUrl(String url);
    /** Update the bounds that this ImageOverlay covers */
    native public ImageOverlay setBounds(LatLngBounds bounds);
    /** Get the bounds that this ImageOverlay covers */
    native public LatLngBounds getBounds();
    /** Get the img element that represents the ImageOverlay on the map */
    native public HTMLImageElement getElement();
    public ImageOverlayOptions options;
    public ImageOverlay(String imageUrl, LatLngBounds bounds){}
    public ImageOverlay(String imageUrl, jsweet.util.tuple.Tuple2<Double,Double>[] bounds, ImageOverlayOptions options){}
    public ImageOverlay(String imageUrl, jsweet.util.tuple.Tuple2<Double,Double>[] bounds){}
    protected ImageOverlay(){}
}

