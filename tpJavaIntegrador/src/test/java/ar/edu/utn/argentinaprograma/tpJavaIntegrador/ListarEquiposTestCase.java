/**
 * 
 */
package ar.edu.utn.argentinaprograma.tpJavaIntegrador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ar.edu.utn.argentinaprograma.tpJavaIntegrador.entity.Equipo;
import ar.edu.utn.argentinaprograma.tpJavaIntegrador.service.EquipoService;

/**
 * @author Diaz, Sebastián Darío
 *
 */
@SpringBootTest
class ListarEquiposTestCase {

	@Autowired
	private EquipoService equipoService;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testListarEquipos() {
		try {
			assertNotNull(equipoService.listarEquipos());
			for(Equipo e:equipoService.listarEquipos()) {
				System.out.println(e.toString());
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
