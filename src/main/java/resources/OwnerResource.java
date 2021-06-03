package resources;

import com.sun.org.apache.xpath.internal.operations.Bool;
import resources.pojos.Owner;
import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;

@Path("/users/{userName}/owner")
public class OwnerResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("userName") String userName, @QueryParam("person_Id") Integer person_Id, @QueryParam("name") String name,
                         @QueryParam("neighborhood") String neighborhood) {

        List<Pet> pets = new ArrayList<Pet>();
        List<Pet> pets2 = new ArrayList<Pet>();
        List<Pet> pets3 = new ArrayList<Pet>();

        pets.add(new Pet(1, "10as1d1a0d", "Iván Duque", "títere", "No se sabe", "pequeño", "no se sabe", "foto", 1));
        pets.add(new Pet(2, "Robinson Pirse", "Perro", "Dalmata", "Mediano", "Hembra", "foto2", 1));

        pets2.add(new Pet(3, "10as1d1a0d", "Iván Duque", "títere", "No se sabe", "pequeño", "no se sabe", "foto", 2));
        pets2.add(new Pet(4, "Robinson Pirse", "Perro", "Dalmata", "Mediano", "Hembra", "foto2", 2));

        pets3.add(new Pet(5, "10as1d1a0d", "Iván Duque", "títere", "No se sabe", "pequeño", "no se sabe", "foto", 3));
        pets3.add(new Pet(6, "Robinson Pirse", "Perro", "Dalmata", "Mediano", "Hembra", "foto2", 3));

        List<Owner> owners = new ArrayList<Owner>();
        owners.add(new Owner(userName, 1, "Felipe Rojas", "Calle 74a # 65b - 61", "San Felipe", pets));
        owners.add(new Owner(userName, 2, "Paula Buitrago", "Calle 47a # 104b - 23", "San Pedro", pets2));
        owners.add(new Owner(userName, 3, "Ricardo Cuevas", "Carrera 6 N° 17 - 90", "San Felipe", pets3));



        List<Owner> owners2 = new ArrayList<Owner>();

        for (int i = 0; i < owners.size(); i++) {

            boolean verificar = true;

            if (person_Id != null) {
                if (!owners.get(i).getPerson_Id().equals(person_Id)) {
                    verificar = false;
                }
            }

            if (name != null && verificar) {
                if (!owners.get(i).getName().equals(name)) {
                    verificar = false;
                }
            }

            if (neighborhood != null && verificar) {
                if (!owners.get(i).getNeighborhood().equals(neighborhood)) {
                    verificar = false;
                }
            }

            if (verificar) {
                owners2.add(owners.get(i));
            }
        }

        return Response.ok()
                .entity(owners2)
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total(@PathParam("userName") String userName) {

        List<Owner> owners = new ArrayList<Owner>();
        owners.add(new Owner(userName, 1, "Felipe Rojas", "Calle 74a # 65b - 61", "San Felipe"));
        owners.add(new Owner(userName, 2, "Paula Buitrago", "Calle 47a # 104b - 23", "San Pedro"));
        owners.add(new Owner(userName, 3, "Ricardo Cuevas", "Carrera 6 N° 17 - 90", "San Felipe"));


        List<Owner> owners2 = new ArrayList<Owner>();

        int sanFelipe = 0;
        int sanPedro = 0;

        for (int i = 0; i < owners.size(); i++) {

            boolean verificar = true;

            if (owners.get(i).getNeighborhood().equals("San Felipe")) {

                sanFelipe++;
            }else if (owners.get(i).getNeighborhood().equals("San Pedro")) {
                sanPedro++;
            }
        }

        return Response.ok()
                .entity("ddddddddddddddd" + owners2 + "dddddddddddddddddddddddddddddddddddddddddddd")
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
