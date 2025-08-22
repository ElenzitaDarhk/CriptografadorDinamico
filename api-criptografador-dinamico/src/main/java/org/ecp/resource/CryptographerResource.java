package org.ecp.resource;


import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.jwt.Claim;
import org.eclipse.microprofile.jwt.Claims;

@Path("cypto")
@RequestScoped
public class CryptographerResource {
	
    @Claim(standard = Claims.preferred_username)
    private String username;
   
	
    @GET
    @Path("hello")
    public String getHello() {
        String output = "Hello " + username + "!/n";
        return output;
    }
}