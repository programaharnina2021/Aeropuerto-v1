package modelo;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Vuelo {

	private Long idEspecifico;
	private Trayecto trayecto;
	private LocalDateTime fechaSalida;
	private LinkedList<Asiento> asientos;
	
	public Vuelo(Long idEspecifico, Trayecto trayecto, LocalDateTime fechaSalida,int cantidadAsientos) {
		super();
		this.idEspecifico = idEspecifico;
		this.trayecto = trayecto;
		this.fechaSalida = fechaSalida;
		createAsientos(cantidadAsientos);
	}
	
	private void createAsientos(int cantidadAsientos) {
		asientos=new LinkedList<>();
		for (int i = 0; i < cantidadAsientos; i++) {
			asientos.add(new Asiento(i));
		}
	}
	public boolean isTotalmenteReservado(int reservas) {
		return asientos.size()>reservas;
	}
	
	
}
