package control;

import modelo.Cliente;
import modelo.Reserva;
import modelo.Vuelo;

public interface Reservable {
	public Reserva reservarVuelo(Cliente cliente,Vuelo vuelo);
	
}
