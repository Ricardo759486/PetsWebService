package resources;

import resources.pojos.Owner;
import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;

@Path("/users/owner/{owner_Id}/pet")
public class PetsResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("owner_Id") Integer owner_Id) {
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet(3, "10as1d1a0d", "Iván Duque", "títere", "No se sabe", "pequeño", "no se sabe", "foto", owner_Id));
        pets.add(new Pet(2,  "Robinson Pirse", "Perro", "Dalmata", "Mediano", "Hembra", "foto2", owner_Id));
        return Response.ok()
                .entity(pets)
                .build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("owner_Id") Integer owner_Id, Pet pets) {
        pets.setOwner_Id(owner_Id);
        pets.setPet_Id(3);
        return Response.status(Response.Status.CREATED)
                .entity(pets)
                .build();
    }


}
