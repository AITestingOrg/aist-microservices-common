package org.aitesting.microservices.tripmanagement.common;

import java.util.UUID;

public class TripCanceledEvent {
    private UUID id;

    public TripCanceledEvent(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
