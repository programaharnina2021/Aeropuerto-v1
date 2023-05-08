package repositorios;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import modelo.Cliente;
import objectmother.ClienteOM;

class ClienteRepositoriableTest {
	void testGet(ClienteRepositoriable clienteRepositoriable) {
		List<Cliente> list = new ClienteOM().get();
		Cliente cliente = list.get(0);
		assertEquals(cliente,clienteRepositoriable.get(cliente.getDNI()));
	}

}
