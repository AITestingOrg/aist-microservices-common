package org.aitesting.microservices.tripmanagement.common;

import java.util.UUID;

public class TripCompletedEvent {
    private UUID id;

    public TripCompletedEvent(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
