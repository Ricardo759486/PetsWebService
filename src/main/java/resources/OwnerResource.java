package resources;

import resources.pojos.Owner;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;

@Path("/{userName}/owner")
public class OwnerResource {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("userName") String userName, Owner owner) {
        owner.setPerson_Id(1);
        return Response.status(Response.Status.CREATED)
                .entity(owner)
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("userName") String userName) {
        List<Owner> owners = new ArrayList<Owner>();
        owners.add(new Owner (userName, 1, "Felipe Rojas", "Calle 74a # 65b - 61", "San Fernando"));
        return Response.ok()
                .entity(owners)
                .build();
    }
}
