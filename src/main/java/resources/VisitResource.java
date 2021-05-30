package resources;

import resources.pojos.Pet;
import resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/{userName}/vet/{vet_Id}/pet/{pet_Id}/visit/{visit_Id}")
public class VisitResource {
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("userName") String userName, @PathParam("vet_Id") Integer vet_Id, @PathParam("pet_Id") Integer pet_Id, @PathParam("visit_Id") Integer visit_Id, Visit visits) {

        return Response.ok()
                .entity(visits)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("vet_Id") Integer vet_Id, @PathParam("pet_Id") Integer pet_Id, @PathParam("visit_Id") Integer visit_Id) {

        return Response.noContent()
                .build();
    }
}
