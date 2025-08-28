package org.ecp.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("Cryptographer")
public class CryptographerResource {
	
    @GET
    public String get() {
        String output = "Hello ";
        return output;
    }
}