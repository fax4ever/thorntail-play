package it.redhat.demo.jaxrs;

import static io.restassured.RestAssured.when;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.thorntail.test.ThorntailTestRunner;

@RunWith(ThorntailTestRunner.class)
public class CiaoAppTest {

	@Inject
	private CiaoService service;

	@Test
	public void testService() {
		assertThat( service.ciao() ).isEqualTo( "Ciao" );
	}

	@Test
	public void testResource() {
		when().get( "/rest/ciao" ).then()
				.statusCode( 200 )
				.body( containsString( "Ciao" ) );
	}

}
