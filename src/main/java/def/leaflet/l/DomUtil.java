package def.leaflet.l;
import def.dom.HTMLElement;
/** Utility class. */
public class DomUtil extends def.js.Object {
    private DomUtil(){}
    /**
     * Get Element by its ID or with the given HTML-Element
     */
    native public static HTMLElement get(String element);
    native public static String getStyle(HTMLElement el, String styleAttrib);
    native public static HTMLElement create(String tagName, String className, HTMLElement container);
    native public static void remove(HTMLElement el);
    native public static void empty(HTMLElement el);
    native public static void toFront(HTMLElement el);
    native public static void toBack(HTMLElement el);
    native public static Boolean hasClass(HTMLElement el, String name);
    native public static void addClass(HTMLElement el, String name);
    native public static void removeClass(HTMLElement el, String name);
    native public static void setClass(HTMLElement el, String name);
    native public static String getClass(HTMLElement el);
    native public static void setOpacity(HTMLElement el, double opacity);
    native public static String testProp(String[] props);
    native public static void setTransform(HTMLElement el, Point offset, double scale);
    native public static void setPosition(HTMLElement el, Point position);
    native public static Point getPosition(HTMLElement el);
    native public static void disableTextSelection();
    native public static void enableTextSelection();
    native public static void disableImageDrag();
    native public static void enableImageDrag();
    native public static void preventOutline(HTMLElement el);
    native public static void restoreOutline();
    public static String TRANSFORM;
    public static String TRANSITION;
    public static String TRANSITION_END;
    native public static HTMLElement create(String tagName, String className);
    native public static HTMLElement create(String tagName);
    native public static void setTransform(HTMLElement el, Point offset);
    /**
     * Get Element by its ID or with the given HTML-Element
     */
    native public static HTMLElement get(HTMLElement element);
}

