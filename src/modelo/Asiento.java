package modelo;

import java.util.Objects;

public class Asiento {
	private int numero;
	private boolean ocupado;
	
	public Asiento(int numero) {
		super();
		this.numero = numero;
		this.ocupado = false;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asiento other = (Asiento) obj;
		return numero == other.numero;
	}
	
	
}
