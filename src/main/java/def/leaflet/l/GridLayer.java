package def.leaflet.l;
import def.js.Error;
import def.dom.HTMLElement;
public class GridLayer extends Layer {
    public GridLayer(GridLayerOptions options){}
    native public GridLayer bringToFront();
    native public GridLayer bringToBack();
    native public HTMLElement getContainer();
    native public GridLayer setOpacity(double opacity);
    native public GridLayer setZIndex(double zIndex);
    native public Boolean isLoading();
    native public GridLayer redraw();
    native public Point getTileSize();
    native public HTMLElement createTile(Coords coords, java.util.function.BiConsumer<Error,HTMLElement> done);
    native public String _tileCoordsToKey(Coords coords);
    public InternalTiles _tiles;
    @jsweet.lang.Optional
    public double _tileZoom;
    public GridLayer(){}
    native public HTMLElement createTile(Coords coords, java.util.function.Consumer<Error> done);
    native public HTMLElement createTile(Coords coords, java.lang.Runnable done);
}

