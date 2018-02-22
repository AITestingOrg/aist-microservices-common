package org.aitesting.microservices.eventstore;

import java.util.UUID;

@Name("Event")
public abstract class Event {
    private static UUID id;

    public Event(UUID id) {
        this.id = id;
    }

    public UUID getID() {
        return id;
    }
}
