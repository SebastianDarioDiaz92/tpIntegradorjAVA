/**
 * 
 */
package ar.edu.utn.argentinaprograma.tpJavaIntegrador.service;

import java.util.List;

import ar.edu.utn.argentinaprograma.tpJavaIntegrador.entity.Equipo;

/**
 * @author Diaz, Sebastián Darío
 *
 */
public interface EquipoService {

	public void agregarEquipo(Equipo equipo);
	public void eliminarEquipo(Equipo equipo);
	public Equipo buscarEquipo(Equipo equipo);
	public Equipo buscarEquipoPorNombre(String nombreEquipo);
	public List<Equipo> listarEquipos();
}
