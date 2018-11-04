package def.leaflet.l;
import jsweet.util.union.Union3;
@jsweet.lang.Interface
public abstract class PathOptions extends InteractiveLayerOptions {
    @jsweet.lang.Optional
    public Boolean stroke;
    @jsweet.lang.Optional
    public String color;
    @jsweet.lang.Optional
    public double weight;
    @jsweet.lang.Optional
    public double opacity;
    @jsweet.lang.Optional
    public Object lineCap;
    @jsweet.lang.Optional
    public Object lineJoin;
    @jsweet.lang.Optional
    public String dashArray;
    @jsweet.lang.Optional
    public String dashOffset;
    @jsweet.lang.Optional
    public Boolean fill;
    @jsweet.lang.Optional
    public String fillColor;
    @jsweet.lang.Optional
    public double fillOpacity;
    @jsweet.lang.Optional
    public Union3<def.leaflet.StringTypes.nonzero,def.leaflet.StringTypes.evenodd,def.leaflet.StringTypes.inherit> fillRule;
    @jsweet.lang.Optional
    public Renderer renderer;
    @jsweet.lang.Optional
    public String className;
}

