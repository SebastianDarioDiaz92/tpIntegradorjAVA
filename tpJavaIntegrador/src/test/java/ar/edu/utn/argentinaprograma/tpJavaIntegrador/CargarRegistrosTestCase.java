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
class CargarRegistrosTestCase {

	@Autowired
	private EquipoService equipoService;
	Equipo equipo1;
	Equipo equipo2;
	Equipo equipo3;
	Equipo equipo4;
	Equipo equipo5;
	Equipo equipo6;
	Equipo equipo7;
	Equipo equipo8;
	Equipo equipo9;
	Equipo equipo10;
	private Integer cantidadEquipos=0;
	@BeforeEach
	void setUp() throws Exception {
		equipo1 = new Equipo("RIVER PLATE", 11, 22, "MARECELO GALLARDO", 33, 13);
		equipo2 = new Equipo("BELGRANO", 11, 12, "GUILLERMO FARRÉ", 27, 13);
		equipo3 = new Equipo("BOCA JUNIORS", 11, 12, "JORGE ALMIRÓN", 24, 13);
		equipo4 = new Equipo("RACING CLUB", 11, 12, "FERNANDO GAGO", 24, 13);
		equipo5 = new Equipo("DEFENSA Y JUSTICIA", 11, 12, "JULIO VACCARI", 24, 14);
		equipo6 = new Equipo("ESTUDIANTES", 11, 12, "EDUARDO DOMÍNGUEZ", 23, 13);
		equipo7 = new Equipo("TIGRE", 11, 12, "DIEGO MARTÍNEZ", 22, 13);
		equipo8 = new Equipo("AREGNTINOS JUNIORS", 11, 12, "GABRIEL MILITO", 21, 13);
		equipo9 = new Equipo("SAN LORENZO", 11, 12, "RUBÉN DARÍO INSÚA", 21, 14);
		equipo10 = new Equipo("TALLERES", 11, 12, "JAVIER GANDOLFI", 19, 13);
		equipoService.agregarEquipo(equipo1);
		equipoService.agregarEquipo(equipo2);
		equipoService.agregarEquipo(equipo3);
		equipoService.agregarEquipo(equipo4);
		equipoService.agregarEquipo(equipo5);
		equipoService.agregarEquipo(equipo6);
		equipoService.agregarEquipo(equipo7);
		equipoService.agregarEquipo(equipo8);
		equipoService.agregarEquipo(equipo9);
		equipoService.agregarEquipo(equipo10);
		
		cantidadEquipos = equipoService.listarEquipos().size();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCargarRegistros() {
		assertTrue(cantidadEquipos.equals(10));
	}

}
