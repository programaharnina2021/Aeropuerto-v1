package control;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import modelo.Cliente;
import modelo.Reserva;
import modelo.Vuelo;
import objectmother.ClienteOM;
import objectmother.VueloOM;

class ReservableTest {

	Reservable reservable;
	
	
	public ReservableTest(Reservable reservable) {
		super();
		this.reservable = reservable;
	}


	void testReservarVuelo() {
		List<Cliente> clientes = new ClienteOM().get();
		List<Vuelo> vuelos = new VueloOM().populateVuelos();
		Vuelo vuelo = vuelos.get(0);
		Cliente cliente = clientes.get(0);
		vuelo.getCantidadAsientos();
		Reserva reserva = reservable.reservarVuelo(cliente, vuelo);
		assertNotNull(reserva);
		reserva = reservable.reservarVuelo(cliente, vuelo);
		assertNotNull(reserva);
		reserva = reservable.reservarVuelo(cliente, vuelo);
		assertNull(reserva);
	}

}
