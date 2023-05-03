package modelo;

import java.util.Objects;

public class Billete {
	private Reserva reserva;
	private Asiento asiento;
	
	public Billete(Reserva reserva, Asiento asiento) {
		super();
		this.reserva = reserva;
		this.asiento = asiento;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Asiento getAsiento() {
		return asiento;
	}

	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asiento, reserva);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Billete other = (Billete) obj;
		return Objects.equals(asiento, other.asiento) && Objects.equals(reserva, other.reserva);
	}
	
	
}
