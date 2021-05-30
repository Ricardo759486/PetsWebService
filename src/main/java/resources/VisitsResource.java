package resources;

import resources.pojos.Pet;
import resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/{userName}/vet/{vet_Id}/pet/{pet_Id}/visit")
public class VisitsResource {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("userName") String userName, @PathParam("vet_Id") Integer vet_Id, @PathParam("pet_Id") Integer pet_Id, Visit visits) {
        visits.setVet_Id(vet_Id);
        visits.setPet_Id(pet_Id);
        return Response.status(Response.Status.CREATED)
                .entity(visits)
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("vet_Id") Integer vet_Id, @PathParam("pet_Id") Integer pet_Id) {
        List<Visit> visits = new ArrayList<Visit>();
        visits.add(new Visit(5, "home", "felino", "good healthy", vet_Id, pet_Id));
        return Response.ok()
                .entity(visits)
                .build();
    }
}
