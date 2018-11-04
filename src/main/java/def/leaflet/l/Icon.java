package def.leaflet.l;
import def.dom.HTMLElement;
public class Icon<T extends BaseIconOptions> extends Layer {
    public Icon(T options){}
    native public HTMLElement createIcon(HTMLElement oldIcon);
    native public HTMLElement createShadow(HTMLElement oldIcon);
    public T options;
    native public HTMLElement createIcon();
    native public HTMLElement createShadow();
    protected Icon(){}
}

