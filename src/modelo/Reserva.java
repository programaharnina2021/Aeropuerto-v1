package modelo;

import java.util.Objects;

public class Reserva {
	private Long idReserva;
	private Cliente cliente;
	private Vuelo vuelo;
	
	public Reserva(Long idReserva, Cliente cliente, Vuelo vuelo) {
		super();
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.vuelo = vuelo;
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idReserva);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(idReserva, other.idReserva);
	}
	
	
}
