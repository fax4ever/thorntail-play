package it.redhat.demo.jaxrs;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CiaoService {

	public String ciao() {
		return "Ciao";
	}

}
