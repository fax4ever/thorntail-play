package it.redhat.demo.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ciao")
public class CiaoResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String ciao() {
		return "Ciao";
	}

}
