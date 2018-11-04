package def.leaflet.l;

import def.geojson.geojson.Feature;
import def.geojson.geojson.GeoJsonObject;
import def.geojson.geojson.GeometryObject;

/**
 * Represents a GeoJSON object or an array of GeoJSON objects.
 * Allows you to parse GeoJSON data and display it on the map. Extends FeatureGroup.
 */
public class GeoJSON<P> extends FeatureGroup<P> {
    /**
     * Creates a Layer from a given GeoJSON feature. Can use a custom pointToLayer
     * and/or coordsToLatLng functions if provided as options.
     */
    native public static <P> Layer geometryToLayer(Feature featureData, GeoJSONOptions<P> options);
    /**
     * Creates a LatLng object from an array of 2 numbers (longitude, latitude) or
     * 3 numbers (longitude, latitude, altitude) used in GeoJSON for points.
     */
    native public static LatLng coordsToLatLng(jsweet.util.tuple.Tuple2<Double,Double> coords);
    /**
     * Creates a multidimensional array of LatLngs from a GeoJSON coordinates array.
     * levelsDeep specifies the nesting level (0 is for an array of points, 1 for an array of
     * arrays of points, etc., 0 by default).
     * Can use a custom coordsToLatLng function.
     */
    @jsweet.lang.Name("coordsToLatLngs")
    native public static Object[] coordsToLatLngsCoordsToLatLngFunction(Object[] coords, double levelsDeep, java.util.function.Function<jsweet.util.tuple.Tuple2<Double,Double>,LatLng> coordsToLatLng);
    /**
     * Reverse of coordsToLatLng
     */
    native public static jsweet.util.union.Union<jsweet.util.tuple.Tuple2<Double,Double>,jsweet.util.tuple.Tuple3<Double,Double,Double>> latLngToCoords(LatLng latlng);
    /**
     * Reverse of coordsToLatLngs closed determines whether the first point should be
     * appended to the end of the array to close the feature, only used when levelsDeep is 0.
     * False by default.
     */
    native public static Object[] latLngsToCoords(Object[] latlngs, double levelsDeep, Boolean closed);
    /**
     * Normalize GeoJSON geometries/features into GeoJSON features.
     */
    native public static <P> Feature asFeature(Feature geojson);
    public GeoJSON(GeoJsonObject geojson, GeoJSONOptions<P> options){}
    /**
     * Adds a GeoJSON object to the layer.
     */
    native public Layer addData(GeoJsonObject data);
    /**
     * Resets the given vector layer's style to the original GeoJSON style,
     * useful for resetting style after hover events.
     */
    native public Layer resetStyle(Layer layer);
    /**
     * Same as FeatureGroup's setStyle method, but style-functions are also
     * allowed here to set the style according to the feature.
     */
    native public GeoJSON<?> setStyle(PathOptions style);
    public GeoJSONOptions<P> options;
    /**
     * Creates a Layer from a given GeoJSON feature. Can use a custom pointToLayer
     * and/or coordsToLatLng functions if provided as options.
     */
    native public static <P> Layer geometryToLayer(Feature featureData);
    /**
     * Creates a multidimensional array of LatLngs from a GeoJSON coordinates array.
     * levelsDeep specifies the nesting level (0 is for an array of points, 1 for an array of
     * arrays of points, etc., 0 by default).
     * Can use a custom coordsToLatLng function.
     */
    native public static Object[] coordsToLatLngs(Object[] coords, double levelsDeep);
    /**
     * Creates a multidimensional array of LatLngs from a GeoJSON coordinates array.
     * levelsDeep specifies the nesting level (0 is for an array of points, 1 for an array of
     * arrays of points, etc., 0 by default).
     * Can use a custom coordsToLatLng function.
     */
    native public static Object[] coordsToLatLngs(Object[] coords);
    /**
     * Reverse of coordsToLatLngs closed determines whether the first point should be
     * appended to the end of the array to close the feature, only used when levelsDeep is 0.
     * False by default.
     */
    native public static Object[] latLngsToCoords(Object[] latlngs, double levelsDeep);
    /**
     * Reverse of coordsToLatLngs closed determines whether the first point should be
     * appended to the end of the array to close the feature, only used when levelsDeep is 0.
     * False by default.
     */
    native public static Object[] latLngsToCoords(Object[] latlngs);
    public GeoJSON(GeoJsonObject geojson){}
    public GeoJSON(){}
    /**
     * Creates a LatLng object from an array of 2 numbers (longitude, latitude) or
     * 3 numbers (longitude, latitude, altitude) used in GeoJSON for points.
     */
    native public static LatLng coordsToLatLng(jsweet.util.tuple.Tuple3<Double,Double,Double> coords);
    /**
     * Creates a multidimensional array of LatLngs from a GeoJSON coordinates array.
     * levelsDeep specifies the nesting level (0 is for an array of points, 1 for an array of
     * arrays of points, etc., 0 by default).
     * Can use a custom coordsToLatLng function.
     */
    @jsweet.lang.Name("coordsToLatLngs")
    native public static Object[] coordsToLatLngsCoordsToLatLngTuple3DoubleFunction(Object[] coords, double levelsDeep, java.util.function.Function<jsweet.util.tuple.Tuple3<Double,Double,Double>,LatLng> coordsToLatLng);
    /**
     * Normalize GeoJSON geometries/features into GeoJSON features.
     */
    native public static <P> Feature asFeature(GeometryObject geojson);
    /**
     * Same as FeatureGroup's setStyle method, but style-functions are also
     * allowed here to set the style according to the feature.
     */
    native public GeoJSON<?> setStyle(java.util.function.Function<Feature,PathOptions> style);
}

