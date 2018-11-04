package def.leaflet.l;
import def.dom.HTMLElement;
public class Control extends Class {
    public Control(ControlOptions options){}
    native public Object getPosition();
    native public Control setPosition(Object position);
    native public HTMLElement getContainer();
    native public Control addTo(Map map);
    native public Control remove();
    native public HTMLElement onAdd(Map map);
    native public void onRemove(Map map);
    public ControlOptions options;
    public Control(){}
}

