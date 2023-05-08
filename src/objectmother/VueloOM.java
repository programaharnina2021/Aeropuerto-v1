package objectmother;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import modelo.Trayecto;
import modelo.Vuelo;

public class VueloOM {
	public List<Vuelo> populateVuelos() {
		List<Trayecto> trayectos = new TrayectoOM().populateTrayectos();
		LocalDate[] dates = { LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 2), LocalDate.of(2023, 1, 3) };
		int asientos = 2;
		LinkedList<Vuelo> vuelos = new LinkedList<>();
		for (int i = 0; i < trayectos.size(); i++) {
			for (int j = 0; j < dates.length; j++) {
				vuelos.add(new Vuelo((long) (i * 10 + j), trayectos.get(i), dates[j], asientos));
			}
		}
		return vuelos;
	}
}
