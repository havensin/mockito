package org.mockito.internal.creation.settings;

import org.mockito.listeners.InvocationListener;
import org.mockito.listeners.VerificationStartedListener;
import java.util.ArrayList;
import java.util.List;

public class VerificationStartedListenerManager implements ListenerManager<VerificationStartedListener> {

    private final List<VerificationStartedListener> listeners = new ArrayList<>();

    @Override
    public void addListener(VerificationStartedListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(VerificationStartedListener listener) {
        listeners.remove(listener);
    }

    @Override
    public List<VerificationStartedListener> getListeners() {
        return new ArrayList<>(listeners);
    }
}
