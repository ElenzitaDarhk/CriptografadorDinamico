package org.ecp.resource;

import java.util.List;

import org.ecp.model.Configuration;
import org.ecp.dto.ConfigurationDto;

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
	
	@GET
	@Path("GetByAppClientId")
	public Response getByAppClientId(@QueryParam("appClientId") Long appClientId)
	{
		Configuration config = Configuration.findByAppClientIdEnable(appClientId, true);
		
		if(config == null)
			return Response.noContent().build();
		else
		{
			ConfigurationDto dto = new ConfigurationDto();
			dto.setAlgorithmName(config.algorithm.name);
			dto.setKeyword(config.keyWord);
			
			return Response.ok(dto).build();
		}
	}
	
}
