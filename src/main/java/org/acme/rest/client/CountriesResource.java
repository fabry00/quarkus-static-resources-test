package org.acme.rest.client;

import java.util.Set;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.smallrye.mutiny.Uni;

@Path("/country")
public class CountriesResource {

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<String> test() {
        return Uni.createFrom().item("test");
    }
}
