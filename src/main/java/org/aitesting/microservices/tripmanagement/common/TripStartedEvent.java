package org.aitesting.microservices.tripmanagement.common;

import org.aitesting.microservices.eventstore.Event;
import org.aitesting.microservices.eventstore.Name;

import java.util.UUID;

@Name("TripStartedEvent")
public class TripStartedEvent extends Event {

    public TripStartedEvent(UUID id) {
        super(id);
    }
}
