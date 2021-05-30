package resources;

import resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;

@Path("/{userName}/vet")
public class VetsResource {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("userName") String userName, Vet vets) {
        vets.setVet_Id(2);
        return Response.status(Response.Status.CREATED)
                .entity(vets)
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("userName") String userName) {
        List<Vet> vets = new ArrayList<Vet>();
        vets.add(new Vet (userName, 2, "Antonio Banderas", "Calle 106 # 40bis - 50", "Ricachón"));
        return Response.ok()
                .entity(vets)
                .build();
    }
}
