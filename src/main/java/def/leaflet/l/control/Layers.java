package def.leaflet.l.control;
import def.leaflet.l.Control;
import def.leaflet.l.Layer;
public class Layers extends Control {
    public Layers(LayersObject baseLayers, LayersObject overlays, LayersOptions options){}
    native public Layers addBaseLayer(Layer layer, String name);
    native public Layers addOverlay(Layer layer, String name);
    native public Layers removeLayer(Layer layer);
    native public Layers expand();
    native public Layers collapse();
    public LayersOptions options;
    public Layers(LayersObject baseLayers, LayersObject overlays){}
    public Layers(LayersObject baseLayers){}
    public Layers(){}
}

