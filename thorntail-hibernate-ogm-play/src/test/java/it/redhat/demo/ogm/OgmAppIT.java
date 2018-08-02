package it.redhat.demo.ogm;

import static org.assertj.core.api.Assertions.assertThat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.thorntail.test.ThorntailTestRunner;

/**
 * Integration test using Hibernate OGM application within Thorntail framework.
 *
 * This test requires a remote Infinispan server
 * Port and host are defined in hotrodclient.properties
 */
@RunWith(ThorntailTestRunner.class)
public class OgmAppIT {

	@Inject
	private EmployeeRepo repo;

	@Test
	public void testJpa() {
		assertThat( repo ).isNotNull();
		repo.add( 1, "Fabio" );

		Employee employee = repo.load( 1 );
		assertThat( employee.getName() ).isEqualTo( "Fabio" );
	}

}
