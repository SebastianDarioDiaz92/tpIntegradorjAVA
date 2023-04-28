/**
 * 
 */
package ar.edu.utn.argentinaprograma.tpJavaIntegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.utn.argentinaprograma.tpJavaIntegrador.entity.Equipo;

/**
 * @author Diaz, Sebastián Darío
 *
 */
@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long>{
	Equipo findByIdEquipo(Long idEquipo);
	Equipo findByNombreEquipo(String nombreEquipo);
}
