package org.ecp.resource;

import org.ecp.model.Algorithm;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("Algorithm")
public class AlgorithmResource {

	@GET
	public Response get()
	{
		return Response.ok(Algorithm.listAll()).build();
	}
}
