package objectmother;

import java.util.LinkedList;
import java.util.List;

import modelo.Cliente;

public class ClienteOM {
	public Cliente getRandom() {
		return null;
	}
	
	public List<Cliente> get(){
		LinkedList<Cliente> clientes = new LinkedList<>();
		String[] dnis = { "1", "2", "3" };
		String[] dps = { "pepe", "juan", "alfonso" };
		for (int i = 0; i < dps.length; i++) {
			clientes.add(new Cliente(dnis[i], dps[i]));
		}
		return clientes;
	}
}
