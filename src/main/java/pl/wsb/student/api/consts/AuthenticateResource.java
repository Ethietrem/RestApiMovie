package pl.wsb.student.api.consts;

import pl.wsb.student.api.model.AuthenticationRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(ApiEndpoints.AUTHENTICATE)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class AuthenticateResource {

    @POST
    public Response postAuthenticate(AuthenticationRequest body) {
        return Response.status(Response.Status.OK).entity("mock call ok...").build();
    }
}

