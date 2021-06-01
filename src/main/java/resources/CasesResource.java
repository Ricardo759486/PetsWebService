package resources;

import resources.pojos.Case;
import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/users/owner/pet/{pets_Id}/case")
public class CasesResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("pets_Id") Integer pets_Id) {
        List<Case> cases = new ArrayList<Case>();
        cases.add(new Case(4, "dog", "visit", "lindi", pets_Id));
        return Response.ok()
                .entity(cases)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("pets_Id") Integer pets_Id, Case caso) {
        caso.setPet_Id(pets_Id);
        caso.setCase_Id(4);
        return Response.status(Response.Status.CREATED)
                .entity(caso)
                .build();
    }


}
