package def.leaflet.l.domevent;
import def.dom.HTMLElement;
import def.dom.Event;
import def.dom.MouseEvent;
import def.leaflet.l.Point;
/** This class holds all the global functions and variables of the DomEvent package. */
public final class Globals {
    private Globals(){}
    native public static void on(HTMLElement el, String types, java.util.function.Consumer<Event> fn, Object context);
    native public static void on(HTMLElement el, EventMap eventMap, Object context);
    native public static void off(HTMLElement el, String types, java.util.function.Consumer<Event> fn, Object context);
    native public static void off(HTMLElement el, EventMap eventMap, Object context);
    native public static void stopPropagation(Event ev);
    native public static void disableScrollPropagation(HTMLElement el);
    native public static void disableClickPropagation(HTMLElement el);
    native public static void preventDefault(Event ev);
    native public static void stop(Event ev);
    native public static Point getMousePosition(MouseEvent ev, HTMLElement container);
    native public static double getWheelDelta(Event ev);
    native public static void addListener(HTMLElement el, String types, java.util.function.Consumer<Event> fn, Object context);
    native public static void addListener(HTMLElement el, EventMap eventMap, Object context);
    native public static void removeListener(HTMLElement el, String types, java.util.function.Consumer<Event> fn, Object context);
    native public static void removeListener(HTMLElement el, EventMap eventMap, Object context);
    native public static void on(HTMLElement el, String types, java.util.function.Consumer<Event> fn);
    native public static void on(HTMLElement el, EventMap eventMap);
    native public static void off(HTMLElement el, String types, java.util.function.Consumer<Event> fn);
    native public static void off(HTMLElement el, EventMap eventMap);
    native public static Point getMousePosition(MouseEvent ev);
    native public static void addListener(HTMLElement el, String types, java.util.function.Consumer<Event> fn);
    native public static void addListener(HTMLElement el, EventMap eventMap);
    native public static void removeListener(HTMLElement el, String types, java.util.function.Consumer<Event> fn);
    native public static void removeListener(HTMLElement el, EventMap eventMap);
}

