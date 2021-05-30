package resources;

import resources.pojos.Owner;
import resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/{userName}/vet/{vet_Id}")
public class VetResource {
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("userName") String userName, @PathParam("vet_Id") Integer vet_Id, Vet vet) {

        return Response.ok()
                .entity(vet)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("userName") String userName, @PathParam("vet_Id") Integer vet_Id) {

        return Response.noContent()
                .build();
    }
}
