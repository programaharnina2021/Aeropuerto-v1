package repositorios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteRepositoryListTest extends ClienteRepositoriableTest {

	@Test
	void testGet() {
		super.testGet(new ClienteRepositoryList());
	}

}
