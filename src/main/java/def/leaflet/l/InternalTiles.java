package def.leaflet.l;
import def.dom.HTMLElement;
import def.js.Date;
@jsweet.lang.Interface
public abstract class InternalTiles extends def.js.Object {
    @SuppressWarnings("unchecked")
	native public $get $get(String key);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class $get extends def.js.Object {
        @jsweet.lang.Optional
        public Boolean active;
        public Coords coords;
        public Boolean current;
        public HTMLElement el;
        @jsweet.lang.Optional
        public Date loaded;
        @jsweet.lang.Optional
        public Boolean retain;
    }
}

