package org.mockito.internal.creation.settings;

import org.mockito.listeners.InvocationListener;
import java.util.List;

public interface ListenerManager<T> {

    /**
     * Adds a listener to listener manager.
     * @param listener to be added
     */
    void addListener(T listener);

    /**
     * Removed a listener from listener manager.
     * @param listener to be removed
     */
    void removeListener(T listener);

    /**
     * Returns listeners from listener manager.
     *
     * @return list of listeners
     */
    List<T> getListeners();
}
