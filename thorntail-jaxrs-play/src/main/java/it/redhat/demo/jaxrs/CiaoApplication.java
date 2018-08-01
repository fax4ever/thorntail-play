package it.redhat.demo.jaxrs;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.thorntail.Main;

@ApplicationPath("/rest")
public class CiaoApplication extends Application {
	public static void main(String... args) throws Exception {
		Main.main(args);
	}
}
