package org.mockito.internal.creation.settings;

import org.mockito.listeners.InvocationListener;
import java.util.ArrayList;
import java.util.List;

public class InvocationListenerManager implements ListenerManager<InvocationListener> {

    private final List<InvocationListener> listeners = new ArrayList<>();

    @Override
    public void addListener(InvocationListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(InvocationListener listener) {
        listeners.remove(listener);
    }

    @Override
    public List<InvocationListener> getListeners() {
        return new ArrayList<>(listeners);
    }
}
