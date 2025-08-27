package org.ecp.resource;

import java.util.List;

import org.ecp.model.Configuration;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("Configuration")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ConfigurationResource {

	@GET
	public Response get()
	{
		return Response.ok(Configuration.listAll()).build();
	}
	
	//TODO:
	@GET
	@Path("GetByAppClientId")
	public Response getByAppClientId(@QueryParam("appClientId") Long appClientId)
	{
		Configuration config = Configuration.findEnable(appClientId);
		
		if(config == null)
			return Response.noContent().build();
		else
			return Response.ok(config).build();
	}
	
}
