package resources;

import resources.pojos.Owner;
import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/owner/{owner_Id}/pet/{pet_Id}")
public class PetResource {
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("owner_Id") Integer owner_Id, @PathParam("pet_Id") Integer pet_Id,Pet pets) {

        pets.setOwner_Id(owner_Id);
        pets.setPet_Id(pet_Id);

        return Response.ok()
                .entity(pets)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("owner_Id") Integer owner_Id, @PathParam("pet_Id") Integer pet_Id) {

        return Response.noContent()
                .build();
    }
}
