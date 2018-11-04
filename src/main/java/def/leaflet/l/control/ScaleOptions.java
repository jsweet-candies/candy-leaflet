package def.leaflet.l.control;
import def.leaflet.l.ControlOptions;
@jsweet.lang.Interface
public abstract class ScaleOptions extends ControlOptions {
    @jsweet.lang.Optional
    public double maxWidth;
    @jsweet.lang.Optional
    public Boolean metric;
    @jsweet.lang.Optional
    public Boolean imperial;
    @jsweet.lang.Optional
    public Boolean updateWhenIdle;
}

