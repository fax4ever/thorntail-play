package it.redhat.demo.data;

import static org.assertj.core.api.Assertions.assertThat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.thorntail.test.ThorntailTestRunner;

@RunWith(ThorntailTestRunner.class)
public class DataAppTest {

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
