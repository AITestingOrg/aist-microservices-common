package org.aitesting.microservices.tripmanagement.common;

import java.util.UUID;

public class TripStartedEvent {
    private UUID id;

    public TripStartedEvent(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
