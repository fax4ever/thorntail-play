package it.redhat.demo.jaxrs;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ciao")
public class CiaoResource {

	@Inject
	private CiaoService service;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String ciao() {
		return service.ciao();
	}

}
