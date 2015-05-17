package org.sganslandt.watcher.notifier.sout.events;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ServiceRemovedEvent {
    private final String serviceName;

    @JsonCreator
    public ServiceRemovedEvent(@JsonProperty("serviceName") final String serviceName) {
        this.serviceName = serviceName;
    }
}
