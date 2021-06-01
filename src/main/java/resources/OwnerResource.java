package resources;

import resources.pojos.Owner;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;

@Path("/users/{userName}/owner")
public class OwnerResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("userName") String userName) {
        List<Owner> owners = new ArrayList<Owner>();
        owners.add(new Owner (userName, 1, "Felipe Rojas", "Calle 74a # 65b - 61", "San Felipe"));
        owners.add(new Owner (userName, 2, "Paula Buitrago", "Calle 47a # 104b - 23", "San Pedro"));
        owners.add(new Owner (userName, 3, "Ricardo Cuevas", "Carrera 6 N° 17 - 90", "Nuevo Mexico"));
        return Response.ok()
                .entity(owners)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("userName") String userName, Owner owner) {
        owner.setUser(userName);
        owner.setPerson_Id(1);
        return Response.status(Response.Status.CREATED)
                .entity(owner)
                .build();
    }

}
