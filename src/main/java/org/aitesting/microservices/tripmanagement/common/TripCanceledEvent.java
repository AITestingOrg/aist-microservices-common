package org.aitesting.microservices.tripmanagement.common;

import org.aitesting.microservices.eventstore.Event;
import org.aitesting.microservices.eventstore.Name;

import java.util.UUID;

@Name("TripCanceledEvent")
public class TripCanceledEvent extends Event {

    public TripCanceledEvent(UUID id) {
        super(id);
    }
}
