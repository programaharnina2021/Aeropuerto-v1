package repositorios;

import modelo.Cliente;

public interface ClienteRepositoriable {
	public Cliente get(String dni);
	public boolean add(String dni,String dp);
}
