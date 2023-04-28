/**
 * 
 */
package ar.edu.utn.argentinaprograma.tpJavaIntegrador.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Diaz, Sebastián Darío
 * Equipo. Clase que representa a un Equipo de Fútbol.
 */
@Entity
@Table(name = "Equipos")
public class Equipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEquipo;
	
	@Column(name = "nombre_equipo")
	private String nombreEquipo;
	
	@Column(name = "titulares")
	private Integer titularesEquipo;
	
	@Column(name = "suplentes")
	private Integer suplentesEquipo;
	
	@Column(name = "dt_equipo")
	private String directorTecnicoEquipo;
	
	@Column(name = "puntos")
	private Integer puntosEquipo;
	
	@Column(name = "partidos_jugados")
	private Integer partidoJugadosEquipo;
	
	public Equipo() {
		// TODO Auto-generated constructor stub
	}

	public Equipo(String nombreEquipo, Integer titularesEquipo, Integer suplentesEquipo, String directorTecnicoEquipo,
			Integer puntosEquipo, Integer partidoJugadosEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.titularesEquipo = titularesEquipo;
		this.suplentesEquipo = suplentesEquipo;
		this.directorTecnicoEquipo = directorTecnicoEquipo;
		this.puntosEquipo = puntosEquipo;
		this.partidoJugadosEquipo = partidoJugadosEquipo;
	}

	public Long getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(Long idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Integer getTitularesEquipo() {
		return titularesEquipo;
	}

	public void setTitularesEquipo(Integer titularesEquipo) {
		this.titularesEquipo = titularesEquipo;
	}

	public Integer getSuplentesEquipo() {
		return suplentesEquipo;
	}

	public void setSuplentesEquipo(Integer suplentesEquipo) {
		this.suplentesEquipo = suplentesEquipo;
	}

	public String getDirectorTecnicoEquipo() {
		return directorTecnicoEquipo;
	}

	public void setDirectorTecnicoEquipo(String directorTecnicoEquipo) {
		this.directorTecnicoEquipo = directorTecnicoEquipo;
	}

	public Integer getPuntosEquipo() {
		return puntosEquipo;
	}

	public void setPuntosEquipo(Integer puntosEquipo) {
		this.puntosEquipo = puntosEquipo;
	}

	public Integer getPartidoJugadosEquipo() {
		return partidoJugadosEquipo;
	}

	public void setPartidoJugadosEquipo(Integer partidoJugadosEquipo) {
		this.partidoJugadosEquipo = partidoJugadosEquipo;
	}

	@Override
	public String toString() {
		return "EQUIPO = ID: " + idEquipo + " - NOMBRE: " + nombreEquipo + " - TITULARES: "
				+ titularesEquipo + " - SUPLENTES: " + suplentesEquipo + " - D.T.: "
				+ directorTecnicoEquipo + " - PUNTOS: " + puntosEquipo + " - PARTIDOS JUGADOS: "
				+ partidoJugadosEquipo + ".";
	}
	
	
}
