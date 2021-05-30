package resources;

import resources.pojos.Owner;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/{userName}/owner/{person_Id}")
public class OwnersResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("userName") String userName, @PathParam("person_Id") Integer person_Id, Owner owner) {

        return Response.ok()
                .entity(owner)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("userName") String userName, @PathParam("person_Id") Integer person_Id) {

        return Response.noContent()
                .build();
    }

}
