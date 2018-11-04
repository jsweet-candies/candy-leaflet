package def.leaflet.l;
import def.dom.HTMLElement;
/**
 * A class for making DOM elements draggable (including touch support).
 * Used internally for map and marker dragging. Only works for elements
 * that were positioned with [`L.DomUtil.setPosition`](#domutil-setposition).
 */
public class Draggable extends Evented {
    public Draggable(HTMLElement element, HTMLElement dragStartTarget, Boolean preventOutline){}
    native public void enable();
    native public void disable();
    native public void finishDrag();
    public Draggable(HTMLElement element, HTMLElement dragStartTarget){}
    public Draggable(HTMLElement element){}
    protected Draggable(){}
}

