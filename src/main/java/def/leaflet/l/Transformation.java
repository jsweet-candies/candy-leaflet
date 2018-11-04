package def.leaflet.l;
public class Transformation extends def.js.Object {
    public Transformation(double a, double b, double c, double d){}
    native public Point transform(Point point, double scale);
    native public Point untransform(Point point, double scale);
    native public Point transform(Point point);
    native public Point untransform(Point point);
    protected Transformation(){}
}

