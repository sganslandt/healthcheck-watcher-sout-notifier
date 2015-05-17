package org.sganslandt.watcher.notifier.sout.resources;

import com.codahale.metrics.annotation.Timed;
import org.sganslandt.watcher.notifier.sout.events.*;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class EventHandlerResource {

    @POST
    @Timed
    @Path("/systemStateChanged")
    public void handleSystemStateChanged(SystemStateChangedEvent event) {
        System.out.println(event);
    }

    @POST
    @Timed
    @Path("/serviceAdded")
    public void handleServiceAdded(ServiceAddedEvent event) {
        System.out.println(event);
    }

    @POST
    @Timed
    @Path("/serviceRemoved")
    public void handleServiceRemove(ServiceRemovedEvent event) {
        System.out.println(event);
    }

    @POST
    @Timed
    @Path("/serviceStateChanged")
    public void handleServiceStateChanged(ServiceStateChangedEvent event) {
        System.out.println(event);
    }

    @POST
    @Timed
    @Path("/nodeAdded")
    public void handleNodeAdded(NodeAddedEvent event) {
        System.out.println(event);
    }

    @POST
    @Timed
    @Path("/nodeHealthChanged")
    public void handleNodeHealthChanged(NodeHealthChangedEvent event) {
        System.out.println(event);
    }

    @POST
    @Timed
    @Path("/nodeRemoved")
    public void handleNodeRemoved(NodeRemovedEvent event) {
        System.out.println(event);
    }

}
