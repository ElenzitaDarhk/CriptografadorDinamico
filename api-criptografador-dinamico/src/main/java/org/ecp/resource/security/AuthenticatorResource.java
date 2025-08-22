package org.ecp.resource.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.eclipse.microprofile.jwt.Claims;

import io.smallrye.jwt.build.Jwt;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/auth")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class AuthenticatorResource {
	
    @GET
    public Response get(@QueryParam("client") String client) {
    	
    	ArrayList arrListClient = new ArrayList();
    	arrListClient.addLast("ApiUsuario");
    	arrListClient.addLast("ApiMensagens");
    	arrListClient.addLast("ApiGateway");
    	
    	if(arrListClient.contains(client))
    	{
	    	String token = Jwt.issuer(client)
	    							.upn("jdoe@quarkus.io")
	    							.groups(new HashSet<>(Arrays.asList("User", "Admin")))
	    							.claim(Claims.birthdate.name(), "2025-08-22")
	    							.sign();
	    	
	    	return Response.ok(token).build();
    	}
    	
    	return Response.status(Status.FORBIDDEN).build();
    }
}
