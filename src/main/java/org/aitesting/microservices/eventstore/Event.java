package org.aitesting.microservices.eventstore;

import java.util.UUID;

@Name("Event")
public abstract class Event {
    private UUID id;

    public Event(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
