package org.mockito.internal.creation.settings;

import org.mockito.listeners.InvocationListener;
import org.mockito.listeners.StubbingLookupListener;
import java.util.ArrayList;
import java.util.List;

public class StubbingLookupListenerManager implements ListenerManager<StubbingLookupListener> {

    private final List<StubbingLookupListener> listeners = new ArrayList<>();

    @Override
    public void addListener(StubbingLookupListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(StubbingLookupListener listener) {
        listeners.remove(listener);
    }

    @Override
    public List<StubbingLookupListener> getListeners() {
        return new ArrayList<>(listeners);
    }
}
