/**
 * 
 */
package ar.edu.utn.argentinaprograma.tpJavaIntegrador.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.utn.argentinaprograma.tpJavaIntegrador.entity.Equipo;
import ar.edu.utn.argentinaprograma.tpJavaIntegrador.repository.EquipoRepository;
import ar.edu.utn.argentinaprograma.tpJavaIntegrador.service.EquipoService;

/**
 * @author Diaz, Sebastián Darío
 *
 */
@Service
public class EquipoServiceImp implements EquipoService{

	@Autowired
	private EquipoRepository equipoRepository;
	
	@Override
	public void agregarEquipo(Equipo equipo) {
		try {
			if(equipoRepository.findByNombreEquipo(equipo.getNombreEquipo()) != null) {
				System.out.println("El equipo que intenta agregar, ya se encuentra registrado." + equipo.getNombreEquipo());
			}else {
				equipoRepository.save(equipo);
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	@Override
	public void eliminarEquipo(Equipo equipo) {
		try {
			if(equipoRepository.findByNombreEquipo(equipo.getNombreEquipo()) != null) {
				equipoRepository.delete(equipo);
			}else {
				System.out.println("El equipo que intenta eliminar, no se encuentra registrado." + equipo.getNombreEquipo());
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	@Override
	public Equipo buscarEquipo(Equipo equipo) {
		return equipoRepository.findByNombreEquipo(equipo.getNombreEquipo());
	}

	@Override
	public List<Equipo> listarEquipos() {
		return equipoRepository.findAll();
	}

	@Override
	public Equipo buscarEquipoPorNombre(String nombreEquipo) {
		return equipoRepository.findByNombreEquipo(nombreEquipo);
	}

}
