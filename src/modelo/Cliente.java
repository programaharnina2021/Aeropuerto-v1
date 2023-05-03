package modelo;

import java.util.Objects;

public class Cliente {

	private String DNI;
	private String dp;

	public Cliente() {
		super();
	}

	public Cliente(String dNI, String dp) {
		super();
		DNI = dNI;
		this.dp = dp;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getDp() {
		return dp;
	}

	public void setDp(String dp) {
		this.dp = dp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DNI, dp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(DNI, other.DNI);
	}

}
