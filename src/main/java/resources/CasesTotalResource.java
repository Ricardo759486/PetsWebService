package resources;

import resources.pojos.Case;
import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/users/owner/pet/{pets_Id}/case/total")
public class CasesTotalResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("pets_Id") Integer pets_Id) {
        List<Case> cases = new ArrayList<Case>();
        cases.add(new Case(1, "dog", "visit", "Pqueño", pets_Id));
        cases.add(new Case(2, "cat", "control", "Enfermo", pets_Id));
        cases.add(new Case(3, "cat", "Vacuna", "Pata pequeña", pets_Id));
        cases.add(new Case(4, "dog", "Vacuna", "Oreja mordida", pets_Id));
        cases.add(new Case(5, "dog", "visit", "Grande", pets_Id));

        int visit = 0;
        int control = 0;
        int vacuna= 0;

        for (int i = 0; i < cases.size(); i++) {

            if (cases.get(i).getType().equals("visit")) {

                visit++;
            } else if (cases.get(i).getType().equals("control")) {
                control++;
            }else if(cases.get(i).getType().equals("vacuna")){
                vacuna++;
            }
        }

        return Response.ok()
                .entity("El total de casos son: " + cases.size() + "\nhay " + visit + " casos de visita" +  "\nhay " + control + " casos de control" +  "\nhay " + vacuna + " casos de vacuna")
                .build();
    }

}