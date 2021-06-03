package resources;

import resources.pojos.Pet;
import resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/pet/{pet_Id}/visit/total")
public class VisitTotalResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("pet_Id") Integer pet_Id) {
        List<Visit> visits = new ArrayList<Visit>();
        visits.add(new Visit(5, "home", "felino", "good healthy", 2, pet_Id));
        visits.add(new Visit(6, "home2", "canino", "death virus", 3, pet_Id));
        visits.add(new Visit(7, "home3", "canino", "without balls and ovaries", 3, pet_Id));
        visits.add(new Visit(8, "home4", "felino", "good healthy", 2, pet_Id));

        int canino = 0;
        int felino = 0;

        int dos = 0;
        int tres = 0;

        for (int i = 0; i < visits.size(); i++) {

            if (visits.get(i).getType().equals("canino")) {
                canino++;
            } else if (visits.get(i).getType().equals("felino")) {
                felino++;
            }


            if(visits.get(i).getVet_Id().equals(2)){
                dos++;
            }else if(visits.get(i).getVet_Id().equals(3)){
                tres++;
            }
        }

        return Response.ok()
                .entity("El total visitas de tipo canino son: " + canino + "\nEl total de visitas de tipo felino son: " + felino + "\nEl total de visitas a la veterinaria con Id=2 son: " + dos + "\nEl total de visitas a la veterinaria con Id=3 son: " + tres)
                .build();
    }

}
