package def.leaflet.l;
@jsweet.lang.Interface
public abstract class PopupOptions extends DivOverlayOptions {
    @jsweet.lang.Optional
    public double maxWidth;
    @jsweet.lang.Optional
    public double minWidth;
    @jsweet.lang.Optional
    public double maxHeight;
    @jsweet.lang.Optional
    public Boolean autoPan;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> autoPanPaddingTopLeft;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> autoPanPaddingBottomRight;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Point,jsweet.util.tuple.Tuple2<Double,Double>> autoPanPadding;
    @jsweet.lang.Optional
    public Boolean keepInView;
    @jsweet.lang.Optional
    public Boolean closeButton;
    @jsweet.lang.Optional
    public Boolean autoClose;
    @jsweet.lang.Optional
    public Boolean closeOnClick;
}

