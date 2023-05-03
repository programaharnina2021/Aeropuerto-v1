package modelo;

import java.util.Objects;

public class Trayecto {

	private Long id;
	private String origen,destino,diaHora;
	
	public Trayecto() {
		super();
	}
	public Trayecto(Long id, String origen, String destino, String diaHora) {
		super();
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.diaHora = diaHora;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDiaHora() {
		return diaHora;
	}
	public void setDiaHora(String diaHora) {
		this.diaHora = diaHora;
	}
	@Override
	public int hashCode() {
		return Objects.hash(destino, diaHora, origen);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trayecto other = (Trayecto) obj;
		return Objects.equals(destino, other.destino) && Objects.equals(diaHora, other.diaHora)
				&& Objects.equals(origen, other.origen);
	}
	
	 
}
