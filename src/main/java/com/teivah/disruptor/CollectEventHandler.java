package com.teivah.disruptor;

import com.lmax.disruptor.EventHandler;

import java.util.ArrayList;
import java.util.List;

public class CollectEventHandler<T> implements EventHandler<Event<T>> {

    private List<Event<T>> collectedEvents;

    public CollectEventHandler() {
        collectedEvents = new ArrayList<>();
    }

    @Override
    public void onEvent(Event<T> tEvent, long l, boolean b) {
        collectedEvents.add(tEvent);
    }

    public List<Event<T>> getCollectedEvents() {
        return collectedEvents;
    }
}