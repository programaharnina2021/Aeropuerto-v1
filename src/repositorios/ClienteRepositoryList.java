package repositorios;

import java.util.List;

import modelo.Cliente;
import objectmother.ClienteOM;

public class ClienteRepositoryList implements ClienteRepositoriable {

	List<Cliente> clientes;
	
	public ClienteRepositoryList() {
		super();
		clientes=new ClienteOM().get();
	}

	@Override
	public Cliente get(String dni) {
		for (Cliente cliente : clientes) {
			if(cliente.getDNI().equals(dni)) {
				return cliente;
			}
		}
		return null;
	}

	@Override
	public boolean add(String dni, String dp) {
		return clientes.add(new Cliente(dni,dp));
	}

}
