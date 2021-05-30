package resources;

import resources.pojos.Case;
import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/{userName}/owner/{owner_Id}/pet/{pet_Id}/case/{case_Id}")
public class CaseResource {
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("userName") String userName, @PathParam("owner_Id") Integer owner_Id, @PathParam("pet_Id") Integer pet_Id, @PathParam("case_Id") Integer case_Id,
                           Case caso) {

        return Response.ok()
                .entity(caso)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("pet_Id") Integer pet_Id, @PathParam("case_Id") Integer case_Id) {

        return Response.noContent()
                .build();
    }
}
