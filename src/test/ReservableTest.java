package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import control.Reservable;
import modelo.Cliente;
import modelo.Reserva;
import modelo.Vuelo;

class ReservableTest {

	@Test
	void testReservarVuelo() {
		Reservable reservable = null;
		Cliente cliente = null;
		Vuelo vuelo = null;
		Reserva reservarVuelo = reservable.reservarVuelo(cliente, vuelo);
		assertNotNull(reservarVuelo);
	}

}
