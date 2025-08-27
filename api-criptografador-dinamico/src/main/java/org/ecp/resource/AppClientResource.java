package org.ecp.resource;

import org.ecp.model.AppClient;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("AppClient")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AppClientResource {

	@GET
	public Response get()
	{
		return Response.ok(AppClient.listAll()).build();
	}
	
	@POST
	@Transactional
	public Response post(AppClient appClient)
	{
		appClient.id = null;
		appClient.persist();
		return Response.ok(appClient).build();
	}
	
	@PUT
	@Transactional
	public Response put(AppClient appClient)
	{
		AppClient app = AppClient.findById(appClient.id);
		app.name = appClient.name;
		app.persist();
		return Response.ok(app).build();
	}
	
	@DELETE
	@Transactional
	public Response put(Long id)
	{
		return Response.ok(AppClient.deleteById(id)).build();
	}
}
