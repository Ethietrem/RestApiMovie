package pl.wsb.student.api.consts;

import pl.wsb.student.api.model.RegisterUserRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(ApiEndpoints.USER)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class UserResource {

    @POST
    public Response postUser(RegisterUserRequest body) {
        return Response.status(Response.Status.OK).entity("mock call ok...").build();
    }
}
