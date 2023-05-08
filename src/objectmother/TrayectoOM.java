package objectmother;

import java.util.LinkedList;
import java.util.List;

import modelo.Trayecto;

public class TrayectoOM {
	public List<Trayecto> populateTrayectos(){
		LinkedList<Trayecto> lista=new LinkedList();
		String[] origen= {"Toledo","Ibiza","Madrid","Barcelona","Cuenca"};
		String[] destino= {"Berlin","Londres","Roma","Paris","Dublin"};
		String[] dia= {"Martes","Lunes","Jueves","Lunes","Sabado"};
		String[] hora= {"12:00","07:00","13:30","09:15","11:00"};
		for (int i = 0; i < hora.length; i++) {
			lista.add(new Trayecto((long)i, origen[i], destino[i], dia[i]+" "+hora[i]));
		}
		return lista;
	}
}
