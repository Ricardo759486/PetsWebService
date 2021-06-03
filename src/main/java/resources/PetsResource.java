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
    public Response list(@QueryParam("pet_Id") Integer pet_Id, @QueryParam("microchip") String microchip,
                         @QueryParam("name") String name, @QueryParam("species") String species, @QueryParam("race") String race, @QueryParam("size") String size,
                         @QueryParam("sex") String sex) {

        List<Owner> owners = new ArrayList<Owner>();

        Owner  owner = new Owner("yesveryguell", 1, "Felipe Rojas", "Calle 74a # 65b - 61", "San Felipe");
        Owner  owner2 = new Owner("yesveryguell", 2, "Paula Buitrago", "Calle 47a # 104b - 23", "San Pedro");
        Owner  owner3 = new Owner("yesveryguell", 3, "Ricardo Cuevas", "Carrera 6 N° 17 - 90", "San Felipe");


        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet(4, "10as1d1a0d", "Iván Duque", "títere", "No se sabe", "pequeño", "no se sabe", "foto", 1, owner));
        pets.add(new Pet(2, "Robinson Pirse", "Perro", "Dalmata", "Mediano", "Hembra", "foto2", 3, owner3));
        pets.add(new Pet(3, "10as1d1a0s", "Iván Duque", "títere", "No se sabe", "pequeño", "no se sabe", "foto", 2, owner2));
        pets.add(new Pet(1, "Robinson Pirse", "Perro", "Dalmata", "Mediano", "Hembra", "foto2", "foto",1, owner));



        List<Pet> pets2 = new ArrayList<Pet>();

        for (int i = 0; i < pets.size(); i++) {

            boolean verificar = true;

            if (pet_Id != null) {
                if (!pets.get(i).getPet_Id().equals(pet_Id)) {
                    verificar = false;
                }
            }

            if (microchip != null && verificar) {
                if (pets.get(i).getMicrochip() == null || !pets.get(i).getMicrochip().equals(microchip)) {
                    verificar = false;
                }
            }

            if (name != null && verificar) {
                if (!pets.get(i).getName().equals(name)) {
                    verificar = false;
                }
            }

            if (species != null && verificar) {
                if (!pets.get(i).getSpecies().equals(species)) {
                    verificar = false;
                }
            }

            if (race != null && verificar) {
                if (!pets.get(i).getRace().equals(race)) {
                    verificar = false;
                }
            }

            if (size != null && verificar) {
                if (!pets.get(i).getSize().equals(size)) {
                    verificar = false;
                }
            }

            if (sex != null && verificar) {
                if (!pets.get(i).getSex().equals(sex)) {
                    verificar = false;
                }
            }

            if (verificar) {
                pets2.add(pets.get(i));
            }
        }

        return Response.ok()
                .entity(pets2)
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
