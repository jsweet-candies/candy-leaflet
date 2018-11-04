package def.leaflet.l;
import jsweet.util.union.Union3;
import def.js.PropertyDescriptorMap;
/** Utility class. */
public class Util extends def.js.Object {
    private Util(){}
    native public static <D extends Object,S1,S2> Union3<D,S1,S2> extend(D dest, S1 src1, S2 src2);
    native public static <D extends Object,S1,S2,S3> Object extend(D dest, S1 src1, S2 src2, S3 src3);
    native public static Object extend(Object dest, Object... src);
    native public static def.js.Object create(Object proto, PropertyDescriptorMap properties);
    native public static java.lang.Runnable bind(java.lang.Runnable fn, Object... obj);
    native public static double stamp(Object obj);
    native public static java.lang.Runnable throttle(java.lang.Runnable fn, double time, Object context);
    native public static double wrapNum(double num, double[] range, Boolean includeMax);
    native public static boolean falseFn();
    native public static double formatNum(double num, double digits);
    native public static String trim(String str);
    native public static String[] splitWords(String str);
    native public static Object setOptions(Object obj, Object options);
    native public static String getParamString(Object obj, String existingUrl, Boolean uppercase);
    native public static String template(String str, Object data);
    native public static Boolean isArray(Object obj);
    native public static double indexOf(Object[] array, Object el);
    native public static double requestAnimFrame(java.util.function.Consumer<Double> fn, Object context, Boolean immediate);
    native public static void cancelAnimFrame(double id);
    public static double lastId;
    public static String emptyImageUrl;
    native public static def.js.Object create(def.js.Object proto);
    native public static double wrapNum(double num, double[] range);
    native public static double formatNum(double num);
    native public static String getParamString(Object obj, String existingUrl);
    native public static String getParamString(Object obj);
    native public static double requestAnimFrame(java.util.function.Consumer<Double> fn, Object context);
    native public static double requestAnimFrame(java.util.function.Consumer<Double> fn);
    native public static def.js.Object create(def.js.Object proto, PropertyDescriptorMap properties);
    native public static def.js.Object create(Object proto);
}

