package org.aitesting.microservices.tripmanagement.common;

import java.util.UUID;

public class TripCreatedEvent {
    private UUID id;
    private UUID userId;
    private String originAddress;
    private String destinationAddress;

    public TripCreatedEvent(UUID id, UUID userId, String originAddress, String destinationAddress){
        this.id = id;
        this.userId = userId;
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getOriginAddress() {
        return originAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }
}
