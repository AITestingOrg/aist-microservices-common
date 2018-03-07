package org.aitesting.microservices.tripmanagement.common;

import org.aitesting.microservices.eventstore.Event;
import org.aitesting.microservices.eventstore.Name;

import java.util.UUID;

@Name("TripCompletedEvent")
public class TripCompletedEvent extends Event {

    public TripCompletedEvent(UUID id) {
        super(id);
    }
}
