package resources;

import resources.pojos.User;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;

@Path("/users")
public class UserResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(User user) {
        user.setUserName(user.getUserName());
        return Response.status(Response.Status.CREATED)
                .entity(user)
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        List<User> users = new ArrayList<User>();
        User user = new User();
        System.out.println(user.toString());
        return Response.ok()
                .entity(users)
                .build();
    }
}