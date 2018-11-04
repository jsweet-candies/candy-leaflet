package def.leaflet.l;
import def.dom.Element;
public class Path extends Layer {
    native public Path redraw();
    native public Path setStyle(PathOptions style);
    native public Path bringToFront();
    native public Path bringToBack();
    native public Element getElement();
    public PathOptions options;
}

