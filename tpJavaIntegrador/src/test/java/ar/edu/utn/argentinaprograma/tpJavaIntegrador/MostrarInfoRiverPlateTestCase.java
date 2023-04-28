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
class MostrarInfoRiverPlateTestCase {

	@Autowired
	private EquipoService equipoService;
	Equipo buscado;
	String riverPlate;
	
	@BeforeEach
	void setUp() throws Exception {
		riverPlate = "RIVER PLATE";
		buscado = equipoService.buscarEquipoPorNombre(riverPlate);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMostrarInfoRiverPlate() {
		assertTrue(buscado.getNombreEquipo().equals(riverPlate));
		System.out.println(buscado.toString());
	}

}
