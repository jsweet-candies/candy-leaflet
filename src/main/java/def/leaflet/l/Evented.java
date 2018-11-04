package def.leaflet.l;
/**
 * A set of methods shared between event-powered classes (like Map and Marker).
 * Generally, events allow you to execute some function when something happens
 * with an object (e.g. the user clicks on the map, causing the map to fire
 * 'click' event).
 */
public class Evented extends Class {
    /**
     * Adds a listener function (fn) to a particular event type of the object.
     * You can optionally specify the context of the listener (object the this
     * keyword will point to). You can also pass several space-separated types
     * (e.g. 'click dblclick').
     */
    native public Evented on(String type, java.util.function.Consumer<LeafletEvent> fn, Object context);
    /**
     * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
     */
    native public Evented on(LeafletEventHandlerFnMap eventMap);
    /**
     * Removes a previously added listener function. If no function is specified,
     * it will remove all the listeners of that particular event from the object.
     * Note that if you passed a custom context to on, you must pass the same context
     * to off in order to remove the listener.
     */
    native public Evented off(String type, java.util.function.Consumer<LeafletEvent> fn, Object context);
    /**
     * Removes a set of type/listener pairs.
     */
    native public Evented off(LeafletEventHandlerFnMap eventMap);
    /**
     * Removes all listeners to all events on the object.
     */
    native public Evented off();
    /**
     * Fires an event of the specified type. You can optionally provide a data
     * object — the first argument of the listener function will contain its properties.
     * The event might can optionally be propagated to event parents.
     */
    native public Evented fire(String type, Object data, Boolean propagate);
    /**
     * Returns true if a particular event type has any listeners attached to it.
     */
    native public Boolean listens(String type);
    /**
     * Behaves as on(...), except the listener will only get fired once and then removed.
     */
    native public Evented once(String type, java.util.function.Consumer<LeafletEvent> fn, Object context);
    /**
     * Behaves as on(...), except the listener will only get fired once and then removed.
     */
    native public Evented once(LeafletEventHandlerFnMap eventMap);
    /**
     * Adds an event parent - an Evented that will receive propagated events
     */
    native public Evented addEventParent(Evented obj);
    /**
     * Removes an event parent, so it will stop receiving propagated events
     */
    native public Evented removeEventParent(Evented obj);
    /**
     * Alias for on(...)
     *
     * Adds a listener function (fn) to a particular event type of the object.
     * You can optionally specify the context of the listener (object the this
     * keyword will point to). You can also pass several space-separated types
     * (e.g. 'click dblclick').
     */
    native public Evented addEventListener(String type, java.util.function.Consumer<LeafletEvent> fn, Object context);
    /**
     * Alias for on(...)
     *
     * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
     */
    native public Evented addEventListener(LeafletEventHandlerFnMap eventMap);
    /**
     * Alias for off(...)
     *
     * Removes a previously added listener function. If no function is specified,
     * it will remove all the listeners of that particular event from the object.
     * Note that if you passed a custom context to on, you must pass the same context
     * to off in order to remove the listener.
     */
    native public Evented removeEventListener(String type, java.util.function.Consumer<LeafletEvent> fn, Object context);
    /**
     * Alias for off(...)
     *
     * Removes a set of type/listener pairs.
     */
    native public Evented removeEventListener(LeafletEventHandlerFnMap eventMap);
    /**
     * Alias for off()
     *
     * Removes all listeners to all events on the object.
     */
    native public Evented clearAllEventListeners();
    /**
     * Alias for once(...)
     *
     * Behaves as on(...), except the listener will only get fired once and then removed.
     */
    native public Evented addOneTimeEventListener(String type, java.util.function.Consumer<LeafletEvent> fn, Object context);
    /**
     * Alias for once(...)
     *
     * Behaves as on(...), except the listener will only get fired once and then removed.
     */
    native public Evented addOneTimeEventListener(LeafletEventHandlerFnMap eventMap);
    /**
     * Alias for fire(...)
     *
     * Fires an event of the specified type. You can optionally provide a data
     * object — the first argument of the listener function will contain its properties.
     * The event might can optionally be propagated to event parents.
     */
    native public Evented fireEvent(String type, Object data, Boolean propagate);
    /**
     * Alias for listens(...)
     *
     * Returns true if a particular event type has any listeners attached to it.
     */
    native public Boolean hasEventListeners(String type);
    /**
     * Adds a listener function (fn) to a particular event type of the object.
     * You can optionally specify the context of the listener (object the this
     * keyword will point to). You can also pass several space-separated types
     * (e.g. 'click dblclick').
     */
    native public Evented on(String type, java.util.function.Consumer<LeafletEvent> fn);
    /**
     * Removes a previously added listener function. If no function is specified,
     * it will remove all the listeners of that particular event from the object.
     * Note that if you passed a custom context to on, you must pass the same context
     * to off in order to remove the listener.
     */
    native public Evented off(String type, java.util.function.Consumer<LeafletEvent> fn);
    /**
     * Removes a previously added listener function. If no function is specified,
     * it will remove all the listeners of that particular event from the object.
     * Note that if you passed a custom context to on, you must pass the same context
     * to off in order to remove the listener.
     */
    native public Evented off(String type);
    /**
     * Fires an event of the specified type. You can optionally provide a data
     * object — the first argument of the listener function will contain its properties.
     * The event might can optionally be propagated to event parents.
     */
    native public Evented fire(String type, Object data);
    /**
     * Fires an event of the specified type. You can optionally provide a data
     * object — the first argument of the listener function will contain its properties.
     * The event might can optionally be propagated to event parents.
     */
    native public Evented fire(String type);
    /**
     * Behaves as on(...), except the listener will only get fired once and then removed.
     */
    native public Evented once(String type, java.util.function.Consumer<LeafletEvent> fn);
    /**
     * Alias for on(...)
     *
     * Adds a listener function (fn) to a particular event type of the object.
     * You can optionally specify the context of the listener (object the this
     * keyword will point to). You can also pass several space-separated types
     * (e.g. 'click dblclick').
     */
    native public Evented addEventListener(String type, java.util.function.Consumer<LeafletEvent> fn);
    /**
     * Alias for off(...)
     *
     * Removes a previously added listener function. If no function is specified,
     * it will remove all the listeners of that particular event from the object.
     * Note that if you passed a custom context to on, you must pass the same context
     * to off in order to remove the listener.
     */
    native public Evented removeEventListener(String type, java.util.function.Consumer<LeafletEvent> fn);
    /**
     * Alias for once(...)
     *
     * Behaves as on(...), except the listener will only get fired once and then removed.
     */
    native public Evented addOneTimeEventListener(String type, java.util.function.Consumer<LeafletEvent> fn);
    /**
     * Alias for fire(...)
     *
     * Fires an event of the specified type. You can optionally provide a data
     * object — the first argument of the listener function will contain its properties.
     * The event might can optionally be propagated to event parents.
     */
    native public Evented fireEvent(String type, Object data);
    /**
     * Alias for fire(...)
     *
     * Fires an event of the specified type. You can optionally provide a data
     * object — the first argument of the listener function will contain its properties.
     * The event might can optionally be propagated to event parents.
     */
    native public Evented fireEvent(String type);
}

