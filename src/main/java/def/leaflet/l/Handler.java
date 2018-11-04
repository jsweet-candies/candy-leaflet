package def.leaflet.l;
public class Handler extends Class {
    public Handler(Map map){}
    native public Handler enable();
    native public Handler disable();
    native public Boolean enabled();
    native public void addHooks();
    native public void removeHooks();
    protected Handler(){}
}

