package def.leaflet.l;
import def.dom.SVGElement;
public class SVG extends Renderer {
    native public static SVGElement create(String name);
    native public static String pointsToPath(Point[] rings, Boolean close);
    native public static String pointsToPath(jsweet.util.tuple.Tuple2<Double,Double>[] rings, Boolean close);
}

